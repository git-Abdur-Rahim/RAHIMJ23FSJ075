package second_Lab_book_Java_programs;

public class Casting_Exercise {

	public static void main(String[] args) {
		//Dont run this program - Just type and understanding how casting works
		
		byte b=10;
		int i=b;// will accept - automatic type promotion
		//byte c=i;// will not accept - because lower type cannot be put in higher
		byte d=(byte)i;// Type casting makes it possible to store compatible types.
		byte x=10;
		byte y=20;
		//byte sum=x*y; // Error is thrown because when two bytes are used in a arthmetic operation, the result will be integer
		System.out.println("sum = "+x);
		

	}

}
