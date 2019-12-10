import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        int k;
        int l;

        System.out.println("How many years would you like to test?");
        Scanner inputTimes = new Scanner(System.in);
        l = inputTimes.nextInt();

        while (l > 0) {
            System.out.println("What year do you want to test? (make sure it's between 1500 and 2019): ");
            Scanner inputYear = new Scanner(System.in);
            k = inputYear.nextInt();
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
            l--;
        
        }
    }
}
