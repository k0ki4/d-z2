import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "Кот который живёт на крыше";
        String search = scan.next();
        int index = -1;
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            j = 0;
            while (j < search.length() && i + j < str.length() && str.charAt(i + j) == search.charAt(j)) {
                j++;
            }
            if (j == search.length()) {
                index = i;
            }
        }
        if (index >= 0) {
            System.out.println("Индекс слова: " + index);
        }
        else {
            System.out.println("Слово не найдено");
        }
    }
}
