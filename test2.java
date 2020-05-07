package codes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class test2 extends test {
	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		double B1, B2, C1, C2, D1, D2, E1, E2, F1, F2;
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("#.#");
		System.out.println("mon B:");
		System.out.print("diem B1: ");
		B1=scanner.nextDouble();
		System.out.print("diem B2: ");
		B2=scanner.nextDouble();
		
		System.out.println("mon C:");
		System.out.print("diem C1: ");
		C1=scanner.nextDouble();
		System.out.print("diem C2: ");
		C2=scanner.nextDouble();
		
		System.out.println("mon D:");
		System.out.print("diem D1: ");
		D1=scanner.nextDouble();
		System.out.print("diem D2: ");
		D2=scanner.nextDouble();
		
		System.out.println("mon E:");
		System.out.print("diem E1: ");
		E1=scanner.nextDouble();
		System.out.print("diem E2: ");
		E2=scanner.nextDouble();
		
		System.out.println("mon F:");
		System.out.print("diem F1: ");
		F1=scanner.nextDouble();
		System.out.print("diem F2: ");
		F2=scanner.nextDouble();
		
		System.out.println("KET QUA TUNG MON: ");
		
		double DiemMonB = ((B1*0.3)+(B2*0.7));
		decimalFormat.format(DiemMonB);
		if (DiemMonB<=5){
			System.out.println("DiemMonB= " + DiemMonB);
			System.out.println("mon B: ROT");
		}
		else {
			System.out.println("DiemMonB= " + DiemMonB);
			System.out.println("Mon B: DAU");
		}
		
		double DiemMonC = ((C1*0.3)+(C2*0.7));
		decimalFormat.format(DiemMonC);
		if (DiemMonC<=5){
			System.out.println("DiemMonC= " + DiemMonC);
			System.out.println("mon C: ROT");
		}
		else {
			System.out.println("DiemMonC= " + DiemMonC);
			System.out.println("Mon C: DAU");
		}
		
		double DiemMonD = ((D1*0.3)+(D2*0.7));
		decimalFormat.format(DiemMonD);
		if (DiemMonD<=5){
			System.out.println("DiemMonD= " + DiemMonD);
			System.out.println("mon D: ROT");
		}
		else {
			System.out.println("DiemMonD= " + DiemMonD);
			System.out.println("Mon D: DAU");
		}
		
		double DiemMonE = ((E1*0.3)+(E2*0.7));
		decimalFormat.format(DiemMonE);
		if (DiemMonE<=5){
			System.out.println("DiemMonE= " + DiemMonE);
			System.out.println("mon E: ROT");
		}
		else {
			System.out.println("DiemMonE= " + DiemMonE);
			System.out.println("Mon E: DAU");
		}
		double DiemMonF = ((F1*0.3)+(F2*0.7));
		decimalFormat.format(DiemMonF);
		if (DiemMonF<=5){
			System.out.println("DiemMonF= " + DiemMonF);
			System.out.println("mon F: ROT");
		}
		else {
			System.out.println("DiemMonF= " + DiemMonF);
			System.out.println("Mon F: DAU");
	    }
		
		double DiemCuoiKi= (((DiemMonB*2)+(DiemMonC*2)+(DiemMonD*2)+(DiemMonE*2)+(DiemMonF*2))/10);
		decimalFormat.format(DiemCuoiKi);
		System.out.println("KET QUA CUOI KI:");
		if(DiemCuoiKi>=9) {
			System.out.println("DiemCuoiKi= " + DiemCuoiKi);
			System.out.println("Xep loai: gioi");
		}
		else if((DiemCuoiKi>=7) && (DiemCuoiKi<9)) {
			System.out.println("DiemCuoiKi= " + DiemCuoiKi);
			System.out.println("Xep loai: kha");
		}
		else if((DiemCuoiKi>=5)&&(DiemCuoiKi<7)) {
			System.out.println("DiemCuoiKi= " + DiemCuoiKi);
			System.out.println("Xep loai: trung binh");
		}
		else {
			System.out.println("DiemCuoiKi= " + DiemCuoiKi);
			System.out.println("Xep loai: yeu");
		}
		
}
}


