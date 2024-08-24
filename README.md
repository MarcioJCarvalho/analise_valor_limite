# Cálculo de Cashback com Base em Compras e Grau de Fidelidade do Cliente

## Descrição

**COMO** um analista de marketing,  
**QUERO** que o sistema calcule o valor de cashback que os clientes recebem com base em suas compras e no grau de fidelidade,  
**PARA** garantir que as recompensas sejam aplicadas corretamente e que os clientes fiéis sejam incentivados a comprar mais.

## Critérios de Aceitação

1. O sistema deve registrar os valores das compras dos clientes, a porcentagem de cashback oferecida e o grau de fidelidade do cliente.

   ### O cálculo de cashback deve ser baseado em:

   - **Valor Total das Compras**: Total gasto pelo cliente em um período específico.
   - **Percentual de Cashback Baseado em Faixas de Valor**:
     - Até R$ 100: Cashback de 5%.
     - De R$ 100,01 até R$ 500: Cashback de 10%.
     - Acima de R$ 500: Cashback de 15%.
   - **Grau de Fidelidade do Cliente**:
     - **Bronze**: Nenhum ajuste.
     - **Prata**: Aumento de 5% no percentual de cashback.
     - **Ouro**: Aumento de 10% no percentual de cashback.

2. O valor de cashback final deve ser calculado e apresentado ao cliente de forma clara.

## Problemas Identificados nos Testes de Cashback

Durante a execução dos testes de cashback, foram encontrados problemas nos valores esperados para o cashback em diferentes faixas de valor e graus de fidelidade. Abaixo estão os detalhes dos erros:

### Erros Identificados

1. **`testCashbackAt100Bronze`**
   - **Valor da Compra**: R$ 100,00
   - **Grau de Fidelidade**: Bronze
   - **Percentual Esperado**: 5.0%
   - **Percentual Obtido**: 10.0%
   - **Descrição**: O código está aplicando 10% de cashback em vez dos 5% esperados para compras de até R$ 100,00.

2. **`testCashbackAt100Prata`**
   - **Valor da Compra**: R$ 100,00
   - **Grau de Fidelidade**: Prata
   - **Percentual Esperado**: 10.0%
   - **Percentual Obtido**: 15.000000000000002%
   - **Descrição**: O código está aplicando 15% de cashback em vez dos 10% esperados para compras de até R$ 100,00.

3. **`testCashbackAt100Ouro`**
   - **Valor da Compra**: R$ 100,00
   - **Grau de Fidelidade**: Ouro
   - **Percentual Esperado**: 15.0%
   - **Percentual Obtido**: 20.0%
   - **Descrição**: O código está aplicando 20% de cashback em vez dos 15% esperados para compras de até R$ 100,00.

4. **`testCashbackAt500Bronze`**
   - **Valor da Compra**: R$ 500,00
   - **Grau de Fidelidade**: Bronze
   - **Percentual Esperado**: 10.0%
   - **Percentual Obtido**: 15.0%
   - **Descrição**: Para valores de R$ 500,00, o código está aplicando 15% de cashback em vez dos 10% esperados para essa faixa de valor.

5. **`testCashbackAt500Prata`**
   - **Valor da Compra**: R$ 500,00
   - **Grau de Fidelidade**: Prata
   - **Percentual Esperado**: 15.0%
   - **Percentual Obtido**: 20.0%
   - **Descrição**: O código está aplicando um aumento adicional de 5%, totalizando 20%, em vez dos 15% esperados para essa combinação de valor e grau de fidelidade.

6. **`testCashbackAt500Ouro`**
   - **Valor da Compra**: R$ 500,00
   - **Grau de Fidelidade**: Ouro
   - **Percentual Esperado**: 20.0%
   - **Percentual Obtido**: 25.0%
   - **Descrição**: O código está aplicando um aumento adicional de 5%, totalizando 25%, em vez dos 20% esperados para essa combinação de valor e grau de fidelidade.

---

Esses erros sugerem que há uma inconsistência nas regras aplicadas ao calcular o cashback em diferentes faixas de valor e níveis de fidelidade. É necessário revisar a lógica de cálculo para garantir que os percentuais corretos sejam aplicados.