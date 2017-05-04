/**
 * Created by Zver on 04.05.2017.
 */
public class NumberSearchCommand implements MenuCommand {
    private final int[] arr;
    private final int b;

    public NumberSearchCommand(int[] arr, int b) {
        this.arr = arr;
        this.b = b;
    }

    @Override
    public void apply() {

        boolean numberExist = ArrayUtils.isNumberExist(arr, b);
        if (numberExist) {
            System.out.println("Number is found");
        } else {
            System.out.println("Cant find your number ");
        }


    }
}
