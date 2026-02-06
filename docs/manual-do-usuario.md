# Manual do Usuário — Estoque Solidário

## 👤 Quem pode usar o sistema
Este sistema foi desenvolvido para uso do setor administrativo de instituições de caridade, como creches e projetos sociais.

O usuário não precisa ter conhecimento técnico ou de programação.

---

## 🌐 Como acessar o sistema
1. Abrir um navegador (Google Chrome, Edge ou Firefox)
2. Certificar-se de que o sistema está em execução
3. Acessar o endereço:
   http://localhost:8080/produtos

---

## 📦 Cadastrar um produto
Para cadastrar um produto, utilize uma ferramenta como Postman ou Insomnia e envie os seguintes dados:

Nome do produto  
Quantidade em estoque

Exemplo:
```json
{
  "nome": "Arroz",
  "quantidade": 10
}

📋 Listar produtos

Ao acessar o endereço abaixo no navegador, será exibida a lista de produtos cadastrados:
http://localhost:8080/produtos

✏️ Atualizar um produto

Para atualizar um produto, informe o ID do produto e os novos dados:
http://localhost:8080/produtos/{id}

🗑️ Deletar um produto

Para remover um produto do estoque, informe o ID do produto:
http://localhost:8080/produtos/{id}


⚠️ Atenção:  
Se o sistema estiver desligado, a página não será exibida.


## 🔮 Melhorias Futuras

As funcionalidades abaixo estão previstas para versões futuras do sistema, visando melhorar a usabilidade e a experiência do usuário final:

- Implementação de uma interface web para o administrador, permitindo:
  - Cadastro de produtos
  - Atualização de quantidade
  - Exclusão de produtos
- Pesquisa de produtos por nome ou categoria
- Controle de acesso com autenticação de usuários (login e senha)
- Definição de perfis de usuário (Administrador e Visualizador)
- Validações adicionais de dados para evitar erros de cadastro
- Relatórios simples de entrada e saída de produtos

Atualmente, as operações de cadastro, atualização e exclusão são realizadas via API REST, utilizando ferramentas técnicas como Postman.
