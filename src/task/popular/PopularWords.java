package task.popular;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.SortedMap;
/***
 * Задача 3: Поиск популярных слов
 * Из списка слов надо найти 10 наиболее часто встречаемых, длинной больше 5
 */
public class PopularWords {
    public static final int WORDS_BIGGER_THAN = 5;
    public static final int NUMBER_OF_FIRST_WORDS = 10;

    public static void main(String[] args) {
        List<String> input = List.of("А", "В", "А", "АА", "В", "ВВ", "А", "ВВ");
        ArrayList<String> output = getPopularWords(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемый результат: " + "[]");
        System.out.println("Полученный результат: " + output);
        System.out.println("");

        input = List.of("А", "В", "А", "ААABBB", "В", "ВВ", "А", "ВВ");
        output = getPopularWords(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемый результат: " + "[AAABBB]");
        System.out.println("Полученный результат: " + output);
        System.out.println("");

        input = List.of("dog", "Dmethod", "Breading", "Areality", "gate", "virus",
                "photo", "gate", "Crecognition", "Areality", "virus", "gate", "cat", "Areality", "Breading");
        output = getPopularWords(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемый результат: " + "[Areality, Breading, Crecognition, Dmethod] или " +
                "[Areality, Breading, Dmethod, Crecognition]");
        System.out.println("Полученный результат: " + output);
        System.out.println("");

        input = List.of("AAAAdog", "AAAAdog", "AAAAdog", "BBBcat", "BBBcat", "BBBcat", "CCCCon", "CCCCon", "CCCCon");
        output = getPopularWords(input);
        System.out.println("Вход: " + input);
        System.out.println("Ожидаемый результат: " + "[AAAAdog, BBBcat, CCCCon]");
        System.out.println("Полученный результат: " + output);
        System.out.println("");
    }

    // Алг. O(n*logn)
    //Память.  O(n)
    private static ArrayList<String> getPopularWords(List<String> input) {

        //для сравнения значений ключа у TreeHashMap
        class IntegerMapValueComparator implements Comparator<String> {
            final Map<String, Integer> map;

            public IntegerMapValueComparator(Map<String, Integer> map) {
                this.map = map;
            }

            public int compare(String o1, String o2) {
                int rezCompareInteger = Integer.compare(map.get(o2), map.get(o1));

                if (rezCompareInteger != 0) {
                    return rezCompareInteger;
                } else {
                    return 1; //чтобы сохранить ключи, по которым повторяются в Map значения
                }
            }
        }

        //Можно и new LinkedHashMap<>(); - для сохранения порядка следования
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String word : input) {

            if (word.length() > WORDS_BIGGER_THAN) {
                int count = wordsCount.getOrDefault(word, 0);
                wordsCount.put(word, ++count);
            }
        }

        SortedMap<String, Integer> sortedWordsCount = new TreeMap<>(new IntegerMapValueComparator(wordsCount));
        sortedWordsCount.putAll(wordsCount); // O(n*logn)

        ArrayList<String> firstNWords = new ArrayList<>();
        int i = 0;
        for (Map.Entry<String, Integer> word : sortedWordsCount.entrySet()) {
            firstNWords.add(word.getKey());
            i++;
            if (i == NUMBER_OF_FIRST_WORDS) {
                break;
            }
        }

        return firstNWords;
    }


}
