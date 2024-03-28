import java.util.Scanner;

class FICO {

  private static final int BEGIN = 2403;
  private static final int END = 9912;

  private static int month;
  private int chase;
  private int boa;
  private int citi;
  private int dcu;
  private int discover;
  private int transUnion;
  private int equiFax;

  public static void main(String args[]){
   System.out.println("Manage FICO system");

   // Read user input
   readInput();
   // Update database
   // Default output the average that month
   // Advanced output, plot the trend.
  }  

  private static void readInput(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("What month YYMM is this FICO infor for?: ");
    month = scanner.nextInt();

    validateMonth(month);
  }

  private static boolean validateMonth(int month){
    if(month < BEGIN || month > END){
      System.out.println("Invalid time stamp");
      return false;
    }
    //TODO Check the time enter and the realtime and make sure to warn user if there is much different
    return true;
  }
}
