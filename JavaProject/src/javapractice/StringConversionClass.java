package javapractice;

import java.text.DecimalFormat;

public class StringConversionClass {

	public static void main(String[] args) {


		String value = "63.40";
		float f=Float.parseFloat(value);
		
		float cvalue = (float) (f-(f*0.0825));
		
		String formattedString = String.format("%.02f", cvalue);
		System.out.println(formattedString);
		
		
		DecimalFormat df = new DecimalFormat("0.00");
		df.setMaximumFractionDigits(2);
		f = Float.parseFloat(df.format(cvalue));
		String s=Float. toString(f);
		System.out.println(s);

	}

}
