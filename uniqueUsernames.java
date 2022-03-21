import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class uniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nameCount = Integer.parseInt(scanner.nextLine());

        Set<String> uniqueName = new LinkedHashSet<>();

        for (int i = 0; i < nameCount; i++) {
            String name = scanner.nextLine();

            uniqueName.add(name);
        }

        for (String name : uniqueName) {
            System.out.println(name);
        }
    }
}
