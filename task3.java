import java.util.Scanner;


public class task3 {


    // public static void calcul(String[] args) {
    public static void calcul(int num1, int num2, char operation) {
        num1 = getInt();
        num2 = getInt();
        operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("Результат операции: "+result);
    }

    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        Scanner sc = new Scanner(System.in);
        // int input = sc.nextInt();
        if(sc.hasNextInt()){
            num = sc.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            sc.next();//рекурсия
            num = getInt();
        }
        sc.close();
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            operation = sc.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            sc.next();//рекурсия
            operation = getOperation();
        }
        sc.close();
        return operation;
    }

    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;
    }
}

