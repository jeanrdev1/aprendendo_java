package paralelo;

import java.util.Scanner;

public class Bank {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Account Code: ");
        int code = sc.nextInt();

        System.out.print("Account Holder: ");
        String holder = sc.nextLine();
        holder = sc.nextLine();

        Account account = new Account(code, holder);

        while (true) {
            System.out.println("--- Switch Option: 1 - Info / 2 - Deposit / 3 - Withdraw / 0 - Exit ---");
            int option = sc.nextInt();
            if (option == 1) {
                System.out.println(account);
            } else if (option == 2) {
                System.out.print("Value to Deposit: ");
                double value = sc.nextDouble();
                account.deposit(value);
            } else if (option == 3) {
                System.out.print("Value to Withdraw: ");
                double value = sc.nextDouble();
                account.withdraw(value);
            } else if (option == 0) {
                break;
            } else {
                System.out.println("Opção Invalida");
            }
        }

        sc.close();
    }
}
