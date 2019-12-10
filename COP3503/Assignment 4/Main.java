import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      int userInput;
      Scanner input  = new Scanner(System.in);
      System.out.println("Please enter a number between 0 and 2097151 to convert:");
      userInput = input.nextInt();
      
        while (userInput >= 0 && userInput <= 2097151) {
            int digit7;
            int digit6;
            int digit5;
            int digit4;
            int digit3;
            int digit2;
            int digit1;
            int octalTotal;
            
            digit7 = (userInput % 8) * 1;
            digit6 = ((userInput / 8) % 8) * 10;
            digit5 = ((userInput / 64) % 8) * 100;
            digit4 = ((userInput / 512) % 8) * 1000;
            digit3 = ((userInput / 4096) % 8) * 10000;
            digit2 = ((userInput / 32768) % 8) * 100000;
            digit1 = ((userInput / 262144) % 8) * 1000000;
            octalTotal = digit1 + digit2 + digit3 + digit4 + digit5 + digit6 + digit7;
            System.out.printf("Your integer number %d is %07d in octal.\n", userInput, octalTotal);

            System.out.println("Please enter a number between 0 and 2097151 to convert: ");
            userInput = input.nextInt();
          }
        System.out.println("UNABLE TO CONVERT");
        input.close();
      }
}