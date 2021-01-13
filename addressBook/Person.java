
package addressBook;

public class Person
{
    String firstName;
    String lastName;
    String city,state;
    int zip;
    int phoneNum;
    
    public Person(String firstName,String lastName,String city,String state,int zip,int phoneNum) {
    	this.firstName=firstName;
    	this.lastName=lastName;
    	this.city=city;
    	this.state=state;
    	this.zip=zip;
    	this.phoneNum=phoneNum;
    }

       public String toString() {
        return
                "\n firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\''+
                        ", city='" + city + '\'' +
                        ", state='" + state + '\'' +
                        ", zip=" + zip +
                        ", phNo='" + phoneNum + '\''
                ;
    }
    

}
