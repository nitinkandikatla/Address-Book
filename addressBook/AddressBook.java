package addressBook;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {



	public static void main(String[] args) {
		int choice=1,person_count=0;
	    ArrayList<Person> person = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
		while (choice!=0)
        {
            System.out.println("1.Add Person \n2.Update person \n3.Display ");
            System.out.println("Enter your choice:");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                	
                    System.out.println("Enter Number of persons:");
                    person_count=sc.nextInt();
                    Person p[]=new Person[person_count];
                    for(int i=0;i<person_count;i++)
                    {
                    	p[i]=new Person();
                    	
                    	Scanner s=new Scanner(System.in);
                    	System.out.println("Enter First name :");
                    	p[i].firstName=s.nextLine();
                    	System.out.println("Enter last name :");
                    	p[i].lastName=s.nextLine();
                    	System.out.println("Enter city :");
                    	p[i].city=s.nextLine();
                    	System.out.println("Enter state :");
                    	p[i].state=s.nextLine();
                    	System.out.println("Enter phone number :");
                    	p[i].phoneNum=s.nextLine();
                    	System.out.println("Enter zip :");
                    	p[i].zip=s.nextInt();
                    	person.add(p[i]);
                    	
                    }
                    break;
                case 2:
                	System.out.println("Enter person name to update:");
                	Scanner s1=new Scanner(System.in);
                	String name=s1.nextLine();
                	
                	for(Person s : person) {
                		if(s.firstName.equals(name)) {
                			System.out.println("Person found");
                			System.out.println("Enter what u want to update:");
                        	String update=s1.nextLine();
                			switch(update) {
                			case "city":
                				System.out.println("Enter city name to update:");
                				s.city=s1.nextLine();
                				break;
                			case "state":
                				System.out.println("Enter state to update:");
                				s.state=s1.nextLine();
                				break;
                			case "zip":
                				System.out.println("Enter zip to update:");
                				s.zip=s1.nextInt();
                				break;
                			case "phoneNum":
                				System.out.println("Enter phone num to update:");
                				s.phoneNum=s1.nextLine();
                				break;
                			}
                		 }
                			else {
                				System.out.println("person not found");
                			}
                	}
                	break;
                case 3:	
                		System.out.println(person);
                		break;
                default:
                		System.exit(0);
               }
		
		}
	}
}
