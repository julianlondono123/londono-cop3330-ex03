import java.util.Scanner;

/**
 prints quotation marks
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println( "What is the quote?" );
        String quote = input.nextLine();
        System.out.println("Who said it?");
        String auth = input.nextLine();

        System.out.println(auth + " says, " +  "\"" + quote + "\"" );
    }
}
