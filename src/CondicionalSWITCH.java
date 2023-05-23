public class CondicionalSWITCH {
    public static void main(String[] args) {

        // switch (<valor>)
        // case <valorPossivel1>:
        // codigo aqui
        // break;
        // case <valorPossivel2>:
        // codigo aqui
        // break;
        // case <valorPossivel3>:
        // codigo aqui
        // break;
        // default:
        // codigo aqui
        // break;

        String nome = "Ayla";

        switch (nome) {
            case "Jean":
                System.out.println("Patrick");
                break;
            case "Ana":
                System.out.println("Carolina");
                break;
            case "Italo":
                System.out.println("Ribeiro");
                break;
            default:
                System.out.println("Pessoa Nao Encontrada!");
                break;
        }

        int diaDaSemana = 1;

        switch (diaDaSemana) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terca");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia Invalido!");
                break;
        }

    }
}
