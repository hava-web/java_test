package retangle;

import java.util.Scanner;

public class hcn {
    private double cd;
    private double cr;
     
    
      public void getInfor() {
    	   Scanner inputScanner = new Scanner(System.in);
    	    System.out.println("Nhap chieu dai...");
    		cd = inputScanner.nextInt();
    		Scanner inputScanner1 = new Scanner(System.in);
    	    System.out.println("Nhap chieu rong...");
    		cr = inputScanner1.nextInt();
	}
      public void tinhCV() {
    	 System.out.println("Chu vi:"+(cd + cr)*2);
	}
      public void tinhDientich() {
		System.out.println("Dien tich:"+(cr*cd));
	}
     
}
