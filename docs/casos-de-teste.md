# Casos de Teste — Estoque Solidário

## CT01 — Cadastrar produto com dados válidos
**Objetivo:** Verificar se o sistema cadastra produto corretamente  
**Pré-condição:** Sistema em execução  
**Passos:**
1. Enviar requisição POST para /produtos
2. Informar nome e quantidade válidos

**Resultado esperado:** Produto cadastrado com sucesso e ID gerado

---

## CT02 — Cadastrar produto sem nome
**Objetivo:** Validar regra de campo obrigatório  
**Pré-condição:** Sistema em execução  
**Passos:**
1. Enviar requisição POST para /produtos
2. Informar quantidade sem nome

**Resultado esperado:** Sistema retorna erro de validação

---

## CT03 — Cadastrar produto com quantidade negativa
**Objetivo:** Validar regra de negócio  
**Pré-condição:** Sistema em execução  
**Passos:**
1. Enviar requisição POST para /produtos
2. Informar quantidade negativa

**Resultado esperado:** Sistema não permite cadastro

---

## CT04 — Listar produtos
**Objetivo:** Verificar listagem de produtos  
**Pré-condição:** Produtos cadastrados  
**Passos:**
1. Enviar requisição GET para /produtos

**Resultado esperado:** Lista de produtos exibida corretamente

---

## CT05 — Atualizar produto existente
**Objetivo:** Validar atualização de produto  
**Pré-condição:** Produto cadastrado  
**Passos:**
1. Enviar requisição PUT para /produtos/{id}
2. Alterar nome ou quantidade

**Resultado esperado:** Produto atualizado com sucesso

---

## CT06 — Deletar produto existente
**Objetivo:** Verificar remoção de produto  
**Pré-condição:** Produto cadastrado  
**Passos:**
1. Enviar requisição DELETE para /produtos/{id}

**Resultado esperado:** Produto removido do sistema

### ❌ Casos de Teste Negativos

CT-NEG-01 – Cadastrar produto sem nome  
Dado que o usuário envie um produto sem o campo "nome"  
Quando a API receber a requisição POST  
Então o sistema deve retornar erro de validação

CT-NEG-02 – Cadastrar produto com quantidade negativa  
Dado que o usuário informe quantidade menor que zero  
Quando a API receber a requisição POST  
Então o sistema deve impedir o cadastro

CT-NEG-03 – Atualizar produto inexistente  
Dado que o ID informado não exista no banco  
Quando a API receber a requisição PUT  
Então o sistema deve retornar erro "Produto não encontrado"

CT-NEG-04 – Deletar produto inexistente  
Dado que o ID informado não exista  
Quando a API receber a requisição DELETE  
Então o sistema deve retornar erro apropriado
