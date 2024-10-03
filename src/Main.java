import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        int[] nass = mass(10);
        System.out.println(Arrays.toString(nass));
        System.out.println(tru(scan, nass));
    }

    public static int[] mass(int length) {
        int[] i = new int[length];
        Random random = new Random();
        for (int j = 0; j < i.length; j++) {
            i[j] = random.nextInt(1, 10);
        }
        return i;
    }

    public static boolean tru(int a, int... b) {
        for (int i : b) {
            if (b[i] == a) {
                return true;
            }
        }
        return false;
    }
}
