📦 Estoque Solidário

Sistema simples de controle de estoque desenvolvido em Java com Spring Boot,
voltado para instituições de caridade (ex: creches e projetos sociais).

🎯 Objetivo

Permitir que o setor administrativo registre, consulte e gerencie produtos em estoque
de forma simples, acessível via navegador e celular, sem custos com software pago.

🛠️ Tecnologias Utilizadas

.Java 21

.Spring Boot

.Spring Data JPA

.H2 Database (em memória)

.Maven

.Postman (testes manuais)

📌 Status do Projeto

🚧 Em desenvolvimento (versão funcional)

🚀 Funcionalidades Implementadas

✅ Cadastrar produtos no estoque

✅ Listar todos os produtos

✅ Atualizar produtos existentes

✅ Deletar produtos por ID

Todas as operações são realizadas via API REST.

🔗 Endpoints da API
📍 Listar produtos (GET)
http://localhost:8080/produtos

📍 Cadastrar produto (POST)
http://localhost:8080/produtos


Exemplo de JSON:

{
"nome": "Arroz",
"quantidade": 10
}

📍 Atualizar produto (PUT)
http://localhost:8080/produtos/{id}

📍 Deletar produto (DELETE)
http://localhost:8080/produtos/{id}

🧪 Qualidade e Testes (QA)

O projeto contempla práticas de Qualidade de Software, incluindo:

.Levantamento de requisitos

.Definição de casos de uso

.Criação de casos de teste funcionais e negativos

.Testes manuais de API via Postman

.
Validação de códigos de resposta HTTP (200, 404, etc.)

A documentação de testes está disponível na pasta:

/docs
├─ casos-de-uso.md
└─ casos-de-teste.md

▶️ Como executar o projeto

.Clonar o repositório

.Abrir o projeto no IntelliJ IDEA

.Executar a classe:

.EstoqueSolidarioApplication


## A aplicação estará disponível em:

http://localhost:8080

📚 Observações

Este projeto tem fins educacionais e foi desenvolvido como parte do aprendizado
em Desenvolvimento Backend e Qualidade de Software (QA).

💡 Próximos Passos

.Criar interface web (HTML / Thymeleaf)

.Implementar testes automatizados

.Melhorar tratamento de erros

.Evoluir documentação técnica

---

## 👩‍💻 Visão de Qualidade (QA)

Este projeto foi desenvolvido com foco em boas práticas de Qualidade de Software.

Foram realizados:
- Levantamento de requisitos funcionais e não funcionais
- Definição de regras de negócio
- Criação de casos de uso
- Elaboração de casos de teste positivos e negativos
- Validação manual dos endpoints da API utilizando Postman

O objetivo foi garantir que o sistema atendesse às necessidades do usuário final com confiabilidade, clareza e facilidade de uso.






