
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        runLinkList();
        runQueue();

    }

    private static void runQueue(){
        Queue<String> cola = new ArrayDeque<>();
        cola.offer("Jose");
        cola.offer("Andres");
        cola.offer("Ana");

        System.out.println(cola.isEmpty());
        System.out.println(cola.peek()); // devuelve Jose
        System.out.println(cola.size()); // 3
        System.out.println(cola.poll()); // saca a jose
        System.out.println(cola.size()); // 2

        while(!cola.isEmpty()){
            String cliente = cola.poll();
            System.out.println("Atendi a "+cliente);
        }

    }
    private static void runLinkList(){
        LinkedList<String> nombres = new LinkedList<>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Diago");
        nombres.add("Mateo");

        String primero = nombres.getFirst();

        System.out.println(primero);
        System.out.println(nombres.getFirst());
        System.out.println(nombres.get(4));

        System.out.println(nombres.getLast());
        System.out.println();

        System.out.println(nombres.pop());
        System.out.println(nombres.getLast());


    }
}
