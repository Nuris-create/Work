package block2;

import java.util.Scanner;

// Задача 2.2 ★ День недели — условие в tasks/block-2-branching.md
public class Task02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.next();
        switch (day) {
            case "mon":
                System.out.println(1);
                System.out.println("Будний день");
                break;
            case "tue":
                System.out.println(2);
                System.out.println("Будний день");
                break;
            case "wed":
                System.out.println(3);
                System.out.println("Будний день");
                break;
            case "thu":
                System.out.println(4);
                System.out.println("Будний день");
                break;
            case "fri":
                System.out.println(5);
                System.out.println("Будний день");
                break;
            case "sat":
                System.out.println(6);
                System.out.println("Выходной");
                break;
            case "sun":
                System.out.println(7);
                System.out.println("Выходной");
                break;
                default:
                    System.out.println("ERROR");
                    break;
        }

    }
}
