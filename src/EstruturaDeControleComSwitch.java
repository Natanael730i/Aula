public class EstruturaDeControleComSwitch {

    public static void main(String[] args) {

        int finalNumeroDaPlaca = 2;

        switch (finalNumeroDaPlaca) {
            case 1 -> System.out.println("Vencimento para Janeiro");
            case 2 -> System.out.println("Vencimento para fevereiro");
            default -> System.out.println("Vencimento sem data");
        }
    }

}
