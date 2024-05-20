import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        String filePath = "numbers.txt";
        StringBuilder content = new StringBuilder();
//        Указываем путь к файлу с числами (с учетом исключения во избежание ошибки)

        Scanner scanner = new Scanner(new File(filePath));
        while (scanner.hasNext()) {
            content.append(scanner.next()).append(" ");
        }
        scanner.close();
//        Читаем файл и записываем его содержимое в переменную content


        String[] parts = content.toString().trim().split(" ");
        int[] numbers = new int[parts.length];
//        Части содержимого файла разделяем по пробелу и записываем в массив

        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }
//        Конвертируем строки в числа



        System.out.println("В файле: " + content.toString().trim());
        System.out.println("Минимальное: " + _min(numbers));
        System.out.println("Максимальное: " + _max(numbers));
        System.out.println("Сумма: " + _sum(numbers));
        System.out.println("Произведение: " + _mult(numbers));
//        Вывод результатов


    }
    public static int _min(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
//    Поиск минимального числа

    public static int _max(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
//    Поиск максимального числа


    public static int _sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
//    Поиск суммы чисел

    public static long _mult(int[] numbers) {
        long mult = 1;
        for (int number : numbers) {
            mult *= number;
        }
        return mult;
    }
//    Поиск произведения чисел


}
