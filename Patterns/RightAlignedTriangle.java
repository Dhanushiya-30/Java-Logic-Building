import java.util.*;
class RightAlignedTriangle{
    public static void main(String[] args){

        //Getting input from the code
        // for(int i=0;i<5;i++){
        //     for(int j=0;j<5;j++){
        //         if(i==4||j==4||i+j==4||i+j==5||i+j==6){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        //Getting input from the terminal/user
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
  
    }
}