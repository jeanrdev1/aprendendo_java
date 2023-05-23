package basico;
public class RepeticaoForEach {
    public static void main(String[] args) {
        // for-each > para cada
        // for (<tipo> nomeDoElemento : <array>) {}

        String[] lista = {"Carro", "Caneta", "Lapis", "Celular", "Caderno", "Cachorro", "Mouse", "Teste"};

        for (String nome : lista) {
            System.out.println(nome);
        }
    }
}
