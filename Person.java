import java.util.*;
public class Person
{
  public String[] revArr(String[] input){
    String[] array = new String[input.length];
    int a = 0;
    for (int i = input.length-1; i >= 0; i--)
    {
      array[a] = input[i];
      a++;
    }
    return array;
  }
  public String[] shiftArr(String[] input){
    String[] array = new String[input.length];
    int a = 0;
    for (int i = input.length-1; i >= 0; i--)
    {
      if (i+1>=input.length){
        array[a]=input[0];
      }
      else{
        array[a]=input[i+1];
      }
      
    }
    return array;
  }
  public int moDe (int[] input){
    //String inputS = Integer.toString(input);
    int frQu = 0;
    int mode = 0;
    int i, x, j; 
    int[] frequency = new int[10];
    Arrays.toString(frequency); // [0, 0, 0, 0, 0] 
    //iterates through the array and determines which element has the highest frequency
    for (i = 0; i < input.length; i++) { 
      // accessing each element of array 
      int numStr = input[i];
      frequency[numStr]++; 
      //System.out.print(x + " "); 
    } 
    //the index of the highest frequency is the mode of the int
    int highestfrequency = frequency[0];
    for (j = 1; j < frequency.length; j++) {
      if (frequency[j]>highestfrequency){
        highestfrequency = frequency[j];
        mode = j;
      }
    }
    System.out.println("The mode of your game is "+mode);
    return mode;
  }
  int[] nums = new int[12];
  Scanner minigame = new Scanner(System.in);
  public double avErage(int[]avNum){
    //String inputS = Integer.toString(aveNum);
    int total = 0;
    int i = 0;
    int div = 0;
    //adds the digits of the int and divides it by the number of digits in the int
    while (i<avNum.length){
      int numStr = avNum[i];
      total+=numStr;
      i++;
      div++;
    }
    //System.out.println("total is " + total);
    //System.out.println("div is " + div);
    double ave = (double)total/div;
    System.out.println("Your average score is "+ave);
    return ave;
  }
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
    System.out.println("You scored a "+mGScore+" out of "+(wAns+cAns)+".");
    return mGScore;
  }
  public int[] getNArr(){
    return nums;
  }
  
}
