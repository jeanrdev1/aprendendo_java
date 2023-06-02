package arquivos;

import java.time.LocalDateTime;

public class Arquivos {
    public static void main(String[] args) {
        NotasService ns = new NotasService();
        RelatoriosService rs = new RelatoriosService();

        ns.salvar(LocalDateTime.now().toString());

        System.out.println(ns.ler());

        rs.salvar(LocalDateTime.now().toString());

        System.out.println(rs.ler());

    }
}
