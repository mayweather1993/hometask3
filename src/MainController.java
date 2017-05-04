import java.util.Scanner;

/**
 * Created by Zver on 04.05.2017.
 */
public class MainController {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of your array : ");
        final int arrayLength = scanner.nextInt();
        final int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println(String.format("Enter number for array[%d]: ", i));
            array[i] = scanner.nextInt();
        }
        final MenuController menuController = new MenuController();
        final int state = scanner.nextInt();

        switch (state) {
            case MenuState.SEARCH:
                System.out.println("Enter number for search: ");
                menuController.search(array, scanner.nextInt());
                break;
            case MenuState.SORT:
                menuController.sort(array);
                break;
                default:
                    throw new IllegalArgumentException("No such menu item");
        }

    }
}
