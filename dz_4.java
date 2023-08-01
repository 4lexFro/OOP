/*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.*/

import java.util.Scanner;

public class dz_4 {
    public static void main(String[] args) {
        emptyString();
    }

    private static void emptyString() {
        System.out.println("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        if (string.equals("")) {
            throw new RuntimeException("Пустую строку вводить нельзя!");

        }
        System.out.println("Вы ввели: " + string);
        scanner.close();
    }
    
}
