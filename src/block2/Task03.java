package block2;

import java.util.Scanner;

// Задача 2.3 ★★ Оценка по баллам — условие в tasks/block-2-branching.md
public class Task03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number= scanner.nextInt();
        if (0>number || number>100)
        {
            System.out.println("ERROR");
        }
        else if (number>=90)
        {
            System.out.println("5");
        }
        else if (number>=75)
        {
            System.out.println("4");
        }
        else if (number>=60)
        {
            System.out.println("3");
        }
        else
        {
            System.out.println("2");
        }
    }
}
