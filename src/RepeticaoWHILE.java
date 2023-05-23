public class RepeticaoWHILE {
    public static void main(String[] args) {
        // while (<copndição>) { <codigo aqui> }

        int bois = 0;

        while (bois < 10) {
        System.out.println(bois + 1);
        System.out.println("Contei +1");
        bois++;
        }

        System.out.println("bois contados: " + bois);

        int boisNoPasto = 99;

        int contagem = 0;

        while (boisNoPasto >= 1) {
            contagem++;
            boisNoPasto--;
        }

        System.out.println("Bois Contados: " + contagem);

    }
}
