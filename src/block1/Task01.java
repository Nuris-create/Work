package block1;

// Задача 1.1 ★ Подбери тип — условие в tasks/block-1-data.md
public class Task01 {

    public static void main(String[] args) {

       int Age=14;  //База
       long EarthP=8100000000L;  //Такое число не поместится в int
        double Prise=1499.99;   //int не может хранить дробные числа
        char Letter='J';        //Char предназначен для одного символа
        String bicycle="Yes";    //Строки хранятся в String
        double Temperature=-7.5;  //Дробное число
        int Second=86400;   //База
        long Light=9460730472581L;  //Тоже в int не поместится



        System.out.println(Age);
        System.out.println(EarthP);
        System.out.println(Prise);
        System.out.println(Letter);
        System.out.println(bicycle);
        System.out.println(Temperature);
        System.out.println(Second);
        System.out.println(Light);


    }
}
