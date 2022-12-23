// Final Project
// My Activies For This Weekend

class Main {
public static void main(String[] args){
  
myInformation myinformation = new myInformation();
  myinformation.setfirstName("Khaly");
  myinformation.setlastName("Ruot");
  System.out.println("");
  System.out.println(myinformation);
  System.out.println("");
  System.out.println("------------------------------------");
  
myHomework assignment = new myHomework("Statistic", "Intro to Physic","Organic Chemistry");
  System.out.println("");
  assignment.printmyHomework();
  System.out.println("");
  System.out.println("------------------------------------");

myRecreation myrecreation = new myRecreation("goldMembership", "Medium Size", 100);
  System.out.println("");
  myrecreation.printMyrecreation();
  System.out.println("");
  System.out.println("------------------------------------");
}
}