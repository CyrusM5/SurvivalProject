import java.util.*;
public class TheGame {
  private static int randomGenerator(int max, int min) {
    return (int) ((Math.random() * (max - min)) + 1) + min;
  }
  public static void main(String[] args) {
    Person mrP = new Person();
    Situations wWComp = new Situations("you're smiling too much, and are scaring away your date.", "Willy Wonka");
    Situations wWPanic = new Situations("you realize you'll have to find time for the Wonka Factroy, Oompa Loompas and your new spouse.", "Willy Wonka");
    Situations wWBreak = new Situations("you're afraid you'll smile too much, and will scare everyone at the wedding.", "Willy Wonka");
    Situations wWHoneymoon1 = new Situations("you decided that taking your spouse to the center of the Earth was a good honeymoon.", "Willy Wonka");
    Situations wWHoneymoon2 = new Situations("you gave your date an experimental new candy.", "Willy Wonka");
    Situations wWAnniversary = new Situations("you have been very busy endangering children in your factory.", "Willy Wonka");
    int score = 0;
    int scores[] = new int [5];
    String[] goodArray = {"Leans in", "Makes good eye contact", "Moves when you do", "Parts lips", "Touches face, cheek", "Twirls hair"};
    String[] badArray = {"Clenches jaw", "Holds finger to chin or lips", "Look away", "Rubs neck or head", "Shifts weight", "Slouches",};
   
    String[] cyrusInterests = {"Philosophy", "Whale Riding"};
    String[] arinaInterests = {"Philosophy", "Bear Wrestling"};
    String[] halilInterests = {"Poetry", "Football"};
    String[] userInterests = {};
    Single cyrus = new Single("Cyrus", 250, cyrusInterests);
    Single arina = new Single("Arina", 200, arinaInterests);
    Single halil = new Single("Halil", 199, halilInterests);
    Single user = new Single("", 500, userInterests);//this is the main character
    Competitor theOne = new Competitor(0, "");
    int count = 0;
    int random = randomGenerator(100, 1);
    Single [] competitors = {arina, cyrus, halil};
    
    //generates a random competitor based on whether or not a random number divided by the health generates a
    //certain remainder.
    for(Single i: competitors){
      int number = i.getHealth()%random;
      if(number == 0 || number == 1 || number == 2 || number == 3){
          theOne.setHealth(i.getHealth());
          theOne.setName(i.getName());
          break;
      }
      if(count == 2 &&(theOne.getHealth() == 0)){
          theOne.setHealth(i.getHealth());
          theOne.setName(i.getName());
      }
      count++;
    }
    
    //Introduction
    System.out.println("Sup, sunshine. You must be single and ready to mingle! We're experts at replicating real life scenarios; specifically, those pertaining to dating!");
    System.out.println("What's your name?");
    //List characters here
    Scanner character = new Scanner(System.in);
    String name = character.nextLine();
    goodArray = mrP.shiftArr(goodArray, randomGenerator(0,10)); 
    badArray = mrP.shiftArr(badArray, randomGenerator(0,10));
    goodArray = mrP.revArr(goodArray);
    badArray = mrP.revArr(badArray);
    //goodArray = mrP.shiftArr(goodArray);
    //Sets the name for User and explains directions.
    user.setName(name);
    System.out.println(user.getName() + ", welcome to the simulation!");
    System.out.println("You start out with " + user.getHealth() + " health");
    System.out.println("You have to follow directions and make the right choices, if you run out of health, that means you're dead. Good luck! :)");
    System.out.println("Please press any key to continue.");
    character = new Scanner(System.in);
    String enter = character.nextLine();
    score = 0;
    score = mrP.goodOrBad(goodArray, badArray);
    double average = 0;
    average = mrP.avErage(mrP.getNArr());
    int mode = 0;
    mode = mrP.moDe(mrP.getNArr());
    //System.out.println(score);
    //System.out.println(mrP.getNArr());
    for (int i = 0; i < mrP.getNArr().length; i++){
      System.out.print(mrP.getNArr()[i]+" ");
    }
    System.out.println("In one (or two) word(s), how would you describe yourself? Choose from the following options.");
    System.out.println("nice, Willy Wonka, attractive, weird, quirky");
    character = new Scanner(System.in);
    String personality = character.nextLine();
    //when the user chooses nice
    //if the user's health is below 0 the game will end
    if (personality.equalsIgnoreCase("nice")) {
      System.out.println("You signed up for Christian Mingle and described yourself as \"nice\". After a few long days, \n" +
                         "you finally matched with someone. Surprising! you didn't expect it and thought it was too good to be true \n" +
                         "and maybe it was...\nIt's a Friday night, you get out of work and get ready. Normal evening, nothing special.\n" +
                         "You get in your car and start driving to the restaurant. You're on route 66 heading north, in front of you \n" +
                         "is a pickup truck hauling a trailer with a cow in it. You watch the cow walk back and forth hitting the gate. \n" +
                         "The car hits the road and the cow bounces, spinning with its legs flopping around. It keeps bouncing and spinning, bouncing and spinning, legs still flopping.");
      System.out.println("Please press any key to continue.");
      character = new Scanner(System.in);
      String idkwut = character.nextLine();
      System.out.println("You think to yourself: \n\"That's a bizarre sight!\"");
      
      //Thread class just to makes it look nice when the program runs.(you can use that segment
      //of code if you ever want the text to show after a certain period of time.)
      try {
        Thread.sleep(3000);
      } catch (InterruptedException ex) {
        Thread.currentThread().interrupt();
      }
      System.out.println("\"Is it Polish?\"");//this is funnier trust me.
      try {
        Thread.sleep(3000);
      } catch (InterruptedException ex) {
        Thread.currentThread().interrupt();
      }
      System.out.println("You notice the cow is flying right at you. Naturally, as a nice person you say,\n"
                           + "\"Hold on cow, you are invading my personal space. I would appreciate it if you wou...\"");//uh oh, you said the no-no word so I had to modify it.
      try {
        Thread.sleep(7000);
      } catch (InterruptedException ex) {
        Thread.currentThread().interrupt();
      }
      System.out.println("\nYou are dead. \n"
                           + "Oh well maybe next time you'll think of a better adjective to describe yourself... \n"
                           + "You know what they say:");
      try {
        Thread.sleep(9000);
      } catch (InterruptedException ex) {
        Thread.currentThread().interrupt();
      }
      System.out.println("Holy cow!");
      user.setHealth(0);
      System.out.println("\nHealth: " + user.getHealth());//no credits :)
    }
    
    //when the user chooses Jaden Smith as their personality
    if (personality.equalsIgnoreCase("Willy Wonka")) {
      System.out.println("You signed up for Tinder and described yourself as \"Willy Wonka\".");
      System.out.println("You arrived at the restaurant and you see your attractive date. You walk up to them and start a conversation\n" +
                         "about candy and your date seems very interested.\n");
      System.out.println(wWComp.toStringComp());
      System.out.println(theOne);
      System.out.println("You take a step, and look them straight in the eye. ");
      System.out.println("Do you believe this situation is serious?");
      Scanner serious = new Scanner(System.in);
      String serius = serious.nextLine();
      if (serius.equalsIgnoreCase("Yes")) {
        System.out.println("What should you do next?\n" +
                           "1.) Go to the bathroom\n" +
                           "2.) Sit between the competitor and your date\n" +
                           "3.) Throw an onion at your competitor\n");
        Scanner userResponse = new Scanner(System.in);
        int answer1 = userResponse.nextInt();
        if (answer1 == 2) {
          System.out.println("Good job! you win this one...");
          
        } else if (answer1 == 1) {
          System.out.println("Wrong choice, you should've sat between the competitor and your date. While you were in the bathroom your competitor\n" +
                             "managed to impress your date and steal them from you. When you finally come out of the bathroom, your date apologizes and says\n" +
                             "that unfortunately it's not gonna work. Out of embarrassment you offer to pay for the meal and your date agrees. Now you don't even\n" +
                             "have money to take the taxi home and you have to walk. And of course it's raining... When you get home all of your clothes are wet and\n" +
                             "you feel sad. What a terrible day...\n");
          
          end(20, user);
          if (user.getHealth() == 0) {
            System.out.println("You died!! ");
            System.out.println("Congratulations you have finished the game! We hope you liked it. In all seriousness though if you feel lonely and sad that you're not\n" +
                               "in a romantic relationship with someone in highschool don't stress it so much. With About 50% of marriages in America ending in divorce and only 2% of\n" +
                               "highschool relationships ending in marriage your chances of finding your true love in highschool are pretty low...");
            
          }
          else{
            //situation that happens after he goes home
          }
          try {
            Thread.sleep(7000);
          } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
          }
        } else if (answer1 == 3) {
          System.out.println("OHHHH nooo!! You decide to throw the onion at your competitor and completely forget that for the past\n" +
                             "2 months you have actually stuck to your diet and been working out. So when you throw the onion you end up hitting them\n" +
                             "pretty bad right in the face. Soon the police is called and you get taken to jail.\n");
          
          end(20, user);
          if (user.getHealth() == 0) {
            System.out.println("You died!! ");
            System.out.println("Congratulations you have finished the game! We hope you liked it. In all seriousness though if you feel lonely and sad that you're not\n" +
                               "in a romantic relationship with someone in highschool don't stress it so much. With About 50% of marriages in America ending in divorce and only 2% of\n" +
                               "highschool relationships ending in marriage your chances of finding your true love in highschool are pretty low...");
            
          }
          else {
            try {
              Thread.sleep(7000);
            } catch (InterruptedException ex) {
              Thread.currentThread().interrupt();
            }
            System.out.println("It's 10:15pm and you have just been driven to the nearest jail. You notice that one of the jail cells is empty\n" +
                               "and ask the guards to place you there. They ask you why but you decide not to give any specific reason in case you will be placed\n" +
                               "in a group cell later, you don't want to give out any information that could be used against you.\n");
            try {
              Thread.sleep(9000);
            } catch (InterruptedException ex) {
              Thread.currentThread().interrupt();
            }
            System.out.println("It's getting later now so you decide to go to sleep. What should you do?\n" +
                               "1.) Sit on the floor in the corner with your back to the wall and don't take off any of your things.\n" +
                               "2.) Lie down on the bench or cot without saying anything to the inmates next to you to show dominance.\n" +
                               "3.) Don't sleep you have to stay alert");
            int answer2 = userResponse.nextInt();
            if (answer2 == 1) {
              System.out.println("Great job, by staying in the corner of the room and not taking off any clothes you don't allow the inmates to\n" +
                                 "play any tricks on you or take any of your stuff(I know it's wrong to assume that people are jerks but according to the book\n" +
                                 "you can't be careful enough in jail).");
              try {
                Thread.sleep(7000);
              } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
              }
              System.out.println("You survive the night, the next day your dad bails you out of jail and you go home.\n");
              end(20, user);
              if (user.getHealth() == 0) {
                System.out.println("You died!! ");
                System.out.println("Congratulations you have finished the game! We hope you liked it. In all seriousness though if you feel lonely and sad that you're not\n" +
                                   "in a romantic relationship with someone in highschool don't stress it so much. With About 50% of marriages in America ending in divorce and only 2% of\n" +
                                   "highschool relationships ending in marriage your chances of finding your true love in highschool are pretty low...");
              }
            }
            if (answer2 == 2) {
              System.out.println("Wrong choice, when you lie down on the bench or cot without saying anything you're not showing dominance\n" +
                                 "you're giving your fellow inmates a reason to pick on you or claim that you're lying down on their bunk.(I know it's wrong to assume\n" +
                                 "that people are jerks but according to the book you can't be careful enough in jail)");
              try {
                Thread.sleep(7000);
              } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
              }
              System.out.println("As you lie down on the bench, someone comes up to you and tells you that it's their spot. You're too tired to argue so you get\n" +
                                 "up, but for the rest of the time there people call you \"stinky socks\" because you left them lying out beside the bench when you went to sleep.\n");
              System.out.println("The next day your dad bails you out of jail and you get to go home, but for some reason your dad cannot get \"stinky socks\" out of his head\n" +
                                 "and now you have a new nickname\n");
              end(20, user);
              if (user.getHealth() == 0) {
                System.out.println("You died!! ");
                System.out.println("Congratulations you have finished the game! We hope you liked it. In all seriousness though if you feel lonely and sad that you're not\n" +
                                   "in a romantic relationship with someone in highschool don't stress it so much. With About 50% of marriages in America ending in divorce and only 2% of\n" +
                                   "highschool relationships ending in marriage your chances of finding your true love in highschool are pretty low...");
              }
            }
            if (answer2 == 3) {
              System.out.println("You decide not to sleep and so you stay up all night. The next day you walk to the bathroom and brush your teeth with a toothbrush but it\n" +
                                 "turns out it wasn't yours. You were so tired that you didn't even notice. Unfortunately everyone else did. Now everyone thinks you're weird and like using other's\n" +
                                 "toothbrushes. Great!\n");
              try {
                Thread.sleep(7000);
              } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
              }
              System.out.println("The next day your dad bails you out of jail and you get to go home. You were so happy, that was until your dad overheard the story\n" +
                                 "about the toothbrush and told it to everyone he knew, now this story haunts you every Thanksgiving.\n");
              end(20, user);
              if (user.getHealth() == 0) {
                System.out.println("You died!! ");
                System.out.println("Congratulations you have finished the game! We hope you liked it. In all seriousness though if you feel lonely and sad that you're not\n" +
                                   "in a romantic relationship with someone in highschool don't stress it so much. With About 50% of marriages in America ending in divorce and only 2% of\n" +
                                   "highschool relationships ending in marriage your chances of finding your true love in highschool are pretty low...");
              }
            }
          }
        }
      }
      
    }
     if (personality.equalsIgnoreCase("attractive")) {
      Situations tree = new Situations("", ""); //im so confused as to why i had to put these two string parameters in seems kinda redundant.
      System.out.println(tree.toStringAttractive());
     
      Scanner userResponseAtt = new Scanner(System.in);
      int answerAtt = userResponseAtt.nextInt();
      
      System.out.println(tree.nextSitForAtt(answerAtt));
      
      if(answerAtt==1)
      {
        Scanner userResponseAtt1 = new Scanner(System.in);
        int answerAtt1 = userResponseAtt.nextInt();
        System.out.println(tree.nextSitForAtt1(answerAtt1));
        if(answerAtt1==1)
        {
          Scanner userResponseAtt11 = new Scanner(System.in);
          int answerAtt11 = userResponseAtt.nextInt();
          System.out.println(tree.nextSitForAtt11(answerAtt11));
        }
        if(answerAtt1==2)
        {
          Scanner userResponseAtt12 = new Scanner(System.in);
          int answerAtt12 = userResponseAtt.nextInt();
          System.out.println(tree.nextSitForAtt12(answerAtt12));
        }
        if(answerAtt1==3)
        {
          Scanner userResponseAtt13 = new Scanner(System.in);
          int answerAtt13 = userResponseAtt.nextInt();
          System.out.println(tree.nextSitForAtt13(answerAtt13));
        }
      }
      if(answerAtt==2)
      {
        Scanner userResponseAtt2 = new Scanner(System.in);
        int answerAtt2 = userResponseAtt.nextInt();
        System.out.println(tree.nextSitForAtt2(answerAtt2));
        if(answerAtt2==1)
        {
          Scanner userResponseAtt21 = new Scanner(System.in);
          int answerAtt21 = userResponseAtt.nextInt();
          System.out.println(tree.nextSitForAtt21(answerAtt21));
        }
        if(answerAtt2==2)
        {
          Scanner userResponseAtt22 = new Scanner(System.in);
          int answerAtt22 = userResponseAtt.nextInt();
          System.out.println(tree.nextSitForAtt22(answerAtt22));
        }
        if(answerAtt2==3)
        {
          Scanner userResponseAtt23 = new Scanner(System.in);
          int answerAtt23 = userResponseAtt.nextInt();
          System.out.println(tree.nextSitForAtt23(answerAtt23));
        }
      }
      if(answerAtt==3)
      {
        Scanner userResponseAtt3 = new Scanner(System.in);
        int answerAtt3 = userResponseAtt.nextInt();
        System.out.println(tree.nextSitForAtt3(answerAtt3));
        if(answerAtt3==1)
        {
          Scanner userResponseAtt31 = new Scanner(System.in);
          int answerAtt31 = userResponseAtt.nextInt();
          System.out.println(tree.nextSitForAtt31(answerAtt31));
        }
        if(answerAtt3==2)
        {
          Scanner userResponseAtt32 = new Scanner(System.in);
          int answerAtt32 = userResponseAtt.nextInt();
          System.out.println(tree.nextSitForAtt32(answerAtt32));
        }
        if(answerAtt3==3)
        {
          Scanner userResponseAtt33 = new Scanner(System.in);
          int answerAtt33 = userResponseAtt.nextInt();
          System.out.println(tree.nextSitForAtt33(answerAtt33));
        }
      }
    }
    if (personality.equalsIgnoreCase("weird")) {
      System.out.println("");
    }
    if (personality.equalsIgnoreCase("quirky")) {
      System.out.println("");
    }
  }
  
  public static void end(int decrease, Single s) {
    if (s.getHealth() > 0 && decrease <= s.getHealth()) {
      s.setHealth(s.getHealth() - decrease);
    }
    System.out.println("Health: " + s.getHealth());
  }
}
 
