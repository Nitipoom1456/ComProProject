
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
    public void setName(String name){
        this.name = name;
    }
    public void setTelNummber(String telNo){
        this.telNumber = telNo;
    }
    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString() {
        return "PhoneBook{" + "telNumber=" + telNumber + ", name=" + name + ", email=" + email + '}';
    }
    
}
