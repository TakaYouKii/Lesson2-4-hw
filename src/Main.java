import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> A= new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            A.add(input.next());
        }

        System.out.println("A"+A);

        ArrayList<String> B= new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            B.add(input.next());
        }
        System.out.println("B" + B);

        Collections.reverse(B);

        ArrayList<String> C = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            C.add(A.get(i));
            C.add(B.get(i));
        }

        System.out.println("C"+C);

        C.sort(Comparator.comparing(String::length));

        System.out.println(C);
    }
}