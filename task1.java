import java.util.LinkedList;
import java.util.Collections;

public class task1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        LinkedList<String> reversedList = reverseLinkedList(list);
        System.out.println(reversedList);
    }

    public static LinkedList reverseLinkedList(LinkedList list) {
        Collections.reverse(list);
        return list;
    }
}

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёт «перевёрнутый» список.