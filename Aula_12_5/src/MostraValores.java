public class MostraValores {

    // retorno (String)
    // dois parametros inteiros   (4, 9)
    // funcinalidade: mostrar os numeros a partir do primeiro parametro ate o ultimo (4 5 6 7 8 9)

    // criar o metodo: mostrarValores
    static String mostrarValores(int numInicial, int numFinal) {
        String valor = "";

        for (int i = numInicial; i <= numFinal; i++) {
            valor = valor + i + " ";
        }

        return valor;

    }



    public static void main(String[] args) {

        System.out.println(mostrarValores(4, 9));

    }

}