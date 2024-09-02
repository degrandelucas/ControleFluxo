import java.util.Scanner; // Importar a classe Scanner do pacote java.util
/**
 * A classe <code>Contador</code> é responsável por receber dois números do usuário e calcular a diferença entre eles.
 * <p>Se o primeiro número for maior ou igual ao segundo número, ou se os números forem iguais, uma exceção será lançada.
 * O método principal da classe lida com a entrada do usuário, realiza o cálculo usando a classe <code>Diferenca</code>, e imprime a sequência de números.
 * 
 * @author Lucas Degrande
 * @version 2.0
 * @since 2024-08-31
 * 
 */

public class Contador {
    
    /**
     * O método principal da classe. Recebe dois números do usuário, calcula a diferença entre eles usando a classe <code>Diferenca</code>,
     * e imprime a sequência de números do 1 até o resultado da diferença.
     * <p>Se houver uma exceção durante o cálculo, ela será tratada e uma mensagem de erro será exibida.
     * 
     * @param args Argumentos da linha de comando. Não são utilizados neste método.
     * @throws Exception Se ocorrer um erro genérico durante a execução.
     */
    public static void main(String[] args) throws Exception {

        Scanner entradaDados = new Scanner(System.in);

        try {
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
        } finally{
            entradaDados.close();
        }
    }
}
