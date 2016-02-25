import java.util.ArrayList;

/**
 * Created by Root on 24.02.2016.
 */
public class BinarySearch {

    int key, left, right;

    public BinarySearch(int array[], int key, int left, int right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }

    public static int binarysearch(int array[], int key, int left, int right){ //TODO make a BinSrch class
        int mid = left + (right-left)/2;
        System.out.println(mid);
        if (mid == key) return mid;
        else if  (array[mid] > key)
            return binarysearch(array, key, left, mid);
        else
            return binarysearch(array, key, mid + 1, right);
    }
}
