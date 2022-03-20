package task.duplicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * Удаление дубликатов.
 *
 * Удалить из строки повторные слова:
 * Пример:
 * А В А АА В ВВ А ВВ
 *
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
		input.add("AA");
		input.add("B");
		input.add("B");
		input.add("B");
		input.add("BB");
		input.add("BB");
		input.add("A");
		input.add("BB");
		input.add("C");

		Collection<String> output = duplicateRemoving2(input);
		System.out.println(output);

	}

	// Алгоритмическая O (n)
	// Память O (n) -> O (1)
	private static Collection<String> duplicateRemoving(List<String> input) {
		return new LinkedHashSet<>(input);
	}

	// Алгоритмическая O(n2)
	// Память O(1)
	// --->
	// --uniq---/i/--new---
	private static Collection<String> duplicateRemoving2(List<String> input) {
		int i = 0;
		for (Iterator<String> iterator = input.iterator(); iterator.hasNext(); ) {
			String s = iterator.next();
			boolean notUniq = false;
			for (int j = 0; j < i; j++) {
				if (s.equals(input.get(j))) {
					notUniq = true;
					break;
				}
			}
			if (notUniq) {
				iterator.remove();
			} else {
				i++;
			}
		}
		return input;
	}
}
