import java.util.*;

public class Main {

    public static void main(String[] args) {

        // get unique count
        ArrayList<String> arrWords = new ArrayList(Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "One", "Two", "Three", "Four", "Five", "One", "Two", "Three"));
        Map<String, Integer> mapWords = new HashMap();
        Iterator<String> iter = arrWords.iterator();
        for (int i = 0; i < arrWords.size(); i++) {
            mapWords.put(arrWords.get(i), 0);
        }
        for (int i = 0; i < arrWords.size(); i++) {
            mapWords.put(arrWords.get(i), mapWords.get(arrWords.get(i)) + 1);
        }
        System.out.println(mapWords.toString());

        // phoneBook
        PhoneBook phoneBook = new PhoneBook();
        System.out.println(phoneBook.getContacts("Ivanov"));
        phoneBook.addContact("Ivanov", "12345");
        System.out.println(phoneBook.getContacts("Ivanov"));
        phoneBook.addContact("Ivanov", "5434343534");
        System.out.println(phoneBook.getContacts("Ivanov"));
    }
}
