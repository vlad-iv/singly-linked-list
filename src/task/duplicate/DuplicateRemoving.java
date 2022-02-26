package task.duplicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Удаление дубликатов.
 * <p>
 * Удалить из строки повторные слова:
 * Пример:
 * А В А АА В ВВ А ВВ
 * <p>
 * Результат:
 * А В АА ВВ
 *
 * @author Vladimir Ivanov (ivanov.vladimir.l@gmail.com)
 */
public class DuplicateRemoving {

	public static void main(String[] args) {
		List<String> input = new ArrayList<>();
		input.add("A");
		input.add("B");
		input.add("A");
		input.add("AA");
		input.add("B");
		input.add("BB");
		input.add("A");
		input.add("BB");

//		Collection<String> result = duplicateRemoving(input);
		Collection<String> result = duplicateRemoving2(input);

		System.out.println(result);
	}

	// O(n) - сложность
	// O(n) - память ?  --> O(1)
	private static Collection<String> duplicateRemoving(List<String> input) {
		Set<String> uniq = new LinkedHashSet<>();
		for (String value : input) {
			uniq.add(value);
		}
		return uniq;
	}

	// O(n*n) - сложность
	// O(1) - память
	private static List<String> duplicateRemoving2(List<String> input) {
		int i = 0;
		for (Iterator<String> iterator = input.iterator(); iterator.hasNext(); ) {
			String value = iterator.next();
			boolean isUniq = true;
			for (int j = 0; j < i; j++) {
				final String uniq = input.get(j);
				if (value.equals(uniq)) {
					iterator.remove();
					isUniq = false;
					break;
				}
			}
			// --uniq----(-)---not uniq---------
			// --uniq----(x)(-)--not uniq---------
			// --uniq-----(-)--not uniq---------
			if (isUniq) {
				i++;
			}

		}
		return input;
	}
}
