package Arrays;
import java.util.*;
public class PasswordGenerator {
	public static char[] geekPasssword(int len)
	{
		System.out.println("generating password using random..");
		System.out.println("Your new password is ..");
	String Capital_char="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String Small_char="abcdefghijklmnopqrstuvwxyz";
	String number="0123456789";
	String symbol="*!@#$%^&*()_+=/.?<>";
	String values=Capital_char+Small_char+number+symbol;
	Random rndm_method=new Random();
	char[] password=new char[len];
	for(int i=0;i<len;i++)
	{
		password[i]=values.charAt(rndm_method.nextInt(values.length()));
		
	}
	return password;
	}
	
	public static void main(String[] args) {
		int l=10;
		System.out.println(geekPasssword(l));

		
		
	}

}
