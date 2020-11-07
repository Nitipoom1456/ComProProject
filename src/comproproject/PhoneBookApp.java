
package comproproject;

import java.util.Scanner;

public class PhoneBookApp {

    public static void main(String[] args) {
        int select;
        PhoneBook phoneBook = new PhoneBook();
        String menuStr = "1. add phone number \n"
                + "2. delete list \n"
                + "3. edit phone book \n"
                + "4. show all list\n"
                + "0. exit \n"
                + "==============================================================";
        Scanner sc = new Scanner(System.in);
        System.out.println(menuStr);
        
        do{
            System.out.println("Select menu : ");
            select = sc.nextInt();
            sc.nextLine();
            switch(select){
                case 1:
                    System.out.println("Enter phone number : ");
                    PhoneBook newBook = new PhoneBook(sc.nextLine());
                    
                    System.out.println("Enter name of number owner : ");
                    
                    System.out.println("Enter email of owner : ");
                    
                    
                    
                    break;
                case 2:
                    System.out.println("");
            }
        }while (select != 0);
    }
    
}
