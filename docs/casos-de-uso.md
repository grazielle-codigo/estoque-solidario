# Casos de Uso — Estoque Solidário

## UC01 — Cadastrar Produto

**Ator:** Administrador  
**Descrição:** Permite cadastrar um novo produto no estoque.  
**Pré-condição:** Sistema em execução.  
**Pós-condição:** Produto salvo no banco de dados.

**Fluxo principal:**
1. Administrador informa nome e quantidade do produto
2. Sistema valida os dados
3. Sistema salva o produto
4. Sistema retorna o produto cadastrado

---

## UC02 — Listar Produtos

**Ator:** Administrador  
**Descrição:** Permite visualizar todos os produtos cadastrados.  
**Pré-condição:** Sistema em execução.  
**Pós-condição:** Lista de produtos exibida.

**Fluxo principal:**
1. Administrador acessa a listagem
2. Sistema retorna todos os produtos cadastrados

---

## UC03 — Atualizar Produto

**Ator:** Administrador  
**Descrição:** Permite atualizar um produto existente.  
**Pré-condição:** Produto já cadastrado.  
**Pós-condição:** Produto atualizado no sistema.

---

## UC04 — Deletar Produto

**Ator:** Administrador  
**Descrição:** Permite remover um produto do estoque.  
**Pré-condição:** Produto existente.  
**Pós-condição:** Produto removido do sistema.

# Casos de Uso — Estoque Solidário

## UC01 — Cadastrar Produto
**Ator:** Administrador  
**Descrição:** Permite cadastrar um novo produto no estoque.

**Fluxo principal:**
1. O administrador informa o nome do produto
2. O administrador informa a quantidade
3. O sistema salva o produto no banco de dados
4. O sistema retorna o produto cadastrado

**Fluxos alternativos:**
- Quantidade negativa → sistema deve rejeitar
- Nome vazio → sistema deve rejeitar

---

## UC02 — Listar Produtos
**Ator:** Administrador  
**Descrição:** Permite visualizar todos os produtos cadastrados.

**Fluxo principal:**
1. O administrador acessa a lista de produtos
2. O sistema retorna todos os produtos cadastrados

---

## UC03 — Atualizar Produto
**Ator:** Administrador  
**Descrição:** Permite atualizar um produto existente.

**Fluxo principal:**
1. O administrador informa o ID do produto
2. O administrador altera nome e/ou quantidade
3. O sistema salva as alterações

**Fluxo alternativo:**
- ID inexistente → sistema retorna erro

---

## UC04 — Deletar Produto
**Ator:** Administrador  
**Descrição:** Permite remover um produto do estoque.

**Fluxo principal:**
1. O administrador informa o ID do produto
2. O sistema remove o produto do banco
