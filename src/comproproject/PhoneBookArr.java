
package comproproject;

public class PhoneBookArr {
    private int head = -1;
    private String[] book;
    
    
    public PhoneBookArr(){
        book = new String[3];
    }
    public void addTelNo(String telNo){
        book[0] = telNo;
    }
    public void addName(String name){
        book[1] = name;
    }
    public void addEmail(String email){
        book[2] = email;
    }


}
