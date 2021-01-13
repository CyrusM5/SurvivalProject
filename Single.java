public class Single {
    private String name;
    public static int score;

    public Single(String n, int h){
        name = n;
        score = h;
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
    public int getScore()
    {
        return score;
    }

    public void setScore(int g)
    {
        score = g;
    }
}
