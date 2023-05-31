package basico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
    
    public static void main(String[] args) {
        // <modificadorDeAcesso> List<<tipoDoItemDaLista>> nomeDaLista = new ArrayList<>();

        // List
        // ArrayList
        // Arrays
        // Stream < Funcionalidade

        List<String> nameList = new ArrayList<>();

        nameList.add("Teste");
        nameList.add("Jean");
        nameList.add("Aluno");
        nameList.add("Celular");
        nameList.add("abc");

        for (String nome : nameList) {
            System.out.println(nome);
        }

        nameList.remove("Aluno");
        
        System.out.println("==========================");

        for (String nome : nameList) {
            System.out.println(nome);
        }

        System.out.println(nameList.isEmpty());

        nameList.addAll(Arrays.asList("Ana", "Italo", "Novo", "Professor", "Caixa"));

        System.out.println("==========================");

        List<String> teste = new ArrayList<>(Arrays.asList("123", "456", "789"));

        nameList.addAll(teste);

        // nameList.forEach((nome) -> {
        //     System.out.println(nome);
        // });

        nameList.stream().filter(name -> name.contains("a")).collect(Collectors.toList());

        // List<String> testeList = new ArrayList<>();
        // for (String name : nameList) {
        //     if (name.contains("a")) {
        //         testeList.add(name);
        //     }
        // }
    }
}
