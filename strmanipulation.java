public class strmanipulation
{
    public static void main(String[] args)
    {
        String str = "Hello,World!";
        int length = str.length();
        System.out.println("Length: " + length);

        
        String uppercase = str.toUpperCase();
        System.out.println("Uppercase: " + uppercase);

       
        String lowercase = str.toLowerCase();
        System.out.println("Lowercase: " + lowercase);

     
        String replaced = str.replace("o", "x"); 
        System.out.println("Replaced: " + replaced);

      
        String substring = str.substring(7, 12); 
        System.out.println("Substring: " + substring);

       
        boolean startsWith = str.startsWith("hello");
        System.out.println("Starts with 'hello': " + startsWith);

      
        boolean endsWith = str.endsWith("world!");
        System.out.println("Ends with 'world!': " + endsWith);

        
        String trimmed = "  hello,world!  ".trim(); 
        System.out.println("Trimmed: " + trimmed);
    }
}

