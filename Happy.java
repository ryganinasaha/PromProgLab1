import java.util.Scanner;

public class Happy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Кол-во чисел: ");
        int n = in.nextInt();
        int[] numbers = new int[n];

        // Ввод чисел
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число номер " + (i + 1) + ": ");
            numbers[i] = in.nextInt();
        }
        
        // Находим максимальное число для определения границы поиска
        int max = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Максимальное число: " + max);
        
        // Создаем массив для всех чисел от 1 до max
        int[] allNumbers = new int[max];
        for (int i = 0; i < max; i++) {
            allNumbers[i] = i + 1;
        }
        
        // Применяем алгоритм поиска счастливых чисел
        int step = 2; // начинаем с шага 2 (удаляем каждый второй)
        int currentIndex = 1; // текущий индекс для шага
        
        while (step <= max) {
            // Удаляем каждый step-й элемент
            int count = 0;
            for (int i = 0; i < max; i++) {
                if (allNumbers[i] != 0) {
                    count++;
                    if (count % step == 0) {
                        allNumbers[i] = 0; // помечаем как удаленное
                    }
                }
            }
            
            // Находим следующий шаг (первое ненулевое число после текущей позиции)
            currentIndex++;
            while (currentIndex < max && allNumbers[currentIndex] == 0) {
                currentIndex++;
            }
            if (currentIndex >= max) {
                break;
            }
            
            step = allNumbers[currentIndex];
        }
        
        // Выводим счастливые числа из введенных пользователем
        System.out.println("\nСчастливые числа (Lucky numbers) из введенных:");
        boolean found = false;
        
        for (int i = 0; i < n; i++) {
            int num = numbers[i];
            
            // Проверяем, является ли число счастливым
            boolean isLucky = false;
            for (int j = 0; j < max; j++) {
                if (allNumbers[j] == num) {
                    isLucky = true;
                    break;
                }
            }
            
            if (isLucky) {
                System.out.print(num + " ");
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("Среди введенных чисел нет счастливых.");
        }
        
        in.close();
    }
}