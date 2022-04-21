package task.min2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

/***
 * Задача 6: Найти 2 минимума и количество повторений
 * Найти 2 минимальных числа в списке, и указать кол-во сколько он встречается.
 */
public class MinsAndCount {
    public static final int NUMBER_OF_MINS = 2;

    public static void main(String[] args) {
        ArrayList<Integer> input;
        HashMap<Integer, Integer> output;// <min, count>

        input = new ArrayList<>(Arrays.asList(2, 4, -1, 30, 2, -1, 20, 234, -1, 20, 2, 2));
        output = getMinsCount(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемые значения: " + "{-1=3, 2=4}");
        System.out.println("Полученные значения: " + output);
        System.out.println("");

        input = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1));
        output = getMinsCount(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемые значения: " + "{1=5}");
        System.out.println("Полученные значения: " + output);
        System.out.println("");

        input = new ArrayList<>(Arrays.asList(3));
        output = getMinsCount(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемые значения: " + "{3=1}");
        System.out.println("Полученные значения: " + output);
        System.out.println("");

        input = new ArrayList<>(Arrays.asList());
        output = getMinsCount(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемые значения: " + "{}");
        System.out.println("Полученные значения: " + output);
        System.out.println("");

        input = new ArrayList<>(Arrays.asList(0, 0, 0, 1, 1, 1, -1, -1, -1));
        output = getMinsCount(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемые значения: " + "{-1=3, 0=3}");
        System.out.println("Полученные значения: " + output);
        System.out.println("");
    }

    //Алг.   O(nlogn)
    //Память O(n)
    private static HashMap<Integer, Integer> getMinsCount(ArrayList<Integer> input) {
        HashMap<Integer, Integer> minsCount = new HashMap<>();
        TreeSet<Integer> uniqSortedNumbers = new TreeSet<>(input);// O(nlogn)

        int i = 0;
        for (Integer min : uniqSortedNumbers) {//O(n) * O(1)

            int countRepeatedMin = 0;//счетчик повторения
            for (Integer num : input) {//O(n)
                if (min.equals(num)) {
                    countRepeatedMin++;
                }
            }
            minsCount.put(min, countRepeatedMin);

            i++;
            if (i == NUMBER_OF_MINS) {
                break;
            }
        }
        return minsCount;
    }
}
