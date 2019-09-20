package newman_p1;

import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter 4 Digit Integer To Encrypt:");
		int digits = scnr.nextInt();
		int d1, d2, d3, d4;
		int nd1, nd2, nd3, nd4;
		d1 = (digits - (digits % 1000))/1000;
		d2 = ((digits % 1000) - ((digits % 1000) % 100))/100;
		d3 = ((digits % 100) - (digits % 10))/10;
		d4 = digits % 10;
		nd1 = ((d3 + 7) % 10);
		nd2 = ((d4 + 7) % 10);
		nd3 = ((d1 + 7) % 10);
		nd4 = ((d2 + 7) % 10);
		System.out.println("Encrypted 4 Digit Integer:\n" + nd1 + nd2 + nd3 + nd4);		
		scnr.close();
	}

}
