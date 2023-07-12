import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text = "fsd aer uyiyu gd ahgj";

        Comparator<String> vowelComparator = Comparator.comparingInt(Main::countVowels);

        String[] words = text.split(" ");

        List<String> sortedWords = Arrays.stream(words)
                .filter(Main::containsVowels)
                .sorted(vowelComparator)
                .toList();
        for (String word : sortedWords){
            System.out.println(word);
        }
    }
    private static boolean containsVowels(String word) {
        return word.matches(".*[aeiouAEIOU].*");
    }

    private static int countVowels(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}

