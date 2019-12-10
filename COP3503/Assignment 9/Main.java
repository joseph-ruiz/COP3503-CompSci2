//Joseph Gabriel Ruiz
//N00916743
//Assigment 9

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    double[] userInput = new double[3];
    double weightOutcome = 0;
    double distanceOutcome = 0;
    Scanner in = new Scanner(System.in);

    for (int i = 0; i < 2; i++) {
      userInput[i] = in.nextDouble();
    }
    // Re-prompt the user in case of negative or otherwise inproper values
    while (userInput[0] < 1 || userInput[0] > 60 || userInput[1] < 1) {
      for (int i = 0; i < 2; i++) {
      userInput[i] = in.nextDouble();
      }
    }
    double weightPackage = userInput[0];
    double distance = userInput[1];

    weightOutcome = weightCalculate(weightPackage);
    userInput[2] = distanceCalculate(weightOutcome,distance);
    System.out.printf("Output: $%.2f",userInput[2]);
    
  }
  public static double weightCalculate(double packageCalc) {
    double returning = 0;
    // Determining weight of package and returning price
    if(packageCalc >= 1 && packageCalc <= 10) {
      returning = 5.01;
    }
    else if (packageCalc >= 11 && packageCalc <= 20) {
      returning = 7.02;
    }
    else if(packageCalc >= 21 && packageCalc <= 30) {
      returning = 9.03;
    }
    else if(packageCalc >= 31 && packageCalc <= 40) {
      returning = 11.04;
    }
    else if (packageCalc >= 41 && packageCalc <= 60) {
      returning = 15.00;
    }
    return returning;
  }//end of weightCalculate method

  public static double distanceCalculate(double weight, double distance) {
    double initial = 0;
    int counter = 0;

    for( ; distance > 0; distance = distance - 100) {
      counter++;
    }
    initial = counter * weight;
    return initial;
  }
}


