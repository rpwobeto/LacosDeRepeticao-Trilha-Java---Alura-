public class TesteEscopo {

    public static void main(String[] args) {
        System.out.println("Testando escopo");

        int idade = 18;
        int quantidadePessoas = 2;
        //boolean acompanhado = quantidadePessoas >= 2;
        boolean idades = true;
        boolean acompanhado;

        if (quantidadePessoas >= 2) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }

        System.out.println("valor de acompanhado = " + acompanhado);
    }
}
