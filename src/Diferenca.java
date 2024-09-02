/**
 * A classe <code>Diferenca</code> é responsável por calcular a diferença entre dois números.
 * <p>Se o primeiro número for maior que o segundo número, ou se os números forem iguais, uma exceção será lançada.
 * 
 * @author Lucas Degrande
 * @version 1.0
 * @since 2024-08-31
 */
public class Diferenca {
    /**
     * Calcula a diferença entre dois números.
     * <p>Se o primeiro número for maior que o segundo número, ou se os números forem iguais, uma exceção será lançada.
     * 
     * @param numero1 Primeiro número.
     * @param numero2 Segundo número.
     * @return A diferença entre <code>numero2</code> e <code>numero1</code>.
     * @throws IllegalArgumentException Se <code>numero1</code> for maior que <code>numero2</code> ou se forem iguais.
     */
    public int calcular(int numero1, int numero2){

        if (numero1 > numero2){
            throw new IllegalArgumentException("Número 1 não pode ser maior que Número 2.");
        }
        if (numero1 == numero2){
            throw new IllegalArgumentException("Número 1 não pode ser igual ao Número 2.");
        }
        return numero2 - numero1;
                
    }
}