package Inheritance;

public class Gst extends Incometax {
	String aadharcard;
	int Calculatetax(int income) {
		int tax=super.Calculatetax(income);
		if(income>10000) {
			tax=income/5;
		}
		return tax;
	}

}
