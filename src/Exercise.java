import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class Exercise {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quanto vuoi che sia lunga la tua lista?");
		int len = Integer.parseInt(scanner.nextLine());
		
		ArrayList<String> list = ListMaker.createList(len, scanner);
		
		System.out.println(list);
		
		@SuppressWarnings("unchecked")
		HashSet<String> set = (HashSet<String>)ListMaker.setList(list).get(0);
		@SuppressWarnings("unchecked")
		ArrayList<String> duplicates = (ArrayList<String>)ListMaker.setList(list).get(1);
		System.out.println("Le parole uniche sono " + set.size() +  ": ");
		
		System.out.println(set);
		
		System.out.println("Le parole duplicate sono " + duplicates.size() + ": ");
		System.out.println(duplicates);
		
		System.out.println("-------------------- EXERCISE 2 -------------------------");
		System.out.println("Quanto dev'essere lunga la lista di numeri casuali?");
		
		int len2 = Integer.parseInt(scanner.nextLine());
		ArrayList<Integer> randomIntList = ListMaker.createRandomList(len2); //create a list of random numbers
		System.out.println(randomIntList);
		
		ArrayList<Integer> mirrorList = ListMaker.createMirrorList(randomIntList); //create a mirror list starting from the random list
		
		ArrayList<Integer> evenList = ListMaker.getEven(mirrorList, true); //create a list with the index-even elements of the mirror list
		ArrayList<Integer> oddList = ListMaker.getEven(mirrorList, false); //create a list with the index-odd elements of the mirror list
		
		System.out.println("Beccati la tua lista specchiata!");
		System.out.println(mirrorList);
		
		System.out.println("Beccati gli elementi con indice pari della tua lista!");
		System.out.println(evenList);
		System.out.println("Beccati gli elementi con indice dispari della tua lista!");
		System.out.println(oddList);
		
		System.out.println("-------------------- EXERCISE 2 -------------------------");
		PhoneBook phoneBook = new PhoneBook();
		
		System.out.println("Quanti contatti vuoi aggiungere alla rubrica?");
		int numOfContacts = Integer.parseInt(scanner.nextLine()); //create phonebook
		
		for(int i=0; i<numOfContacts; i++) { //add contacts
			
			System.out.println("Nome:");
			String name = scanner.nextLine();
			
			System.out.println("Numero di telefono:");
			String number = scanner.nextLine();
			
			phoneBook.addContact(name, number);
		}
		
		System.out.println("La tua rubrica:");
		phoneBook.printPhoneBook();
		
		System.out.println("Cerca un numero per nome:"); //search number by name
		String nameToSearch = scanner.nextLine();
		
		System.out.println(phoneBook.getNumberByName(nameToSearch));
		
		System.out.println("Cerca un nome per numero:"); //search name by number
		String numToSearch = scanner.nextLine();
		
		System.out.println(phoneBook.getNameByNumber(numToSearch));
		
		System.out.println("Elimina un contatto inserendo il suo nome"); //delete contact
		String nameToDelete = scanner.nextLine();
		phoneBook.deleteContact(nameToDelete);
		System.out.println("Contatto eliminato");
		phoneBook.printPhoneBook();
		
		scanner.close();
	}
}
