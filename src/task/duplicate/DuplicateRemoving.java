package task.duplicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

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
		// скорость!? -память
//		List<String> input = List.of("А", "В", "А", "АА", "В", "ВВ", "А", "ВВ");
//		Collection<String> result = duplicateRemoving(input);
//		System.out.println(result);

		// +  экономия памяти
		ArrayList<String> input2 = new ArrayList<>(List.of("А", "В", "А", "АА", "В", "ВВ", "А", "ВВ"));
		duplicateRemoving2(input2);
		System.out.println(input2);
	}

	// Алг O(n2)
	// Память O(1)
	private static void duplicateRemoving2(ArrayList<String> input) {
		int i = 0;
		for (Iterator<String> iterator = input.iterator(); iterator.hasNext(); ) {
			String val = iterator.next();
			boolean duplicate = false;
			for (int j = 0; j < i; j++) {
				if (val.equals(input.get(j))) {
					duplicate = true;
					break;
				}
			}
			if (duplicate) {
				iterator.remove();
			} else {
				i++;
			}
		}
	}

	// Алг O(n)
	// Память O(n)
	private static Collection<String> duplicateRemoving(List<String> input) {
//		return new HashSet<>(input);
//		return new TreeSet<>(input);
		return new LinkedHashSet<>(input);
	}

}
