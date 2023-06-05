package heranca;

import heranca.objetos.Filho;
import heranca.objetos.FilhoComplexo;

public class Principal {
    
    public static void main(String[] args) {
        
        Filho filho = new Filho();

        filho.nome = "Italo";
        filho.idade = 2;

        //System.out.println(filho);

        FilhoComplexo complexo = new FilhoComplexo("Italo", 2);

        System.out.println(complexo.toString());

        // Filho2Complexo complexo2 = new Filho2Complexo("Italo", 2);
    }
}
