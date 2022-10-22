package task.count;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Подсчет количества повторений слов.
 *
 * Пример:
 * А В АА ВВ А ВВ А
 *
 * Результат:
 * А - 3
 * В - 1
 * АА - 1
 * ВВ - 2
 *
 * @author Vladimir Ivanov (ivanov.vladimir.l@gmail.com)
 */
public class CountWords {

	public static void main(String[] args) {
		List<String> input = List.of("А", "В", "АА", "ВВ", "А", "ВВ", "А");
		Map<String, Integer> output = countWords(input);
		System.out.println(output);
	}

	// Alg O(n) +
	// Mem O(n) +
	private static Map<String, Integer> countWords(List<String> input) {
		Map<String, Integer> output = new LinkedHashMap<>();
		for (String value : input) {
			Integer count = output.getOrDefault(value, 0);
			count++;
			output.put(value, count);
		}
		return output;
	}

}
