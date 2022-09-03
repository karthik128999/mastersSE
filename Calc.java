Skip to content
Search or jump to…
Pull requests
Issues
Marketplace
Explore
 
@karthik128999 
SukumarUA
/
Assignment-1-Practice-SE
Public
Code
Issues
Pull requests
Actions
Projects
Wiki
Security
Insights
Assignment-1-Practice-SE/calculator.java /
@SukumarUA
SukumarUA Update calculator.java
Latest commit 5ac8de5 4 hours ago
 History
 2 contributors
@sukumarchinthalapudi@SukumarUA
80 lines (69 sloc)  1.93 KB


// Replica of https://stackoverflow.com/a/2735664/3262852 since the code itself does not matter, 
// We need to learn about working in group on github

package org.com;

import java.lang.*; 
import java.util.*; 
public class Calculator 
{ 
    private int solution; 
    private static int x; 
    private static int y; 
    private char operators; 

    public Calculator() 
    { 
        solution = 0; 
        Scanner operators = new Scanner(System.in); 
        Scanner operands = new Scanner(System.in); 
    } 
 
    public int subtraction(int x, int y) 
    { 
       //return x - y; 
    }
    public int addition(int x,int y)
    {
	//return x + y;
    } 
    public int multiplication(int x, int y) 
    {     
       //return x * y; 
    }
   public int division(int x, int y) 
    { 
       //solution = x / y; 
       //return solution; 
    } 

    public void calc(int ops){
         x = 4; 
         System.out.println("operand 2: "); 
         y = 5; 

         switch(ops) 
         { 
             case(1): 
               System.out.println(addition(x, y)); 

           //    operands.next(); 
               break; 
             case(2): 
                 System.out.println(subtraction(x, y)); 
              // operands.next(); 
               break; 
             case(3): 
                 System.out.println(multiplication(x, y)); 
             //  operands.next(); 
               break; 
             case(4): 
                 System.out.println(division(x, y));
             //  operands.next(); 
               break; 
          } 
    }
    public static void main (String[] args) 
    { 
      System.out.println("What operation? ('+', '-', '*', '/')");  
      System.out.println(" Enter 1 for Addition");
      System.out.println(" Enter 2 for Subtraction");
      System.out.println(" Enter 3 for Multiplication");
      System.out.println(" Enter 4 for Division");

       Calculator calc = new Calculator();
       calc.calc(1);


  } 
} 
Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About
You have no unread notifications
