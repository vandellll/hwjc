package homework4;

import java.util.HashMap;

public class HomeWork4 {
    public static void main(String[] args) {

        String[] testWords = {"one", "two", "five", "six", "nine", "ten", "seven", "six", "one", "eleven", "twenty"};
        HashMap<String, Integer> words = new HashMap<>();

        System.out.println("Task #1");

        System.out.println("All words: ");

        for (String word: testWords) {
            if (!words.containsKey(word)) {
                words.put(word, 1);
            } else {
                words.put(word, words.get(word) + 1);
            }
            System.out.print(word + " ");
        }
        System.out.println();

        System.out.println("Unique words: ");
        System.out.println(words);

        System.out.println("Task #2");

        PhoneBook book = new PhoneBook();
        book.add("Volkov", "87267345678");
        book.add("Volkov", "82767345679");
        book.add("Volkov", "82567345670");
        book.add("Yusupov", "86534567013");
        book.add("Yusupov", "84479567014");

        book.add("Yusupov", "89034567014");
        book.add("Romanov", "85656701434");

        book.print();

        System.out.println("Volkov's phone");
        System.out.println(book.get("Volkov"));

        //Test name not found case
        System.out.println("Phones for Petrov");
        System.out.println(book.get("Petrov"));
    }
}
