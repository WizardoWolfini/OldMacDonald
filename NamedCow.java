class NamedCow extends Cow
{
  private String myName;
  NamedCow(String name){
  mySound = "Moo";
  myType = "Cow";
  myName = name;
  }
  public String getName(){
  return myName;
  }
}
