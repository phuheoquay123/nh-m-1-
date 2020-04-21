package codes;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("moi nhap so : ");
      int n = scanner.nextInt();
      if (KiemTraSoHoanHao(n)==true) {
    	  System.out.println("day la so hoan hao");
      }
      else {
    	  System.out.println("day khong phai la so hoan hao");
      }
	}
     public static boolean KiemTraSoHoanHao (int n) {
    	int tong=0;
    	for( int i=1;i<=(n/2);i++) {
    		if(n%i==0) tong+=i;{
    		}
    		if (tong==n) return true;
    		}
    	return false;
     }
}
    	
    	
    
    		
 
    	
    		
    
        
        
	


