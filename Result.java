package CalculatorProject;



public class Result {
	ConvertInt convertInt = new ConvertInt();
	Calculate cal = new Calculate();
	public int result(String[] str) {
		int res = convertInt.toInt(str[0]);
		for (int i=0; i<str.length -2; i+=2) {
			res = cal.calculate(res, str[i+1].charAt(0),convertInt.toInt(str[i+2]));
		}
		return res;
	}
}
