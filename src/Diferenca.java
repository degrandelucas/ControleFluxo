public class Diferenca {

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