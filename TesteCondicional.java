public class TesteCondicional {

    public static void main(String[] args) {
        System.out.println("Testando condicionais");

        int idade = 16;
        int quantidadePessoas = 3;

        if (idade >= 18) {
            System.out.println("Você tem mais que 18 anos!");
        } else {
            if(quantidadePessoas >=2){
                System.out.println("Você não tem 18 anos, mas pode entrar, pois está acompanhado por " + quantidadePessoas + " pessoas.");
            }
            System.out.println("Infelizmente você não pode entrar");
        }
    }
}
