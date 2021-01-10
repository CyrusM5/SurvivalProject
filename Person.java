import java.util.*;
public class Person
{
  public String[] revArr(String[] input){
    String[] array = new String[input.length];
    int temp;
    int a = 0;
    for (int i = input.length-1; i >= 0; i--)
    {
      array[a] = input[i];
      a++;
    }
    return array;
  }
  public String[] shiftArr(String[] input, int times){
    for(int i = 0; i < times; i++){    
      int j;
      String last;    
      //Stores the last element of array    
      last = input[input.length-1];    
      
      for(j = input.length-1; j > 0; j--){    
        //Shift element of array by one    
        input[j] = input[j-1];    
      }    
      //Last element of array will be added to the start of array.    
      input[0] = last;    
    }
    return input;
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
    int average = 0;
    int correctA = 0;
    int cAns = 0;
    int wAns = 0;
    int inT = 0;
    for (int i = 0; i < (a.length+b.length)/2; i++)
    {
      boolean validAnswer = false;
      while(validAnswer == false){
      System.out.println("Your date: "+a[i]+" - good or bad?");
      String good = minigame.nextLine();
      if (good.equalsIgnoreCase("good"))
      {
        validAnswer = true;
        correctA++;
        cAns++;
        nums[inT] = 1;
        inT++;
        String levelNum = b[i].substring(b[i].indexOf("level")+6,b[i].indexOf("level")+7);
        int level = Integer.parseInt(levelNum.trim());
        average += level;
      }
      else if (good.equalsIgnoreCase("bad"))
      {
        validAnswer = true;
        wAns++;
        nums[inT] = 0;
        inT++;
      }
      else
      {
        validAnswer = false;
        System.out.println("Please enter an appropriate answer.");
      }
      }
      boolean validAnswer2 = false;
      while(validAnswer2 == false){
      System.out.println("Your date: "+b[i]+" - good or bad?");
      String bad = minigame.nextLine();
      if (bad.equalsIgnoreCase("bad"))
      {
        validAnswer2 = true;
        correctA++;
        cAns++;
        nums[inT] = 1;
        inT++;
        String levelNum = b[i].substring(b[i].indexOf("level")+6,b[i].indexOf("level")+7);
        int level = Integer.parseInt(levelNum.trim());
        average += level;
      }
      else if (bad.equalsIgnoreCase("good"))
      {
        validAnswer2 = true;
        wAns++;
        nums[inT] = 0;
        inT++;
      }
      else
      {
        validAnswer2 = false;
        System.out.println("Please enter an appropriate answer.");
      }
      }
    }
    System.out.println("You got "+correctA+" out of "+(wAns+cAns)+" correct.");
    System.out.println("Your average score was "+ average/(wAns+cAns)+".");
    return correctA;
  }
  public int[] getNArr(){
    return nums;
  }
  public String vAnswer (String question)
  {
    boolean validAnswer = false;
    String personality = "";
    while(validAnswer == false){
      System.out.println(question);
      Scanner character = new Scanner(System.in);
      personality = character.nextLine();
      if (personality.equalsIgnoreCase("nice")){
        validAnswer = true;
      }
      else if (personality.equalsIgnoreCase("Willy Wonka")){
        validAnswer = true;
      }
      else if (personality.equalsIgnoreCase("attractive")){
        validAnswer = true;
      }
      else if (personality.equalsIgnoreCase("weird")){
        validAnswer = true;
      }
      else if (personality.equalsIgnoreCase("quirky")){
        validAnswer = true;
      }
      else {
        validAnswer = false;
        System.out.println("Please enter an appropriate answer.");
      }
    }
    return personality ;
  }
  
}

