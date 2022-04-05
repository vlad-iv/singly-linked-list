package task.minimum;

import java.util.*;

/**
 * ### Задача 5: Найти 2 минимума и количество повторений
 * Найти 2 минимальных числа в списке, и указать кол-во сколько он встречается.
 *
 * ДАНО
 * 5, 10, 14, 0, 5, 6, 14, 14
 *
 * Результат
 * 0 - 1
 * 5 - 2
 *
 */
public class TwoMinimum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 10, 14, 0, 5, 6, 14, 14);
        System.out.println(list);
        getTwoMinimum(list);
    }

    public static void getTwoMinimum(List<Integer> input) {
        Map<Integer, Integer> map = new TreeMap<>(Integer::compareTo);
        for (Integer integer : input) {
            int counter = map.getOrDefault(integer, 0);
            counter++;
            map.put(integer, counter);
        }
        map.entrySet().stream().limit(2).forEach(System.out::println);
    }
}
