/*
Created by David McClung
20/02/21
"Oh boy, I hope this works!"
 */

import java.util.Scanner;

public class MethodOverloading {

    public static void main(String[] args) {

        System.out.println("Welcome please enter a number to choose department");

        /*
        Department 1 - employees are paid a bonus based on the sales:
        If the sales amount is over £5000 they get
        10% of those sales, otherwise they get nothing.
         */

        System.out.println("1. Department 1");

        /*
         *Department 2 - employees are paid a bonus based on the number of units they sell:
         * They get £10 per unit sold, and an extra £10 per unit
         * if they sell 25 units or more; if they sell no units, they get nothing.
         */
        System.out.println("2. Department 2");

       /*
       Department 3 - employees are paid a bonus of 10p per unit they assemble, if they reach a certain level:
       Part-time employees must assemble more than 250 units to get the 10p per unit bonus.
       Full-time employees must assemble more than 700 units to get the 10p per unit bonus."
        */

        System.out.println("3. Department 3");

        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        switch (option) {

            //bonus option for department 1
            case 1:

                System.out.println("Department 1 selected\n" + "Please enter sales amount ");

                /*
                 yo david - this line of code is very  handy - getBonus(sc.nextInt() can be used to input a user amount instead of a static amount!
                 the bonus is set to a static amount as per the brief of 10% bonus. I did a learn
                 */

                int department1 = getBonus(sc.nextInt());

                System.out.println("Your bonus is £" + department1);

                break;

            case 2:


                System.out.println("Department 2 selected\n" + "Please enter units sold amount ");

                float department2 = getBonus(sc.nextFloat());

                System.out.println("Your bonus is £" + department2);

                break;

            case 3:

                System.out.println("Department 3 selected\n" + "Are you:\n1.Part-time\n2.Full-Time? ");

                int workAmount = sc.nextInt();

                System.out.println("Department selected\n Please enter units made: ");

                double unitsMade = sc.nextInt();

                double department3 = getBonus(unitsMade, workAmount);

                System.out.println("Your bonus is £" + department3);

                break;

                case 4:
                System.exit(0);
                break;

        }

    }

    /*
    method for department 1's bonus
    So I made this overly complicated
     */
    private static int getBonus(int sales) {
        if (sales > 5000) {

           return sales / 10;

        }
        return 0;
    }

    //method for department 2's bonus
    private static float getBonus(float unitSales) {

        if (unitSales >= 25) {
             return unitSales * 20;

        }
        else if (unitSales > 0) {

            return unitSales * 10;
        }

        return 0;
    }

    //method for department 3's bonus
    private static double getBonus(double unitsMade,double workAmount) {

        if (workAmount == 1) {

            if (unitsMade > 250) {

                return unitsMade * 0.10;
            }
            return 0;
        }
        else if (workAmount == 2) {

                if (unitsMade > 700) {

                    return unitsMade * 0.10;
                }
                return 0;
            }

      return 0;
    }
}


