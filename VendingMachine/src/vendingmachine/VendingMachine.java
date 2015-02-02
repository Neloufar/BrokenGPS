/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package vendingmachine;


import java.util.Scanner;

/**
 *
 * @author nl2027
 */
public class VendingMachine {
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) 
    {
        Scanner kbd = new Scanner(System.in);
        int leave = 1;
        double totalBalance;
        while (leave!= 0)
       {
       System.out.println("Insert your money :");
       System.out.println("Welcome!");
       System.out.println("Vending machine only accepts $5, $1, $.25, $.10, $.05, $.01 - ");
       
       int choice = kbd.nextInt();
       int amount = kbd.nextInt();
       double coinAmount;
       double dollarAmount;
       int dollarBill;
       int oneAmount;
       int fiveAmount;
       int fiveBill;

          
           System.out.println("How many dollar bills would you like to enter?");
           dollarBill = kbd.nextInt();
           oneAmount = (1 * dollarBill); 

          System.out.println("How many five dollar bills would you like to enter?");
          fiveBill = kbd.nextInt();
          fiveAmount =  (5 * fiveBill);
          
          dollarAmount = (fiveAmount + oneAmount);
          
           double quarter;
           double quarterAmount ;
           double dime;
           double dimeAmount;
           double nickel;
           double nickelAmount;
           double penny;
           double pennyAmount ;

          System.out.println("How many quarters would you like to enter?");
              quarter = kbd.nextInt();
              quarterAmount =  ((.25) * quarter);
              
              System.out.println("How many dimes would you like to enter?");
              dime = kbd.nextInt();
              dimeAmount =  (.10 * dime);

              System.out.println("How many nickels would you like to enter?");
              nickel = kbd.nextInt();
              nickelAmount = (.05 * nickel);

              System.out.println("How many pennys would you like to enter?");
              penny = kbd.nextInt();
              pennyAmount = (.01 * penny);

        coinAmount = (quarterAmount + dimeAmount + nickelAmount + pennyAmount);

       totalBalance = (coinAmount + dollarAmount);

       System.out.println("Youve inserted  $" + totalBalance + " dollars");

        double total = 4.25;  

        System.out.println("Items:");

        System.out.println("1. Snickers ($4.25) ");

        System.out.println("2. Milky Way ($4.25) ");

        System.out.println("3. Twix ($4.25)");

        System.out.println("4. M&M ($4.25)");

        System.out.println("5. Hersheys ($4.25)");

        System.out.println("Your Selection - ");

        String yourchoice = kbd.next();
       System.out.println("You chose: " + yourchoice);

       System.out.println("Your total is $" + total);

   double cashBack;

    cashBack = totalBalance - total;

    System.out.println("Your change is:  $" + cashBack);   

    int fiveDollar = (int) (cashBack/ 5);
    cashBack = (cashBack - (fiveDollar*5));

    int oneDollar = (int) (cashBack/ 1);
    cashBack = (cashBack - (oneDollar * 1));

    int newQuarter = (int) (cashBack/ .25);
    cashBack = (cashBack - (newQuarter * .25));

    int newDime = (int) (cashBack/ .10);
    cashBack = (cashBack - (newDime * .10));

    int newNickel = (int) (cashBack/.05);
    cashBack = (cashBack - (newNickel * .05));

    int newPenny = (int) (cashBack/ .01);
    cashBack = (cashBack - (newPenny * .01));

    

    System.out.println("You get");
    System.out.println("Five dollar " + fiveDollar);
    System.out.println("One dollar: " + oneDollar);
    System.out.println("Quarters: " + newQuarter);
    System.out.println("Dimes: " + newDime);
    System.out.println("Nickels: " + newNickel);
    System.out.println("Pennies: " + newPenny);

    System.out.println("if you would like to leave press 0");

       leave= kbd.nextInt();

        }

        

        

    }

               

    

                  

    

    

}


