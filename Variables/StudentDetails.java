/*
Student details  
This program takes name,age,cgpa and isplaced as inputs from user(terminal to code) using scanner class and 
store them in 4 different datatypes
*/
import java.util.Scanner;
class StudentDetails{
    public static void main(String[] args){
        //Use Scanner class to get input from user
        Scanner var=new Scanner(System.in);

        //Getting values from user using scanner class and methods
        System.out.print("Enter Name : ");
        String name=var.nextLine();

        System.out.print("Enter age :");
        int age=var.nextInt();
        
        System.out.print("Enter CGPA : ");
        double cgpa=var.nextDouble();    
        
        System.out.print("Enter Placed or Not (True/False) : ");
        boolean isPlaced=var.nextBoolean();

        System.out.println();
        //Printing all the 4 inputs using system class(code to terminal)
        System.out.println("============= Student Details =============");
        System.out.println("Name     : "+name);
        System.out.println("Age      : "+age);
        System.out.println("cgpa     : "+cgpa);
        System.out.println("IsPlaced : "+isPlaced);

        var.close();
    }
}
