import java.util.*;
public class TheGame {
    /**
     * @param max the maximum number
     * @param min the minimum number
     * @return a randomly generated number based on the given range
     */
    private static int randomGenerator(int max, int min) {
        return (int) ((Math.random() * (max - min)) + 1) + min;
    }

    /**
     * decreases the health of the given character
     * @param decrease number by which the health decreases
     * @param s object whose health decreases
     */
    public static void end(int decrease, Single s) {
        if (s.getHealth() > 0 && decrease <= s.getHealth()) {
            s.setHealth(s.getHealth() - decrease);
        }
        System.out.println("Health: " + s.getHealth());
    }
    public static void score(int i, String score){
        System.out.println(score + i);
    }
    public static String stringMode(String a){
        int numb = Integer.parseInt(a);
        int result = 0;
        int max=0;
        System.out.println(numb);
        if (numb > 0) {
            int min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
            //determines the maximum value of the String using the Math class
            while (numb > 0) {
                int digit = numb % 10;

                max = Math.max(max, digit);
                min = Math.min(min, digit);

                numb /= 10;
            }

            result = min + max;

            System.out.println("Maximum: " + max);
            System.out.println("Minimum: " + min);
        }

        return "";
    }

    public static void main(String[] args) {

        //for the mini-game*******************************************************************************************************************
        Person mrP = new Person();
        int score = 0;
        int scores[] = new int [5];
        String[] goodArray = {"Leans in", "Makes good eye contact", "Moves when you do", "Parts lips", "Touches face, cheek", "Twirls hair"};
        String[] badArray = {"Clenches jaw", "Holds finger to chin or lips", "Look away", "Rubs neck or head", "Shifts weight", "Slouches"};
        goodArray = mrP.shiftArr(goodArray, randomGenerator(0,10));
        badArray = mrP.shiftArr(badArray, randomGenerator(0,10));
        goodArray = mrP.revArr(goodArray);
        badArray = mrP.revArr(badArray);
        //goodArray = mrP.shiftArr(goodArray);
        //************************************************************************************************************************************

        //all the characters in the game
        String[] userInterests = {};
        Single cyrus = new Single("Cyrus", 250);
        Single arina = new Single("Arina", 200);
        Single halil = new Single("Halil", 199);
        Single user = new Single("", 500, userInterests);//this is the main character
        Competitor theCompetitor = new Competitor(0, "");
        int count = 0;
        int random = randomGenerator(100, 1);
        Single [] competitors = {arina, cyrus, halil};

        //generates a random competitor based on whether or not a random number divided by the health generates a
        //certain remainder.
        for(Single i: competitors){
            int number = i.getHealth()%random;
            if(number == 0 || number == 1 || number == 2 || number == 3){
                theCompetitor.setHealth(i.getHealth());
                theCompetitor.setName(i.getName());
                break;
            }
            if(count == 2 &&(theCompetitor.getHealth() == 0)){
                theCompetitor.setHealth(i.getHealth());
                theCompetitor.setName(i.getName());
            }
            count++;
        }

        //Introduction
        System.out.println("Sup, sunshine. You must be single and ready to mingle! We're experts at replicating real life scenarios; specifically, those pertaining to dating!");
        System.out.println("What's your name?");
        //User chooses a character for themselves
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
        System.out.println("Before the simulation begins you have to play this mini-game. This game will test you knowledge" +
                        "of basic body language on a date. Please answer with \"good\" or \"bad\"");
        //the mini-game
//        score = 0;
//        score = mrP.goodOrBad(goodArray, badArray);
//        double average = 0;
//        average = mrP.avErage(mrP.getNArr());
//        int mode = 0;
//        mode = mrP.moDe(mrP.getNArr());
//        //System.out.println(score);
//        //System.out.println(mrP.getNArr());
//        for (int i = 0; i < mrP.getNArr().length; i++){
//            System.out.print(mrP.getNArr()[i]+" ");
//        }

        System.out.println("Great you are now ready to enter the simulation");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        //based on how the user describes themselves they will have different situations.
        System.out.println("In one (or two) word(s), how would you describe yourself? Choose from the following options:\nnice, Willy Wonka, attractive, weird, quirky");
        String personality = character.nextLine();

        //when the user chooses nice********************************************************************************************************************************************
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
            System.out.println("\nHealth: " + user.getHealth());
        }
        //*********************************************************************************************************************************************************************

        //when the user chooses Willy Wonka as their personality***************************************************************************************************************
        if (personality.equalsIgnoreCase("Willy Wonka")) {
            System.out.println("You signed up for Tinder and described yourself as \"Willy Wonka\".");
            System.out.println("You arrived at the restaurant and you see your attractive date. You walk up to them and start a conversation\n" +
                    "about candy and your date seems very interested.\n");
            System.out.println("You're smiling too much and scaring away your date\nOh no! A competitor has arrived");

            System.out.println(theCompetitor);
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
                    score(2, Single.finalScore);
                    stringMode(Single.finalScore);
                    if (user.getHealth() == 0) {
                        System.out.println("You died!! ");
                        System.out.println("Congratulations you have finished the game! We hope you liked it. In all seriousness though if you feel lonely or sad that you're not\n" +
                                "in a romantic relationship with someone in highschool don't stress it so much. With About 50% of marriages in America ending in divorce and only 2% of\n" +
                                "highschool relationships ending in marriage your chances of finding your true love are pretty low...");

                    } else {
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
                        System.out.println("Congratulations you have finished the game! We hope you liked it. In all seriousness though if you feel lonely or sad that you're not\n" +
                                "in a romantic relationship with someone in highschool don't stress it so much. With About 50% of marriages in America ending in divorce and only 2% of\n" +
                                "highschool relationships ending in marriage your chances of finding your true love are pretty low...");

                    } else {
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
                                        "in a relationship with someone in highschool don't stress it so much. With About 50% of marriages in America ending in divorce and only 2% of\n" +
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
                                System.out.println("Congratulations you have finished the game! We hope you liked it. In all seriousness though if you feel lonely or sad that you're not\n" +
                                        "in a relationship with someone in highschool don't stress it so much. With About 50% of marriages in America ending in divorce and only 2% of\n" +
                                        "highschool relationships ending in marriage your chances of finding your true love are pretty low...");
                            }
                        }
                    }
                }
            }
        }
        //*********************************************************************************************************************************************************************

        //when the user describes themselves as "attractive"*******************************************************************************************************************
        if (personality.equalsIgnoreCase("attractive")) {
            System.out.println("Here you are, sitting at the library. You really seem to enjoy that dictionary. But then"
                    + " you notice a person approaching you. Be wary, as this person is prone to fits of rage and yelling. The person asks you out."
                    + " You appreciate the gesture, but you don't feel the same way. You say:\n1.\"Yes, I've been waiting for you to ask me that forever.\""
                    + "\n2.\"You are a great and lovely person but we just are not meant to be.\"\n3.\"I'm going to be honest. We are not compatible.\"");

            Scanner userResponseAtt = new Scanner(System.in);
            int answerAtt = userResponseAtt.nextInt();
            Situations attSits = new Situations();
            attSits.nextSitForAtt(answerAtt, user);

            if(answerAtt==1)
            {
                int answerAtt1 = userResponseAtt.nextInt();
                attSits.nextSitForAtt1(answerAtt1, user);
                if(answerAtt1==1)
                {
                    int answerAtt11 = userResponseAtt.nextInt();
                    attSits.nextSitForAtt11(answerAtt11, user);
                }
                if(answerAtt1==2)
                {
                    int answerAtt12 = userResponseAtt.nextInt();
                    attSits.nextSitForAtt12(answerAtt12);
                }
                if(answerAtt1==3)
                {
                    int answerAtt13 = userResponseAtt.nextInt();
                    attSits.nextSitForAtt13(answerAtt13);
                }
            }
            if(answerAtt==2)
            {
                int answerAtt2 = userResponseAtt.nextInt();
                attSits.nextSitForAtt2(answerAtt2, user);
                if(answerAtt2==1)
                {
                    int answerAtt21 = userResponseAtt.nextInt();
                    attSits.nextSitForAtt21(answerAtt21);
                }
                if(answerAtt2==2)
                {
                    int answerAtt22 = userResponseAtt.nextInt();
                    attSits.nextSitForAtt22(answerAtt22);
                }
                if(answerAtt2==3)
                {
                    int answerAtt23 = userResponseAtt.nextInt();
                    attSits.nextSitForAtt23(answerAtt23);
                }
            }
            if(answerAtt==3)
            {
                int answerAtt3 = userResponseAtt.nextInt();
                attSits.nextSitForAtt3(answerAtt3, user);
                if(answerAtt3==1)
                {
                    int answerAtt31 = userResponseAtt.nextInt();
                    attSits.nextSitForAtt31(answerAtt31);
                }
                if(answerAtt3==2)
                {
                    int answerAtt32 = userResponseAtt.nextInt();
                    attSits.nextSitForAtt32(answerAtt32);
                }
                if(answerAtt3==3)
                {
                    int answerAtt33 = userResponseAtt.nextInt();
                    attSits.nextSitForAtt33(answerAtt33);
                }
            }
        }
        //*********************************************************************************************************************************************************************

        if (personality.equalsIgnoreCase("weird")) {
            System.out.println("");
        }
        if (personality.equalsIgnoreCase("quirky")) {
            System.out.println("");
        }
    }

}
