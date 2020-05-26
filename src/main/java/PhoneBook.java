import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    Map<String, ArrayList<String>> phoneBook = new HashMap<String, ArrayList<String>>();;

    private ArrayList<String> getPhonesByPerson(String person) {
        return phoneBook.get(person);
    }

    public String getContacts(String person) {
        String result = "Person " + person + " not found or contact list is empty";
        ArrayList<String> phones = getPhonesByPerson(person);
        if (phones != null) {
            result = person + ": " + phones.toString();
        }
        return result;
    }

    public void addContact(String person, String phoneNumber){
        ArrayList<String> phones = getPhonesByPerson(person);
        if (phones == null) {
            phones = new ArrayList<String>();
        }
        phones.add(phoneNumber);
        phoneBook.put(person, phones);
    }
}
