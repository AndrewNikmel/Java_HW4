import java.util.Deque;
import java.util.LinkedList;

public class task2 {


    public static Deque enQueue(LinkedList list, String element) {
        list.addLast(element);
        return list;
    }
    
    public static Deque deQueue(LinkedList list) {
        System.out.println(list.getFirst());
        list.removeFirst();
        return list;
    }
    public static void first(LinkedList list) {
        System.out.println(list.getFirst());
    }
}


// Реализуйте очередь с помощью LinkedList со следующими методами:
// • enqueue() — помещает элемент в конец очереди,
// • dequeue() — возвращает первый элемент из очереди и удаляет его,
// • first() — возвращает первый элемент из очереди, не удаляя.