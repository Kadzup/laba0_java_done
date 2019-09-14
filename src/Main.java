import java.io.*;
import java.lang.*;
import java.util.*;

/*
+ enum - знаки зодиака
input/output
+ int - С начала суток прошло N секунд (N — целое). Найти количество полных часов, прошедших с начала суток.
+ bool - Дано трехзначное число. Проверить истинность высказывания: «Все цифры данного числа различны».
+ if -    На числовой оси расположены три точки: A, B, C.
        Определить, какая из двух последних точек (B или C)
        расположена ближе к A, и вывести эту точку и ее расстояние от точки A.
switch - Даны два целых числа: D (день) и M (месяц), определяющие правильную дату.
            Вывести знак Зодиака, соответствующий этой дате:
            «Водолей» (20.1–18.2),
            «Рыбы» (19.2–20.3),
            «Овен» (21.3–19.4),
            «Телец» (20.4–20.5),
            «Близнецы» (21.5–21.6),
            «Рак» (22.6–22.7),
            «Лев» (23.7–22.8),
            «Дева» (23.8–22.9),
            «Весы» (23.9–22.10),
            «Скорпион» (23.10–22.11),
            «Стрелец» (23.11–21.12),
            «Козерог» (22.12–19.1).
for -   Дано целое число N (> 0). Используя один цикл, найти сумму
        1! + 2! + 3! + … + N!
        (выражение N! — N–факториал — обозначает произведение всех
        целых чисел от 1 до N:    N! = 1·2·…·N). Чтобы избежать
        целочисленного переполнения, проводить вычисления с помощью
        вещественных переменных и вывести результат как вещественное число.
while - Дано целое число N (> 0). С помощью операций деления
        нацело и взятия остатка от деления определить,
        имеется ли в записи числа N цифра «2». Если имеется,
        то вывести True, если нет — вывести False.
array - Дан массив размера N и целые числа K и L (1 Ј K Ј L Ј N).
        Найти сумму элементов массива с номерами от K до L включительно.
two dim array - Дана матрица размера M ґ N.
                Для каждого столбца матрицы найти произведение его элементов.
*/


public class Main {
    public enum Zodiak{
        Aquarius("Водолей"),
        Fish("Рыбы"),
        Aries("Овен"),
        Calf("Телец"),
        Twins("Близнецы"),
        Cancer("Рак"),
        Lion("Лев"),
        Virgo("Дева"),
        Libra("Весы"),
        Scorpio("Скорпион"),
        Sagittarius("Стрелец"),
        Capricorn("Козерог");
    }
    public static class Dots{
        public int x,y;
        public Dots(int _x, int _y){
            this.x = _x;
            this.y = _y;
        }
    }

    /**
    * @param seconds - is count of seconds
     *@return  count of hours
     *
     * @version 1.0.1
     * @author D. Stefurak
    */
    public static int calcHours(int seconds){
        return (seconds/60)/60;
    }

    /**
     * @param number - is inputted number
     *@return  are all numbers equal
     *
     * @version 1.0.1
     * @author D. Stefurak
     */
    public static boolean areAllNumbersDifferent(int number){
        if (((number % 10)!=(number / 10 % 10))&&((number % 10)!=(number / 100))&&((number / 10 % 10)!=(number / 100))){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * @param a - is a dot, with x,y position
     * @param b - is a dot, with x,y position
     * @param c - is a dot, with x,y position
     *@return  a string with information, which dot is closer to a, and distance between them
     *
     * @version 1.0.1
     * @author D. Stefurak
     */
    public static String whoIsCloser(Dots a, Dots b, Dots c){
        String result = "";

        if(Math.sqrt((b.x-a.x)*(b.x-a.x)+(b.y-a.y)*(b.y-a.y))>Math.sqrt((c.x-a.x)*(c.x-a.x)+(c.y-a.y)*(c.y-a.y))){
            result = "C{"+c.x+","+c.y+"} is closer to A, distance "+Math.sqrt((b.x-a.x)*(b.x-a.x)+(b.y-a.y)*(b.y-a.y));
        }
        else{
            result = "B{"+b.x+","+b.y+"} is closer to A, distance "+Math.sqrt((c.x-a.x)*(c.x-a.x)+(c.y-a.y)*(c.y-a.y));
        }

        return result;
    }

    public static String printZodiac(int day, int month){
        String result = "";
        switch(month){
            case 1:
                if(day <= 20){
                    return Zodiak.Capricorn.toString();
                }
                else{
                    return Zodiak.Aquarius.toString();
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
        }

        return result;
    }

    public static void main(String[] args){
        Dots a = new Dots(5,9),b= new Dots(-4,12),c = new Dots(15,0);

        System.out.println(calcHours(12000));
        System.out.println(areAllNumbersDifferent(122));
        System.out.println(whoIsCloser(a,b,c));
    }
}
