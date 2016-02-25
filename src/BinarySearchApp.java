import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Root on 24.02.2016.
 */
public class BinarySearchApp {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        Scanner sc = new Scanner(System.in); // создаем новый сканер строки
        System.out.print("Enter next int, 'done' to stop, 'delete' to stop and delete first element: "); //выводим строку введите следующее инт значение или нажмите "хорош"
        String line = sc.next();
        int array[];// создаем строку ввода

        while (!line.equals("done")) {//пока в строке не введут "хорош"
            myList.add(Integer.parseInt(line)); //вызываем метод добавление в кучу элемента//
            System.out.println(myList); // выводим кучу
            System.out.print("Enter next int, 'done' to stop, 'delete' to stop and delete first element: "); //выводим строку для ввода
            line = sc.next();

        }
        System.out.println(myList);
        array = myList.toArray(new int[]{new int[myList.size()]});
    }

    public static int makeSearch(int[]){
        BinarySearch binSearch = new BinarySearch();
        int [] array = new int[];
        array.binarysearch();
        return mid;
    }
}


