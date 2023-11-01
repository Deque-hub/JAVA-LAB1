package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Завдання 1:
        Вивести на екран надпис Fall seven times and stand up eight у різних рядках. */

        System.out.println("Fall seven times");
        System.out.println("and");
        System.out.println("stand up eight");

        /* Завдання 2:
        Користувач вводить з клавіатури два числа. Необхідно порахувати суму чисел,
        різницю чисел, добуток чисел. Результат підрахунків вивести на екран. */

        System.out.println("Введіть число 1: ");
        int a = scanner.nextInt();
        System.out.println("Введіть число 2: ");
        int b = scanner.nextInt();
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));

        /* Завдання 3:
        Користувач з клавіатури вводить чотиризначне число. Необхідно повернути число і відобразити результат.
        Наприклад, якщо вводимо 4512, результат 2154. */
        System.out.println("Введіть число: ");
        int num = scanner.nextInt();

        String numStr = String.valueOf(num); // переклад числа в строку

        StringBuilder sb = new StringBuilder(numStr);
        sb.reverse(); // зворотне число
        String reversedNum = sb.toString();
        System.out.println(reversedNum);

        /* Завдання 4:
        Користувач з клавіатури вводить кількість годин. Якщо отримане значення знаходиться в діапазоні від 0 до 6 потрібно
        вивести надпис Good Night, якщо в діапазоні від 6 до 13 Good Morning, якщо в діапазоні від 13 до 17 Good Day, якщо
        в відапазоні від 17 до 0 Good Evening. Верхня межа діапазону не включається. Наприклад, число 6 відноситься від 6 до 13. */

        System.out.println("Введіть часи: ");
        int h = scanner.nextInt();

        if (h >= 0 && h < 7)
            System.out.println("Good Night");
        else if (h > 5 && h < 14)
            System.out.println("Good Morning");
        else if (h > 12 && h < 18)
            System.out.println("Good Day");
        else if (h > 16 && h < 24)
            System.out.println("Good Evening");

        /* Завдання 5:
        Користувач вводить з клавіатури ціле шестизначне число. Написати програму, яка визначає,
        чи є введене число — щасливим (щасливим вважається шестизначне число, у якого сума перших
        3 чисел рівна сумі других трьох чисел). */ 

        System.out.println("Введіть шестизначне число: ");
        int sNum = scanner.nextInt();

        /* Завдання 6:
        Користувач вводить з клавіатури число в діапазоні від 1 до 100. Якщо число кратне 3(ділиться на 3 без залишку)
        потрібно вивести слово Fizz. Якщо число кратне 5 потрібно вивести слово Buzz. Якщо число кратне і 3 і 5 потрібно вивести Fizz Buzz.
        Якщо число не кратне 3 і 5 потрібно вивести саме число.
        Якщо користувач ввів значення не в діапазоні від 1 до 100 потрібно вивести повідомлення про помилку. */

        System.out.println("Введіть число від 1 до 100: ");
        sNum = scanner.nextInt();

        if (sNum < 0 && sNum > 100)
            System.out.println("Помилка! не коректне введення ");
        else
        {
            if (sNum % 3 == 0)
                System.out.println("Fizz");
            if (sNum % 5 == 0)
                System.out.println("Buzz");
            if (sNum % 3 == 0 && sNum % 5 == 0)
                System.out.println("Fizz Buzz");
            if (sNum % 3 != 0 && sNum % 5 != 0)
                System.out.println(sNum);
        }

        /* Завдання 7:
        Користувач вводить з клавіатури число. Потрібно порахувати факторіал числа.
        Наприклад, якщо введене число 3, факторіал числа 1*2*3=6.
        Формула для розрахунку факторіала: n! = 1*2*3…*n, де n - число для підрахунку факторіалу. */

        System.out.println("Введіть число для факторіалу: ");
        int f = scanner.nextInt();
        int res = 1;

        for (int i = 1; i <= f; i++)
            res = res * i;

        System.out.println("!" + f + " = " + res);

        /* Завдання 8:
        Показати на екрані всі прості числа в діапазоні, вказаному користувачем. Число називається простим,
        якщо воно ділиться без залишку тільки на себе і на одиницю. Наприклад, три — це просте число, а чотири — ні. */

        System.out.println("Введіть початок діапазону: ");
        int start = scanner.nextInt();

        System.out.println("Введіть кінець діапазону: \"");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++)
        {
            if (i % 2 != 0)
                System.out.print(i + ", ");
        }

        /* Завдання 9:
        Користувач з клавіатури вводить елементи одновимірного масиву.
        Необхідно знайти суму елементів масиву, середнє арифметичне, відобразити на екран всі елементи масиву. */

        System.out.println("Введіть розмір массиву: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        double sum = 0;

        System.out.print("Введіть елементи массиву: ");
        for(int i = 0; i < size; i++)
        {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Елементи массиву: ");
        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("");

        System.out.print("Cумма елементів массиву: ");
        for(int i = 0; i < size; i++)
        {
            sum += arr[i];
        }
        System.out.println((int)sum);
        System.out.println("Середнє арифметичне елементів массиву: " + sum / size);

        /* Завдання 10:
        Користувач з клавіатури вводить елементи одновимірного місиву в деяке число.
        Необхідно підрахувати скільки разів число зустрічається у масиві. */

        int count = 0;
        System.out.println("Введіть розмір массиву: ");
        size = scanner.nextInt();
        arr = new int[size];

        System.out.print("Введіть елементи массиву: ");
        for(int i = 0; i < size; i++)
        {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Введіть число: ");
        int n = scanner.nextInt();

        for(int i = 0; i < size; i++)
        {
            if (arr[i] == n)
                count++;
        }
        System.out.println("Кількість: " + count);

        /* Завдання 11:
        Написати метод, що повертає суму чисел у вказаному діапазоні.
        Границі діапазону передаються в якості параметрів. */

        System.out.println("Введіть початок діапазону: ");
        start = scanner.nextInt();

        System.out.println("Введіть кінець діапазону: \"");
        end = scanner.nextInt();

        System.out.println("Сумма: " + Sum(start, end));

        /* Завдання 12:
        Написати метод, що підраховує факторіал кожного елемента масиву.
        Метод повертає новий масив, що містить отримані факторіали. */

        int[] array = {5, 6, 7, 8,9};
        int[] factorial = new int[array.length];

        for(int i = 0; i < array.length; i++)
        {
            factorial[i] = FactorialArray(array[i]);
        }

        System.out.println("факторіал елементи: ");
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(factorial[i] + ", ");
        }
    }
    //Завдання 11:
    public static int Sum(int start, int end){
        int sum = 0;
        for (int i = start; i <= end; i++)
        {
            sum += i;
        }
        return sum;
    }
    //Завдання 12:
    public static int FactorialArray(int num){
        int res = 1;

        for (int i = 1; i <= num; i++)
            res = res * i;

        return res;
    }
}