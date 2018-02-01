import java.lang.String;
import java.util.Scanner;

public class HWlesson12 {
    public static void main(String[] args) {
        System.out.println("Виберіть номер задачі : \n"
                + "1. task_1\n"
                + "2. task_2\n"
                + "3. task_3\n"
                + "4. task_4\n"
                + "5. task_5\n" +
                "Ви вибрали  \r");
        Scanner scnr = new Scanner(System.in);
        int number = scnr.nextInt();

        switch (number) {
            case 1:
                System.out.println("task_1: \n Перевести из градусов Цельсия в градусы Фаренгейта");
                System.out.println("Введіть будь яке значення в °C " + "щоб перевести в  градуси Фаренгейта(°F)");
                double celsius = scnr.nextDouble();
                double fahrenheit = celsius * 1.8 + 32;
                System.out.print(celsius + " °C -> " + fahrenheit + " °F");

                break;
            case 2:
                System.out.println("task_2: \n Посчитать, сколько лайков получает пользователь соцсети в год.");
                System.out.println("Введіть загальну кількість лайків");
                long likesCount = scnr.nextLong();
                System.out.println("Введіть рік реєстрації");
                int registrationYear = scnr.nextInt();
                int currentYear = java.time.Year.now().getValue();
                double likesPerYear = likesCount / (currentYear - registrationYear);
                System.out.println(likesPerYear + " likes / year");
                break;
            case 3:
                System.out.println("task_3: \n Вывести в консоль младшие 5 цифр положительного десятичного числа.");
                System.out.println("введіть будьяке ціле десятичне число");
                int nmbr = scnr.nextInt();
                int i = 1;
                int d = 10000;
                while (i <= 5) {
                    System.out.println(nmbr / d % 10);
                    d = d / 10;
                    ++i;
                }
                break;
            case 4:
                System.out.println("task_4: \n Преобразовать количество байт в строку формата “_ GB, _ MB, _ KB, _ B”");
                int a = 0;
                int c = 2, b = 10;
                int p = (int) Math.pow(c, b);
                while (a >= 0) {
                    System.out.println("Введіть кількіть байт: ");
                    long bytes = scnr.nextLong();
                    long kiloBytes = bytes % 1024;
                    long megaBytes = (bytes / p / p % 1024);
                    long gigaBytes = (bytes / p / p / p % 1024);
                    System.out.println(gigaBytes + " GB, " + megaBytes + " MB, "
                            + kiloBytes + " KB, " + bytes + "B");
                    System.out.println("к-ть повторів " + a++);
                }
                break;
            case 5:
                System.out.println("task_5: \n Найти среднее арифметическое двух целых положительных чисел типа int.");
                do {

                    System.out.println("Введіть значення першого аргумента: ");
                    int arg1 = scnr.nextInt();
                    System.out.println("Введіть значення другого аргумента: ");
                    int arg2 = scnr.nextInt();


                    long sum = (arg1 + arg2) / 2;
                    int avg = (int) sum;


                    System.out.println("avg = " + avg);
                    System.out.println("повторити ? 1 - TAK " + " 2 -HI");
                    int out = scnr.nextInt();
                    if (out == 2) {
                        break;
                    }
                }
                while (true);
                break;
        }
    }
}
