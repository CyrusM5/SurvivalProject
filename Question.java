public class Question
{
  private String question;
  private int level;
  public Question (String q, int l)
  {
    question = q;
    level = l;
  }
  public String toString(){
    return question + " (level " + level + ") ";
  }
  public int getLevel(){
    return level;
  }
}