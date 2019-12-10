import java.util.Scanner;

public class main{
    public static void main(String args[]) {
        int x = 1; // I got the idea for this while loop after collaborating with Diana Ly in your 1:30 class.
        while (x == 1) {
        int k;
        /* The logic for the program was derived from the following link:
         https://support.microsoft.com/en-us/help/214019/method-to-determine-whether-a-year-is-a-leap-year

        */
        System.out.println("What year do you want to test? (make sure it's between 1500 and 2019): ");
        Scanner userInput = new Scanner(System.in);
        k = userInput.nextInt();

        if (k >= 1500 && k <= 2019) {

            if (k % 4 == 0) {

                if (k % 100 == 0) {

                    if (k % 400 == 0) {
                        System.out.println("Yes, "+k+" is a leap year!");
                    }

                    else {
                        System.out.println("Nope, "+k+" is NOT a leap year!");
                    }

                }
                else if (k % 100 != 0) {
                    System.out.println("Yes, "+k+" is a leap year!");
                }
            }

            else {
                System.out.println("Nope, "+k+" is NOT a leap year!");
            }
        }
        else {
            System.out.println("This year cannot be checked. Try again!");
        }
        
        
    }
}
}