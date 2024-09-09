<h1>Projeto API REST de Gerenciamento de Clientes</h1>

<p>Este projeto consiste em uma API REST desenvolvida com <strong>Spring Boot</strong>, utilizando o banco de dados <strong>MySQL</strong> e a ferramenta de documentação <strong>Swagger</strong>. O objetivo é gerenciar o cadastro de clientes, permitindo operações de <strong>CRUD</strong> (Create, Read, Update, Delete).</p>

<h2>Funcionalidades</h2>
<ul>
    <li>Criação de um cliente</li>
    <li>Listagem de todos os clientes</li>
    <li>Busca de cliente por ID</li>
    <li>Atualização dos dados de um cliente</li>
    <li>Exclusão de um cliente</li>
    <li>Validação de CPF e Email</li>
</ul>

<h2>Requisitos</h2>
<ul>
    <li>Java 11+</li>
    <li>Spring Boot 2.6.x</li>
    <li>MySQL</li>
    <li>Maven</li>
</ul>

<h2>Dependências</h2>
<ul>
    <li>spring-boot-starter-web</li>
    <li>spring-boot-starter-data-jpa</li>
    <li>mysql-connector-java</li>
    <li>hibernate-validator</li>
    <li>springfox-boot-starter (Swagger)</li>
    <li>lombok (opcional)</li>
</ul>

<h2>Configuração do Banco de Dados</h2>
<p>Para configurar o banco de dados MySQL, altere o arquivo <code>application.properties</code> com as informações do seu ambiente:</p>
<pre>
<code>
spring.datasource.url=jdbc:mysql://localhost:3306/clientesdb?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
</code>
</pre>

<h2>Execução do Projeto</h2>
<ol>
    <li>Clone o repositório para sua máquina local</li>
    <li>Configure o MySQL e ajuste as credenciais no arquivo <code>application.properties</code></li>
    <li>Rode o projeto com <code>mvn spring-boot:run</code></li>
    <li>Acesse o Swagger para testar os endpoints em <a href="http://localhost:8080/swagger-ui/">http://localhost:8080/swagger-ui/</a></li>
</ol>

<h2>Endpoints da API</h2>
<ul>
    <li><code>GET /clientes</code>: Lista todos os clientes</li>
    <li><code>GET /clientes/{id}</code>: Busca um cliente por ID</li>
    <li><code>POST /clientes</code>: Cria um novo cliente</li>
    <li><code>PUT /clientes/{id}</code>: Atualiza um cliente existente</li>
    <li><code>DELETE /clientes/{id}</code>: Exclui um cliente</li>
</ul>

<h2>Contribuições</h2>
<p>Contribuições são bem-vindas! Sinta-se à vontade para abrir uma <strong>issue</strong> ou enviar um <strong>pull request</strong> no repositório.</p>
