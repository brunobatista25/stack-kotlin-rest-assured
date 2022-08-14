# Sobre stack-kotlin-rest-assured stack

Projeto destinado para fazer testes automatizados de Api, feita inicialmente com a linguagem kotlin e com o framework de testes chamado rest assured, para validar o retorno das requisições das APIs.

## Estrutura:

## Model

 -  Essa pasta model tem o intuito de reunir todas as classes de objeto e converte-lás para uma string json para ser usada nos testes.

## Runner

- Essa pasta contem um arquivo chamado runner onde ele é o principal arquivo que irá rodar todos os testes.

## Services

- Esta pasta contém classes que irão reunir todos os metodos de ações que serão usadas nos testes

## Support

- Essa pasta contém todas as classes de configuração do projeto como variáveis de ambiente, configurações do rest assured, configuração de URL e PATH etc..

## Resources

- Essa pasta contém todos os arquivos onde especificamos os valores das variáveis globais do projeto


## Como executar o projeto

- Basta executar o seguinte comando abaixo:

### Rodar apontando para o ambiente de produção

´´´shell
mvn clean test -Denvironments=prod
´´´ 

### Rodar apontando para o local

```shell
mvn clean test -Denvironments=local
``` 

### Rodar usando dockerfile

- Primeiro precisamos criar a imagem

```shell
docker build -t nome_da_imagem .
```

- Depois da imagem criada pode executar o comando abaixo:

```shell
docker run --rm  nome_da_imagem mvn clean test -Denvironments=prod
```
