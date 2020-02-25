/* This program will calculate the monthly car payment a user should expect to make after taking out a car loan
Created by Elizabeth Akomolafe
Feb 24th 2020
*/
public class CarLoan {
  public static void main(String[] args) {

  int carLoan = 10000;
  int loanLength = 3;
  int intrestRate = 5;
  int downPayment = 2000;

  if (loanLength <= 0 || intrestRate <= 0) {
    System.out.println("Error! You must take out a valid car loan.");
  } else if (downPayment >= carLoan) {
    System.out.println("The car can be paid in full.");
  } else {
    int remainingBalance = carLoan - downPayment;
    int months = loanLength * 12;
    int monthlyBalance = remainingBalance / months;
    int  intrest = (monthlyBalance * intrestRate) / 100;
    int monthlyPayment = monthlyBalance + intrest;
    System.out.println(monthlyPayment);
  }
  }
}
