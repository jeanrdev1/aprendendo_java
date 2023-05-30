package estoque;

import estoque.service.EstoqueService;

public class Estoque {
    public static void main(String[] args) {
        
        EstoqueService estoqueService = new EstoqueService();

        estoqueService.addItem(1, "Caderno", 14.99f);
        estoqueService.addItem(2, "Celular", 1214.99f);
        estoqueService.addItem(3, "Regua", 4.99f);

        estoqueService.showStock();

        estoqueService.removeItem(10);
        estoqueService.removeItem(2);

        estoqueService.showStock();
    }
}
