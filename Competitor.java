public class Competitor
{
    private Single single;
    private String name;
    private int score;
    public Competitor(Single character)
    {
        score = character.getScore();
        name = character.getName();
    }
    public Competitor(String n, int h){
        name = n;
        score = h;
    }
    public String toString(){
        return "Your competitor is " + name + ".\n";
    }
    public void setDecScore(int decrease){
        score = score - decrease;
    }
    public  int getScore(){
        return score;
    }
    public void setScore(int score){this.score = score;}
    public void setName(String name){this.name = name;}

    public String getName(){
        return name;
    }
}
