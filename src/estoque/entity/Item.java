package estoque.entity;

public class Item {
    private int code;
    private String name;
    int quantity;
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

    public float totalValue() {
        return value * quantity;
    }

    @Override
    public String toString() {
        return String.format("Codigo: %d  Nome: %s  Quantidade: %d  Valor Unitario: %.2f  Valor Total: %.2f", code, name, quantity, value, totalValue());
    }
}
