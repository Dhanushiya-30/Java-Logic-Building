class TextStatisticsReport {

    public static void main(String[] args) {

        String text = "Java is easy to learn";

        int characterCount = text.length();

        String[] words = text.split(" ");
        int wordCount = words.length;

        int vowelCount = 0;
        int consonantCount = 0;
        int spaceCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;

        String lowerText = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {

            char ch = lowerText.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {

                vowelCount++;
            }
            else if (ch >= 'a' && ch <= 'z') {

                consonantCount++;
            }
            else if (ch == ' ') {

                spaceCount++;
            }
            else if (ch >= '0' && ch <= '9') {

                digitCount++;
            }
            else {

                specialCharCount++;
            }
        }

        System.out.println("==================================================");
        System.out.println("              TEXT STATISTICS REPORT");
        System.out.println("==================================================");

        System.out.println("\nInput Text :");
        System.out.println(text);

        System.out.println("\n--------------------------------------------------");
        System.out.println("Character Count      : " + characterCount);
        System.out.println("Word Count           : " + wordCount);

        System.out.println("\nVowel Count          : " + vowelCount);
        System.out.println("Consonant Count      : " + consonantCount);
        System.out.println("Space Count          : " + spaceCount);

        System.out.println("\nUppercase Version    : " + text.toUpperCase());
        System.out.println("Lowercase Version    : " + text.toLowerCase());

        System.out.println("\nFirst Character      : " + text.charAt(0));
        System.out.println("Last Character       : " + text.charAt(text.length() - 1));

        System.out.println("\nContains Number      : " +
                (digitCount > 0 ? "Yes" : "No"));

        System.out.println("Contains Special Char: " +
                (specialCharCount > 0 ? "Yes" : "No"));

        System.out.println("--------------------------------------------------");

        System.out.println("\nAnalysis Successful");
        System.out.println("==================================================");
    }
}