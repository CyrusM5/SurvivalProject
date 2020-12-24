public class Competitor
{
    private Single single;
    private String name;
    private int health;
    public Competitor()
    {
    }
    public Competitor(int h, String n)
    {
        health = h;
        name = n;
    }
    public String toString(){
        return "Your competitor is " + single.getName() + ".";
    }
    public void setHealth(int decrease){
        health = health - decrease;
    }
    public  int getHealth(){
        return health;
    }
}