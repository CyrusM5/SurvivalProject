import java.util.*;
public class TheGame {
    public static int randomGenerator(int max, int min)
    {
        return (int) ((Math.random()*(max - min)) + 1) + min;
    }
    public static void main(String[] args)
    {
        Situations wWComp = new Situations("you're smiling too much, and are scaring away your date.", "Willy Wonka");
        Situations wWPanic = new Situations("you realize you'll have to find time for the Wonka Factroy, Oompa Loompas and your new spouse.", "Willy Wonka");
        Situations wWBreak = new Situations("you're afraid you'll smile too much, and will scare everyone at the wedding.", "Willy Wonka");
        Situations wWHoneymoon1 = new Situations("you decided that taking your spouse to the center of the Earth was a good honeymoon.", "Willy Wonka");
        Situations wWHoneymoon2 = new Situations("you gave your date an experimental new candy.", "Willy Wonka");
        Situations wWAnniversary = new Situations("you have been very busy endangering children in your factory.", "Willy Wonka");

        String[] goodArray = {"Leans in", "Makes good eye contact", "Moves when you do", "Parts lips", "Touches face, cheek", "Twirls hair"};
        String[] badArray = {"Clenches jaw", "Holds finger to chin or lips", "Look away", "Rubs neck or head", "Shifts weight", "Slouches"};
        String[] cyrusInterests = {"Philosophy", "Whale Riding"};
        String[] arinaInterests = {"Philosophy", "Bear Wrestling"};
        String[] halilInterests = {"Poetry", "Football"};
        String[] userInterests = {};
        Single cyrus = new Single("Cyrus", 250, cyrusInterests);
        Single arina = new Single("Arina", 200, arinaInterests);
        Single halil = new Single("Halil", 199, halilInterests);
        Single user = new Single("", 500, userInterests);//this is the main character
        Competitor theOne = new Competitor();

        //Introduction
        System.out.println("Sup, sunshine. You must be single and ready to mingle! We're experts at replicating real life scenarios; specifically, those pertaining to dating!");
        System.out.println("What's your name?");
        //List characters here
        Scanner character = new Scanner(System.in);
        String name = character.nextLine();

        //Sets the name for User and explains directions.
        user.setName(name);
        System.out.println(user.getName() + ", welcome to the simulation!");
        System.out.println("You start out with " + user.getHealth() + " health");
        System.out.println("You have to follow directions and make the right choices, if you run out of health, that means you're dead. Good luck! :)");
        System.out.println("Please press any key to continue.");
        character = new Scanner(System.in);
        String enter = character.nextLine();
        System.out.println("What's up doc? Let's get you warmed up with a quick mini-game before the simulation begins");
        System.out.println("This happens to you on a date. Is it good or bad?(good/bad)\n");
        int random = randomGenerator(0,10);
        if (random%5==0){
            theOne = new Competitor(cyrus.getHealth(), cyrus.getName());
        }
        else if (random%2==0){
            theOne = new Competitor(arina.getHealth(), arina.getName());
        }
        else{
            theOne = new Competitor(halil.getHealth(), halil.getName());
        }
        Scanner character2 = new Scanner(System.in);
        int mGScore = 0;
        int cAns = 0;
        int wAns = 0;
        for (int i = 0; i < goodArray.length; i++)
        {
            System.out.println(goodArray[i]);
            character2 = new Scanner(System.in);
            String good = character2.nextLine();
            if (good.equalsIgnoreCase("good"))
            {
                System.out.println("Yay!");
                mGScore++;
                cAns++;
            }
            else{
                System.out.println("Oh no!");
                mGScore--;
                wAns++;
            }
            System.out.println(badArray[i]);
            character2 = new Scanner(System.in);
            String bad = character2.nextLine();
            if (bad.equalsIgnoreCase("bad"))
            {
                System.out.println("Yay!");
                mGScore++;
                cAns++;
            }
            else{
                System.out.println("Oh no!");
                mGScore--;
                wAns++;
            }
        }
        System.out.println("You got " + mGScore + " out of 12 points!");
        System.out.println("You got " + cAns + " correct answers and " + wAns + " wrong answers.");

        //based on how the user describes themselves the story line changes
        //this is why I took out background
        System.out.println("In one (or two) word(s), how would you describe yourself? Choose from the following options.");
        System.out.println("nice, Willy Wonka, attractive, weird, quirky");
        character = new Scanner(System.in);
        String personality = character.nextLine();

        //Competitor.setCompetitor(i);
        //System.out.println(theOne);
        System.out.println(theOne);
        System.out.println(theOne.getHealth());

        //when the user chooses nice
        if (personality.equalsIgnoreCase("nice")){
            System.out.println("You signed up for Christian Mingle and described yourself as \"nice\". After a few long days, \n"+
                    "you finally matched with someone. Surprising! you didn't expect it and thought it was too good to be true \n" +
                    "and maybe it was...\nIt's a Friday night, you get out of work and get ready. Normal evening, nothing special.\n" +
                    "You get in your car and start driving to the restaurant. You're on route 66 heading north, in front of you \n"+
                    "is a pickup truck hauling a trailer with a cow in it. You watch the cow walk back and forth hitting the gate. \n"+
                    "The car hits the road and the cow bounces, spinning with its legs flopping around. It keeps bouncing and spinning, bouncing and spinning, legs still flopping.");
            System.out.println("Please press any key to continue.");
            character = new Scanner(System.in);
            String idkwut = character.nextLine();
            System.out.println("You think to yourself: \n\"That's a bizarre sight!\"");

            //Thread class just to makes it look nice when the program runs.(you can use that segment
            //of code if you ever want the text to show after a certain period of time.)
            try
            {
                Thread.sleep(3000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.println("\"Is it Polish?\"");//this is funnier trust me.
            try
            {
                Thread.sleep(3000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.println("You notice the cow is flying right at you. Naturally, as a nice person you say,\n"
                    + "\"Hold on cow, you are invading my personal space. I would appreciate it if you wou...\"");//uh oh, you said the no-no word so I had to modify it.
            try
            {
                Thread.sleep(7000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.println("\nYou are dead. \n"
                    + "Oh well maybe next time you'll think of a better adjective to describe yourself... \n"
                    + "You know what they say:");
            try
            {
                Thread.sleep(9000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.println("Holy cow!");
            user.setHealth(0);
            System.out.println("\nHealth: " + user.getHealth());//no credits :)
        }

        //when the user chooses Jaden Smith as their personality
        if(personality.equalsIgnoreCase("Willy Wonka"))
        {
            System.out.println("You signed up for Tinder and described yourself as \"Willy Wonka\".");
            System.out.println("You arrived at the restaurant and you see your attractive date. You walk up to them and start a converstation/n" +
                    "about candy and your date seems very interested. ");
            System.out.println(wWComp.toStringComp());
            System.out.println(theOne);
            System.out.println("You take a step, and look them straight in the eye. ");
            System.out.println("Do you believe this situation is serious?");
            Scanner serious = new Scanner(System.in);
            String serius = serious.nextLine();
            if(serius.equalsIgnoreCase("Yes"))
            {
                System.out.println("What should you do next?\n" +
                        "1.) Go to the bathroom\n " +
                        "2.) Sit between the competitor and your date\n" +
                        "3.) Throw an onion at your competitor\n");
                Scanner userResponse = new Scanner(System.in);
                int answer1 = userResponse.nextInt();
                if(answer1 == 2){
                    System.out.println("Good job! you win this one...");
                }
                else user.setHealth(20);
            }
            //System.out.println(Situations.situation1);
        }
        if(personality.equalsIgnoreCase("attractive"))
        {
            System.out.println("");
        }
        if(personality.equalsIgnoreCase("weird"))
        {
            System.out.println("");
        }
        if(personality.equalsIgnoreCase("quirky"))
        {
            System.out.println("");
        }

    }
}
