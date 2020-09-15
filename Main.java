import java.util.Scanner;
/**

 * Determining if a number is odd or even
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create scanner for user input
    Scanner input = new Scanner(System.in);

    //ask the user to enter an integer
    System.out.println("Please enter an integer:");
    
    //declaring and initializing a varaible to store the integer 
    int integer = input.nextInt();

    // declaring and calculating the remainder
    int modulus = integer%2;

    //check and see if number is odd or even 
    if( modulus == 0){
      System.out.println( integer + " is an even number");
    } else {
      System.out.println( integer + " is an odd number");
    }
  }
}
