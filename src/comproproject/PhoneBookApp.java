
package comproproject;

import java.util.Scanner;
import java.util.Arrays;

public class PhoneBookApp {

    public static void main(String[] args) {
        int select;
        int count = -1;
        PhoneBook[] phonebook = new PhoneBook[200000000];
        int case3select;
        
        
        String menuStr = "Phone Book Program. \n"
                + "1. add phone number \n"
                + "2. delete list \n"
                + "3. edit phone book \n"
                + "4. show all list\n"
                + "0. exit \n"
                + "==============================================================";
        Scanner sc = new Scanner(System.in);
        
        
        
        
        
        do{
            System.out.println(menuStr);
            System.out.println("Select menu : ");
            select = sc.nextInt();
            
            switch(select){
                case 1:
                    System.out.print("Enter phone number : ");
                    count++;
                    phonebook[count] = new PhoneBook();
                    phonebook[count].setTelNumber(sc.nextInt());//ถ้าใส่ String จะ error
                    System.out.print("Enter name of number owner : ");
                    sc.nextLine();
                    phonebook[count].setName(sc.nextLine());
                    System.out.print("Enter email of owner : ");
                    phonebook[count].setEmail(sc.nextLine());
                    System.out.println("Phone Book SUCESSFUL!!!!!");
                    System.out.println("==============================================================");
                    break;//อันนี้ ok ประมาณนึง
                case 2:
                    System.out.println("Enter name you want to delete :");
                    sc.nextLine();
                    String cpr = sc.nextLine();
                    for(int i = 0; i < count; i++){
                        if(cpr.equals(phonebook[i].getName())){
                            phonebook[i].delete();
                            System.out.println("That name has been delete.");
                        }else{
                            System.out.println("Cannot find this name");
                        }
                    }
                    System.out.println("==============================================================");
                    //BUG*
                    break;
                case 3:
                    //โชว์ก่อนแล้วค่อยให้เลือกว่าจะเปลี่ยนตัวใหน
                    //เลือกจากใน list
                    //เลือกแล้วให้เลือกอีกว่าจะ edit อะไร
                    System.out.println("Choose list you want to edit : ");
                    for(int i = 0; i <= count; i++){
                            System.out.println(i + ". " + phonebook[i].toString());
                    }
                    System.out.println("Select list : ");
                        //phonebook[sc.nextInt()];
                        System.out.println("Edit name : ");
                        System.out.println("Edit telephone number : ");
                        System.out.println("Edit E-mail : ");
                    
                    break;
                case 4:
                    //โชว์ทั้งหมด
                    if(count != -1){
                        for(int i = 0; i <= count; i++){
                            System.out.println(i + ". " + phonebook[i].toString());
                        }
                    }else {
                        System.out.println("no data");
                    }
                    
                    break;
            }
        }while (select != 0);
    }
    
}