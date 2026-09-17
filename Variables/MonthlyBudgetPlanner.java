import java.util.*;
class MonthlyBudgetPlanner{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the income: ");
        double income=sc.nextDouble();
        System.out.print("Enter the rent amount: ");
        double rent=sc.nextDouble();
        System.out.print("Enter the food expenses: ");
        double food=sc.nextDouble();
        System.out.print("Enter the transport amount: ");
        double trans=sc.nextDouble();
        System.out.print("Enter the shopping amount: ");
        double shop=sc.nextDouble();
        System.out.print("Enter the movie expenses: ");
        double movies=sc.nextDouble();
        System.out.print("Enter the mutual fund investment: ");
        double funds=sc.nextDouble();
        double total=rent+food+trans+shop+movies+funds;
        double bal=income - total;

        

        System.out.println("\n======================================");
        System.out.println("        MONTHLY BUDGET PLANNER        ");
        System.out.println("======================================");
        System.out.println("\nIncome            : "+income);
        System.out.println("\nBASIC NEEDS");
        System.out.println("--------------------------------------");
        System.out.println("Rent              : "+rent);
        System.out.println("Food              : "+food);
        System.out.println("Transport         : "+trans);
        System.out.println("\nEXTRA EXPENSES");
        System.out.println("--------------------------------------");
        System.out.println("Shopping          : "+shop);
        System.out.println("Movies            : "+movies);
        System.out.println("\nINVESTMENTS");
        System.out.println("--------------------------------------");
        System.out.println("Mutual Funds      : "+funds);
        System.out.println("\n--------------------------------------");
        System.out.println("Total Expenses    : "+total);
        System.out.println("Balance Available : "+bal);
        System.out.println("======================================");
    }
}
