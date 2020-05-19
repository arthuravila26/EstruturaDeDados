import java.text.DecimalFormat;

public class Funcao_v2 {


    // declaracao da funcao
    public static int somar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }



    static String multiplicar(double a, double b) {
        DecimalFormat df = new DecimalFormat("#0.00");
        double res = a*b;
        return df.format(res);
    }
}