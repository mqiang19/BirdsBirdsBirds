public class Dodo extends Bird
{
  public Dodo ()
  {
    super();
    setName("Dodo");
  }
  
  public void eat ()
  {
    super.eat();
    System.out.print (" and ash");
  }
  
  public void speak ()
  {
    super.speak();
    System.out.print (" on twitter about saving the planet or else everyone will DIE");
  }

}