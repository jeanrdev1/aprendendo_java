package basico;
public class CondicionalIF {
    public static void main(String[] args) {
        
        boolean acompanhadoDosPais = false;

        int idade = 15;

        // if (<condição>) { corpor do codigo }

        if (idade >= 18 || acompanhadoDosPais) {
            System.out.println("Possui Permissao");
        }

        // if - se / else - se não

        // if (<condição>) { Se Condição For Verdadeira } else { Se Condição for Falsa}

        if (idade >= 18) {
            System.out.println("Maior de Idade");
        } else {
            System.out.println("Menor de Idade");
        }

        // if (<condição1>) else if (<condição2>)

        if (idade >= 60) {
            System.out.println("idoso");
        } else if (idade >= 18) {
            System.out.println("adulto");
        } else {
            System.out.println("crianca");
        }
    }
}
