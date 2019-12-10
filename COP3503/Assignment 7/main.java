/* Joseph Gabriel Ruiz N00916743 Assigment7 */

import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    int counter = 0;
    char userChar;
  
    while(counter <= 0) {
    System.out.println("How many characters would you like to convert?");
    Scanner inputCounter = new Scanner(System.in);
    counter = inputCounter.nextInt();
    }
    
    for(int i = 1; i <= counter; ) {

        System.out.printf("Enter character #%d to convert: \n",i);
        Scanner charInput = new Scanner(System.in);
        userChar = charInput.next().charAt(0);

        boolean check = leet_loop_convert(userChar);

        if (check == true) {
          i++;
        } 
    }
  }

  public static boolean leet_loop_convert(char c) {
    
    switch (c) {
        case 'A':
        case 'a':
          System.out.println("@");
            return true;
        case 'B':
        case 'b':
          System.out.println("I3");
            return true;
        case 'C':
        case 'c':
          System.out.println("<");
            return true;
        case 'D':
        case 'd':
          System.out.println("[)");
            return true;
        case 'E':
        case 'e':
          System.out.println("&");
            return true;
        case 'F':
        case 'f':
          System.out.println("]=");
            return true;
        case 'G':
        case 'g':
          System.out.println("6");
            return true;
        case 'H':
        case 'h':
          System.out.println("]-[");
            return true;
        case 'I':
        case 'i':
          System.out.println("1");
            return true;
        case 'J':
        case 'j':
          System.out.println("_/");
            return true;
        case 'K':
        case 'k':
          System.out.println("X");
            return true;
        case 'L':
        case 'l':
          System.out.println("7");
            return true;
        case 'M':
        case 'm':
          System.out.println("/\\/\\");
            return true;
        case 'N':
        case 'n':
          System.out.println("|\\|");
            return true;
        case 'O':
        case 'o':
          System.out.println("()");
            return true;
        case 'P':
        case 'p':
          System.out.println("|*");
            return true;
        case 'Q':
        case 'q':
          System.out.println("0");
            return true;
        case 'R':
        case 'r':
          System.out.println("I2");
            return true;
        case 'S':
        case 's':
          System.out.println("$");
            return true;
        case 'T':
        case 't':
          System.out.println("+");
            return true;
        case 'U':
        case 'u':
          System.out.println("(_)");
            return true;
        case 'V':
        case 'v':
          System.out.println("\\/");
            return true;
        case 'W':
        case 'w':
          System.out.println("vv");
            return true;
        case 'X':
        case 'x':
          System.out.println("><");
            return true;
        case 'Y':
        case 'y':
          System.out.println("j");
            return true;
        case 'Z':
        case 'z':
          System.out.println("2");
            return true;
        default:
          System.out.println("-");
          return false;
      }
  }
}
