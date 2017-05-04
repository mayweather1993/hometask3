/**
 * Created by Zver on 04.05.2017.
 */
public class ArrayUtils {
    static void sorting(int[] array) {
        System.out.println("Sorting : ");
    }

    static boolean isNumberExist(int[] array, int a) {
        for (int b : array) {
            if (b == a) {
                return true;
            }
        }
        return false;
    }

    void Sorting(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int g = 0; g < i; g++) {
                if (array[g] > array[g + 1]) {
                    int t = array[g];
                    array[g] = array[g + 1];
                    array[g + 1] = t;
                }
            }
        }
    }
}
