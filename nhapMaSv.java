package nhapmaSV;
public class nhapMaSv {
	public static boolean nhapmasv(String MSSV){
		String pattern="[0-9]{10}[A-Z]{1}";
		if (MSSV.matches(pattern)) {
			return true;
	    }
	    else {
	        return false;
	    }
	}
	public static boolean nhaphovaten(String fullName) {
		String pattern="[a-z A-Z]+";
		if (fullName.matches(pattern)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean nhapngaysinh(String ngay) {
		String pattern="[0-9]{1,2}";
		if (ngay.matches(pattern)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean nhapthangsinh(String thang) {
		String pattern="[0-9]{1}";
		if (thang.matches(pattern)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean nhapnamsinh(String nam) {
		String pattern="[0-9]{4}";
		if (nam.matches(pattern)) {
			return true;
		}
		else {
			return false;
		}
	}
}

   






