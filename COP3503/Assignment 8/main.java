import java.util.Scanner;

class main {
  public static void main(String[] args) {
    int month;
    int day;
    int year;
    char firstSlash;
    char secondSlash;
    int checkDay;
    int checkYear;
    int checkLeapYear;
    int number;
    
    Scanner in = new Scanner(System.in);
    month = in.nextInt();
    firstSlash = in.next().charAt(0);
    day = in.nextInt();
    secondSlash = in.next().charAt(0);
    year = in.nextInt();

    checkYear = verifyLeapYear(year);
    checkDay = checkMonthAndDay(month, checkYear);

    while(month < 1 || month > 12 || day < 1 || day > 31 || firstSlash != '/' || secondSlash != '/' || year < 1500 || year > 3000 || day > checkDay) {
      System.out.println("Invalid");
      month = in.nextInt();
      firstSlash = in.next().charAt(0);
      day = in.nextInt();
      secondSlash = in.next().charAt(0);
      year = in.nextInt();
      
    }
    number = dataCrunching(month, day, year);
    System.out.printf("%d\n", number);
}
  public static int verifyLeapYear (int userYear) {
    int returning;
    if (userYear >= 1500 && userYear <= 3000) {
            if (userYear % 4 == 0) {
              returning = 1;
                if (userYear % 100 == 0) {
                  returning = 1;
                    if (userYear % 400 == 0) {
                        returning = 1;
                    }
                    else {
                        returning = 0;
                    }
                }
                else if (userYear % 100 != 0) {
                    returning = 1;
                }
            }
            else {
                returning = 0;
            }
        }
        else {
            returning = 0;
    } // End leap year validation
    return returning;
}

  public static int checkMonthAndDay(int userMonth, int userYear) {
    if(userYear == 0) {  

      switch(userMonth) {
        case 1:
          return 31;
        case 2:
          return 28;
        case 3:
          return 31;
        case 4:
          return 30;
        case 5:
          return 31;
        case 6:
          return 30;
        case 7:
          return 31;
        case 8:
          return 31;
        case 9:
          return 30;
        case 10:
          return 31;
        case 11:
          return 30;
        default:
          return 31;
      }//end of switch case
    }
    else {
      switch(userMonth) { 
        case 1:
          return 31;
        case 2:
          return 29;
        case 3:
          return 31;
        case 4:
          return 30;
        case 5:
          return 31;
        case 6:
          return 30;
        case 7:
          return 31;
        case 8:
          return 31;
        case 9:
          return 30;
        case 10:
          return 31;
        case 11:
          return 30;
        default:
          return 31;
      }
    }
  }

  public static int dataCrunching(int userMonth, int userDay, int userYear) {

      // First iteration
      int monthTensPlace = userMonth / 10;
      int monthOnesPlace= userMonth % 10;
      int dayTensPlace= userDay % 10;
      int dayOnesPlace = userDay / 10;
      int yearThouPlace = userYear / 1000;
      int yearHundPlace = (userYear % 1000) / 100;
      int yearTensPlace = (userYear % 100) / 10;
      int yearOnesPlace = userYear % 10;
  
      int month1 = monthOnesPlace + monthTensPlace;
      int day1 = dayOnesPlace + dayTensPlace;
      int year1 = yearThouPlace + yearHundPlace + yearTensPlace + yearOnesPlace;

      // Second iteration
      int secondAdding = month1 + day1 + year1;
      
      //Third crunch
      int tensPlace = (secondAdding % 100) / 10; 
      int onesPlace = secondAdding % 10;
      int finalNumber = tensPlace + onesPlace;

      return finalNumber;
  }
}