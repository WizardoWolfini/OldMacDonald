class Cow implements Animal 
{     
  private String mySound, myType;
  Cow(){
  mySound = "Moo";
  myType = "Cow";
  }
     public String getSound(){
     return mySound;
     }
     public String getType(){
     return myType;
     }
}
