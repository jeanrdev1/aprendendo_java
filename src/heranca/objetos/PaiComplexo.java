package heranca.objetos;

public class PaiComplexo {
    
    // public, private
    // protected

    private String nome;

    private int idade;

    protected boolean teste;

    public PaiComplexo(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s  Idade: %d", nome, idade);
    }
}
