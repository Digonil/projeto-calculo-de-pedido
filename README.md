## APLICAÇÃO PARA CÁLCULO DE VALOR DE UM PEDIDO

Com base nos dados indicados pelo usuário, a aplicação irá calcular o valor total do produto, considerando seu valor de frete e desconto.

## Dados solicitados ao usuário referente ao pedido
- Código do produto;
- Valor básico;
- porcentagem de desconto;

## Dados retornados ao usuário:
- Código do pedido;
- Valor total;

## Regra de negócio para cálculo do frete

Os valores de frete serão cálculados conforme as regras abaixo:
- Valor básico do pedido abaixo de R$ 100,00 -> Frete: R$ 20,00;
- Valor básico do pedido entre R$ 100,00 e R$ 200,00 (Inclusive) -> Frete: R$ 12,00;
- Valor básico do pedido acima de R$ 200,00 -> Frete grátis;

## Desconto do produto
A porcentagem de desconto do produto será definida pelo usuário.

## Considerações finais

Após o cálculo do valor do produto, a aplicação irá solicitar ao usuário se ele deseja realizar outra operação ou finalizar a mesma.


## Tecnologias utilizadas:
- JAVA - Versão 17;
- Springboot - Versão 3.1.0;
- IDE - Intellij