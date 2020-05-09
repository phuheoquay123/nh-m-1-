package com.baithicuoiki.sinhvien;
import java.util.Scanner;
import nhapmaSV.nhapMaSv;
public class Thongtinsinhvien {
	public static void thongtinsinhvien() {
		String fullName;
		String ngay, thang, nam;
		String MSSV;
		int namhientai=2020,tuoi; 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Moi nhap ho va ten sinh vien: ");
		fullName=scanner.nextLine();
		if (nhapMaSv.nhaphovaten(fullName)==false) {
			System.out.println("Ho va ten khong hop le, vui long kiem tra lai");
		}
		else {
			System.out.print("Moi nhap ngay sinh: ");
            ngay=scanner.nextLine();
			if(nhapMaSv.nhapngaysinh(ngay)==false) {
				System.out.println("ngay sinh khong hop le, vui long kiem tra lai");
			}
			else { 
				System.out.print("Moi nhap thang sinh: ");
				thang=scanner.nextLine();
				if(nhapMaSv.nhapthangsinh(thang)==false) {
					System.out.println("thang sinh khong hop le, vui long kiem tra lai");
				}
				else { 
					System.out.print("Moi nhap nam sinh: ");
					nam=scanner.nextLine();
					if(nhapMaSv.nhapnamsinh(nam)==false) {
						System.out.println("nam sinh khong hop le,vui long kiem tra lai");
					}
					else {
						tuoi=namhientai-Integer.parseInt(nam);
						if(tuoi>24 || tuoi<18) {
							System.out.println(fullName + " khong phai la sinh vien, vui long kiem tra lai");
					    }
		                else {
		        	        System.out.print("Moi nhap MSSV: NIIE");
		        	        MSSV=scanner.nextLine();
				            if (nhapMaSv.nhapmasv(MSSV)) {
		                    System.out.println("-------THONG TIN SINH VIEN-------");
		                    System.out.println("Ho va ten sinh vien: " + fullName);
	  			            System.out.println("Sinh ngay " + ngay + " thang " + thang + " nam " + nam);
		                    System.out.println("MSSV: NIIE" + MSSV);
		                    Tinhdiemcuoiki.tinhdiemcuoiki();
		                    }
				            else {
				            	System.out.println("Ma sai dinh dang, vui long kiem tra lai");
				            }
				            }
				        }
					}
				}
			}
		}
	}
