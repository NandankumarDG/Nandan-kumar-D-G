package problems;

import java.util.Scanner;

public class Problem1 {
	
 public double calculate(double a, double b, String operation) {
     switch (operation.toLowerCase()) {
         case "add":
             return a + b;
         case "subtract":
             return a - b;
         case "multiply":
             return a * b;
         case "divide":
             if (b == 0) {
                 System.out.println("Division by zero gives Error");
                 return 0;
             }
             return a / b;
         default:
             System.out.println("Invalid operation");
             return 0;
     }
 }

 public static void main(String[] args) {
     Problem1 calculator = new Problem1();
     
     Scanner scan = new Scanner(System.in);

     double a = scan.nextDouble();
     double b = scan.nextDouble();

     System.out.println("Addition: " + calculator.calculate(a, b, "add"));
     System.out.println("Subtraction: " + calculator.calculate(a, b, "subtract"));
     System.out.println("Multiplication: " + calculator.calculate(a, b, "multiply"));
     System.out.println("Division: " + calculator.calculate(a, b, "divide"));
 }
}
