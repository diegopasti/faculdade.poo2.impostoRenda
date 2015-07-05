# Encoding: utf8
# language: pt
Funcionalidade: Calcular Imposto

Scenario Outline: Teste da Transacao de Calculo do Imposto de Renda.

Dado que Eu ganho "<Salario>"
E que Eu tenho "<Filhos>" Filhos
Quando eu calcular 
Entao o valor do imposto sera R$ "<Imposto>"

Exemplo:
    | Salario | Filhos | Imposto |
    | 0.0 | 0 | 0.0 |
    | 1500.0 | 0 | 0.0 |
    | 1500.0 | 1 | 0.0 |
    | 1500.0 | 2 | 0.0 |
    | 1500.0 | 3 | 0.0 |
    
    | 2500.0 | 0 | 0.0 |
    | 2500.0 | 1 | 0.0 |
    | 2500.0 | 2 | 0.0 |
    | 2500.0 | 3 | 0.0 |
    
    | 3500.0 | 0 | 0.0 |
    | 3500.0 | 1 | 0.0 |
    | 3500.0 | 2 | 0.0 |
    | 3500.0 | 3 | 0.0 |
    

    