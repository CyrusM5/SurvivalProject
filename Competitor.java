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
        return "Your competitor is " + name + ".\n";
    }
    public void setDecHealth(int decrease){
        health = health - decrease;
    }
    public  int getHealth(){
        return health;
    }
    public void setHealth(int health){this.health = health;}
    public void setName(String name){this.name = name;}

    public String getName(){
        return name;
    }
}
