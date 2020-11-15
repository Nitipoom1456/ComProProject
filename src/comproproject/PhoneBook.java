
package comproproject;

public class PhoneBook {
    private int telNumber;
    private String name;
    private String email;
    
    public PhoneBook(){
        this.name = null;
        this.telNumber = 0;
        this.email = null;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setTelNumber(int telNo){
        this.telNumber = telNo;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getName(){
        return name;
    }
    public int getTelNumber(){
        return telNumber;
    }
    public String getEmail(){
        return email;
    }
    public void delete(){
        this.name = null;
        this.telNumber = 0;
        this.email = null;
    }
    
    @Override
    public String toString() {
        return "PhoneBook{" + "telNumber = " + telNumber + " , name = " + name + " , email = " + email + '}';
    }
    
}