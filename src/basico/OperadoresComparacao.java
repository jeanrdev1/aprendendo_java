package basico;
import java.util.Scanner;

public class OperadoresComparacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // ! Negação

        // == Igual a 'String > .equals(<valor>)'
        // != Diferente de
        // > Maior que
        // < Menor que
        // >= Maior ou igual a
        // <= Menor ou igual a

        int a = 8;
        int b = 6;

        String referencia = "Jean";
        String name = scanner.next();
        System.out.println(referencia.equals(name));

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        scanner.close();
    }
}
