package com.baithicuoiki.sinhvien;
import java.util.Scanner;
public class Tinhdiemcuoiki {
	public static void tinhdiemcuoiki() {
		double B1=0, B2=0, C1=0, C2=0, D1=0, D2=0, E1=0, E2=0, F1=0, F2=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("-------NHAP DIEM-------");
		try {
		System.out.println("Mon B:");
		System.out.print("- Diem B1: ");
		B1=scanner.nextDouble();
		System.out.print("- Diem B2: ");
		B2=scanner.nextDouble();
		try {
		    System.out.println("Mon C:");
		    System.out.print("- Diem C1: ");
		    C1=scanner.nextDouble();
		    System.out.print("- Diem C2: ");
		    C2=scanner.nextDouble();
		    try {
		    	System.out.println("Mon D:");
		        System.out.print("- Diem D1: ");
		        D1=scanner.nextDouble();
		        System.out.print("- Diem D2: ");
		        D2=scanner.nextDouble();
		        try {
		            System.out.println("Mon E:");
		            System.out.print("- Diem E1: ");
		            E1=scanner.nextDouble();
		            System.out.print("- Diem E2: ");
		            E2=scanner.nextDouble();
		            try {
		            	System.out.println("Mon F:");
		                System.out.print("- Diem F1: ");
		                F1=scanner.nextDouble();
                        System.out.print("- Diem F2: ");
		                F2=scanner.nextDouble();
		                try {
		                	System.out.println("-------KET QUA TUNG MON------- ");
		            		
		            		double DiemMonB = ((B1*0.3)+(B2*0.7));
		            		if (DiemMonB<=5){
		            			System.out.println("+Diem Mon B= " + (double)Math.round(DiemMonB*10)/10);
		            			System.out.println("-> Mon B: ROT");
		            		}
		            		else {
		            			System.out.println("+Diem Mon B= " + (double)Math.round(DiemMonB*10)/10);
		            			System.out.println("->Mon B: DAU");
		            		}
		            		
		            		double DiemMonC = ((C1*0.3)+(C2*0.7));
		            		Math.round((DiemMonC * 10) / 10);
		                    if (DiemMonC<=5){
		                    	System.out.println("+Diem Mon C= " + (double)Math.round(DiemMonC*10)/10);
		            			System.out.println("-> Mon C: ROT");
		            		}
		            		else {
		            			System.out.println("+Diem Mon C= " + (double)Math.round(DiemMonC*10)/10);
		            			System.out.println("-> Mon C: DAU");
		            		}
		            		
		            		double DiemMonD = ((D1*0.3)+(D2*0.7));
		            		if (DiemMonD<=5){
		            			System.out.println("+Diem Mon D= " + (double)Math.round(DiemMonD*10)/10);
		            			System.out.println("-> Mon D: ROT");
		            		}
		            		else {
		            			System.out.println("+Diem Mon D= " + (double)Math.round(DiemMonD*10)/10);
		            			System.out.println("-> Mon D: DAU");
		            		}
		            		
		            		double DiemMonE = ((E1*0.3)+(E2*0.7));
		            		if (DiemMonE<=5){
		            			System.out.println("+Diem Mon E= " + (double)Math.round(DiemMonE*10)/10);
		            			System.out.println("-> Mon E: ROT");
		            		}
		            		else {
		            			System.out.println("+Diem Mon E= " + (double)Math.round(DiemMonE*10)/10);
		            			System.out.println("-> Mon E: DAU");
		            		}
		            		double DiemMonF = ((F1*0.3)+(F2*0.7));
		            		if (DiemMonF<=5){
		            			System.out.println("+Diem Mon F= " + (double)Math.round(DiemMonF*10)/10);
		            			System.out.println("-> Mon F: ROT");
		            		}
		            		else {
		            			System.out.println("+Diem Mon F= " + (double)Math.round(DiemMonF*10)/10);
		            			System.out.println("-> Mon F: DAU");
		            	    }
		            		
		            		double DiemCuoiKi= (((DiemMonB*2)+(DiemMonC*2)+(DiemMonD*2)+(DiemMonE*2)+(DiemMonF*2))/10);
		            		System.out.println("-------KET QUA CUOI KI-------");
		            		if(DiemCuoiKi>=9) {
		            			System.out.println("+Diem Cuoi Ki= " + (double)Math.round(DiemCuoiKi*10)/10);
		            			System.out.println("-> Xep loai: gioi");
		            		}
		            		else if((DiemCuoiKi>=7) && (DiemCuoiKi<9)) {
		            			System.out.println("+Diem Cuoi Ki= " + (double)Math.round(DiemCuoiKi*10)/10);
		            			System.out.println("-> Xep loai: kha");
		            		}
		            		else if((DiemCuoiKi>=5)&&(DiemCuoiKi<7)) {
		            			System.out.println("+Diem Cuoi Ki= " + (double)Math.round(DiemCuoiKi*10)/10);
		            			System.out.println("-> Xep loai: trung binh");
		            		}
		            		else {
		            			System.out.println("+Diem Cuoi Ki= " + (double)Math.round(DiemCuoiKi*10)/10);
		            			System.out.println("-> Xep loai: yeu");
		            		}
		                }
		                catch (Exception e) {
		                	System.out.println(e);
		                }
		            }
		            catch (Exception e) {
		            	    System.out.println("vui long nhap so!" + "(loi:" + e + ")");
		            }
		        }
		        catch (Exception e) {
		        	System.out.println("vui long nhap so!" + "(loi:" + e + ")");
		        }
		    }
		    catch (Exception e) {
		    	    System.out.println("vui long nhap so!" + "(loi:" + e + ")");
		    }
		}
		catch (Exception e) {
			System.out.println("vui long nhap so!" + "(loi:" + e + ")");
		}
		}
		catch (Exception e) {
			System.out.println("vui long nhap so!" + "(loi:" + e + ")");
		}
	}
}
