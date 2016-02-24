import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Root on 24.02.2016.
 */
public class Mylist {
    ArrayList myList = new ArrayList();



    public List returnMyList() throws IOException {
        BufferedReader reader = new BufferedReader(InputStreamReader());
        String sInt = reader.readLine(); //читаем строку с клавиатуры
        int intVal = Integer.parseInt(sInt); //преобразовываем строку в число.
        return null;
    }
}
