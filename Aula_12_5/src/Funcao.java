public class Funcao {


    // declaracao da funcao
    static int somar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }



    public static void main(String[] args) {

        // chama a funcao
        int total = somar(3,5);
        System.out.println("soma = " + total);
    }

}
