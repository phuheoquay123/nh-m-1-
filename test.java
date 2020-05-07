package codes;

import java.util.Scanner;

public class test  {

	public static void main(String[] args) {
	 // TODO Auto-generated method stub
		String fullName="";
		int ngay, thang, nam, age;
		long MSSV;
		int namhientai=2020; 
	    Scanner scanner = new Scanner(System.in);
		System.out.print("moi nhap ho va ten sinh vien: ");
		fullName=scanner.nextLine();
		System.out.print("moi nhap ngay sinh: ");
		ngay=Integer.parseInt(scanner.nextLine());
		System.out.print("moi nhap thang sinh: ");
		thang=Integer.parseInt(scanner.nextLine());
		System.out.print("moi nhap nam sinh: ");
		nam=Integer.parseInt(scanner.nextLine());
		try {
			 age= namhientai - nam;
			 if (age<18) {
					System.out.println( fullName + " khong phai la sinh vien ");
				}
				else if (age>24) {
					System.out.println( fullName + " khong phai la sinh vien " );
				}
			    else {
			    	System.out.println( fullName + " la sinh vien "); 
					System.out.print("moi nhap MSSV: ");
				    MSSV=Integer.parseInt(scanner.nextLine());
				    System.out.println("MSSV: " + MSSV);
				    System.out.println("ho va ten sinh vien: " + fullName);
					System.out.println("sinh ngay " + ngay + " thang " + thang + " nam " + nam);
			    }
		} 
		catch (Exception e) {
		        System.out.println(e);
		       }
	}
}
		
		
   

    		
    
        
        
	


