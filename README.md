# 🎨 **API de Gerenciamento de Produtos de Beleza**

## Uma API desenvolvida para fins de estudo pessoal, permitindo a gestão de produtos de beleza com operações de CRUD utilizando Java e Spring Boot.

### 🚀 Funcionalidades
* Cadastrar um produto por vez
* Cadastrar múltiplos produtos de uma só vez
* Encontrar um produto pelo ID
* Listar todos os produtos cadastrados
* Atualizar as informações de um produto
* Deletar um produto pelo ID
* Deletar todos os produtos de uma só vez

### 🛠️ Tecnologias Utilizadas
* Java 21
* Spring Boot 3.3.3
* Maven
* MySQL

### 🏁 Como Executar o Projeto

📋 **Pré-requisitos**
* Java 21 instalado
* MySQL instalado
* IDE compatível (IntelliJ IDEA, Eclipse, VSCode, etc.)
* Postman para testar as requisições (opcional)

📥 **Passo a Passo**

**1. Clone o repositório na sua máquina:**

git clone https://github.com/HenriqueCaldas/produtos-de-beleza

**2. Abra o projeto na sua IDE preferida.**

Aguarde o maven baixar as dependências automaticamente

**3. Configuração do banco de dados MySQL:**

Crie um banco de dados no MySQL. (CREATE DATABASE nome_banco)

Configure o arquivo application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/nome_banco
spring.datasource.username=Seu_Usuário
spring.datasource.password=Sua_Senha
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update

**4. Importe o projeto maven na IDE para iniciar a API.**

**5. Importe a coleção do Postman (opcional):**

Na pasta /postman, você encontrará uma coleção de requisições do Postman.
Importe essa coleção no Postman para testar os endpoints da API.

📡 Endpoints da API

| Método  | Endpoint              | Descrição                          |
|---------|-----------------------|------------------------------------|
| POST    | /api/produtos         | Cadastra um novo produto           |
| POST    | /api/cadastrar        | Cadastra vários produtos de uma vez|
| GET     | /api/produtos/id      | Busca um produto pelo ID           |
| GET     | /api/produtos         | Lista todos os produtos            |
| PUT     | /api/produtos         | Atualiza um produto                |
| DELETE  | /api/produtos/id      | Deleta um produto pelo ID          |
| DELETE  | /api/deletar-todos    | Deleta todos os produtos           |


**💡 Exemplos de Requisições**

Cadastra um Produto

POST /api/produtos

json

{
	"nome": "Hidratante PITANGA",
    "valor": 100
}
___
Atualizar um Produto

PUT /api/produtos

json

{
    "id": 34,
    "nome": "Shampoo Nutritivo Atualizado",
    "valor": 39.9
}

___

**🛠️ Configurar o Banco de Dados**

Certifique-se de criar um banco de dados MySQL e ajustar as credenciais no arquivo application.properties para que a API se conecte corretamente.

**🤝 Contribuição**

Se quiser contribuir com este projeto, sinta-se à vontade para abrir issues ou enviar pull requests.

**📜 Licença**

Este projeto é de uso pessoal para fins de estudo e não possui uma licença específica