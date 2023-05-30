package paralelo;

public class Account {
    
    private int code; // NUNCA MUDA
    private String holder; // NUNCA MUDA
    private double balance;

    // Construtor > Passar valores na hora da criação do objeto

    public Account(int code, String holder) {
        this.code = code;
        this.holder = holder;
    }

    // Getter > Metodo que retorna uma variavel desejada

    public int getCode() {
        return code;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    // Setter > Atribui valor a variavel desejada

    public void deposit(double value) {
        double oldBalance = balance;
        balance += value;
        System.out.println("Old Balance: " + oldBalance + "  New Balance: " + balance);
    }

    public void withdraw(double value) {
        if (value <= balance) {
            double oldBalance = balance;
            balance -= value;
            System.out.println("Old Balance: " + oldBalance + "  New Balance: " + balance);
        } else {
            System.out.println("Error: Invalid Value!");
        }
    }

    @Override
    public String toString() {
        return String.format("Code: %d  Holder: %s  Balance: %.2f", code, holder, balance);
    }

}
