import java.util.*;
import java.util.Random;
class Employee{						//Sub Class
		String FirstName;
		String LastName;
		
		public void EmpInfo(){   //Printing Employee Information
			System.out.print(FirstName);
			System.out.println(LastName);
		} Employee(String FirstName,String LastName){
			this.FirstName = FirstName;
			this.LastName = LastName;
		}
} 
public class ITSupportAdmin {						//Main Class
	public static void main(String args[]) {
		System.out.println("Please Enter Your Full Name");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		String lastName = sc.nextLine();
		while(!firstName.matches("[a-zA-Z ,]+")||(!lastName.matches("[a-zA-Z ,]+"))) { //Checking Name(To prevent integer type input)
			System.out.println("Please Retype your Name ");
			firstName = sc.nextLine();
			lastName = sc.nextLine();
		} while(firstName.length()<0 && firstName.length()>8 || lastName.length()<0 && lastName.length()>8){  //Checking Name Length
			System.out.println("Please Retype your Name ");
			firstName = sc.nextLine();
			lastName = sc.nextLine();
		} 
		Employee e = new Employee(firstName, lastName);
		e.EmpInfo();
		System.out.println("Please Choose Your Department\n1. Technical\n2. Admin\n3. Human Resource\n4. Legal");
		int department = sc.nextInt();
		while(department<1 || department>4) {    //for Choosing only Valid Option 
		System.out.println("Please Choose Your Department from Below Mentioned List only \n1. Technical\n2. Admin\n3. Human Resource\n4. Legal");
		department = sc.nextInt();
		} System.out.println("Dear "+firstName+" "+lastName+" your generated credentials are as follows");
		if(department==1) {
		System.out.println("Email ---> "+firstName+lastName+"@Technical.GreatLearing.com");
		} else if (department==2) {
		System.out.println("Email ---> "+firstName+lastName+"@Admin.GreatLearing.com");
		} else if (department==3) {
		System.out.println("Email ---> "+firstName+lastName+"@Human_Resource.GreatLearing.com");
		} else if (department==4) {
		System.out.println("Email ---> "+firstName+lastName+"@Legal.GreatLearing.com");
		} 
		String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String  lowercase = "abcdefghijklmnopqrstuvwxyz";
		String num = "0123456789";
		String specialchars = "!@#$%^&()_-+=[]\',./-+{}|:<>?";
		String combination = uppercase+lowercase+specialchars+num;
		int len = 10;
		char[] password = new char[len];
		Random r = new Random();
		for(int s=0;s<len;s++) {
			password[s]= combination.charAt(r.nextInt(combination.length()));
		}
		System.out.println("Password ---> "+new String(password));
	}
}