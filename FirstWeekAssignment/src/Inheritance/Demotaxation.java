package Inheritance;

public class Demotaxation {
	public static void main(String[] args) {
		Incometax incometax = new Incometax();
		Gst gst = new Gst();
		int tax = gst.Calculatetax(10000);
		System.out.println("Tax is "+tax);
	}

}
