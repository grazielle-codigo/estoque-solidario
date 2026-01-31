# Casos de Uso – Sistema Estoque Solidário

## CU01 – Cadastrar Produto

**Ator:** Administrativo  

**Descrição:**  
Permite que o usuário administrativo cadastre um novo produto no sistema.

**Pré-condição:**  
Usuário com acesso ao sistema.

**Fluxo Principal:**
1. O usuário acessa o sistema
2. O usuário seleciona a opção "Cadastrar Produto"
3. O usuário informa o nome do produto
4. O usuário informa a quantidade inicial
5. O usuário confirma o cadastro
6. O sistema salva o produto

**Pós-condição:**  
Produto cadastrado com sucesso no sistema.

**Fluxo Alternativo:**
- Caso o nome do produto não seja informado, o sistema deve exibir mensagem de erro

---

## CU02 – Registrar Entrada de Produto

**Ator:** Administrativo  

**Descrição:**  
Permite registrar a entrada de novos itens no estoque.

**Pré-condição:**  
Produto previamente cadastrado.

**Fluxo Principal:**
1. O usuário acessa o sistema
2. Seleciona um produto existente
3. Informa a quantidade de entrada
4. Confirma a operação
5. O sistema atualiza o estoque

**Pós-condição:**  
Quantidade do produto atualizada corretamente.

**Fluxo Alternativo:**
- Caso a quantidade informada seja inválida, o sistema deve exibir mensagem de erro

---

## CU03 – Registrar Saída de Produto

**Ator:** Administrativo  

**Descrição:**  
Permite registrar a saída de produtos do estoque.

**Pré-condição:**  
Produto cadastrado com quantidade disponível.

**Fluxo Principal:**
1. O usuário seleciona o produto
2. Informa a quantidade de saída
3. Confirma a operação
4. O sistema atualiza o estoque

**Pós-condição:**  
Estoque reduzido corretamente.

**Fluxo Alternativo:**
- Caso a quantidade informada seja maior que a disponível em estoque, o sistema deve bloquear a operação
