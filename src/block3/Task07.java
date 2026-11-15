package block3;

import java.util.Scanner;

// Задача 3.7 ★★★ Подъезд и этаж — условие в tasks/block-3-functions.md
public class Task07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        System.out.println(Enter(a,b,c));
        System.out.println(getFloor(a,b,c));
    }
    static int Enter(int floor,int flatsPerFloor,int number){
        return (number%(floor*flatsPerFloor)==0) ? (number/(floor*flatsPerFloor)) : (number/(floor*flatsPerFloor)+1);
    }
    static int getFloor(int floor,int flatsPerFloor,int number){
        return (number%(floor*flatsPerFloor)==0) ? (number/flatsPerFloor) : ((number%(flatsPerFloor*floor)/flatsPerFloor)+1);
    }
}


