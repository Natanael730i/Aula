public class EstruturaDeControleComIf {

    public static void main(String[] args) {
        String nome = "Lucas";
        double peso = 100.0;
        double altura = 1.70;
        double imc = peso / (altura * altura);

        System.out.printf("\nO IMC do %s é: %.2f",nome, imc);

        boolean resultado = imc < 18.5;

        System.out.println(resultado);

        if (resultado){
            System.out.println("Abaixo do peso ideal");
        }else if (imc >= 18.5 && imc < 25){
            System.out.println("Peso ideal");
        }
        else if (imc>= 25 && imc<30){
            System.out.println("Obesidade de grau 1");
        } else if (imc >= 30 && imc<40) {
            System.out.println("Obesidade de grau 2");
        } else{
            System.out.println("Obesidade grau 3");
        }
    }

}
