# Consultor de Preço da Tabela Fipe
![Instagram post carro moderno azul e preto](https://github.com/ThiagoDeSena/Tabela-Fipe/assets/110785400/161dc760-1f5b-4d6a-8c8e-569e86b9183b)
![Badge Concluído](http://img.shields.io/static/v1?label=STATUS&message=CONCLUÍDO&color=GREEN&style=for-the-badge)
![Badge Linguagem](http://img.shields.io/static/v1?label=LINGUAGEM&message=JAVA&color=yellow&style=for-the-badge)
![Badge Linguagem](http://img.shields.io/static/v1?label=API&message=FIPE+API+HTTP+REST&color=blue&style=for-the-badge)

## Descrição do projeto 

<p align="justify">
implementar uma aplicação para consultar o valor médio de veículos (carros, motos ou caminhões) de acordo com a tabela FIPE, que pode ser acessada através desse site
https://veiculos.fipe.org.br/

- A consulta aos valores dos veículos pelo site tem o seguinte fluxo:
- Primeiramente é necessário escolher o tipo do veículo: carro, moto ou caminhão.

  ![image](https://github.com/ThiagoDeSena/Tabela-Fipe/assets/110785400/39cd4437-106a-4a45-85be-2bdb4054dfdc)

- Depois disso, é necessário preencher a MARCA, MODELO e ANO para consulta.

![image](https://github.com/ThiagoDeSena/Tabela-Fipe/assets/110785400/11652eda-acd9-4620-b825-604711d16b7f)

- Por fim, é exibida a avaliação apenas daquele ano escolhido.

![image](https://github.com/ThiagoDeSena/Tabela-Fipe/assets/110785400/d801cbb1-c846-4422-9dc8-c129615ffa7a)
  
Exemplo do Programa sendo executado no console:

![Imagem do console inicial do programa](https://github.com/ThiagoDeSena/Tabela-Fipe/assets/110785400/4dd1c8df-56da-4f68-803f-3c7ed61e6826)


Este projeto foi criado para atender às necessidades de quem quer comprar veículos usados e desejam consultar os valores dos veículos desejados na Tabela FIPE, 
referência nacional para preços de carros usados no Brasil.

</p>

## Objetivos do projeto

- O objetivo do projeto é ter um fluxo similar ao que é feito no site, porém com algumas melhorias.
- Criaremos um projeto Spring com linha de comando, utilizando a classe Scanner para fazer interações com o usuário via terminal.
- Solicitaremos que o usuário digite o tipo de veículo desejado (carro, caminhão ou moto).
- Feito isso, listaremos todas as marcas daquele tipo de veículo, solicitando que o usuário escolha uma marca pelo código.
- Após essa escolha, listaremos todos os modelos de veículos daquela marca.
- Solicitaremos que o usuário digite um trecho do modelo que ele quer visualizar, por exemplo PALIO.
- Listaremos apenas os modelos que tiverem a palavra PALIO no nome.
- Usuário escolherá um modelo específico pelo código e, diferente do site, já listaremos as avaliações para TODOS os anos disponíveis daquele modelo, retornando uma lista de valores dos anos do modelo de veículo escolhido.

## Funcionalidades

:heavy_check_mark: `Consulta por categoria:` Permite selecionar entre carros, motos ou caminhões. 

:heavy_check_mark: `Consulta por marca:`  Permite selecionar a marca do veículo desejado, como Ford, Volkswagen, Fiat, etc.

:heavy_check_mark: `Consulta por modelo:`  Permite selecionar o modelo específico do veículo, como Palio, Gol, Fusca, etc.

:heavy_check_mark: `Consulta por ano:` Permite selecionar o ano de fabricação do veículo.

:heavy_check_mark: `Exibição do valor FIPE:` Exibe o valor do veículo de acordo com a categoria, marca, modelo e ano selecionados.

## Como usar

https://github.com/ThiagoDeSena/Tabela-Fipe/assets/110785400/545df798-0790-4d08-9d8b-8c738afe4a33


## Benefícios

- Praticidade: Consulta rápida e fácil dos valores FIPE.
- Precisão: Informações atualizadas e confiáveis da Tabela FIPE.
- Organização: Permite aos colecionadores gerenciar sua coleção de forma organizada, com acesso aos valores dos seus veículos.
- Decisão informada: Auxilia na tomada de decisões sobre compra, venda ou avaliação de carros, motos e caminhões.

 

## Desenvolvedores

[<img src="https://avatars.githubusercontent.com/u/110785400?v=4" width=115><br><sub>Thiago De Sena</sub>](https://www.linkedin.com/in/thiago-de-sena-ab5b09179/)


