import java.util.Scanner;
public class EstruturaRepeticaoComWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número Inicial");
        int numeroInicial = scanner.nextInt();

        System.out.println("DIgite um número Final");
        int numeroFinal = scanner.nextInt();

        while (numeroInicial <= numeroFinal){
             System.out.println(numeroInicial);
             numeroInicial++;
        }
        scanner.close();
    }
}
