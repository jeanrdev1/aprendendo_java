package heranca.objetos;

public class FilhoComplexo extends PaiComplexo {
    
    public FilhoComplexo(String nome, int idade) {
        super(nome, idade);
    }

    public void printTest() {
        System.out.println(teste);
    }

    @Override
    public String toString() {
        return "Filho - " + super.toString();
    }
}
