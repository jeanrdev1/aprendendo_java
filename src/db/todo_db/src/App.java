import java.util.List;

import entity.ToDo;
import service.ToDoService;

public class App {

    public static void main(String[] args) throws Exception {
        ToDoService service = new ToDoService();

        service.create("Titulo Teste", "TEXTO");

        ToDo todo = service.read(1);
        System.out.println(todo);

        System.out.println("SELECT ALL");

        List<ToDo> todos = service.readAll();
        for (ToDo td : todos) {
            System.out.println(td);
        }

        service.delete(2);
        // updateStatus
        service.updateStatus(1);

        todos = service.readAll();
        for (ToDo td : todos) {
            System.out.println(td);
        }
    }
}