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
  public Question getQuestion() {
    Question que = new Question(this.question, this.level);
    if (this.level==1)
    {
      que.level = 2;
    }
    else if (this.level==3)
    {
      que.level = 3;
    }
    else if (this.level > 3 || this.level <= 0)
    {
      que.level = 1;
    }
    return que;
  }
}
