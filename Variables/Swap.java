import java.util.*;
class Swap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        System.out.println("Before Swapping");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        // Swapping using third variable temp
        // int temp=a;
        // a=b;
        // b=temp;

        //Swapping using Arithmetic operation (can use both +,- and *,/)
        a=a+b; //store sum of a and b in 'a'.Now a=original_a + original_b
        b=a-b; // Subtract original b from sum.Now b=original_a . So b is swapped
        a=a-b; // Subtract new b(original_a) from sum. Now a= original_b. So a is swapped.
        System.out.println("After Swapping");
        System.out.println("a: "+a);
        System.out.println("b: "+b);



    }
}