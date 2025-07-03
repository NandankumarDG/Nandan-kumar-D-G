package problems;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        int count = 0;
        int num = 1;

        while (count < a) {
            System.out.print(num);
            count++;
            num += 2;

            if (count < a) {
                System.out.print(", ");
            }
        }

    }
}

