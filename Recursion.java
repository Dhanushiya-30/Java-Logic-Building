import java.util.*;
class Recursion{
    public static void PrintNumber(int x){
        //Printing from 1 to 100
    //    
    //     if(x>100){
    //         return;
    //     }
    //     else{
    //         System.out.println(x);
    //     }
    //     //Recursion takes place(function calling itself until the condition fails)
    //     PrintNumber(x+1);
    //     


        //Printing from 100 to 1
        if(x<1){
            return;
        }
        else{
            System.out.println(x);
        }
        //Recursion takes place(function calling itself until the condition fails)
        PrintNumber(x-1);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Starting number : ");
        int a=sc.nextInt();
        PrintNumber(a);
    }
}