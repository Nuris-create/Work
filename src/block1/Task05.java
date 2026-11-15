package block1;

import java.util.Scanner;

// Задача 1.5 ★★ Число наоборот — условие в tasks/block-1-data.md
public class Task05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a=number%10;
        int b=number%100/10;
        int c=number/100;
        System.out.println(a*100+b*10+c);
    }
}
