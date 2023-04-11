import java.util.LinkedList;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class homework4{
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>(); // task1
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");



        task1 task1 = new task1();
        System.out.println(task1.reverseLinkedList(list));

        task2 task2= new task2();
        System.out.println("Enter the element");
        String element = "z";
        System.out.println(task2.enQueue(list, element));
        System.out.println(task2.deQueue(list));
        task2.first(list);

        
    
    // task3 task3 = new task3();
    // int num1 = task3.getInt();
    // int num2 = task3.getInt();
    // char operation = task3.getOperation();
    // int result = task3.calc(num1,num2,operation);
    // System.out.println("Результат операции: "+result);
    // }

    // public static StringBuilder getTheString() {
    //     StringBuilder strB = new StringBuilder();
    //     strB.append(num1, );
    //     return strB;
    //     }
    
    //     public static LinkedHashMap writeDown() {
    //         LinkedHashMap <Integer, String> lhp = new LinkedHashMap<>();
    //         return lhp;
            
    }
}
