public class Bird
{
  private String name;
  
  public Bird () 
  {
    name = "Bird";
  }
  
  public void eat ()
  {
    System.out.print ("Seeds");
  }
  
  public void speak ()
  {
    System.out.print ("Tweet!");
  }
  
  public String getName()
  {
    return name;
  }
  
  public String setName (String s)
  {
    name = s;
    return name;
  }

}