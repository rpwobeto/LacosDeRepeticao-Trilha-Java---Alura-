public class TestaCondicional2 {

    public static void main(String[] args) {
        System.out.println("Testando condicionais");

        int idade = 18;
        int quantidadePessoas = 2;
        boolean acompanhado = quantidadePessoas >= 2;
        boolean idades = true;

        if (idade >= 18 && acompanhado) {
            System.out.println("Você tem mais que 18 anos! Seja bem vindo");
        } else {
            System.out.println("Infelizmente você não pode entrar");
        }
    }
}
