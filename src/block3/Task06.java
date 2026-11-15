package block3;

import java.util.Scanner;

// Задача 3.6 ★★★ Будильник — условие в tasks/block-3-functions.md
public class Task06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour=scanner.nextInt();
        int min=scanner.nextInt();
        int sleep=scanner.nextInt();
        System.out.println(Time(hour,min,sleep));
    }
    static String Format(int time){
        int hour=time/60;
        int min=time%60;
        return String.format("%02d:%02d",hour,min);
    }
    static String Time(int hour, int min,int sleep){
        int time=hour*60+min+sleep;
        return Format(time%1440);
    }
}
