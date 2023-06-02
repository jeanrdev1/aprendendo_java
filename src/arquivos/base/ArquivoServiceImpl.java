package arquivos.base;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ArquivoServiceImpl implements ArquivoService {

    private String arquivo;

    public ArquivoServiceImpl(String arquivo) {
        this.arquivo = arquivo;
    }

    @Override
    public void salvar(String value) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo + ".txt"));
            writer.write(value);
            writer.close();
            System.out.println("Arquivo Salvo!");
        } catch (Exception e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }

    @Override
    public String ler() {
        try {
            BufferedReader reader =  new BufferedReader(new FileReader(arquivo + ".txt"));
            String line = reader.readLine();
            reader.close();
            return line;
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
            return null;
        }
    }
    
}
