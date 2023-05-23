package basico;
public class Array {
    public static void main(String[] args) {
        // <tipo>[] nomeDoArray = new <tipo>[<tamanho>];
        // <tipo>[] nomeDoArray = {<valor>, <valor>, <valor>}

        String[] nomes = new String[5];
        // 0 1 2 3 4

        nomes[2] = "Italo";
        nomes[1] = "Jean";
        nomes[4] = "Ana";
        nomes[0] = "Ayla";
        nomes[3] = "Yan";

        System.out.println(nomes[3]);

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        int[] valores = {10, 20, 30};

        System.out.println(valores[2]);
    }
}
