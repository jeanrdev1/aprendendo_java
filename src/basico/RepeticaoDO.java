package basico;
public class RepeticaoDO {
    public static void main(String[] args) {
        // do { <codigo aqui> } while (<condição>);

        int valor = 5;

        do {
            System.out.println("Executei");
        } while (valor < 3);

        while (valor < 3) {
            System.out.println("Executei");
        }
    }
}
