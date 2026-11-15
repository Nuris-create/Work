package block2;

import java.util.Scanner;

// Задача 2.1 ★ Чётное или нечётное — условие в tasks/block-2-branching.md
public class Task01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number%2==0)
        {
            System.out.println(number +" Четное");
        }
        else
        {
            System.out.println(number +" Нечетное");
        }
    }
}
