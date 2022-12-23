
class myInformation{
  
    private String firstName;
    private String lastName;
  
  // Constructor to reveive logIn information
    
  public String getfirstName(){
    return firstName;
  }
  
  public void setfirstName(String firstName){
    this.firstName = firstName;
  } 
  
  public String getlastName(){
    return lastName;
  }  
  
  public void setlastName(String lastName){
    this.lastName = lastName;
  } 
  
    
    @Override
    public String toString() {
      return "Welcome ! " + this.firstName + " " + this.lastName + ", this is your activities for this weekend ";
    }
  
  
  }
  
  
    
    
  
    
  