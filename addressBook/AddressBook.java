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
            System.out.println("1.Add Person \n 2.Display \n ");
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
                    	System.out.println("Enter zip :");
                    	p[i].zip=s.nextInt();
                    	System.out.println("Enter phone number :");
                    	p[i].phoneNum=s.nextLine();
                    	person.add(p[i]);
                    	
                    }
                    break;
                  
                case 2:
                	for(int i=0;i<person_count;i++)
                	{	
                		System.out.println(person);
                		break;
                	}
                default:
                	System.exit(0);
               }
		
		}
	}
}
