public class MultiplosDe3 {

    public static void main(String[] args) {

        //Usando FOR com IF
        int numero = 0;
        for (int i = 1; i < 100; i++){
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
        //Usando FOR sem IF
        for (int i = 3; i < 100; i += 3 ){
            System.out.println(i);
        }
    }
}
