# CRUD de Usuários - Spring Boot

Este projeto é uma API REST simples para **gerenciamento de usuários (CRUD)** desenvolvida em **Java 21** utilizando o ecossistema **Spring Boot**.
A aplicação permite **criar, listar, atualizar e deletar usuários** de forma simples usando um banco de dados em memória.

---

## 🚀 Tecnologias utilizadas

* **Java 21 (JDK 21)**
* **Spring Boot**
* **Spring Data JPA**
* **H2 Database**
* **Lombok**
* **Maven**

---

## 📂 Estrutura do projeto

```
crud-usuario
 ├── src
 │   ├── main
 │   │   ├── java
 │   │   │   └── com.exemplo.crudusuario
 │   │   │       ├── controller
 │   │   │       ├── model
 │   │   │       ├── repository
 │   │   │       └── CrudUsuarioApplication.java
 │   │   └── resources
 │   │       └── application.properties
 └── pom.xml
```

---

## ⚙️ Como executar o projeto

### 1️⃣ Clonar o repositório

```bash
git clone https://github.com/seu-usuario/crud-usuario.git
```

### 2️⃣ Entrar na pasta do projeto

```bash
cd crud-usuario
```

### 3️⃣ Executar a aplicação

Usando Maven:

```bash
./mvnw spring-boot:run
```

Ou rodando diretamente pela IDE (IntelliJ, Eclipse, VSCode).

---

## 🗄️ Banco de dados H2

O projeto utiliza **H2 Database em memória**, ideal para testes e desenvolvimento.

### Acessar o console do H2

Depois que a aplicação estiver rodando:

```
http://localhost:8080/h2-console
```

Exemplo de configuração:

```
JDBC URL: jdbc:h2:mem:usuario
User Name: bauer
Password: 1234
```

---

## 📡 Endpoints da API

### Listar usuários

```
GET /usuarios
```

---

### Buscar usuário por ID

```
GET /usuarios/{id}
```

---

### Criar usuário

```
POST /usuarios
```

Body JSON:

```json
{
  "nome": "João",
  "email": "joao@email.com"
}
```

---

### Atualizar usuário

```
PUT /usuarios/{id}
```

Body JSON:

```json
{
  "nome": "Maria",
  "email": "maria@email.com"
}
```

---

### Deletar usuário

```
DELETE /usuarios/{id}
```

---

## 🧪 Exemplo de entidade Usuario

```java
@Entity
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
}
```

---

## 📦 Dependências principais

* Spring Boot Starter Web
* Spring Boot Starter Data JPA
* H2 Database
* Lombok
* Maven

---

## 📌 Objetivo do projeto

Este projeto tem como objetivo demonstrar de forma simples:

* criação de **APIs REST**
* uso de **Spring Data JPA**
* integração com **banco de dados H2**
* organização básica de um projeto **Spring Boot**

---

## 👨‍💻 Autor

Projeto desenvolvido para fins de estudo e prática com **Spring Boot e Java 21**.
