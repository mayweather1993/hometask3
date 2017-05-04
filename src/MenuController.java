/**
 * Created by Zver on 04.05.2017.
 */
public class MenuController {

    MenuController() {
        System.out.println("1. Search number in array.");
        System.out.println("2. Sort array.");
        System.out.println("Your choice: ");
    }

    void search(final int[] array, final int number) {
        new NumberSearchCommand(array, number).apply();
    }

    void sort(final int[] array) {
        new SortingCommand(array).apply();
    }

}
