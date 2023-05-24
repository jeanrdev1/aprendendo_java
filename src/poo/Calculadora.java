package poo;

// Encapsulamento
// public > Encapsulamento onde o objeto é vesivel para qualquer outra classe no codigo
// private > Encapsulamento que so permite o objeto ser visto pela classe atual

// void > Que nao retorna nada
// String, int, float, double, boolean

public class Calculadora {
    
    // + - * /

    // <encapsulamento> <retorno> <nomeDaFuncao>(<parametros 'opcional'>) { <codigo> }

    public static void soma(int a, int b) {
        System.out.println(a + b);
    }

    public static void soma(double a, double b) {
        System.out.println(a + b);
    }

    public static void subtracao(int a, int b) {
        System.out.println(a - b);
    }

    // static > Permite o acesso sem a criação de um objeto
}
