package block2;

import java.util.Scanner;

// Задача 2.4 ★★ Электронные часы — условие в tasks/block-2-branching.md
public class Task04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number= scanner.nextInt();
        if (0<=number && number<=86399)
        {
            int hour, min, sec;
            hour= number/3600;
            min=number%3600/60;
            sec=number%60;
            String result = String.format("%02d:%02d:%02d", hour, min, sec);
            System.out.println(result);


        }

    }
}
