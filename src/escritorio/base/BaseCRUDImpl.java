package escritorio.base;

public class BaseCRUDImpl implements BaseCRUD {

    private String arquivo;

    public BaseCRUDImpl(String arquivo) {
        this.arquivo = arquivo;
    }

    @Override
    public void create() {
        System.out.println("Arquivo Criado: " + arquivo + ".txt");
    }

    @Override
    public void read() {
        System.out.printf("Leitura Concluida %s.txt\n", arquivo);
    }
    
}
