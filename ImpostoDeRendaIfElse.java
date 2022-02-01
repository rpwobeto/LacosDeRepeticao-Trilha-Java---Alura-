

public class ImpostoDeRendaIfElse {
    public static void main(String[] args) {

        double salario = 4300;

        System.out.println("O salário atual é R$ " + salario );

        if (salario >= 0.0 && salario < 1900.0) {
            System.out.println("Isento de Imposto de Renda");
        } else if (salario >= 1900.0 && salario <= 2800.0) {
            System.out.println(String.format("Imposto faixa 1 = R$ %.2f", (salario * 0.075)));
        } else if (salario >= 2800.01 && salario <= 3751.0) {
            System.out.println(String.format("Imposto faixa 2 = R$ %.2f", (salario * 0.15)));
        } else if (salario >= 3751.1 && salario <= 4664.0) {
            System.out.println(String.format("Imposto faixa 3 = R$ %.2f", (salario * 0.225)));
        } else{
            System.out.println(String.format("Imposto faixa mais alta = R$ %.2f",  (salario * 0.275)));
        }
    }
}

//        De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142
//        De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350
//        De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636