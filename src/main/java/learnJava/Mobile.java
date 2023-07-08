package learnJava;

public class Mobile {

	short price= 5000;
	int imei = 1568749698;
	long mobileNumber = 9876543210l;
	float percentage = 99.9F;
	double version = 34.67890888;
	char symbol = 'A';
	boolean ischarging = true;
	String name = "Testleaf";
	
public static void main(String[] args) {
	String Originalstr = "Kishona";
	String Reversedstr = "";
	
	System.out.println("Original String is " + Originalstr);
	
	       for (int i=0; i<Originalstr.length(); i++) {
	    	   Reversedstr = Originalstr.charAt(i)+Reversedstr;
	       }
	       System.out.println("Reversed String is " + Reversedstr);
}
}
