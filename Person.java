import java.util.*;
public class Person
{
  int[] nums = new int[12];
  Scanner minigame = new Scanner(System.in);
  public int goodOrBad(String[] a, String[] b){
  int mGScore = 0;
  int cAns = 0;
  int wAns = 0;
  int inT = 0;
  for (int i = 0; i < (a.length+b.length)/2; i++)
  {
    System.out.println(a[i]);
    String good = minigame.nextLine();
    if (good.equalsIgnoreCase("good"))
    {
      mGScore++;
      cAns++;
      nums[inT] = 1;
      inT++;
    }
    else{
      wAns++;
      nums[inT] = 0;
      inT++;
    }
    System.out.println(b[i]);
    String bad = minigame.nextLine();
    if (bad.equalsIgnoreCase("bad"))
    {
      mGScore++;
      cAns++;
      nums[inT] = 1;
      inT++;
    }
    else{
      wAns++;
      nums[inT] = 0;
      inT++;
    }
    
  }
  return mGScore;
  }
  public int[] getNArr(){
    return nums;
  }
}