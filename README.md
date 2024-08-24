# Relatório de Testes

## 1. Introdução

### a. Descrição da Atividade

Neste relatório, abordamos a atividade de teste de uma aplicação que calcula o valor de cashback para clientes com base em suas compras e grau de fidelidade. A aplicação deve calcular corretamente o percentual de cashback de acordo com faixas de valor e ajustar o valor com base no grau de fidelidade do cliente.

### b. Objetivo dos Testes

O objetivo dos testes é garantir que o sistema de cashback calcule corretamente o valor de recompensas para clientes, conforme as regras estabelecidas. Testamos a funcionalidade que aplica percentuais de cashback em diferentes faixas de valor e ajusta esse valor com base no grau de fidelidade do cliente. Esses testes são importantes para assegurar que a aplicação esteja funcionando conforme o esperado e para identificar e corrigir quaisquer erros ou inconsistências no cálculo.

### c. Conceito de Análise de Valor Limite

A análise de valor limite é uma técnica de teste que se concentra em valores que estão no limite de uma faixa de entrada ou saída, e um pouco acima e abaixo desses limites. É importante porque muitos erros de software ocorrem nas bordas das faixas de valores, e testar esses limites ajuda a garantir que o sistema se comporte corretamente em todas as condições possíveis.

## 2. Análise de Valor Limite

### a. Casos de Teste

#### i. Casos de Teste Projetados

#### i. Lista e Descrição dos Casos de Teste

1. **Cashback para R$ 100,00 com Grau de Fidelidade "Bronze"**
   - **Entradas**: Valor de Compra = R$ 100,00; Grau de Fidelidade = Bronze
   - **Resultado Esperado**: 5.0%

2. **Cashback para Valor Justamente Abaixo de R$ 100,00 com Grau de Fidelidade "Bronze"**
   - **Entradas**: Valor de Compra = R$ 99,99; Grau de Fidelidade = Bronze
   - **Resultado Esperado**: 4.99%

3. **Cashback para Valor Justamente Acima de R$ 100,00 com Grau de Fidelidade "Bronze"**
   - **Entradas**: Valor de Compra = R$ 100,01; Grau de Fidelidade = Bronze
   - **Resultado Esperado**: 10.0%

4. **Cashback para R$ 100,00 com Grau de Fidelidade "Prata"**
   - **Entradas**: Valor de Compra = R$ 100,00; Grau de Fidelidade = Prata
   - **Resultado Esperado**: 10.0%

5. **Cashback para Valor Justamente Abaixo de R$ 100,00 com Grau de Fidelidade "Prata"**
   - **Entradas**: Valor de Compra = R$ 99,99; Grau de Fidelidade = Prata
   - **Resultado Esperado**: 9.99%

6. **Cashback para Valor Justamente Acima de R$ 100,00 com Grau de Fidelidade "Prata"**
   - **Entradas**: Valor de Compra = R$ 100,01; Grau de Fidelidade = Prata
   - **Resultado Esperado**: 15.0%

7. **Cashback para R$ 100,00 com Grau de Fidelidade "Ouro"**
   - **Entradas**: Valor de Compra = R$ 100,00; Grau de Fidelidade = Ouro
   - **Resultado Esperado**: 15.0%

8. **Cashback para Valor Justamente Abaixo de R$ 100,00 com Grau de Fidelidade "Ouro"**
   - **Entradas**: Valor de Compra = R$ 99,99; Grau de Fidelidade = Ouro
   - **Resultado Esperado**: 14.99%

9. **Cashback para Valor Justamente Acima de R$ 100,00 com Grau de Fidelidade "Ouro"**
   - **Entradas**: Valor de Compra = R$ 100,01; Grau de Fidelidade = Ouro
   - **Resultado Esperado**: 20.0%

10. **Cashback para R$ 500,00 com Grau de Fidelidade "Bronze"**
    - **Entradas**: Valor de Compra = R$ 500,00; Grau de Fidelidade = Bronze
    - **Resultado Esperado**: 50.0%

11. **Cashback para Valor Justamente Abaixo de R$ 500,00 com Grau de Fidelidade "Bronze"**
    - **Entradas**: Valor de Compra = R$ 499,99; Grau de Fidelidade = Bronze
    - **Resultado Esperado**: 49.99%

12. **Cashback para Valor Justamente Acima de R$ 500,00 com Grau de Fidelidade "Bronze"**
    - **Entradas**: Valor de Compra = R$ 500,01; Grau de Fidelidade = Bronze
    - **Resultado Esperado**: 75.0%

13. **Cashback para R$ 500,00 com Grau de Fidelidade "Prata"**
    - **Entradas**: Valor de Compra = R$ 500,00; Grau de Fidelidade = Prata
    - **Resultado Esperado**: 75.0%

14. **Cashback para Valor Justamente Abaixo de R$ 500,00 com Grau de Fidelidade "Prata"**
    - **Entradas**: Valor de Compra = R$ 499,99; Grau de Fidelidade = Prata
    - **Resultado Esperado**: 74.99%

15. **Cashback para Valor Justamente Acima de R$ 500,00 com Grau de Fidelidade "Prata"**
    - **Entradas**: Valor de Compra = R$ 500,01; Grau de Fidelidade = Prata
    - **Resultado Esperado**: 100.0%

16. **Cashback para R$ 500,00 com Grau de Fidelidade "Ouro"**
    - **Entradas**: Valor de Compra = R$ 500,00; Grau de Fidelidade = Ouro
    - **Resultado Esperado**: 100.0%

17. **Cashback para Valor Justamente Abaixo de R$ 500,00 com Grau de Fidelidade "Ouro"**
    - **Entradas**: Valor de Compra = R$ 499,99; Grau de Fidelidade = Ouro
    - **Resultado Esperado**: 99.99%

18. **Cashback para Valor Justamente Acima de R$ 500,00 com Grau de Fidelidade "Ouro"**
    - **Entradas**: Valor de Compra = R$ 500,01; Grau de Fidelidade = Ouro
    - **Resultado Esperado**: 125.0%

#### ii. Resultados Esperados

Os resultados esperados foram baseados nas faixas de valor e nos ajustes de grau de fidelidade definidos. Cada caso de teste foca em valores específicos que estão nas bordas das faixas de valor, conforme descrito acima.

### b. Aplicação do Critério

Os valores limites testados foram:
- R$ 100,00 e R$ 500,00, que são os limites das faixas de valor para cashback.
- Testamos também valores ligeiramente acima e abaixo desses limites para verificar a robustez da aplicação em torno dos valores críticos.

## 3. Execução dos Testes

### a. Processo de Execução

Os testes foram executados utilizando uma suíte de testes automatizados que valida o cálculo de cashback. Os casos de teste foram criados para cobrir os limites das faixas de valor e ajustes de fidelidade, e foram executados usando uma ferramenta de testes integrada ao projeto.

### b. Resultados dos Testes

Durante a execução, foram encontradas as seguintes falhas:

1. **`testCashbackAt100Bronze`**: Esperava-se 5.0%, mas o código retornou 10.0%.
2. **`testCashbackAt100Prata`**: Esperava-se 10.0%, mas o código retornou 15.0%.
3. **`testCashbackAt100Ouro`**: Esperava-se 15.0%, mas o código retornou 20.0%.
4. **`testCashbackAt500Bronze`**: Esperava-se 10.0%, mas o código retornou 15.0%.
5. **`testCashbackAt500Prata`**: Esperava-se 15.0%, mas o código retornou 20.0%.
6. **`testCashbackAt500Ouro`**: Esperava-se 20.0%, mas o código retornou 25.0%.

### c. Saídas de Execução

*Logs e prints das telas de resultados podem ser incluídos aqui, se disponíveis.*

### d. Resultados dos Testes de Valor Limite

Os testes projetados para valores de limite falharam em vários casos, sugerindo problemas na aplicação das regras de cálculo de cashback, especialmente em torno dos valores críticos.

### e. Problemas Encontrados

Os problemas identificados indicam que o cálculo do cashback não está seguindo corretamente as faixas e ajustes especificados. A aplicação dos ajustes de fidelidade parece estar incorreta e os valores de cashback não correspondem aos esperados para diferentes níveis de fidelidade.

## 4. Conclusão

### a. Resumo das Descobertas

Os testes revelaram inconsistências significativas na aplicação das regras de cashback, especialmente em relação aos ajustes de fidelidade e faixas de valor. As falhas encontradas indicam que a lógica de cálculo precisa ser revisada e corrigida para garantir que o sistema funcione conforme o esperado.

### b. Avaliação da Robustez

A aplicação mostrou-se menos robusta do que o esperado, com falhas nos limites críticos de valor e ajustes de fidelidade. A correção dos problemas identificados é necessária para assegurar a precisão e confiabilidade do sistema de cashback.

