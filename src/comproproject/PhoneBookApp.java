
package comproproject;

import java.util.Scanner;

public class PhoneBookApp {

    public static void main(String[] args) {
        int select;
        int count = -1;
        PhoneBook[] phonebook = new PhoneBook[200000000];
        int noSelected;
        int case3select;
        
        
        String menuStr = "Phone Book Program. \n"
                + "1. add phone number \n"
                + "2. delete list \n"
                + "3. edit phone book \n"
                + "4. show all list\n"
                + "0. exit \n"
                + "==============================================================";
        Scanner sc = new Scanner(System.in);
        //Scanner sc2 = new Scanner(System.in);
        //Scanner sc3 = new Scanner(System.in);
        

        do{
            System.out.println(menuStr);
            System.out.print("Select menu : ");
            select = sc.nextInt();
            System.out.println("==============================================================");
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
                    System.out.print("Enter name you want to delete : ");
                    sc.nextLine();
                    String cpr = sc.nextLine();
                    if(count != -1){
                        for(int i = 0; i < count; i++){
                            if(cpr.equals(phonebook[i].getName())){
                                phonebook[i].delete();
                                System.out.println("That name has been delete.");
                                System.out.println("==============================================================");
                            }else{
                                System.out.println("Cannot find this name");
                            }
                        }
                    }else{
                        System.out.println("no data");
                    }
                    //OK แล้วระดับนึง
                    //ตอนแรกแม่งยังได้อยู่เลย
                    break;
                case 3:
                    //โชว์ก่อนแล้วค่อยให้เลือกว่าจะเปลี่ยนตัวใหน
                    //เลือกจากใน list
                    //เลือกแล้วให้เลือกอีกว่าจะ edit อะไร
                    System.out.println("Choose list you want to edit : ");
                    System.out.println("No.   Tel.       Name      Email");
                    for(int i = 0; i <= count; i++){
                        System.out.println(i + ". " + phonebook[i].toString());
                    }
                    System.out.print("Select list : ");
                    noSelected = sc.nextInt();
                    System.out.println("==============================================================");
                    String menuEdit = "What you want to edit?\n"
                            + "1. Edit name\n"
                            + "2. Edit Telnumber\n"
                            + "3. Edit E-mail\n"
                            + "0. Cancel\n"
                            + "==============================================================";
                    
                    do{
                        System.out.println(menuEdit);
                        System.out.print("Wanna edit : ");
                        case3select = sc.nextInt();
                        System.out.println("==============================================================");
                        switch(case3select){
                            case 1:
                                System.out.print("Edit name : ");
                                sc.nextLine();
                                phonebook[case3select].setName(sc.nextLine());
                                System.out.println("Changed name!!!");
                                System.out.println("==============================================================");
                                break;
                            case 2:
                                System.out.print("Edit telephone number : ");
                                sc.nextInt();
                                phonebook[case3select].setTelNumber(sc.nextInt());
                                System.out.println("Changed telnumber!!!");
                                System.out.println("==============================================================");
                                break;
                            case 3:
                                System.out.print("Edit E-mail : ");
                                sc.nextLine();
                                phonebook[case3select].setEmail(sc.nextLine());
                                System.out.println("Changed E-mail!!!");
                                System.out.println("==============================================================");
                                break;
                        }
                        System.out.println("==============================================================");
                    }while(noSelected != 0);
                    break;
                case 4:
                    //โชว์ทั้งหมด
                    if(count != -1){
                        System.out.println("No.   Tel.       Name      Email");
                        for(int i = 0; i <= count; i++){
                            System.out.println(i + ". " + phonebook[i].toString());
                        }
                    }else {
                        System.out.println("no data");
                    }
                    System.out.println("==============================================================");
                    break;
            }
        }while (select != 0);
    }
}