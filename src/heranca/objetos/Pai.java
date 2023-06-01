package heranca.objetos;

public class Pai {

    public String nome;

    public int idade;

    @Override
    public String toString() {
        return String.format("PAI - Nome: %s  Idade: %d", nome, idade);
    }
}
