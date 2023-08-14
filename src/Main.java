public class Main {
    public static void main(String[] args) {

        double precoProdutoCarneKG = 39.50d;
        boolean alunoEstaMatriculado = false;

        char sexo = 'M';
        char numero = '5';
        byte diaAtualNoAno = 110;

        long populacaoBrasil = 220000000;
        float precoProdutoPaoKg = 0.85f;

        String mensagemPrecoCarne = "Preço da Carne: " + precoProdutoPaoKg;
        double valor =1.05d;

        System.out.println(valor);
        System.out.println(mensagemPrecoCarne);

        System.out.println("Preço da Carne em quilos é: " + precoProdutoCarneKG);
        System.out.println("O Alunos está Matriculado: " + alunoEstaMatriculado);
        System.out.println("Sexo: " + sexo);
        System.out.println("O número é: " + numero);
        System.out.println("O dia atual do ano é: " + diaAtualNoAno);
        System.out.println("A população do Brasil é: " + populacaoBrasil);
        System.out.println("O preço do pão em quilos é: " + precoProdutoPaoKg);

        System.out.printf("O preço do pão é: %.4f", precoProdutoPaoKg);
    }
}