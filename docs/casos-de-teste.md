# Casos de Teste – Sistema Estoque Solidário

## CT01 – Cadastro de Produto com dados válidos

**Objetivo:**  
Verificar se o sistema permite cadastrar um produto com informações válidas.

**Pré-condição:**  
Usuário com acesso ao sistema.

**Passos:**
1. Acessar o sistema
2. Selecionar a opção "Cadastrar Produto"
3. Informar nome do produto: Arroz
4. Informar quantidade: 10
5. Confirmar cadastro

**Resultado Esperado:**  
Produto cadastrado com sucesso.

---

## CT02 – Cadastro de Produto sem nome

**Objetivo:**  
Verificar se o sistema impede o cadastro de produto sem nome.

**Passos:**
1. Acessar o sistema
2. Selecionar a opção "Cadastrar Produto"
3. Deixar o campo nome em branco
4. Informar quantidade: 5
5. Confirmar cadastro

**Resultado Esperado:**  
Sistema deve exibir mensagem de erro informando que o nome é obrigatório.

---

## CT03 – Registrar Entrada de Produto

**Objetivo:**  
Verificar se a entrada de produtos atualiza corretamente o estoque.

**Pré-condição:**  
Produto previamente cadastrado.

**Passos:**
1. Selecionar um produto existente
2. Informar quantidade de entrada: 5
3. Confirmar operação

**Resultado Esperado:**  
Quantidade do produto atualizada corretamente no estoque.

---

## CT04 – Registrar Saída de Produto maior que estoque

**Objetivo:**  
Verificar se o sistema bloqueia a saída de produtos quando a quantidade solicitada é maior que a disponível.

**Pré-condição:**  
Produto com quantidade disponível menor que a solicitada.

**Passos:**
1. Selecionar um produto
2. Informar quantidade maior que a disponível
3. Confirmar operação

**Resultado Esperado:**  
Sistema deve impedir a operação e exibir mensagem de erro.
