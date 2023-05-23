package poo;

public class Pessoa {

    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void imprimir() {
        System.out.println("Nome: " + nome + "  Idade: " + idade);
    } 

}
