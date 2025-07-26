
# 🌱 Projeto de Aprendizado: API REST com Spring Boot e MongoDB

Este projeto foi desenvolvido como parte do meu processo de aprendizado em **APIs REST** com **Spring Boot**, utilizando o **MongoDB** como banco de dados NoSQL. O foco foi entender como estruturar uma API moderna e performática com documentos aninhados, DTOs e boas práticas RESTful.

---

## 🎯 Objetivo

Criar uma API RESTful simples que simula uma rede social com os seguintes recursos:

- CRUD de usuários
- CRUD de posts com comentários
- Associação entre documentos (`User`, `Post`, `Comment`)
- Conversão entre entidades e DTOs
- Integração com MongoDB via `Spring Data`

---

## 🧰 Tecnologias e ferramentas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data MongoDB
- MongoDB (local ou em nuvem)
- Maven

---

## 📁 Estrutura do Projeto

```
src/main/java/com/josef/workshopmongo/
├── config/                # Instanciação de dados
├── domain/                # Entidades: User, Post, Comment
├── dto/                   # Data Transfer Objects
├── repository/            # Repositórios Mongo
├── resources/             # Controllers REST
│   └── exceptions/        # Tratamento de exceções
└── WorkshopmongoApplication.java
```

---

## 🚀 Como executar

### Pré-requisitos

- Java 17+  
- MongoDB rodando localmente (ou conexão com Atlas)
- Maven

### Passos

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/spring-boot-mongodb.git

# Acesse a pasta do projeto
cd spring-boot-mongodb

# Compile e rode
./mvnw spring-boot:run
```

A API estará disponível em `http://localhost:8080`

---

## 🔗 Endpoints principais

- `GET /users` – Listar usuários
- `POST /users` – Criar novo usuário
- `GET /posts` – Listar posts
- `GET /posts/{id}` – Buscar post com comentários

---

## 📬 Dados de exemplo

- Ao iniciar a aplicação, dados de exemplo são carregados automaticamente via `Instantiation.java`
- Isso facilita testes rápidos com coleções de usuários e posts.

---

## 🧠 Aprendizados

✅ Conceitos de banco de dados NoSQL com MongoDB  
✅ Uso do Spring Data MongoDB  
✅ Modelagem com documentos aninhados  
✅ Conversão entre entidades e DTOs  
✅ Criação de uma API RESTful bem estruturada

---

## 👤 Autor

**Josef Caique**  
📚 Projeto desenvolvido exclusivamente para fins educacionais.

---

## 📄 Licença

Uso livre para aprendizado e estudos.

