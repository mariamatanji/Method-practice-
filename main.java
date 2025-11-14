import java.util.Scanner;

public class Calculation {

  public static void printCalculation(double num1, double num2){
   
   double myDouble = num1 - num2;
   System.out.println("Outcome: "+ myDouble);
   
   }


   public static void main(String[] args) {
     Scanner scnr = new Scanner(System.in);
     double a1;
     double b1;

     a1 = scnr.nextDouble();
     b1 = scnr.nextDouble();

     printCalculation(a1, b1);
	}
}
