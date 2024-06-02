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

 ## Observações

 - Para realização do desafio faremos o consumo de uma API, documentada nesse link https://deividfortuna.github.io/fipe/.

- De acordo com o escolhido (carro, moto, ou caminhão) vamos fazer uma chamada a um dos endpoints abaixo para buscar as marcas:

https://parallelum.com.br/fipe/api/v1/carros/marcas

https://parallelum.com.br/fipe/api/v1/motos/marcas

https://parallelum.com.br/fipe/api/v1/caminhoes/marcas

- O retorno dessa requisição será uma lista com código e marca desejada. Caso o usuário queira por exemplo fazer uma consulta a modelos de carros da Fiat, que possui o código 21, terá que fazer uma nova requisição para o endpoint:
  
https://parallelum.com.br/fipe/api/v1/carros/marcas/21/modelos

- Feito isso, irá escolher um código de modelo, por exemplo esse Palio Weekend Stile 1.6 mpi 16V 4p, representado pelo código 560. Então deverá fazer uma terceira requisição para o endpoint:

https://parallelum.com.br/fipe/api/v1/carros/marcas/21/modelos/560/anos

- Para saber a avaliação para cada ano disponível, teremos que fazer requisições pelo código por ano, onde obteremos um retorno similar ao que é mostrado abaixo:
  
https://parallelum.com.br/fipe/api/v1/carros/marcas/21/modelos/560/anos/2003-1

![image](https://github.com/ThiagoDeSena/Tabela-Fipe/assets/110785400/882957d0-045a-42cf-a0b8-26c26447c1da)

- Para podermos exibir em nossa aplicação as avaliações de todos os anos para esse modelo, será necessário trabalhar com as coleções e estruturas de repetição para poder exibir já todos as avaliações de todos os anos para o nosso usuário.
- Utilize a biblioteca Jackson para a desserialização dos dados.
- Modele as classes de acordo com o necessário para representar as marcas, modelos e dados dos veículos.
- Relembre os conceitos vistos no curso para filtrar os modelos por um trecho do nome.


## Desenvolvedores

[<img src="https://avatars.githubusercontent.com/u/110785400?v=4" width=115><br><sub>Thiago De Sena</sub>](https://www.linkedin.com/in/thiago-de-sena-ab5b09179/)


