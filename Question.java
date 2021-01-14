public class Question
{
  private String question;
  private int level;
  private int numberOf;
  public Question (String q, int l)
  {
    question = q;
    level = l;
  }
  public Question (int l, int nO)
  {
    level = l;
    numberOf = nO;
  }
  public String toString(){
    return question + " (level " + level + ") ";
  }
  public String toTString(){
    return "you scored " + numberOf + ", level: " + level + " questions. ";
  }
  public int getLevel(){
    return level;
  }
  public int getNumber(){
    return numberOf;
  }
  public void setHealth(int numberOf){
    this.numberOf = numberOf;
  }
}
