Architecture & Engineering Manager - Backend 🏗️☕
Este é o backend de um sistema (API REST) de uma plataforma de gestão voltada para escritórios de arquitetura e engenharia que atuam no nicho de Interiores. O projeto foi desenvolvido para gerenciar o ciclo de vida de projetos, clientes e cronogramas, aplicando os conceitos de arquitetura em camadas e boas práticas de desenvolvimento em Java.

## Tecnologias Utilizadas
**Java 17+**
**Spring Boot 3**
**Spring Data JPA** (Persistência de dados)
**Hibernate** (ORM)
**H2 Database** (Ambiente de teste)
**MySQL** (Ambiente de produção)
**Maven** (Gestão de dependências)

## Arquitetura do Projeto
O sistema foi estruturado seguindo o padrão de Arquitetura em Camadas, garantindo a separação de responsabilidades e facilitando a manutenção:
**Resource (Controladores)**: Camada de entrada que disponibiliza os endpoints REST.
**Service (Serviços)**: Onde reside a lógica de negócio e as regras de validação.
**Repository (Acesso a Dados)**: Interface de comunicação com o banco de dados via JPA.
**Exceptions**: Tratamento customizado de erros para retornar respostas claras ao cliente da API.

## Funcionalidades Principais
**Gestão de Clientes**: CRUD completo de contratantes.
**Gestão de Projetos**: Registro de projetos com status (Em elaboração, Aprovado, Em Obra, Finalizado).
**Vínculo de Atividades**: Associação de tarefas e prazos a projetos específicos.
**Modelo de Domínio**: Implementação de associações 1:N (Um cliente para muitos projetos) e N:N (Projetos e Categorias).
**Seeding de Dados**: População automática do banco de dados para facilitar testes em ambiente de desenvolvimento.

## Como executar o projeto
Certifique-se de ter o JDK 17 e o Maven instalados.
Clone o repositório:
Bash
git clone https://github.com/marina-araujo/gestao-projetos-backend.git
Entre na pasta do projeto e execute:
Bash
mvn spring-boot:run
A API estará disponível em http://localhost:8080.

## Sobre este projeto
Este projeto faz parte do meu portfólio de transição de carreira para a Engenharia de Software. Ele foi inspirado na estrutura técnica do curso do Prof. Nélio Alves, mas customizado com as regras de negócio que vivenciei durante 7 anos atuando na área de Arquitetura e Gestão de Projetos.
