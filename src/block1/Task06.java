package block1;

import java.util.Scanner;

// Задача 1.6 ★★ Условия — условие в tasks/block-1-data.md
public class Task06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(10<=x && x<=20);
        System.out.println(10>x || x>20);
        System.out.println(x%2==0);
        System.out.println(x%3==0 && x%5!=0);
        System.out.println(10<=x && x<=99);

    }
}
