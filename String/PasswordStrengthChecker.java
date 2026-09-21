import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password : ");
        String password = sc.nextLine();

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasNumber = false;
        boolean hasSpecialCharacter = false;
        boolean hasSpaces = false;

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                hasUppercase = true;
            }
            else if (ch >= 'a' && ch <= 'z') {
                hasLowercase = true;
            }
            else if (ch >= '0' && ch <= '9') {
                hasNumber = true;
            }
            else if (ch == ' ') {
                hasSpaces = true;
            }
            else {
                hasSpecialCharacter = true;
            }
        }

        boolean hasMinLength = password.length() >= 8;

        int score = 0;

        if (hasMinLength) score++;
        if (hasUppercase) score++;
        if (hasLowercase) score++;
        if (hasNumber) score++;
        if (hasSpecialCharacter) score++;

        String strength;

        if (hasSpaces) {
            strength = "INVALID";
        }
        else if (score == 5) {
            strength = "VERY STRONG";
        }
        else if (score == 4) {
            strength = "STRONG";
        }
        else if (score == 3) {
            strength = "MEDIUM";
        }
        else {
            strength = "WEAK";
        }

        System.out.println("\n=================================================");
        System.out.println("           PASSWORD SECURITY REPORT");
        System.out.println("=================================================");

        System.out.println("\nPassword Entered : " + password);

        System.out.println("\nSecurity Checks");
        System.out.println("-------------------------------------------------");

        System.out.println("Minimum Length (8)         : " + (hasMinLength ? "Yes" : "No"));
        System.out.println("Contains Uppercase         : " + (hasUppercase ? "Yes" : "No"));
        System.out.println("Contains Lowercase         : " + (hasLowercase ? "Yes" : "No"));
        System.out.println("Contains Number            : " + (hasNumber ? "Yes" : "No"));
        System.out.println("Contains Special Character : " + (hasSpecialCharacter ? "Yes" : "No"));
        System.out.println("Contains Spaces            : " + (hasSpaces ? "Yes" : "No"));

        System.out.println("\n-------------------------------------------------");
        System.out.println("Password Strength          : " + strength);
        System.out.println("Security Score             : " + score + " / 5");
        System.out.println("-------------------------------------------------");

        System.out.println("\nAnalysis Successful");
        System.out.println("=================================================");
    }
}