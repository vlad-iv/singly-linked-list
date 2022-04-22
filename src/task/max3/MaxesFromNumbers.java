package task.max3;

import java.security.KeyStore;
import java.util.*;

/***
 * Задача 5: Найти 3 максимума
 * В списке чисел найти 3 максимальных
 */
public class MaxesFromNumbers {
    public static final int NUMBER_OF_MAXES = 3;

    public static void main(String[] args) {
        ArrayList<Integer> input;
        ArrayList<Integer> output;

        System.out.println("Метод: getMaxesFromNumbersWithRepeat\n");

        input = new ArrayList<>(Arrays.asList(4, 30, 2, -1, 20, 234, 11));
        output = getMaxesFromNumbersWithRepeat(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемые значения: " + "[234, 30, 20]");
        System.out.println("Полученные значения: " + output);
        System.out.println("");

        input = new ArrayList<>(Arrays.asList(4, 234, 30, 2, -1, 20, 234, 11));
        output = getMaxesFromNumbersWithRepeat(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемые значения: " + "[234, 234, 30]");
        System.out.println("Полученные значения: " + output);
        System.out.println("");

        input = new ArrayList<>(Arrays.asList(-1, 2));
        output = getMaxesFromNumbersWithRepeat(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемые значения: " + "[2, -1]");
        System.out.println("Полученные значения: " + output);
        System.out.println("");

        input = new ArrayList<>(Arrays.asList(3));
        output = getMaxesFromNumbersWithRepeat(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемые значения: " + "[3]");
        System.out.println("Полученные значения: " + output);
        System.out.println("");

        input = new ArrayList<>(Arrays.asList());
        output = getMaxesFromNumbersWithRepeat(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемые значения: " + "[]");
        System.out.println("Полученные значения: " + output);
        System.out.println("");

        input = new ArrayList<>(Arrays.asList(1, 1, 1));
        output = getMaxesFromNumbersWithRepeat(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемые значения: " + "[1, 1, 1]");
        System.out.println("Полученные значения: " + output);
        System.out.println("");

        input = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 3));
        output = getMaxesFromNumbersWithRepeat(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемые значения: " + "[3, 3, 3]");
        System.out.println("Полученные значения: " + output);
        System.out.println("");

        System.out.println("----------------------------------------------------------------");
        System.out.println("Метод: getMaxesFromNumbersWithoutRepeat\n");

        input = new ArrayList<>(Arrays.asList(4, 30, 2, -1, 20, 234, 11));
        output = getMaxesFromNumbersWithoutRepeat(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемые значения: " + "[234, 30, 20]");
        System.out.println("Полученные значения: " + output);
        System.out.println("");

        input = new ArrayList<>(Arrays.asList(4, 234, 30, 2, -1, 20, 234, 11));
        output = getMaxesFromNumbersWithoutRepeat(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемые значения: " + "[234, 30, 20]");
        System.out.println("Полученные значения: " + output);
        System.out.println("");

        input = new ArrayList<>(Arrays.asList(-1, 2));
        output = getMaxesFromNumbersWithoutRepeat(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемые значения: " + "[2, -1]");
        System.out.println("Полученные значения: " + output);
        System.out.println("");

        input = new ArrayList<>(Arrays.asList(3));
        output = getMaxesFromNumbersWithoutRepeat(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемые значения: " + "[3]");
        System.out.println("Полученные значения: " + output);
        System.out.println("");

        input = new ArrayList<>(Arrays.asList());
        output = getMaxesFromNumbersWithoutRepeat(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемые значения: " + "[]");
        System.out.println("Полученные значения: " + output);
        System.out.println("");

        input = new ArrayList<>(Arrays.asList(1, 1, 1));
        output = getMaxesFromNumbersWithoutRepeat(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемые значения: " + "[1]");
        System.out.println("Полученные значения: " + output);
        System.out.println("");

        input = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 3));
        output = getMaxesFromNumbersWithoutRepeat(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемые значения: " + "[3, 2, 1]");
        System.out.println("Полученные значения: " + output);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Метод: getMaxesFromNumbersWithoutRepeatSmallerDiff\n");


        input = new ArrayList<>(Arrays.asList(4, 30, 2, -1, 20, 234, 11));
        output = getMaxesFromNumbersWithoutRepeatSmallerDiff(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемые значения: " + "[234, 30, 20]");
        System.out.println("Полученные значения: " + output);
        System.out.println("");

        input = new ArrayList<>(Arrays.asList(4, 234, 30, 2, -1, 20, 234, 11));
        output = getMaxesFromNumbersWithoutRepeatSmallerDiff(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемые значения: " + "[234, 30, 20]");
        System.out.println("Полученные значения: " + output);
        System.out.println("");

        input = new ArrayList<>(Arrays.asList(-1, 2));
        output = getMaxesFromNumbersWithoutRepeatSmallerDiff(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемые значения: " + "[2, -1]");
        System.out.println("Полученные значения: " + output);
        System.out.println("");

        input = new ArrayList<>(Arrays.asList(3));
        output = getMaxesFromNumbersWithoutRepeatSmallerDiff(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемые значения: " + "[3]");
        System.out.println("Полученные значения: " + output);
        System.out.println("");

        input = new ArrayList<>(Arrays.asList());
        output = getMaxesFromNumbersWithoutRepeatSmallerDiff(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемые значения: " + "[]");
        System.out.println("Полученные значения: " + output);
        System.out.println("");

        input = new ArrayList<>(Arrays.asList(1, 1, 1));
        output = getMaxesFromNumbersWithoutRepeatSmallerDiff(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемые значения: " + "[1]");
        System.out.println("Полученные значения: " + output);
        System.out.println("");

        input = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 3));
        output = getMaxesFromNumbersWithoutRepeatSmallerDiff(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемые значения: " + "[3, 2, 1]");
        System.out.println("Полученные значения: " + output);
        System.out.println("----------------------------------------------------------------");

    }

    // Алг.   O(n)
    //Память. O(1)
    private static ArrayList<Integer> getMaxesFromNumbersWithoutRepeatSmallerDiff(ArrayList<Integer> input) {
        ArrayList<Integer> maxes = new ArrayList<>();
        if (input.size() == 0) {
            return maxes;
        }

        for (int countMaxes = 0; countMaxes < NUMBER_OF_MAXES; countMaxes++) { //O(1) * O(n)
            int max = input.get(0);
            for (int i = 1; i < input.size(); i++) {//O(n)
                if ((input.get(i) > max) && !(maxes.contains(input.get(i)))) {
                    max = input.get(i);
                }
            }

            //Исключаем повтор среди найденых максимальных значений. Ведь max в цикле всегда имеет
            // какое-то значение, даже в случае, когда в input будет меньше кол-во значений, чем требуемое
            // для нахождения кол-во максимальных значений
            if (!maxes.contains(max)) {
                maxes.add(max);
            }
        }
        return maxes;
    }


    // Алг.   O(nlogn)
    //Память. O(n)
    private static ArrayList<Integer> getMaxesFromNumbersWithoutRepeat(ArrayList<Integer> input) {
        ArrayList<Integer> maxes = new ArrayList<>();
        TreeSet<Integer> uniqSortedNumbers = new TreeSet<>(input);// O(nlogn)

        int i = 0;
        for (Integer uniqSortedNumber : uniqSortedNumbers.descendingSet()) {
            maxes.add(uniqSortedNumber);
            i++;
            if (i == NUMBER_OF_MAXES) {
                break;
            }
        }
        return maxes;
    }

    // Алг.   O(nlogn)
    //Память. O(n)
    private static ArrayList<Integer> getMaxesFromNumbersWithRepeat(ArrayList<Integer> input) {
        ArrayList<Integer> maxes = new ArrayList<>();

        Integer[] arrayToSort = input.toArray(new Integer[input.size()]);

        //Dual-Pivot Quicksort by Vladimir Yaroslavskiy, Jon Bentley, and Joshua Bloch
        Arrays.sort(arrayToSort, Collections.reverseOrder());//O(nlogn)

        for (int i = 0; (i < NUMBER_OF_MAXES) && (i < arrayToSort.length); i++) {
            maxes.add(arrayToSort[i]);
        }
        return maxes;
    }
}
