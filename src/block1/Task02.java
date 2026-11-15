package block1;

import java.util.Scanner;

// Задача 1.2 ★ Калькулятор — условие в tasks/block-1-data.md
public class Task02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a=Float.parseFloat(scanner.nextLine());
        float b=Float.parseFloat(scanner.nextLine());
        if (b!=0) {
            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b);
            System.out.println(a % b);
            System.out.println((a - a % b) / b);
        }




    }
}
