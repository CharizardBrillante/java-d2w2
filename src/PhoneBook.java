import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Objects;

public class PhoneBook {
	
	static HashMap<String, String> phoneBook = new HashMap<String, String>();
	
	public void addContact(String name, String number) {
		phoneBook.put(name, number);
	}
	
	public void deleteContact(String name) {
		phoneBook.remove(name);
	}
	
	public String getNameByNumber(String num) {
		for(Entry entry : phoneBook.entrySet()) {
			if(Objects.equals(num, entry.getValue())) {
				return entry.getKey().toString();
			}
		}
		
		return "Contact not found";
	}
	
	public String getNumberByName(String name) {
		return phoneBook.get(name).toString();
	}
	
	public void printPhoneBook() {
		phoneBook.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		});
	}
}
