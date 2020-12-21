public class Competitor
{
  private Single single;
  public Competitor()
  {
    
  }
  public Competitor(Single s)
  {
    this.single = new Single(s.getName(), s.getHealth(), s.getInterests());
  }
  public String toString(){
    return "Your competitor is " + single.getName() + ".";
  }
}