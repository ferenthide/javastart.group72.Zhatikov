package hwlesson34;

import java.util.Scanner;

public class HomeWorkLevel1Conditions {
    public static void main(String[] args) {
        System.out.print("Task 1 (MinMaxCalculator) enter 1\n" +
                "Task 2 (IsAgeChecker enter 2\n" +
                "Task 3 (AgeParser) enter 3\n" +
                "Task 4 (IdToToyNameConverter) enter 4\n" +
                "Task 5 (ToyNameToIdConverter) enter 5\n" +
                "enter : ");
        Scanner scan = new Scanner(System.in);
        int end2 = 0;
        while (end2 !=2 ) {
            int task = scan.nextInt();
            int end = 0;
            switch (task) {
                case 1:
                    while (end != 2) {
                        System.out.println("\n Task 1 (MinMaxCalculator)\nНахождение минимума/максимума двух чисел.\n");
                        System.out.println("enter number a: ");
                        int a = scan.nextInt();
                        System.out.println("enter number b: ");
                        int b = scan.nextInt();
                        if (a > b) {
                            System.out.println("max= " + a + "min= " + b);
                        } else if (a < b) {
                            System.out.println("max = " + b + " min = " + a);
                        } else {
                            System.out.println("a = b");
                        }
                        System.out.println("повторити задачу? 1 -Tak / 2 - Hi");
                        end = scan.nextInt();
                    }


                    break;
                case 2:
                    while (end != 2) {
                        System.out.println("\nTask 2 (IsAgeChecker)" +
                                "\nОпределение корректности заданного возраста. Возраст может принимать значения в диапазоне 1..120.");
                        System.out.print("enter age: ");
                        int age = scan.nextInt();
                        boolean isAge = true;
                        if ((age >= 1) && (age <= 120)) {
                            System.out.println("isAge = " + isAge);
                        } else {
                            isAge = false;
                            System.out.println("isAge = " + isAge +"\n");
                        }
                        System.out.println("повторити задачу? 1 -Tak / 2 - Hi");
                        end = scan.nextInt();
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                    default:
                        System.out.println("IllegalArgumentException");
                        continue;

            }
            System.out.print("Task 1 (MinMaxCalculator) enter 1\n" +
                    "Task 2 (IsAgeChecker enter 2\n" +
                    "Task 3 (AgeParser) enter 3\n" +
                    "Task 4 (IdToToyNameConverter) enter 4\n" +
                    "Task 5 (ToyNameToIdConverter) enter 5\n" +
                    "enter : ");


        }


    }
}
