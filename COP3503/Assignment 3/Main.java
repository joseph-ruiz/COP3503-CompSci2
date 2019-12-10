/* Joseph Gabriel Ruiz N00916743 Assigment3 */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter character to Convert");

      char a = input.next().charAt(0);

      switch (a) {
        case 'A':
        case 'a':
          System.out.println("@");
          break;
        case 'B':
        case 'b':
          System.out.println("I3");
          break;
        case 'C':
        case 'c':
          System.out.println("<");
          break;
        case 'D':
        case 'd':
          System.out.println("[)");
          break;
        case 'E':
        case 'e':
          System.out.println("&");
          break;
        case 'F':
        case 'f':
          System.out.println("]=");
          break;
        case 'G':
        case 'g':
          System.out.println("6");
          break;
        case 'H':
        case 'h':
          System.out.println("]-[");
          break;
        case 'I':
        case 'i':
          System.out.println("1");
          break;
        case 'J':
        case 'j':
          System.out.println("_/");
          break;
        case 'K':
        case 'k':
          System.out.println("X");
          break;
        case 'L':
        case 'l':
          System.out.println("7");
          break;
        case 'M':
        case 'm':
          System.out.println("/\\/\\");
          break;
        case 'N':
        case 'n':
          System.out.println("|\\|");
          break;
        case 'O':
        case 'o':
          System.out.println("()");
          break;
        case 'P':
        case 'p':
          System.out.println("|*");
          break;
        case 'Q':
        case 'q':
          System.out.println("0");
          break;
        case 'R':
        case 'r':
          System.out.println("I2");
          break;
        case 'S':
        case 's':
          System.out.println("$");
          break;
        case 'T':
        case 't':
          System.out.println("+");
          break;
        case 'U':
        case 'u':
          System.out.println("(_)");
          break;
        case 'V':
        case 'v':
          System.out.println("\\/");
          break;
        case 'W':
        case 'w':
          System.out.println("vv");
          break;
        case 'X':
        case 'x':
          System.out.println("><");
          break;
        case 'Y':
        case 'y':
          System.out.println("j");
          break;
        case 'Z':
        case 'z':
          System.out.println("2");
          break;
        default:
          System.out.println("-");
      }

  }

}
