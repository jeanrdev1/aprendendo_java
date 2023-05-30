package poo;

public class ObjetoInit {

    public static void main(String[] args) {
        
        Objeto obj = new Objeto();

        obj.setNome("Teste");
        obj.setCodigo(-5);

        System.out.println(obj.getNome());
        System.out.println(obj.getCodigo());
        System.out.println(obj.getDescricao());
    }
}
