import java.util.*;

class EmailValidator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Email ID : ");
        String email = sc.nextLine();

        int atCount = 0;

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                atCount++;
            }
        }

        boolean hasOneAt = atCount == 1;
        boolean hasCom = email.endsWith(".com");
        boolean hasNoSpaces = !email.contains(" ");
        boolean hasValidLength = email.length() > 10;

        int atIndex = email.indexOf('@');

        boolean hasUsername = false;
        boolean hasDomain = false;

        if (atIndex > 0) {
            hasUsername = true;
        }

        if (atIndex != -1 && atIndex < email.length() - 1) {
            hasDomain = true;
        }

        System.out.println("\n=================================================");
        System.out.println("              EMAIL ANALYSIS REPORT");
        System.out.println("=================================================");

        System.out.println("\nEmail Entered : " + email);

        System.out.println("\nValidation Checks");
        System.out.println("-------------------------------------------------");

        System.out.println("Contains One '@' Symbol   : " + (hasOneAt ? "Yes" : "No"));
        System.out.println("Contains Username         : " + (hasUsername ? "Yes" : "No"));
        System.out.println("Contains Domain           : " + (hasDomain ? "Yes" : "No"));
        System.out.println("Contains '.com'           : " + (hasCom ? "Yes" : "No"));
        System.out.println("Length Greater Than 10    : " + (hasValidLength ? "Yes" : "No"));
        System.out.println("Contains Spaces           : " + (hasNoSpaces ? "No" : "Yes"));

        System.out.println("-------------------------------------------------");

        if (hasOneAt &&
            hasUsername &&
            hasDomain &&
            hasCom &&
            hasValidLength &&
            hasNoSpaces) {

            System.out.println("Email Status : VALID");
        } else {
            System.out.println("Email Status : INVALID");
        }

        System.out.println("-------------------------------------------------");
        System.out.println("Analysis Successful");
        System.out.println("=================================================");

        sc.close();
    }
}