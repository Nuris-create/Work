package block1;

import java.util.Scanner;

// Задача 1.7 ★★★ Счастливый билет — условие в tasks/block-1-data.md
public class Task07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (99999<number && number<=999999)
        {
            int a=number%10;
            int b=number%100/10;
            int c=number%1000/100;
            int d=number%10000/1000;
            int z=number%100000/10000;
            int n=number/100000;
            System.out.println(a+b+c==d+z+n);
        }
    }
}
