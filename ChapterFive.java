import java.util.Scanner;

public class ChapterFive {
    Scanner scanner = new Scanner(System.in);
    private String name, user, domain;
    
//accessor
    public void setName() {    
 	name = scanner.nextLine();
}        
    public void setUser() {
 	user = scanner.nextLine();
}
    public void setDomain() {
	domain = scanner.nextLine();
}

//mutator
    public String getName() {
 	return name;
}
    public String getUser() {
 	return user;
}
    public String getDomain() {
	return domain;
}
    public String getEmail() { //mutator for email
 	return user + "@" + domain;
}

//main method
public static void main(String[] args) { 
    ChapterFive listObject = new ChapterFive(); //initialize instance 
    Scanner reset = new Scanner(System.in);
        
    System.out.println("------------------------------------------");
    System.out.println("//Chapter Five Assignment//");       
             
    char again = 'y'; //loops code 
    while(again == 'y' || again == 'Y') {
                
    System.out.println("------------------------------------------");
    System.out.println("[Input]");
    System.out.println(" ");        
        
    System.out.print("Enter name: ");   
        listObject.setName(); //accessor for name
                
    System.out.print("Enter username: ");
        listObject.setUser(); //accessor for username
                
    System.out.print("Enter domain: ");
        listObject.setDomain(); //accessor domain

    System.out.println("------------------------------------------");
    System.out.println("[Output]");
    System.out.println(" ");
        
    System.out.println("Email address for " + listObject.getName() + " is " + listObject.getEmail());
    System.out.println(" ");
    System.out.println("Would you like to try again? y/n");       
        
    again = reset.next().charAt(0); //scans for input to restart code
        }
}
}