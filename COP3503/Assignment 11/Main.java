//Joseph Gabriel Ruiz
//N00916743
import java.util.Random;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    Arena a = new Arena();
    a.randomNumber(12000);

  }
}
class Arena {
  public void randomNumber(int number) {
  Random rand = new Random();
  int[] array = new int[number];
  for (int i = 0; i < array.length; i++) {
    array[i] = rand.nextInt(365);
    while (array[i] == 0) {
      array[i] = rand.nextInt(365);
      }//close while
      System.out.println(array[i]);
    }// close for loop


  int[] days = new int[365];
  for(int i = 0; i < days.length; i++) {
    for (int j = 0; j < array.length; j++) {
      if(array[j] == i) {
        days[i]++;
      }
    }
  }
  
  max(days);
  min(days);


  }//close randomNumber method

  public void max(int [] days) {
    int max = days[0];
    

    for (int i = 1; i <days.length; i++) {
      if(days[i] > max) {
        max = days[i];
      }
    }
    System.out.println("The following days have " + max + " people: ");
    for(int i = 1; i < days.length; i++) {
		    	if(days[i] == max) {
		    		System.out.printf(" %d ",i);
		    	}
		    }
    }
   //close max method

  public void min(int [] days) {
    int min = days[1];

    for (int i = 1; i < days.length; i++) {
      if (days[i] < min) {
        min = days[i];
      }
    }
    System.out.println("\nThe following days have " + min + " people: ");

    for (int i = 1; i < days.length; i++) {
      if (days[i] == min) {
        System.out.printf(" %d ", i);
      }
    }
  }
}//close Arena class