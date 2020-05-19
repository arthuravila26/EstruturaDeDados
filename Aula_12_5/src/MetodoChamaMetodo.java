public class MetodoChamaMetodo {

    // metodo que mostra uma cidade
    static String mostrarCidade(String cidade) {
        return "você mora em " + cidade;

    }

    // metodo que chama o metodo mostrarCidade
    static void apresentaNome(String nome, String cidade) {
        System.out.println("Seu nome é " + nome + " e " + mostrarCidade(cidade));
    }



    public static void main(String[] args) {

        apresentaNome("Cláudia", "Blumenau");
    }

}