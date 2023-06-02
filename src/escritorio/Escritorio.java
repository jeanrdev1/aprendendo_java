package escritorio;

import escritorio.service.NotasService;
import escritorio.service.RelatoriosService;

public class Escritorio {
    
    public static void main(String[] args) {
        NotasService notasService = new NotasService();
        RelatoriosService relatoriosService = new RelatoriosService();

        System.out.println("Meu Escritorio");
        notasService.create();
        notasService.read();

        relatoriosService.create();
        relatoriosService.read();
    }
}
