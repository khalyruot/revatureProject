import java.util.Scanner;
import java.util.ArrayList;

public class myRecreation {
  public String gymMembership;
  public String clotheSize;
  public int walletMoney;

  public myRecreation(String gymMembership, String clotheSize, int walletMoney) {
    this.gymMembership = gymMembership;
    this.clotheSize = clotheSize;
    this.walletMoney = walletMoney;
  }

  public void printMyrecreation() {

    System.out.println("");

    System.out.println("Since you have been working so hard last week, you can go out on Sunday.");

    System.out.println("");

    System.out.println("Where you want to go this Sunday? \n1 Mall \n2 Gym\n");

    System.out.println("Please Enter The Number:");

    try {

      Scanner in = new Scanner(System.in);
      System.out.println("");
      int recreationType = in.nextInt();

      switch (recreationType) {
        case 1:
          R_Mall mall = new R_Mall();
          
            System.out.println("");
            System.out.println("Must have more than " + walletMoney +"$ on wallet.");
            System.out.println("");    
            ArrayList<String> clothList1 = new ArrayList<String>();
            clothList1.add("Linen Shirt");
            clothList1.add("Blue Jeans");
            clothList1.add("White Sneaker");
            System.out.println("Please wear " + clotheSize + " cloth: ");
            for (String i : clothList1) {
            System.out.println(" - " + i);
            }
          
            System.out.println("");
            mall.parking();
            mall.transportation();
          break;
          

        case 2:
          R_Gym gym = new R_Gym();
          
            System.out.println("");
            ArrayList<String> clothList2 = new ArrayList<String>();
            clothList2.add("T-shirt");
            clothList2.add("Short Pants");
            clothList2.add("Tennis Shoes");
            System.out.println("Please wear " + clotheSize + " cloth: ");
            for (String i : clothList2) {
            System.out.println(" - " + i);
            }
  
            System.out.println("");
            System.out.println("Don't forget your " + gymMembership + " you!");
            gym.parking();
            gym.transportation();
          break;

        default:
          System.out.println("");
          System.out.println("WRONG NUMBER! Please re-run the program!");
      }

    } catch (Exception ex) {
      System.out.println("");
      System.out.println("Caught!");
      System.out.println("NO LETTER! Please re-run the program!");
      System.out.println("");
      ex.printStackTrace();
    }

  }
}
