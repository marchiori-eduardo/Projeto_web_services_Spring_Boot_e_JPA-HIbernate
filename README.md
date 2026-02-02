# Projeto Web Services com Spring Boot e JPA / Hibernate

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)

> API RESTful desenvolvida para explorar o mapeamento objeto-relacional (ORM), injeção de dependência e o ecossistema Spring Boot.

## 💻 Sobre o Projeto

Este projeto consiste em um sistema de pedidos (Web Services) construído com Java e Spring Boot. O objetivo principal é demonstrar a implementação de um modelo de domínio complexo utilizando **JPA (Java Persistence API)** e **Hibernate** para persistência de dados.

O sistema gerencia:
* **Usuários** e seus pedidos.
* **Produtos** categorizados.
* **Pedidos** com status de pagamento e itens variados.

## ⚙️ Tecnologias Utilizadas

* **Java 17+**
* **Spring Boot 3** (Web, JPA)
* **Banco de Dados H2** (Para ambiente de Teste)
* **PostgreSQL** (Para ambiente de Produção/Dev)
* **Maven** (Gerenciamento de dependências)

## 🗄️ Modelo de Domínio

O projeto segue uma arquitetura em camadas (Resource, Service, Repository) e implementa as seguintes entidades:
* Users
* Orders
* Categories
* Products
* Payments

## 🚀 Como Executar

### Pré-requisitos
* Java JDK 17 ou superior instalado.
* Maven instalado (ou usar o wrapper `./mvnw`).

### Passo a Passo

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/marchiori-eduardo/Projeto_web_services_Spring_Boot_e_JPA-HIbernate.git](https://github.com/marchiori-eduardo/Projeto_web_services_Spring_Boot_e_JPA-HIbernate.git)
    ```

2.  **Acesse a pasta do projeto:**
    ```bash
    cd Projeto_web_services_Spring_Boot_e_JPA-HIbernate
    ```

3.  **Execute o projeto:**
    ```bash
    ./mvnw spring-boot:run
    ```

4.  **Acesse o Banco de Dados (H2):**
    O projeto está configurado com um perfil de teste (`application-test.properties`) que popula o banco automaticamente.
    * Abra o navegador em: `http://localhost:8080/h2-console`
    * JDBC URL: `jdbc:h2:mem:testdb`
    * User: `sa`
    * Password: *(deixe em branco)*

## 📡 Endpoints da API

Abaixo estão os principais endpoints disponíveis para teste no Postman ou navegador:

| Método | Rota | Descrição |
|---|---|---|
| `GET` | `/users` | Lista todos os usuários |
| `GET` | `/users/{id}` | Busca usuário por ID |
| `POST` | `/users` | Cria novo usuário |
| `GET` | `/products` | Lista todos os produtos |
| `GET` | `/categories` | Lista as categorias |
| `GET` | `/orders` | Lista os pedidos realizados |
| `GET` | `/orders/{id}` | Busca pedido por ID (com itens e pagamento) |

### Exemplo de JSON (Novo Usuário)
`POST /users`
```json
{
  "name": "Maria Brown",
  "email": "maria@gmail.com",
  "phone": "988888888",
  "password": "123"
}
