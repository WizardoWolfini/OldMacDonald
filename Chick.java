class Chick implements Animal 
{     
  private String mySound, myType;
  Chick(){
   if(Math.random() < .33){
  mySound = "Cluck";
   } else{
  mySound = "Cheep";
   }
  myType = "Chick";
  }
     public String getSound(){
     return mySound;
     }
     public String getType(){
     return myType;
     }
     //your code here
}
