package addressBook;

public class Person
{
    String firstName;
    String lastName;
    String city,state;
    int zip;
    String phoneNum;
    
   public Person() {

    }
    
    

       public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public int getZip() {
		return zip;
	}



	public void setZip(int zip) {
		this.zip = zip;
	}



	public String getPhoneNum() {
		return phoneNum;
	}



	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}



	public String toString() {
        return
                "\n firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\''+
                        ", city='" + city + '\'' +
                        ", state='" + state + '\'' +
                        ", zip=" + zip +
                        ", phone number='" + phoneNum + '\''
                ;
    }
    

}
