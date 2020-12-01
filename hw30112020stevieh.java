/* Homework instructions from 30/11/2020

create variable my_name (String)
use scanner to get the name from the user
create variable named my_savings (int or long)
put 0 in my_savings
add 10000 to my_savings
multiply my_savings by 2
add 30000 to my_savings
add 1 to my_savings
divide my_savings in half
-- all this math operations should be in shorten format!
print in one line -- [my_name] has saving of [my_savings]
what was the amount?
run in debugger 
change user name to Bill Gates before the print
change my_savings to start in 100000 instead of 0 -- what was the final amount this time?

*/

package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        
    java.util.Scanner prn = new Scanner(System.in);
    System.out.print("Please enter your full name: ");
    String my_name = prn.nextLine();
    long my_savings = 100000;
    my_savings += 10000;
    my_savings *= 2;
    my_savings += 30000;
    my_savings++;
    my_savings /= 2;
    System.out.println(my_name + " has savings of " + my_savings);

    // HW: The original savings amount is 25000
    // HW: Bill Gates's savings amount (in debugging) is 125000
       
    }
}
