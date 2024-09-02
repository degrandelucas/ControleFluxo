import java.util.Scanner; // Importar a classe Scanner do pacote java.util

/**
 * A classe Contador recebe dois números de entrada via terminar pelo usuário.
 * <p>Ela contém métodos para registrar entrada, saída e análise para verificar se o segundo número é maior que o primeiro número (pré requisito),
 * caso contrário irá lançar um erro que é tratado no método main
 * 
 * @author Lucas Degrande
 * @version 1.0
 * @since 2024-08-31
 * 
 */

public class Contador {    
    public static void main(String[] args) throws Exception {

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Olá, iremos realizar a contagem do primeiro número que digitar, até o segundo número.");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.print("Digite o 1º Número: ");
        int numero1 = entradaDados.nextInt();
        System.out.print("Digite o 2º Número: ");
        int numero2 = entradaDados.nextInt();

        Diferenca diferenca = new Diferenca();

        int resultado = 0;

        try {
            resultado = diferenca.calcular(numero1, numero2);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erro de inserção: " + e.getMessage());

            // Lançando uma exceção genérica diretamente no main
            throw new Exception("Ocorreu um erro no método main");
        }

        System.out.println("A diferença entre os números é: " + resultado);
        System.out.println("Sequência de 1 até " + resultado +": ");
        for(int i = 1; i <= resultado; i++){
            System.out.println(i);
        }
    }
}
