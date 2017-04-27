import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Zver on 22.04.2017.
 */
public class Olo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter length of array : ");
        int a = Integer.parseInt(reader.readLine());
        int[] numbers = new int[a];
        System.out.println("Fill your array");
        for (int i = 0; i < numbers.length; i++) {
            a = Integer.parseInt(reader.readLine());

            numbers[i] = a;


        }
        for (int b = 0; b < numbers.length; b++) {
            System.out.print(numbers[b] + " ");
        }
        System.out.println("\nMenu : 1 - Seaching number, 2 - Sort the array");
        a = Integer.parseInt(reader.readLine());
        if (a == 1) {
            System.out.println("Start the search");
            System.out.println("Enter your number");
            a = Integer.parseInt(reader.readLine());
            for (int i = 0; i < numbers.length; i++)
                if (numbers[i] == a) {
                    System.out.println("your number in the array");
                    return;
                }

            System.out.println("Your number not in the array");
        } else if (a == 2) {
            System.out.println("Sort");


            for (int i = numbers.length - 1; i >= 0; i--) {
                for (int g = 0; g < i; g++) {
                    if (numbers[g] > numbers[g + 1]) {
                        int t = numbers[g];
                        numbers[g] = numbers[g + 1];
                        numbers[g + 1] = t;
                    }
                }
            }



                        System.out.print("Sorted array: ");

                        for (int p = 0; p < numbers.length; p++) {
                            System.out.print(numbers[p] + (p == numbers.length - 1 ? "." : ","));
                        }
                    } else {
                        System.out.println("pasha error");


                    }
                }
            }


