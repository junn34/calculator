package CalculatorProject;

public class Operation {
	public int plus(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("0으로 나눌 수 없음");
            return 0;
        }
        return a / b;
    } 
}
