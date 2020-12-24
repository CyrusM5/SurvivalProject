public class Single {
    private String name;
    private int health;
    private String[] interests;
    //I deleted background because it's based on the adjective that the user chooses
    //to describe themselves -- see the main method(TheGame.java)

    public Single(String n, int h, String[] i)
    {
        name = n;
        health = h;
        String[] interests = i;
    }

    public Single() {

    }


    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
    public int getHealth()
    {
        return health;
    }

    public void setHealth(int g)
    {
        health = g;
    }
    public String[] getInterests()  //doesnt work
    {
        return interests;
    }
    //  public void setInterests(String d)   //doesnt work
    // {
    //      interests = d;
    //  }
}
