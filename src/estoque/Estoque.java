package estoque;

import java.util.Scanner;

import estoque.service.EstoqueService;

public class Estoque {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EstoqueService estoqueService = new EstoqueService();

        estoqueService.addItem(10, "Celular Samsung", 1200f);
        estoqueService.addItem(11, "TV Samsung", 2200f);
        estoqueService.addItem(12, "Celular Multilaser", 850);
        estoqueService.addItem(13, "Teclado Mecanico Razer", 1500f);
        estoqueService.addItem(14, "Headset Multilaser", 250);
        estoqueService.addItem(15, "Celular Apple", 7900f);

        System.out.println("Sistema de Estoque");

        while (true) {
            System.out.println("\n\n------- Opcoes Disponiveis -------");
            System.out.println("1 - Consultar Estoque");
            System.out.println("2 - Busca Personalizada");
            System.out.println("3 - Adicionar Item");
            System.out.println("4 - Remover Item");
            System.out.println("5 - Adicionar Quantidade ao Item");
            System.out.println("6 - Remover Quantidade do Item");
            System.out.println("0 - SAIR");
            System.out.print("Digite a Opcao Desejada> ");
            int option = scanner.nextInt();

            if (option == 1) {
                System.out.println("Consultar Estoque");
                
                estoqueService.showStock();


            } else if (option == 2) {
                System.out.println("Busca Personalizada");
                System.out.print("Digite o codigo ou partes do nome> ");
                String text = scanner.nextLine();
                text = scanner.nextLine();

                estoqueService.specialSearch(text);


            } else if (option == 3) {
                System.out.println("Adicionar Item");
                System.out.print("Digite o codigo do item> ");
                int code = scanner.nextInt();
                System.out.print("Digite o nome do item> ");
                String name = scanner.nextLine();
                name = scanner.nextLine();
                System.out.print("Digite o valor do item> ");
                float value = Float.parseFloat(scanner.next().replace(',', '.'));

                estoqueService.addItem(code, name, value);


            } else if (option == 4) {
                System.out.println("Remover Item");
                System.out.print("Digite o codigo do item> ");
                int code = scanner.nextInt();

                estoqueService.removeItem(code);


            } else if (option == 5) {
                System.out.println("Adicionar Quantidade ao Item");
                System.out.print("Digite o codigo do item> ");
                int code = scanner.nextInt();
                System.out.print("Digite a quantidade> ");
                int ammount = scanner.nextInt();

                estoqueService.addAmmount(code, ammount);


            } else if (option == 6) {
                System.out.println("Remover Quantidade do Item");
                System.out.print("Digite o codigo do item> ");
                int code = scanner.nextInt();
                System.out.print("Digite a quantidade> ");
                int ammount = scanner.nextInt();

                estoqueService.removeAmmount(code, ammount);


            } else {
                System.out.println("SISTEMA FINALIZADO");
                break;
            }
        }

        scanner.close();

    }
}
