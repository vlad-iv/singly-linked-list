package task.maximum;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * ### Задача 5: Найти 3 максимума
 * В списке чисел найти 3 максимальных
 *
 * ДАНО
 * 5, 10, 1, 0, 4, 6, 14
 *
 * Результат
 * 14
 * 10
 * 6
 *
 */
public class ThreeMaximum {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(1);
        list.add(0);
        list.add(4);
        list.add(6);
        list.add(14);

        System.out.println(list);
        getThreeMaximum(list);
    }

    public static void getThreeMaximum(List<Integer> input) {
        input.stream()
                .sorted(Comparator.comparingInt(o -> (int) o).reversed())
                .limit(3)
                .forEach(System.out::println);
    }
}
