package task.duplicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
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
		List<String> input = new ArrayList<>(List.of("А", "В", "А", "АА", "В", "ВВ", "А", "ВВ"));
//		input = duplicateRemoving(input);
		duplicateRemoving2(input);
		System.out.println(input);
	}

	// Alg O(n)
	// Mem O(n)
	private static Collection<String> duplicateRemoving(Collection<String> input) {
		return new LinkedHashSet<>(input);
	}

	// Alg O(n) -> O(n2)
	// Mem O(n) -> O(1)
	private static void duplicateRemoving2(List<String> input) {
		int pos = 0;
		for (Iterator<String> iterator = input.iterator(); iterator.hasNext(); ) {
			String value = iterator.next();
			boolean dublicate = false;
			for (int i = 0; i < pos; i++) {
				if (input.get(i).equals(value)) {
					dublicate = true;
					break;
				}
			}
			if (dublicate) {
				iterator.remove();
			} else {
				pos++;
			}
		}
	}
}
