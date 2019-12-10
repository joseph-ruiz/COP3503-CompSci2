import java.util.Scanner;
// Todo: compare cases either lower case or upper case use .toLowerCase()
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String inputString = input.nextLine();
    checkPalidrome(inputString);
  }

  public static void checkPalidrome (String inputString2) {
    String lowerCaseinputString2;
    lowerCaseinputString2 = inputString2.toLowerCase();
    char[] palidromeArray = lowerCaseinputString2.toCharArray();
    char[] palidromeArray2 = lowerCaseinputString2.toCharArray();

    boolean checkPalidrome = false;
    
    for (int i = 0; i <= palidromeArray.length - 1; i++) {
      for (int j = palidromeArray2.length - 1; j >= 0; j--) {
         if (palidromeArray[i] == palidromeArray2[j]) {
          checkPalidrome = true;
        }// end if
        else {
          checkPalidrome = false;
        } //end else
      } // end for loop 
    }//end for loop */

     String falseInput = "";
        
      for(int i = inputString2.length() - 1; i >= 0; i--)
      {
        falseInput = falseInput + inputString2.charAt(i);
      }


    if (checkPalidrome == true) {
      System.out.printf("Yes\n");
    }
    else {
      System.out.printf("No: %s", falseInput);
    }

  }// close checkPalidrome
  
}
