package poo;

public class Init {
    
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Jean", 29);
        Pessoa p2 = new Pessoa("Ana", 25);

        p1.imprimir();

        p2.nome = "Ana";
        p2.idade = 27;

        p2.imprimir();

    }

}
