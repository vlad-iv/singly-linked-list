package task.letter;

import java.util.HashMap;
import java.util.Map;

/**
 * ### Задача 4: Подсчет количества повторений букв
 * Найти сколько раз встречается символ в строке
 *
 * ДАНО
 * А В А АА В ВВАВВ
 *
 * РЕЗУЛЬТАТ
 * A - 5
 * B - 6
 */

public class CountLetters {
    public static void main(String[] args) {
        String input = "А В А АА В ВВАВВ";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if (input.charAt(i) != ' ') {
                int counter = map.getOrDefault(letter, 0);
                counter++;
                map.put(letter, counter);
            }
        }
        System.out.println(input + "\n");
        map.forEach((key, value) -> System.out.println(key + "-" + value));
    }
}
