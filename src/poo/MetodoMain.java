package poo;

public class MetodoMain {
    
    public static void main(String[] args) {
        System.out.println("Sistema Basico de Teste");
        for (int i = 0; i < args.length; i++) {
            System.out.printf("Argumento %d: %s\n", i, args[i]);
        }
    }

}
