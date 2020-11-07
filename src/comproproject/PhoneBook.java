
package comproproject;

public class PhoneBook {
    private String telNumber;
    private String name;
    private String email;
    
    public PhoneBook(){
        this.name = null;
        this.telNumber = null;
        this.email = null;
    }
    public PhoneBook(String telNumber){
        this.name = telNumber;
        this.telNumber = telNumber;
        this.email = null;
    }
    public PhoneBook(String telNumber, String name){
        this.name = name;
        this.telNumber = telNumber;
        this.email = null;
    }
    public PhoneBook(String telNmString, String name, String email){
        this.telNumber = telNmString;
        this.name = name;
        this.email = email;
    }
    
}
