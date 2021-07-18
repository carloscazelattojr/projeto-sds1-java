# SDS1 - Semana DevSuperior Spring React/React Native/Java - Projeto: DSPesquisa de Games


# BACKEND

## Tecnologies

`Java` `Spring boot` `h2` `PostgreSQL` `Maven` 

## Dependencies

- Spring Web
- Spring DevTools
- Spring Data JPA
- Spring Security
- PostgreSQL Driver
- H2

Database: dspesquisa


## Chek-List Step-by-Step in Deploy

1) Definir arquivos de configuração .properties:
  - application.properties
  ```
  #My Environment 
  spring.profiles.active=test

  #life cycle
  spring.jpa.open-in-view=false

  ```
  - application-dev.properties
  ```
  #Databse PostgreSQL configs
  #Commands with create script postgreSQL
  spring.jpa.properties.javax.persistence.schema-generation.create-source=metadata
  spring.jpa.properties.javax.persistence.schema-generation.scripts.action=create
  spring.jpa.properties.javax.persistence.schema-generation.scripts.create-target=create.sql
  spring.jpa.properties.hibernate.hbm2ddl.delimiter=;
  # --------

  spring.datasource.url=jdbc:postgresql://localhost:5432/dspesquisa
  spring.datasource.username=postgres
  spring.datasource.password=1234567

  spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
  spring.jpa.hibernate.ddl-auto=none  
  ```
  - application-test.properties
  ```
  #Database H2 Configs
  spring.datasource.url=jdbc:h2:mem:testdb
  spring.datasource.username=sa
  spring.datasource.password=

  spring.h2.console.enabled=true
  spring.h2.console.path=/h2-console  
  ```
  - application-prod.properties
  ```
  #Database in Heroku
  spring.datasource.url=${DATABASE_URL}
  # ${DATABASE_URL} - Variavel interna do Heroku que contém o URL

  spring.jpa.hibernate.ddl-auto=none
  spring.jpa.show-sql=false
  spring.jpa.properties.hibernate.format_sql=false  
  ```

2) Para desenvolvimento TEST, utilize o H2
3) Para desenvolvimento DEV, utilize o PostgreSQL
4) Para deploy no Heroku
  - Criar app no heroku. Provisionar o banco de dados PostgreSQL
  - Pegar string de conexão do banco e conectar no PostgreSQL Local para verificar se está funcionando.
  - Execute o script CREATE.SQL para criar a base no Heroku (atividade manual.)
  - No terminal do Git execute os comandos abaixo:
    ```
    heroku git:remote -a <nome-seu-app>
    ```
    ```
    git remote -v
    ```
    ```
    git subtree push -prefix backend heroku main
    ```
5) Testar o CORS.
6) Criar configuração de segurança no APP. (Spring Security)  
    


