import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Root on 24.02.2016.
 */
public class BinarySearchApp {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        Scanner sc = new Scanner(System.in); // создаем новый сканер строки
        System.out.print("Enter next int, 'done' to stop"); //выводим строку введите следующее инт значение или нажмите "хорош"
        String line = sc.next();
        // инициализируем массив

        while (!line.equals("done")) {//пока в строке не введут "хорош"
            myList.add(Integer.parseInt(line)); //вызываем метод добавление в кучу элемента//
            System.out.println(myList); // выводим кучу
            System.out.print("Enter next int, 'done' to stop"); //TODO добавить проверку на ввод числа
            line = sc.next();

        }
        int array[] = new int[myList.size()];
        if (myList.isEmpty()){
            System.out.println("Массив пуст");
        }
        else {
            System.out.println(myList);
            for (int i = 0; i < myList.size(); i++) {
                array[i] = myList.get(i);}
            System.out.println("ВВедите число для поиска");
            String sKey = sc.next(); //TODO добавить проверку на ввод числа
            int key = Integer.parseInt(sKey);
            int left = array[0];
            int right = array[array.length-1]; //Todo тут есть ошибка (выдает 0)

            BinarySearch binSrch = new BinarySearch(array, key, left, right);
            binSrch.binarysearch(array, key, left, right);

        }
    }
}


