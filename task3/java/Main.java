import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(23,219,435,1,23,5,6,90);

        List<Integer> newNumbers = numbers.stream()
                .filter(n -> n>10)
                .collect(Collectors.toList());

        newNumbers.sort(Comparator.comparing(Main::getLastDigit));
        for (int a : newNumbers){
            System.out.println(a);
        }

    }
    public static int getLastDigit(int number){
        return number % 10;
    }
}

