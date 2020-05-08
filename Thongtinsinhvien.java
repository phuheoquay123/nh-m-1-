package com.baithicuoiki.sinhvien;
import java.util.Scanner;
import nhapmaSV.nhapMaSv;
public class Thongtinsinhvien {
	public static void thongtinsinhvien() {
		String fullName="";
		int ngay, thang, nam, tuoi;
		String MSSV;
		int namhientai=2020; 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Moi nhap ho va ten sinh vien: ");
		fullName=scanner.nextLine();
		if (nhapMaSv.nhaphovaten(fullName)==false) {
			System.out.println("Ho va ten khong hop le, vui long kiem tra lai");
		}
		else {
			System.out.print("Moi nhap ngay sinh: ");
		        ngay=Integer.parseInt(scanner.nextLine());
		        System.out.print("Moi nhap thang sinh: ");
		        thang=Integer.parseInt(scanner.nextLine());
		        System.out.print("Moi nhap nam sinh: ");
		        nam=Integer.parseInt(scanner.nextLine());
		try {
			tuoi=namhientai-nam;
			if(tuoi>24) {
				System.out.println(fullName + " khong phai la sinh vien");
			}
			else if(tuoi<18) {
				System.out.println(fullName + " khong phai la sinh vien");
			}
			else {
				System.out.print("Moi nhap MSSV: NIIE");
				MSSV=scanner.nextLine();
				if (nhapMaSv.nhapmasv(MSSV)) {
					System.out.println("-------THONG TIN SINH VIEN-------");
					System.out.println("MSSV: NIIE" + MSSV);
					System.out.println("Ho va ten sinh vien: " + fullName);
					System.out.println("Sinh ngay " + ngay + " thang " + thang + " nam " + nam);
					Tinhdiemcuoiki.tinhdiemcuoiki();
				}
				else {
					System.out.println("Ma sinh vien khong hop le, vui long kiem tra lai");
				}
			}
			}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
}
