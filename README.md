# Contador - Aplicação de Contagem de Números

Este projeto é uma aplicação Java que realiza a contagem de números entre dois valores fornecidos pelo usuário. A aplicação coleta dois números do usuário, calcula a diferença entre eles e exibe uma sequência de números até o valor resultante da diferença. Caso o primeiro número seja maior ou igual ao segundo número, uma exceção será lançada e tratada.

## Funcionalidades Principais

- **Coleta de Números do Usuário:** Solicita ao usuário que insira dois números inteiros.
- **Cálculo da Diferença:** Utiliza a classe `Diferenca` para calcular a diferença entre os dois números fornecidos.
- **Exibição da Sequência:** Imprime a sequência de números do 1 até a diferença calculada.
- **Tratamento de Exceções:** Lida com casos em que o primeiro número é maior ou se ambos são iguais, lançando exceções apropriadas.

## Passo a Passo do Projeto

### Passo 1: Coletar Números

Quando o programa é iniciado, o usuário é solicitado a inserir dois números inteiros. Estes números são então utilizados para calcular a diferença entre eles.

### Passo 2: Calcular a Diferença

O cálculo da diferença é realizado pela classe `Diferenca`. Se o primeiro número for maior que o segundo ou se forem iguais, uma exceção `IllegalArgumentException` é lançada.

### Passo 3: Exibir a Sequência

Após o cálculo bem-sucedido, o programa exibe uma sequência de números do 1 até o resultado da diferença.

### Passo 4: Tratamento de Exceções

Se ocorrer uma exceção durante o cálculo, uma mensagem de erro é exibida. Além disso, uma exceção genérica é lançada diretamente no método `main` para indicar um erro genérico na execução.

## Tecnologias Utilizadas

- **Java:** Linguagem de programação utilizada para desenvolver a aplicação.
- **Scanner (java.util.Scanner):** Pacote utilizado para capturar entradas do usuário via console.