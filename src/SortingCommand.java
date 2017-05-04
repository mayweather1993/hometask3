import java.util.Arrays;

/**
 * Created by Zver on 04.05.2017.
 */
public class SortingCommand implements MenuCommand {
    private final int [] arr;

    public SortingCommand(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void apply() {
        ArrayUtils.sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
}
