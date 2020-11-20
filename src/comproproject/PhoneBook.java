
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
    public void setTelNumber(String telNo){
        this.telNumber = telNo;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getName(){
        return name;
    }
    public String getTelNumber(){
        return telNumber;
    }
    public String getEmail(){
        return email;
    }
    public void delete(){
        this.name = null;
        this.telNumber = null;
        this.email = null;
    }

    @Override
    public String toString() {
        return " " + getTelNumber() + "   " + getName() + "   " + getEmail();
    }
    

}