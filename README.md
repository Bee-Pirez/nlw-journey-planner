# PLANNER

## 🌟 Sobre o Projeto
Planner é uma aplicação que visa facilitar a organização de viagens, permitindo que os usuários cadastrem viagens, convidem participantes e gerenciem atividades e locais importantes durante a viagem.


## ⭐ Requisitos funcionais
1. **Cadastro de Viagens**: O usuário cadastra uma viagem informando o local de destino, data de início, data de término, e-mails dos convidados e também seu nome completo e endereço de e-mail;
2. **Confirmação de Viagem**: O criador da viagem recebe um e-mail para confirmar a nova viagem através de um link. Ao clicar no link, a viagem é confirmada, os convidados recebem e-mails de confirmação de presença e o criador é redirecionado para a página da viagem;
3. **Confirmação de Presença dos Convidados**: Os convidados, ao clicarem no link de confirmação de presença, são redirecionados para a aplicação onde devem inserir seu nome (além do e-mail que já estará preenchido) e então estarão confirmados na viagem;
4. **Gerenciamento de Links Importantes**: Na página do evento, os participantes da viagem podem adicionar links importantes da viagem como reserva do AirBnB, locais para serem visitados, etc...
5. **Gerenciamento de Atividades**: Ainda na página do evento, o criador e os convidados podem adicionar atividades que irão ocorrer durante a viagem com título, data e horário;
6. **Convite de Novos Participantes**: Novos participantes podem ser convidados dentro da página do evento através do e-mail e assim devem passar pelo fluxo de confirmação como qualquer outro convidado

## 🛠️ Tecnologias Utilizadas

- **Java 21**: Linguagem de programação principal.
- **Spring Boot**: Framework para simplificação do desenvolvimento de aplicações Java.
- **Maven**: Ferramenta de automação de build e gerenciamento de dependências.
- **Spring Web**: Módulo do Spring para desenvolvimento de aplicações web.
- **Flyway**: Biblioteca para controle de versão do banco de dados (migrations).
- **Spring Boot DevTools**: Ferramenta para facilitar o desenvolvimento.
- **Lombok**: Biblioteca para geração de código boilerplate.
- **Spring Data JPA**: Módulo do Spring para persistência de dados e conexão com o banco de dados.
- **H2 Database**: Banco de dados em memória.


## 🚀 Instalação e Execução

### Pré-requisitos

- JDK 21 instalado
- Maven instalado

### Passos para rodar o projeto

1. Clone o repositório:

    ```sh
    git clone https://github.com/Bee-Pirez/nlw-journey-planner.git
    cd planner
    ```

2. Configure o banco de dados no arquivo `application.properties`. Caso não queira usar o mesmo driver que estou utilizando e deseja usar outro banco de dados, basta fazer as alterações no arquivo e baixar as dependências necessárias. Aqui está um exemplo de configuração para o H2 Database:
    ```properties
    spring.datasource.url=jdbc:h2:mem:planner
    spring.datasource.driverClassName=org.h2.Driver
    spring.jpa.database-plataform=org.hibernate.dialect.H2Dialect
    spring.datasource.password=
    spring.datasource.username=sa
    
    ```

3. Compile e rode a aplicação

