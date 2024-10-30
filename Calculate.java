package CalculatorProject;



public class Calculate {
	public Operation oper = new Operation();;
	public int calculate(int num1, char operator,int num2) {
		 switch (operator) {
         case '+':
             return oper.plus(num1, num2);
         case '-':
             return oper.subtract(num1, num2);
         case '*':
             return oper.multiply(num1, num2);
         case '/':
             return oper.divide(num1, num2);
         default:
             System.out.println("유효하지 않은 연산자입니다.");
             return 0;
     }
	}
}
