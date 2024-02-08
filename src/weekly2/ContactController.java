package weekly2;

import java.util.Scanner;

public class ContactController {
    boolean exit=false;
    Scanner sc=new Scanner(System.in);
    public void run(){
        while(!exit){
            showMenu();
            int input = menuInput();
            displayMenu(input);
        }
    }

    private void displayMenu(int input){
        MenuOption selectedOption=MenuOption.getValue(input);
        switch (selectedOption) {
            case ADD_BUSINESS_CONTACT:
                addBusinessContact();
                break;
            case ADD_PERSONAL_CONTACT:
                addPersonalContact();
                break;
            case DISPLAY_CONTACT:
                printAddressContact();
                break;
            case SEARCH_CONTACT:
                System.out.println("검색할 이름을 입력하세요:");
                String name = contactInput();
                searchAddressContact(name);
                break;
            case EXIT:
                exit();
                break;
            default:
                System.out.println("유효하지 않은 선택입니다. 다시 선택해주세요.");
        }
    }


    private int menuInput() {
       return sc.nextInt();
    }

    private String contactInput(){
        return sc.next();
    }

    private static void showMenu(){
        System.out.println("1. 비즈니스 연락처 추가"+"\n"+
        "2. 개인 연락처 추가"+"\n"+
        "3. 연락처 출력"+"\n"+
        "4. 연락처 검색"+"\n"+
        "5. 종료"+"\n"+
        "메뉴를 선택해주세요:");
    }

    private void addBusinessContact(){
        System.out.println("이름을 입력하세요:");
        String name = contactInput();
        System.out.println("전화번호를 입력하세요:");
        String phoneNumber = contactInput();
        System.out.println("회사명을 입력하세요");
        String company = contactInput();
        AddressBook.addAddress(new BusinessContact(name,phoneNumber,company));
    }

    private void addPersonalContact(){
        System.out.println("이름을 입력하세요:");
        String name = contactInput();
        System.out.println("전화번호를 입력하세요:");
        String phoneNumber = contactInput();
        System.out.println("관계를 입력하세요");
        String relationship = contactInput();
        AddressBook.addAddress(new PersonalContact(name,phoneNumber,relationship));
    }

    private void printAddressContact(){
        AddressBook.displayContacts();
    }

    private void searchAddressContact(String name){
        AddressBook.searchContact(name);
    }

    private void exit(){
        exit=true;
    }

}
