package weekly2;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private static List<Contact> contacts=new ArrayList<>();

    public AddressBook() {

    }

    public static void addAddress(Contact contact){
        contacts.add(contact);
    }

    public static void displayContacts(){
        if(contacts.isEmpty()){
            System.out.println("연락처가 비어있습니다");
        }else{
            for (Contact contact : contacts) {
                System.out.println(contact.toString());
            }
        }
    }

    public static void searchContact(String name){
        boolean found=false;

        for (Contact contact : contacts) {
            if(contact.getName().equals(name)){
                System.out.println(contact.toString());
                found=true;
                break;
            }
        }

        if(!found){
            System.out.println("연락처를 찾을 수 없습니다.");
        }
    }
}
