public class ExemploEstuturaRepeticaoFor {

    public static void main(String[] args) {

        //Valor "10" de forma estática
        for (int i = 0; i <= 10; i ++) {
            System.out.println("Número do indice: " + i);
        }

        //Valor em uma variável
        int tamanho = 10;
        for (int i = 0; i <= tamanho; i ++) {
            System.out.println("Número do indice: " + i);
        }
    }

}