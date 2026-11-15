package block2;

import java.util.Scanner;

// Задача 2.7 ★★★ Треугольник — условие в tasks/block-2-branching.md
public class Task07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int min=Math.min(c,Math.min(a,b));
        int max=Math.max(c,Math.max(a,b));
        int mid=a+b+c-min-max;
        if (max>=(min+mid)){
            System.out.println("Не треугольник");
        }
        else{
            if(a==b && b==c){
                System.out.println("Равносторонний");
            }
            else if(a==b || a==c || b==c){
                System.out.println("Равнобедренный");
            }
            else{
                System.out.println("Разносторонний");
            }
            if (max*max==mid*mid+min*min){
                System.out.println("Прямоугольный");
            }

        }

    }
}
