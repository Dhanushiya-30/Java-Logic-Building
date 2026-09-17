/*
Simple Caculator - Operators and Math (Built-in functions)
*/

import java.util.*;
class SimpleCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a : ");
        int a= sc.nextInt();

        System.out.print("Enter b : ");
        int b= sc.nextInt();

        System.out.println("Add: "+(a+b));
        System.out.println("Sub: "+(a-b));
        System.out.println("Mul: "+(a*b));
        System.out.println("Div: "+(a/b));
        System.out.println("Mod: "+(a%b));

        //Java MATH Class Methods
        System.out.print("Enter c : ");
        int c=sc.nextInt();

        System.out.print("Enter d : ");
        int d=sc.nextInt();

        //Generates random number between the range given by the user 
        System.out.println("Random Number Generated: "+((int)((Math.random()*21)+1)));
        
        System.out.println("Maximum Number: "+(Math.max(c,d)));
        System.out.println("Minimum Number: "+(Math.min(c,d)));

        //Round the decimal number to whole number
        System.out.println("Rounded Whole Number: "+((double)(Math.round(4.5))));

        //Round the number downwards
        System.out.println("Floor Number: "+((double)Math.floor(4.8)));

        //Round the number upwards
        System.out.println("Ceil Number: "+((double)Math.ceil(4.1)));

        System.out.println("Square Root: "+((int)Math.sqrt(25)));

        //Converts the negative number into positive
        System.out.println("Positive Number: "+(Math.abs(-37.2)));

        System.out.println("Value of PI: "+(Math.PI));
    }
}
