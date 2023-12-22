package mirea_lab_13;

import java.io.*;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Выберите операцию:");
            System.out.println("1. Запись в файл");
            System.out.println("2. Чтение из файла");
            System.out.println("3. Замена информации в файле на информацию, введённую с клавиатуры");
            System.out.println("4. Добавить в конец исходного файла текст, введённый с клавиатуры");
            System.out.println("5. Выход");
            choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            switch (choice) {
                case 1:
                    writeToFile(scanner);
                    break;
                case 2:
                    readFromFile();
                    break;
                case 3:
                    replaceInFile(scanner); // Выполнение операции замены информации в файле
                    break;
                case 4:
                    appendToFile(scanner); // Добавить текст в конец файла
                    break;
                case 5:
                    System.out.println("Программа завершена.");
                    break;
                default:
                    System.out.println("Некорректный выбор. Повторите попытку.");
            }
        } while (choice != 5);
    }

    // Функция для записи в файл
    private static void writeToFile(Scanner scanner) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"))) {
            System.out.print("Введите информацию для записи в файл: ");
            String input = scanner.nextLine();
            writer.write(input);
            System.out.println("Информация успешно записана в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }

    // Функция для чтения из файла
    private static void readFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Информация из файла: " + line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла: " + e.getMessage());
        }
    }

    // Функция для замены информации в файле
    private static void replaceInFile(Scanner scanner) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"))) {
            System.out.print("Введите информацию для замены в файле: ");
            String input = scanner.nextLine();
            writer.write(input);
            System.out.println("Информация успешно заменена в файле.");
        } catch (IOException e) {
            System.out.println("Ошибка замены информации в файле: " + e.getMessage());
        }
    }

    // Функция для добавления текста в конец файла
    private static void appendToFile(Scanner scanner) {
        try (FileWriter writer = new FileWriter("file.txt", true)) {
            System.out.print("Введите текст для добавления в конец файла: ");
            String input = scanner.nextLine();
            writer.write(input);
            System.out.println("Текст успешно добавлен в конец файла.");
        } catch (IOException e) {
            System.out.println("Ошибка добавления текста в файл: " + e.getMessage());
        }
    }
}
