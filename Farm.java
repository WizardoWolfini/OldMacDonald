class Farm 
{     
  private Animal[] animals = new Animal[3];
   //your code here
     Farm(){
     animals[0] = new NamedCow("Betty");
     animals[1] = new Chick();
     animals[2] = new Pig();
     }
     public void AnimalSounds(){
     for(Animal animal : animals){
     System.out.println(animal.getType() + " goes " + animal.getSound());
      }
      System.out.println("This cow is known as " + ((NamedCow)animals[0]).getName());
     }
}
