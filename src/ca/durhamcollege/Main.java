package ca.durhamcollege;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;




public class Main
{

    public static void main(String[] args)
    {
        //Declarations
        //Constants
        final int MAX_YEAR = 2099;
        final int MIN_YEAR = 2000;
        final int MAX_MONTH = 12;
        final int MIN_MONTH = 1;
        final int MAX_DAY = 30;
        final int MIN_DAY = 1;

        //Variables
        Scanner keyboard = new Scanner(System.in);
        boolean dirtyFlag = true;
        int day = 0, month = 0, year = 0;

        do
        {
            try
            {

                System.out.print("\nPlease enter the day: ");
                day = keyboard.nextInt();
                if (day > MIN_DAY && day < MAX_DAY)
                {
                    System.out.printf("Day is: %d\n", day);

                    System.out.print("\nPlease enter the month: ");
                    month = keyboard.nextInt();
                    if (month > MIN_MONTH && month < MAX_MONTH)
                    {
                        System.out.printf("Month is: %d\n", month);

                        System.out.print("\nPlease enter the Year: ");
                        year = keyboard.nextInt();
                        if (year > MIN_YEAR && year < MAX_YEAR)
                        {
                            System.out.printf("Year is: %d\n", year);

                            LocalDate tempDate;
                            tempDate = LocalDate.of(year, month, day);
                            System.out.printf("The Date is: %s", tempDate.toString());
                        }

                    }
                }


            }
            catch(IllegalArgumentException iae)
            {
                System.out.print("\n INVALID");
                keyboard.nextLine();
                dirtyFlag = true;
            }
            catch(InputMismatchException ime)
            {
                System.out.print("\nINVALID: Your input was incorrect, try again.");
                keyboard.nextLine();
                dirtyFlag = true;
            }
        } while (dirtyFlag);







    }

}

