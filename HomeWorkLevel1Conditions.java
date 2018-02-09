package hwlesson34;

import java.util.Scanner;

public class HomeWorkLevel1Conditions {
    public static void main(String[] args) {
        System.out.print("\tВиберіть номер задачі: \n" +
                "Task 1 (MinMaxCalculator) enter 1\n" +
                "Task 2 (IsAgeChecker enter 2\n" +
                "Task 3 (AgeParser) enter 3\n" +
                "Task 4 (IdToToyNameConverter) enter 4\n" +
                "Task 5 (ToyNameToIdConverter) enter 5\n" +
                "enter : ");
        Scanner scan = new Scanner(System.in);
        int end2 = 0;
        while (end2 != 2) {
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
                            System.out.println("isAge = " + isAge + "\n");
                        }
                        System.out.println("повторити задачу? 1 -Tak / 2 - Hi");
                        end = scan.nextInt();
                    }
                    break;
                case 3:
                    System.out.println("\nTask 3 (AgeParser)\n" +
                            "Парсинг строки возраста (в строке представлено число типа int). Можно пользоваться стандартными функциями." +
                            " Если входная строка является числом, что не соответствует диапазону 1..120, бросить исключение IllegalArgumentException");
                    while (end != 2) {
                        System.out.println("Enter age: ");
                        String parseAge = scan.next();
                        int parseAgeInt = Integer.parseInt(parseAge);
                        if (parseAgeInt >= 1 && parseAgeInt <= 120) {
                            System.out.println("True \r Ваш вік = " + parseAgeInt);
                        } else {
                            System.out.println("false\r" + parseAge + " - IllegalArgumentException ");
                        }
                        System.out.println("повторити задачу? 1 -Tak / 2 - Hi");
                        end = scan.nextInt();
                    }
                    break;
                case 4:
                    System.out.println("\nTask 4 (IdToToyNameConverter)\n" +
                            "Определение названия детской игрушки по ее идентификатору.\n");
                    while (end != 2) {
                        System.out.print("enter toys ID: ");
                        int id = scan.nextInt();

                        if (id == 0) {
                            System.out.println("Car");
                        } else if (id == 1) {
                            System.out.println("Lego");
                        } else if (id == 2) {
                            System.out.println("Doll");
                        } else if (id == 3) {
                            System.out.println("Puzzle");
                        } else {
                            System.out.println("IllegalArgumentException");
                        }
                        System.out.println("повторити задачу? 1 -Tak / 2 - Hi");
                        end = scan.nextInt();
                    }
                    break;
                case 5:
                    while (end != 2) {
                        System.out.println("\nTask 5 (ToyNameToIdConverter)\n" +
                                "Определение идентификатора детской игрушки по ее названию\n");
                        System.out.println("Enter toy name: ");
                        String name = scan.next();
                        String str = "car", str1 = "lego", str2 = "doll", str3 = "puzzle";

                        int id = -1;
                        if (name.equals(str)) {
                            id = 0;
                        } else if (name.equals(str1)) {
                            id = 1;
                        } else if (name.equals(str2)) {
                            id = 2;
                        } else if (name.equals(str3)) {
                            id = 3;
                        } else {
                            id = 4;
                        }
                        switch (id) {
                            case 0:
                                System.out.println("car = " + id);
                                break;
                            case 1:
                                System.out.println("Lego = " + id);
                                break;
                            case 2:
                                System.out.println("Doll =  " + id);
                                break;
                            case 3:
                                System.out.println("Puzzle = " + id);
                                break;
                            case 4:
                                System.out.println("IllegalArgumentException ");
                                break;
                        }
                        System.out.println("повторити задачу? 1 -Tak / 2 - Hi");
                        end = scan.nextInt();
                    }
                    break;
                default:
                    System.out.println("ERROR - IllegalArgumentException. " +
                            "не коректний номер задачі !!!!!\n");
                    break;

            }
            System.out.print("\tВиберіть номер задачі: \n" +
                    "Task 1 (MinMaxCalculator) enter 1\n" +
                    "Task 2 (IsAgeChecker enter 2\n" +
                    "Task 3 (AgeParser) enter 3\n" +
                    "Task 4 (IdToToyNameConverter) enter 4\n" +
                    "Task 5 (ToyNameToIdConverter) enter 5\n" +
                    "enter : ");


        }


    }
}
