package retangle;

import java.util.Scanner;
import java.lang.Math;

public class htg extends hinhhoc {
	private double a;
	private double b;
	private double c;
	private double p;
	
	
	public void getInfor() {
		Scanner inputScanner = new Scanner(System.in);
 	    System.out.println("Nhap a...");
 		a = inputScanner.nextInt();
 		Scanner inputScanner1 = new Scanner(System.in);
 	    System.out.println("Nhap b...");
 		b = inputScanner1.nextInt();
 		Scanner inputScanner2 = new Scanner(System.in);
 	    System.out.println("Nhap c...");
 		c = inputScanner1.nextInt();
	}
	 public void tinhCV() {
    	 System.out.println("Chu vi:"+(a+b+c));
	}
      public void tinhDientich() {
    	p = (a+b+c)/2;  
		System.out.println("Dien tich:"+(Math.sqrt(p*(p-a)*(p-b)*(p-c))));
	}

}
