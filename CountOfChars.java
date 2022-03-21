import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character, Integer> uniqueChar = new TreeMap<>();


        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
           //var1
            if (!uniqueChar.containsKey(symbol)) {
                uniqueChar.put(symbol, 1);
            } else {
                uniqueChar.put(symbol, uniqueChar.get(symbol) + 1);
            }
            //var2
//            uniqueChar.putIfAbsent(symbol, 0);
//            uniqueChar.put(symbol, uniqueChar.get(symbol) + 1);

        }
        for (Map.Entry<Character, Integer> entry : uniqueChar.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            System.out.printf("%c: %d time/s%n", key, value);
        }

    }
}
