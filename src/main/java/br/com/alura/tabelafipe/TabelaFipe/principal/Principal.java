package br.com.alura.tabelafipe.TabelaFipe.principal;

import br.com.alura.tabelafipe.TabelaFipe.models.Dados;
import br.com.alura.tabelafipe.TabelaFipe.models.Modelos;
import br.com.alura.tabelafipe.TabelaFipe.models.Veiculo;
import br.com.alura.tabelafipe.TabelaFipe.service.ConsumoApi;
import br.com.alura.tabelafipe.TabelaFipe.service.ConverteDados;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {

    private Scanner scan = new Scanner(System.in);
    private ConsumoApi consumoApi = new ConsumoApi();
    private ConverteDados converteDados = new ConverteDados();
    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";
    public void exibeMenu(){

        String menu = "**** OPÇÕES ****\n" +
                "\n" +
                "Carro\n" +
                "\n" +
                "Moto\n" +
                "\n" +
                "Caminhão\n" +
                "\n" +
                "Digite uma das opções para consultar valores:";

        System.out.println(menu);
        var veiculo = scan.nextLine();

        var enderecoApi = "";
        if (veiculo.toLowerCase().contains("carro")){
            enderecoApi = URL_BASE+"carros/marcas";
        } else if (veiculo.toLowerCase().contains("moto")) {
            enderecoApi = URL_BASE+"motos/marcas";
        } else if (veiculo.toLowerCase().contains("caminhão")) {
            enderecoApi = URL_BASE+"caminhoes/marcas";
        }

        var json = consumoApi.obterJson(enderecoApi);


        List<Dados> dados = converteDados.obterLista(json, Dados.class);

        List<Dados> listaDeCodigos = dados.stream().sorted(Comparator.comparing(Dados::codigo)).collect(Collectors.toList());

        for (int i = 0; i < dados.size(); i++) {
            System.out.print("Cód: "+listaDeCodigos.get(i).codigo());
            System.out.println("\tNome da Marca: "+listaDeCodigos.get(i).nome());
        }

        System.out.println("\nDigite o código da Marca do veículo que você deseja conferir: ");
        var marca = scan.nextLine();

        enderecoApi = enderecoApi+"/"+marca+"/modelos";

        json = consumoApi.obterJson(enderecoApi);

        Modelos modelosDaMarca = converteDados.obterDados(json,Modelos.class);

        List<Dados> listaDosModelos = modelosDaMarca.modelos().stream().collect(Collectors.toList());

        System.out.println();
        for (int i = 0; i < listaDosModelos.size(); i++) {
            System.out.print("Cód: "+listaDosModelos.get(i).codigo());
            System.out.println("\tNome do Modelo: "+listaDosModelos.get(i).nome());
        }

        System.out.println("\nDigite um trecho do nome do veículo que você quer ver as informações:");
        var trechoVeiculo=scan.nextLine();

        List<Dados> modelosFiltrados = listaDosModelos.stream()
                .filter(m -> m.nome().toUpperCase().contains(trechoVeiculo.toUpperCase())).collect(Collectors.toList());

        System.out.println("\nLista de Veículos Filtrados: ");

        for (int i = 0; i < modelosFiltrados.size(); i++) {
            System.out.print("Cód: "+modelosFiltrados.get(i).codigo());
            System.out.println("\tNome do Modelo: "+modelosFiltrados.get(i).nome());
        }

        System.out.println("\nDigite o código do veículo para consultar valores e informações: ");
        var codigoVeiculo = scan.nextLine();

        enderecoApi = enderecoApi+"/"+codigoVeiculo+"/anos";

        json = consumoApi.obterJson(enderecoApi);

        List<Dados> anos = converteDados.obterLista(json, Dados.class);


        List<Veiculo> veiculos = new ArrayList<>();
        for (int i = 0; i < anos.size(); i++) {
            var novoEnderecoApi = enderecoApi+"/"+anos.get(i).codigo();
            json = consumoApi.obterJson(novoEnderecoApi);
            Veiculo informacoesDeVeiculo = converteDados.obterDados(json, Veiculo.class);
            veiculos.add(informacoesDeVeiculo);
        }

        System.out.println();
        for (int i = 0; i < veiculos.size(); i++) {
            System.out.println("Valor: "+veiculos.get(i).valor()+" \tMarca: "+veiculos.get(i).marca()+
                    "\tModelo: "+veiculos.get(i).modelo()+" \tAno: "+veiculos.get(i).ano()+
                    "\tCombustivél: "+veiculos.get(i).combustivel());
        }


    }
}
