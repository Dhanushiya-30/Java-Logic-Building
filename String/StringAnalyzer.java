class StringAnalyzer{
    public static void main(String[] args){
         System.out.println("===============================================");
         System.out.println("TEXT ANALYSIS REPORT");
         System.out.println("===============================================");
         String text="Java is easy to learn";
         System.out.println("\n Input Text       : "+text);
         System.out.println("\nText Information");
         System.out.println("-----------------------------------------------");
         int len=text.length();
         System.out.println("Length            : "+len);
         int count=0;
         String[] word=text.split(" ");
         for(String i : word)
         {
            count++;
            }
            System.out.println("Word Count        : "+count);
            
            System.out.println("UpperCase Version : "+text.toUpperCase());
            System.out.println("Lowercase Version : "+text.toLowerCase());
            System.out.println("First Character   : "+text.charAt(0));
            System.out.println("Last Character    : "+text.charAt(len-1));
            System.out.println("-----------------------------------------------");
            System.out.println("Analysis Successful");
            System.out.println("===============================================");
    }
}
