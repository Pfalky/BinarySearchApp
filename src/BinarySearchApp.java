import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Root on 24.02.2016.
 */
public class BinarySearchApp {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in); // создаем новый сканер строки
        System.out.print("Enter next int, 'done' to stop, 'delete' to stop and delete first element: "); //выводим строку введите следующее инт значение или нажмите "хорош"
        String line = sc.next();// создаем строку ввода
        while (!line.equals("done")) {//пока в строке не введут "хорош"
            mylist.add(Integer.parseInt(line)); //вызываем метод добавление в кучу элемента
            System.out.println(myList); // выводим кучу
            System.out.print("Enter next int, 'done' to stop, 'delete' to stop and delete first element: "); //выводим строку для ввода
            line = sc.next();

        } //генерируем новую строку для ввода
    }
}


