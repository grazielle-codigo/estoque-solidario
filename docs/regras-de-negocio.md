# Regras de Negócio — Estoque Solidário

## RN-01 – Nome do produto é obrigatório
Todo produto deve possuir um nome válido para ser cadastrado no sistema.

## RN-02 – Quantidade não pode ser negativa
Não é permitido cadastrar ou atualizar produtos com quantidade menor que zero.

## RN-03 – Produto inexistente não pode ser atualizado
O sistema deve impedir atualização de produtos que não existam no banco de dados.

## RN-04 – Produto inexistente não pode ser removido
O sistema deve impedir a exclusão de produtos inexistentes.

## RN-05 – Cada produto possui um identificador único
Cada produto deve ser identificado por um ID único gerado automaticamente.
