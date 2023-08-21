import java.util.Scanner;
public class EstruturaDeRepeticaoDoWhile {
    public static void main(String[] args) {

        int codigoProduto = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite o código do produto:");
            codigoProduto = scanner.nextInt();

            if (codigoProduto != 0) {
                if (codigoProduto % 2 == 0) {
                    System.out.println("Número Par!!");
                } else {
                    System.out.println("Número impar!!");
                }
            }

        } while (codigoProduto != 0);

        scanner.close();


    }
}
