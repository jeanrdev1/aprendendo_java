package poo;

public class Objeto {

    private String nome;
    private int codigo;
    private String descricao;
    
    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        if (descricao == null || descricao.isEmpty()) {
            return "SEM DESCRICAO";
        }
        return descricao;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public void setCodigo(int novoCodigo) {
        if (codigo > 0) {
            codigo = novoCodigo;
        } else {
            System.out.println("Valor do Codigo Invalido!");
        }
    }

    public void setDescricao(String novaDescricao) {
        descricao = novaDescricao;
    }

}
