/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает 
введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
вместо этого, необходимо повторно запросить у пользователя ввод данных.*/

import java.util.Scanner;

public class dz_1 {
    public static void main(String[] args) {
        float number = getFloatFromUser();
        System.out.println("Введенное число: " + number);
    }

    public static float getFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        while (!scanner.hasNextFloat()) {
            System.out.print("Ошибка ввода. Введите дробное число: ");
            scanner.next();
        }
        float number = scanner.nextFloat();
        scanner.close();
        return number;
    }
}