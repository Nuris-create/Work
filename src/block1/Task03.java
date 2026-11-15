package block1;

// Задача 1.3 ★★ Предскажи вывод — условие в tasks/block-1-data.md
public class Task03 {

    public static void main(String[] args) {
        System.out.println(7 / 2);    //3
        System.out.println(7 / 2.0);     //3
        System.out.println((double) (7 / 2));  //3.5
        System.out.println(17 % 5);      //2
        System.out.println(2 + 3 * 4);   //14

        int a = 5;
        int b = a;
        a = 12;
        System.out.println(b);   //5

        int x = 10;
        x += 3;
        x *= 2;
        x--;
        x %= 4;
        System.out.println(x);  //Я не знаю что делают операторы +=, *= и %=. Но предположу что сначало выполняют знак слева, а потом присваивают получившееся значние.
        //10+3    13*2    26-1   25%4    1

        double d = 9 / 2;
        System.out.println(d);     //4.5
    }
}
    /*Ошибки в:
     System.out.println(7 / 2.0);    //3    Я забыл, что если хотя бы одно из чисел дробное, то делится по обычному
     System.out.println((double) (7 / 2));  //3.5   Я не знаю как это работает, но думал что double превращает эти цифры в дробные
      double d = 9 / 2;
        System.out.println(d);     //4.5     Тут вообще без понятия
     */

