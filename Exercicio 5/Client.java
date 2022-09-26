public class Client {
    private String name;
    private String email;
    private java.util.Date birthDate;


    public Client(String name, String email, java.util.Date birthDate) {
        this.name = name; 
        this.email= email; 
        this.birthDate = birthDate; 
    }
    
    public String toString() {
        return String.format("%s (%s) - %s\n", name, birthDate, email);
    }

    
}
