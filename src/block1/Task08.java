package block1;

import java.util.Scanner;

// Задача 1.8 ★★★ Сколько ехать — условие в tasks/block-1-data.md
public class Task08 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int hour1 = scanner.nextInt();
        int min1 = scanner.nextInt();
        int hour2 = scanner.nextInt();
        int min2 = scanner.nextInt();
        int hour3;
        int min3;
        /*if ((0<=hour1 && hour1<24)
        && (0<=hour2 && hour2<24)
            && (0<=min1 && min1<60)
            && (0<=min2 && min2<60))
        {
            if (min1<min2)
            {
                min3=min2-min1;
                if (hour2>hour1)
                {
                    hour3=hour2-hour1;
                }
                else if (hour1>hour2)
                {
                    hour3=24-hour1+hour2;
                }
                else
                {
                    hour3=0;
                }
            }
            else if (min1>min2)
            {
                min3=60-min1+min2;
                if (hour2>hour1)
                {
                   hour3=hour2-hour1-1;
                }
                else if (hour1>hour2)
                {
                    hour3=23-hour1+hour2;
                }
                else
                {
                    hour3=23;
                }

            }
            else
            {
                min3=0;

            if (hour2>hour1)
            {
                hour3=hour2-hour1;
            }
            else if (hour1>hour2)
            {
                hour3=24-hour1+hour2;
            }
                else {
                hour3 = 0;
            }
            }
            System.out.println(hour3);
            System.out.println(min3);
        }
       Посмотрев на это решение мне казалось, что можно сделать короче и вот как я решил по итогу сделать:
         */
    int sum1,sum2;
    sum1=min1+hour1*60;
    sum2=min2+hour2*60;
    if (sum1<=sum2)
    {
        hour3=(sum2-sum1)/60;
        min3=(sum2-sum1)%60;
    }
    else
        {
            hour3=(1440-sum1+sum2)/60;
            min3=(1440-sum1+sum2)%60;
        }

        System.out.println(hour3);
        System.out.println(min3);
    }
}
