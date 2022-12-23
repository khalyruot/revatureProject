import java.util.Scanner;

public class myHomework {
  public String Math;
  public String Physic;
  public String Chemistry;
  
public myHomework(String Math, String Physic, String Chemistry) {
    this.Math = Math;
    this.Physic = Physic;
    this.Chemistry = Chemistry;
}

public void printmyHomework(){

    System.out.println("You will have your final exam soon. You have to spend your Saturday reviewing your lecture.");

    System.out.println("");

    System.out.println("What subject do you want to study? \n1 Math \n2 Physic \n3 Chemistry\n");

    System.out.println("Please Enter Subject Code:");


  try{
    
    Scanner in = new Scanner(System.in);
    System.out.println("");
    int homeworkType = in.nextInt();

    if (homeworkType == 1) {
      System.out.println("");
      System.out.println("You got 40 for your "+ Math +" Midterm, you should focus on Chapter 1, Chapter 2, and Chapter 5. Please try your best for this coming " + Math + " exam");
    }

    else if (homeworkType == 2) {
      System.out.println("");
      System.out.println("Your " + Physic + " professor is very nice " + "You will have an open book exam, so you will need to create two cheat sheets for this " + Physic + " exam.");
    }

    else if (homeworkType == 3) {
      System.out.println("");
      System.out.println("You will have to present your final "+ Chemistry + " project infront of your classmate. For " + Chemistry + ", please review your Power Point Presentation.");
    }
    else {
    System.out.println("");
    System.out.println("Please don't forget to do at least one homework tomorrow");
    }

  }catch (Exception ex) {
    System.out.println("");
  	System.out.println("Caught!");
    System.out.println("NO LETTER!");
    System.out.println("");
  	ex.printStackTrace();
  }

}

}
