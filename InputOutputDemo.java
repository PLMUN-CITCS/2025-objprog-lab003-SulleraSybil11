import java.util.Scanner;  //Importing a scanner class

public class InputOutputDemo {
    public static void main(String[] args) {  //Defining the main method 


Scanner input = new Scanner(System.in);
System.out.print("Enter an integer: ");

int userInt = input.nextInt();  //Declaring int variable

System.out.print("Enter a decimal number: ");  //Print the variable

double userDouble = input.nextDouble();
input.nextLine(); // Consume newline

System.out.print("Enter a word or sentence: ");

String userString = input.nextLine();

System.out.printf("Your integer: %d%n", userInt);  
System.out.printf("Your decimal number: %.2f%n", userDouble);
System.out.printf("Your string: %s%n", userString);

input.close();

    }
}