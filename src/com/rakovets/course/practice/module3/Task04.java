package com.rakovets.course.practice.module3;

import java.util.Scanner;

/**
 * Разработать программу для desktop приложения:
 * которая преобразует номер дня недели в его словесный аналог, если известно:
 *
 * @param weekDayNumber - номер дня недели
 * @return день недели на английском языке (lower case)
 */
public class Task04 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int weekdayNumber = (args.length != 1) ? scanner.nextInt() : Integer.parseInt(args[0]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        if (weekdayNumber == 1 ) {
            System.out.println("Monday");
        } else if (weekdayNumber == 2) {
            System.out.println("Tuesday");
        } else if (weekdayNumber ==3) {
            System.out.println("Wednesday");
        } else if (weekdayNumber == 4) {
            System.out.println("Thursday");
        } else if (weekdayNumber == 5) {
            System.out.println("Friday");
        } else if (weekdayNumber == 6) {
            System.out.println("Saturday");
        } else if (weekdayNumber == 7) {
            System.out.println("Sunday");
        }
    }
}