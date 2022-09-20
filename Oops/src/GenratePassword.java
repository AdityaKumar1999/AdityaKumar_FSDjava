import java.util.Random;
public class GenratePassword {
	public static void main(String args[]) {
	String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String  lowercase = "abcdefghijklmnopqrstuvwxyz";
	String num = "0123456789";
	String specialchars = "!@#$%^&*()_-+=[]\',./*-+{}|:<>?";
	String combination = uppercase+lowercase+specialchars+num;
	int len = 10;
	char[] password = new char[len];
	Random r = new Random(); 
	for(int i=0;i<len;i++) {
		password[i]= combination.charAt(r.nextInt(combination.length()));
	}
	System.out.println("Your Password is:"+new String(password));
	}
	}
