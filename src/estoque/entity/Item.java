package estoque.entity;

public class Item {
    private int code;
    private String name;
    private int quantity;
    float value;

    public Item(int code, String name, float value) {
        this.code = code;
        this.name = name;
        this.value = value;
        quantity = 0;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int ammount) {
        quantity += ammount;
    }

    public void removeQuantity(int ammount) {
        // validando se a quantidade a remover é maior que o estoque existente
        if (ammount > quantity) {
            System.out.println("Quantitdade Invalida. Disponiveis: " + quantity);
            // return em uma função com retorno void finaliza a função no momento que o return for executado
            return;
        }
        quantity -= ammount;
    }

    public float totalValue() {
        return value * quantity;
    }

    @Override
    public String toString() {
        return String.format("Codigo: %d  Nome: %s  Quantidade: %d  Valor Unitario: %.2f  Valor Total: %.2f", code, name, quantity, value, totalValue());
    }
}
