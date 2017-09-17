
import java.util.Scanner;

public class Calculator 

{

public static void main(String[] args) 

{

	Scanner input = new Scanner(System.in);

int number1;

int number2;



System.out.print("Enter first integer:");
number1=input.nextInt();

System.out.print("Enter second integer:");
number2=input.nextInt();

int sum = number1 + number2;
int difference = number1 - number2;
int product = number1 * number2;
int quotient = number1 / number2;

System.out.printf("The sum is %d\n", sum);

System.out.printf("The difference is %d\n", difference);

System.out.printf("The product is %d\n", product);

System.out.printf("The quotient is %d\n", quotient);


	}

}
