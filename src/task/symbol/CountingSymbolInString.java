package task.symbol;

/***
 * Задача 4: Подсчет количества повторений букв
 * Найти сколько раз встречается символ в строке
 */
public class CountingSymbolInString {
    public static void main(String[] args) {
        String input = "Homer was a happy hamster who lived in a heart shaped house. His owner, " +
                "Hazel, was a redhead. Homer had the best cage. It was almost the size of a doghouse.";
        char chToCount = 'h';
        int output = countingCharInString(input, chToCount);
        System.out.println("Вход: " + input);
        System.out.println("Символ: " + chToCount);
        System.out.println("Ожидаемое значение: " + 11);
        System.out.println("Полученное значение: " + output);
        System.out.println("");

        input = "Homer was a happy hamster who lived in a heart shaped house. His owner, " +
                "Hazel, was a redhead. Homer had the best cage. It was almost the size of a doghouse.";;
        chToCount = 'H';
        output = countingCharInString(input, chToCount);
        System.out.println("Вход: " + input);
        System.out.println("Символ: " + chToCount);
        System.out.println("Ожидаемое значение: " + 4);
        System.out.println("Полученное значение: " + output);
        System.out.println("");

        input = "Homer was a happy hamster who lived in a heart shaped house. His owner, " +
                "Hazel, was a redhead. Homer had the best cage. It was almost the size of a doghouse.";;
        chToCount = 'q';
        output = countingCharInString(input, chToCount);
        System.out.println("Вход: " + input);
        System.out.println("Символ: " + chToCount);
        System.out.println("Ожидаемое значение: " + 0);
        System.out.println("Полученное значение: " + output);
        System.out.println("");

    }

    //Алг.    O(n)
    //Память. O(1)
    private static int countingCharInString(String input, char chToCount) {
        int count = 0;

        for (int i =0; i < input.length(); i++) {
            if (input.charAt(i) == chToCount) {
                count++;
            }
        }
        return count;
    }

}
