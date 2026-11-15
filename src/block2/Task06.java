package block2;

import java.util.Scanner;

// Задача 2.6 ★★★ По возрастанию — условие в tasks/block-2-branching.md
public class Task06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int min=Math.min(c,Math.min(a,b));
        int max=Math.max(c,Math.max(a,b));
        int mid=a+b+c-min-max;
        System.out.println(min+" "+mid+" "+max);

    }
}
