import java.util.Scanner;

public class main {
  public static void main(String[] args) {

      // TODO: Make sure conversion function is optimal
      int mainInput;
      Scanner input  = new Scanner(System.in);
      System.out.println("Enter up to an 8-digit octal number and I will convert it for you: ");
      mainInput = input.nextInt();

      while (mainInput < 0 || mainInput > 99999999) {
        System.out.println("Enter up to an 8-digit octal number and I will convert it for you: ");
        mainInput = input.nextInt();
      }

      conversion(mainInput);
    }
  public static void conversion (int userInput) {

            int digit8;
            int digit7;
            int digit6;
            int digit5;
            int digit4;
            int digit3;
            int digit2;
            int digit1;
            int octalTotal;
            
            //LOGIC: It is correct, do not change.
            digit8 = (userInput % 10);
            digit7 = (((userInput / 10) % 10) * 8);
            digit6 = (((userInput / 100) % 10) * 64);
            digit5 = (((userInput / 1000) % 10) * 512);
            digit4 = (((userInput / 10000) % 10) * 4096);
            digit3 = (((userInput / 100000) % 10) * 32768);
            digit2 = (((userInput / 1000000) % 10)* 262144);
            digit1 = (((userInput / 10000000) % 10)* 2097152);
            octalTotal = digit1 + digit2 + digit3 + digit4 + digit5 + digit6 + digit7 + digit8;
            System.out.printf("%d\n", octalTotal);
    }
}
