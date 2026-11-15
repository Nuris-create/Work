package block2;

import java.util.Scanner;

// Задача 2.8 ★★★★ День года — условие в tasks/block-2-branching.md
public class Task08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        if (0<day && day<=31) {
            switch (month) {
                case 12:
                    day += 30;
                case 11:
                    day += 31;
                case 10:
                    day += 30;
                case 9:
                    day += 31;
                case 8:
                    day += 31;
                case 7:
                    day += 30;
                case 6:
                    day += 31;
                case 5:
                    day += 30;
                case 4:
                    day += 31;
                case 3:
                    day += 28;
                case 2:
                    day += 31;
                case 1:
                    System.out.println(day);
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
        }
            else {
                System.out.println("ERROR");
            }
        }


    }




