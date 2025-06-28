
public class Main
{
    // main method
    public static void main(String[] args)
    {

       String input = ("vishal"); // input 
       String result = input.replaceAll("[aeoiuAEOIU]","");  // use replaceAll method 
        System.out.println(result);
        // output : vshl
    }
}
