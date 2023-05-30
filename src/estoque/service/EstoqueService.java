package estoque.service;

import java.util.ArrayList;
import java.util.List;

import estoque.entity.Item;

public class EstoqueService {
    
    private List<Item> stock = new ArrayList<>();

    public void showStock() {
        System.out.println("Lista de Items");
        for (Item item : stock) {
            System.out.println(item);
        }
    }

    public void addItem(int code, String name, float value) {
        if (existsByCodeOrName(code, name)) {
            System.out.printf("Codigo: %d ou Nome: %s ja Cadastrado!\n", code, name);
        } else {
            Item item = new Item(code, name, value);
            stock.add(item);
        }
    }

    public void removeItem(int code) {
        Item item = getByCode(code);
        if (item == null) {
            System.out.println("Item nao encontrado!");
        } else {
            stock.remove(item);
        }
    }

    private Item getByCode(int code) {
        for (Item item : stock) {
            if (item.getCode() == code) {
                return item;
            }
        }
        return null;
    }

    private boolean existsByCodeOrName(int code, String name) {
        for (Item item : stock) {
            if (item.getCode() == code || item.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
