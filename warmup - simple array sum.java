import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.nextInt();
        long sum = 0;
        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
        }

        scanner.close();

        System.out.println(sum);
    }
}