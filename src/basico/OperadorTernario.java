package basico;
public class OperadorTernario {
    public static void main(String[] args) {
        // ? : Operador Ternario
        // <condicional> ? <se verdadeiro> : <se falso>

        int normal = 140;
        int turbo = 220;

        boolean possuiTurbo = false;

        int velocidade = possuiTurbo ? turbo : normal;

        System.out.println(velocidade);
    }
}
