package block1;

import java.util.Scanner;

// Задача 1.4 ★★ Часы — условие в tasks/block-1-data.md
public class Task04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
       if (0<=a && a<86400)
       {
           System.out.println(a/3600);
           System.out.println(a%3600/60);
           System.out.println(a%60);


       }

    }
}
