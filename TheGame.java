import java.util.*;
public class TheGame {
    /**
     * @param max the maximum number
     * @param min the minimum number
     * @return a randomly generated number based on the given range
     */
    public static int randomGenerator(int max, int min) {
        return (int) ((Math.random() * (max - min)) + 1) + min;
    }

    /**
     * Determines the minimum digit of a passed integer
     * Precondition: Passed integer must be a positive number, otherwise will not output the correct digit
     * Postcondition: Returns the minimum digit of a passed integer as a positive int.
     */
    public static int findMinDigit(int a)
    {
        int digit = 9;
        while (a > 0)
        {
            if (a%10 < digit)
            {
                digit = a%10;
            }
            a = a/10;
        }
        return digit;
    }
    /**
     * Determines the starting score by finding the "digit"th digit of a passed "largeNumber"
     * Precondition: The int digit passed must be a positive number, otherwise will output incorrectly.
     * Precondition: The int largeNumber must have as many or more places of digits than the value of int digit, otherwise will output incorrect number.
     * Postcondition: Returns a starting score of either 100, 200, 300, 400, 500, 600, 700, 800, or 900.
     */
    public static int setStartingScore(int largeNumber, int digit)
    {
        int finalNumber = 0;
        int d = String.valueOf(largeNumber).length();
        if(d<digit)
            d=0;
        else
            d = d-digit;

        while (d > 0)
        {
            finalNumber = largeNumber%10;
            largeNumber = largeNumber/10;
            d--;
        }
        if(finalNumber < 3){
            finalNumber = 3;
        }
        return finalNumber*100;
    }

    /**
     * decreases the score of the given character
     * @param decrease number by which the score decreases
     * @param s object whose score decreases
     */
    public static void end(int decrease, Single s) {
        if (s.getScore() > 0 && decrease <= s.getScore()) {
            s.setScore(s.getScore() - decrease);
        }
        System.out.println("Score: " + s.getScore());
    }
    /**
     * prints out the updated score
     * @param i the amount added to the score
     * @param score the previous score
     */
    public static void score(int i, String score){
        System.out.println(score + i);
    }
    /**
     * returns a random number by which the score will decrease
     * @param user needs the Single to use its score
     * @return returns a number that is less than the users score hopefully.
     */
    private static int decScore(Single user){
        int[] nums = new int[10];
        for(int i = 0; i<nums.length; i++){
            nums[i] = randomGenerator(user.getScore(),5);
        }
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]> max){
                max = nums[i];
            }
            else if(nums[i]< min){
                min = nums[i];
            }
        }
        return max - min;
    }

    /**
     * tells the user whether they won or lost based on the score.
     * @param score the user's score
     * @return whether the user won or lost
     */
    public static String winnerLooser(int score){
        if(score >= 150){
            return "You won!";
        }
        else return "You lost :(";
    }

    public static void main(String[] args) {

        //for the mini-game*******************************************************************************************************************
        Person mrP = new Person();
        int score = 0;
        int scores[] = new int [5];
        Question goodO = new Question("Leans in", randomGenerator(3, 0));
        Question goodTw = new Question("Makes good eye contact", randomGenerator(3, 0));
        Question goodTh = new Question("Moves when you do", randomGenerator(3, 0));
        Question goodFo = new Question("Parts lips", randomGenerator(3, 0));
        Question goodFi = new Question("Touches face, cheek", randomGenerator(3, 0));
        Question goodS = new Question("Twirls hair", randomGenerator(3, 0));
        Question badO = new Question("Clenches jaw", randomGenerator(3, 0));
        Question badTw = new Question("Holds finger to chin or lips", randomGenerator(3, 0));
        Question badTh = new Question("Look away", randomGenerator(3, 0));
        Question badFo = new Question("Rubs neck or head", randomGenerator(3, 0));
        Question badFi = new Question("Shifts weight", randomGenerator(3, 0));
        Question badS = new Question("Slouches", randomGenerator(3, 0));
        goodO = goodO.getQuestion();
        goodTw = goodTw.getQuestion();
        goodTh = goodTh.getQuestion();
        badFo = badFo.getQuestion();
        badFi = badFi.getQuestion();
        badS = badS.getQuestion();
        Question[] questionArray = {goodO.getQuestion(), goodTw, goodTh, goodFo, goodFi, goodS, badO, badTw, badTh, badFo, badFi, badS};
        int oneQ = 0;
        int twoQ = 0;
        int threeQ = 0;
        for (Question question: questionArray)
        {
            if (question.getLevel()==1)
            {
                oneQ++;
            }
            else if (question.getLevel()==2)
            {
                twoQ++;
            }
            else if (question.getLevel()==3)
            {
                threeQ++;
            }
        }
        String[] goodArray = {goodO.toString(), goodTw.toString(), goodTh.toString(), goodFo.toString(), goodFi.toString(), goodS.toString()};
        String[] badArray = {badO.toString(), badTw.toString(), badTh.toString(), badFo.toString(), badFi.toString(), badS.toString()};
        goodArray = mrP.shiftArr(goodArray, randomGenerator(0,10));
        badArray = mrP.shiftArr(badArray, randomGenerator(0,10));
        goodArray = mrP.revArr(goodArray);
        badArray = mrP.revArr(badArray);
        goodArray = mrP.shiftArr(goodArray, randomGenerator(0,10));
        badArray = mrP.shiftArr(badArray, randomGenerator(0,10));
        goodArray = mrP.revArr(goodArray);
        badArray = mrP.revArr(badArray);
        //goodArray = mrP.shiftArr(goodArray);
        //************************************************************************************************************************************

        int assist = findMinDigit(randomGenerator(Integer.MAX_VALUE, 1));
        int userStartingScore = setStartingScore(randomGenerator(Integer.MAX_VALUE, 1), assist);

        //all the characters in the game
        Single cyrus = new Single("Cyrus", 250);
        Single arina = new Single("Arina", 200);
        Single halil = new Single("Halil", 199);
        Single user = new Single("", userStartingScore);//this is the main character
        Competitor theCompetitor = new Competitor("", 0);
        int count = 0;
        int random = randomGenerator(100, 1);
        Single [] competitors = {arina, cyrus, halil};

        //generates a random competitor based on whether or not a random number divided by the score generates a
        //certain remainder.
        for(Single i: competitors){
            int number = i.getScore()%random;
            if(number == 0 || number == 1 || number == 2 || number == 3){
                theCompetitor = new Competitor(i);
                break;
            }
            if(count == 2 &&(theCompetitor.getScore() == 0)){
                theCompetitor = new Competitor(i);
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
        System.out.println("You start out with " + user.getScore() + " points");
        System.out.println("You have to follow directions and make the right choices, at the end of the game you will be told whether you won or lost based on your score. Good luck! :)");
        System.out.println("Please press any key to continue.");
        character = new Scanner(System.in);
        String enter = character.nextLine();
        System.out.println("Before the simulation begins you have to play this mini-game. This game will test you knowledge" +
                "of basic body language on a date. Please answer with \"good\" or \"bad\"");
        //the mini-game
        score = 0;
        score = mrP.goodOrBad(goodArray, badArray);
        /*goodgooddouble average = 0;
        average = mrP.avErage(mrP.getNArr());
        int mode = 0;
        mode = mrP.moDe(mrP.getNArr());
        //System.out.println(score);
        //System.out.println(mrP.getNArr());
        for (int i = 0; i < mrP.getNArr().length; i++){
            System.out.print(mrP.getNArr()[i]+" ");
        }*/

        System.out.println("Great you are now ready to enter the simulation.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        //based on how the user describes themselves they will have different situations.
        //System.out.println("In one (or two) word(s), how would you describe yourself? Choose from the following options:\nnice, Willy Wonka, attractive, weird, quirky");
        //String personality = character.nextLine();
        String personality = "";
        personality = mrP.vAnswer("In one (or two) word(s), how would you describe yourself? Choose from the following options:\nnice, Willy Wonka, attractive");
        //when the user chooses nice********************************************************************************************************************************************
        if (personality.equalsIgnoreCase("nice")) {
            //boolean validAnswer = true;
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
            user.setScore(0);
            System.out.println("\nScore: " + user.getScore());
            end(decScore(user),user);
            System.out.println(winnerLooser(user.getScore()));
        }
        //*********************************************************************************************************************************************************************

        //when the user chooses Willy Wonka as their personality***************************************************************************************************************
        if (personality.equalsIgnoreCase("Willy Wonka")) {
            boolean validAnswer = true;
            System.out.println("You signed up for Tinder and described yourself as \"Willy Wonka\".");
            System.out.println("You arrived at the restaurant and you see your date. You walk up to them and start a conversation\n" +
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
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("You and your date have been engaged in a very serious conversation about candy for about 4 hours now and your date is getting very bored.");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("Luckily, you came prepared. What conversation topic do you choose next?\n" +
                            "1.) What event has shaped your life the most?\n" +
                            "2.) What is your deepest darkest secret?\n" +
                            "3.) Talk about how your date's intelligence makes up for their lack of beauty.\n");
                    userResponse = new Scanner(System.in);
                    int answerCon = userResponse.nextInt();
                    if (answerCon == 1) {
                        System.out.println("Excellent! You had an extremely deep and insightful conversation.");
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }
                        System.out.println("You talk for hours and you had a great day. So did your date! It's now the end of the date and your chance to do something special.");
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }
                        System.out.println("How will you seize the opportunity?\n" +
                                "1.) Exchange phone numbers and arrange another date.\n" +
                                "2.) Bring out your origami toolkit and craft a rose and then gift it to your date.\n" +
                                "3.) Take your date to a party with a DJ and bust out your world-famous dance moves.\n");
                        userResponse = new Scanner(System.in);
                        int answerCon1 = userResponse.nextInt();
                        if(answerCon1==1)
                        {
                            System.out.println("Yes! You successfully exchanged phone numbers and set a reservation at the same restaurant for 8 PM that weekend.\n" +
                                    "But oh no! The phone number seems to be wrong and when you go to the restaurant that weekend, you realize you have\n" +
                                    "been stood up. Maybe your date wasn't really interested in you at all...:(");
                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException ex) {
                                Thread.currentThread().interrupt();
                            }
                            end(decScore(user), user);
                            System.out.println(winnerLooser(user.getScore()));
                            System.out.println("Congratulations you have finished the game! We hope you liked it. In all seriousness though if you feel lonely or sad that you're not\n" +
                                    "in a relationship with someone in highschool don't stress it so much. With About 50% of marriages in America ending in divorce and only 2% of\n" +
                                    "highschool relationships ending in marriage your chances of finding your true love are pretty low...");
                        }
                        if(answerCon1==2)
                        {
                            System.out.println("Your date watches in amazement as you take out your origami toolkit. They are filled with happiness once you finish\n" +
                                    "constructing the rose and giving it to them as a present. You have definitely earned yourself another date!");
                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException ex) {
                                Thread.currentThread().interrupt();
                            }
                            System.out.println("Three years later...");
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException ex) {
                                Thread.currentThread().interrupt();
                            }
                            System.out.println("You are now happily married. You have renovated your chocolate factory into an origami factory. Your origami business\n" +
                                    "venture fails and now you are broke. But hey, at least you successfully dated, right? Right?");
                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException ex) {
                                Thread.currentThread().interrupt();
                            }
                            end(decScore(user), user);
                            System.out.println(winnerLooser(user.getScore()));
                            System.out.println("Congratulations you have finished the game! We hope you liked it. In all seriousness though if you feel lonely or sad that you're not\n" +
                                    "in a relationship with someone in highschool don't stress it so much. With About 50% of marriages in America ending in divorce and only 2% of\n" +
                                    "highschool relationships ending in marriage your chances of finding your true love are pretty low...");
                        }
                        if(answerCon1==3)
                        {
                            System.out.println("Ah yes. Your \"world famous\" dance moves. It is not as good as you think, just stop. But you don't, and your date is\n" +
                                    "disgusted. You attempt to show off to your date your \"blind person\" dance routine where you dance with a blindfold on.\n" +
                                    "And you dance and dance and dance throughout the night.");
                            try {
                                Thread.sleep(7000);
                            } catch (InterruptedException ex) {
                                Thread.currentThread().interrupt();
                            }
                            System.out.println("You take your blindfold off and notice your date has left you while you were dancing. You also notice they blocked you on Tinder\n" +
                                    "It's ok. Maybe you can use this time to learn real dance moves. Ask Halil to teach you, I am sure he'll help.");
                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException ex) {
                                Thread.currentThread().interrupt();
                            }
                            end(decScore(user), user);
                            System.out.println(winnerLooser(user.getScore()));
                            System.out.println("Congratulations you have finished the game! We hope you liked it. In all seriousness though if you feel lonely or sad that you're not\n" +
                                    "in a relationship with someone in highschool don't stress it so much. With About 50% of marriages in America ending in divorce and only 2% of\n" +
                                    "highschool relationships ending in marriage your chances of finding your true love are pretty low...");
                        }
                    }
                    else if (answerCon == 2) {
                        System.out.println("Yesh. Your date just stared at you blankly, that's kind of a creepy question to ask on a first date.");
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }
                        end(decScore(user), user);
                        System.out.println("Nooo! This date is going terrible! Do something!");
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }
                        System.out.println("How will you recover and regain your date's interest?\n" +
                                "1.) Tell them about the fat German kid that drowned in your chocolate pool.\n" +//or did he get stuck in a tube or something I don't know
                                "2.) Propose and talk about wedding arrangements.\n" +
                                "3.) Too much pressure! End the date immediately and run home.\n");
                        userResponse = new Scanner(System.in);
                        int answerCon2 = userResponse.nextInt();
                        if(answerCon2==1)
                        {
                            System.out.println("Your date interrupts you. \"did you say chocolate pool?\". \"Yes\", you reply. It turns out, your date is quite fond of\n" +//wait was it a chocolate lake. I dont remember
                                    "chocolate. You take them to the factory. They start drinking directly from the pool. Then, they fall into the pool, just like\n" +//now I feel like it was a chocolate lake
                                    "that fat kid. *Sigh*. Now, you are back to square one. Time to find another date! Yay?");
                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException ex) {
                                Thread.currentThread().interrupt();
                            }
                            end(decScore(user), user);
                            System.out.println(winnerLooser(user.getScore()));
                            System.out.println("Congratulations you have finished the game! We hope you liked it. In all seriousness though if you feel lonely or sad that you're not\n" +
                                    "in a relationship with someone in highschool don't stress it so much. With About 50% of marriages in America ending in divorce and only 2% of\n" +
                                    "highschool relationships ending in marriage your chances of finding your true love are pretty low...");
                        }
                        if(answerCon2==2)
                        {
                            System.out.println("They say yes and you guys start making arrangements. You guys get married and live happily ever af...\n");
                            try {
                                Thread.sleep(4000);
                            } catch (InterruptedException ex) {
                                Thread.currentThread().interrupt();
                            }
                            System.out.println("Wait, hold on. Did you actually think this option would work? What a fool! Of course your date leaves you right then and there.\n" +
                                    "It's cool though. Maybe a golden ticket would come in really handy right about now...");
                            try {
                                Thread.sleep(4000);
                            } catch (InterruptedException ex) {
                                Thread.currentThread().interrupt();
                            }
                            end(decScore(user), user);
                            System.out.println(winnerLooser(user.getScore()));
                            System.out.println("Congratulations you have finished the game! We hope you liked it. In all seriousness though if you feel lonely or sad that you're not\n" +
                                    "in a relationship with someone in highschool don't stress it so much. With About 50% of marriages in America ending in divorce and only 2% of\n" +
                                    "highschool relationships ending in marriage your chances of finding your true love are pretty low...");
                        }
                        if(answerCon2==3)
                        {
                            System.out.println("(•_•) J-just..........Why?");
                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException ex) {
                                Thread.currentThread().interrupt();
                            }
                            end(decScore(user), user);
                            System.out.println(winnerLooser(user.getScore()));
                            System.out.println("Congratulations you have finished the game! We hope you liked it. In all seriousness though if you feel lonely or sad that you're not\n" +
                                    "in a relationship with someone in highschool don't stress it so much. With About 50% of marriages in America ending in divorce and only 2% of\n" +
                                    "highschool relationships ending in marriage your chances of finding your true love are pretty low...");
                        }
                    }
                    else if (answerCon == 3) {
                        System.out.println("Your date was outraged at your comment, and splashed water in your face.");
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }
                        end(decScore(user), user);
                        System.out.println("They are making a dash for the exit but you don't want them to leave yet!");
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }
                        System.out.println("What will you do to continue the date?\n" +//I think no matter what the user picks, they should lose score
                                "1.) Physically block them from leaving and push them back to their seat.\n" +
                                "2.) Apologize and say you didn't mean it. Ask for a second chance.\n" +
                                "3.) Say, \"it was just a prank bro.\"\n");
                        userResponse = new Scanner(System.in);
                        int answerCon3 = userResponse.nextInt();
                        if(answerCon3==1)
                        {
                            System.out.println("Nice job! You don't have a date anymore but smile a little. You have something even better. A court date! See you then!");
                            try {
                                Thread.sleep(5000);
                            } catch (InterruptedException ex) {
                                Thread.currentThread().interrupt();
                            }
                            System.out.println("You have been sentenced to life in prison.");
                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException ex) {
                                Thread.currentThread().interrupt();
                            }
                            System.out.println("Cool!");
                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException ex) {
                                Thread.currentThread().interrupt();
                            }
                            end(decScore(user), user);
                            System.out.println(winnerLooser(user.getScore()));
                            System.out.println("Congratulations you have finished the game! We hope you liked it. In all seriousness though if you feel lonely or sad that you're not\n" +
                                    "in a relationship with someone in highschool don't stress it so much. With About 50% of marriages in America ending in divorce and only 2% of\n" +
                                    "highschool relationships ending in marriage your chances of finding your true love are pretty low...");
                        }
                        else if(answerCon3==2)
                        {
                            System.out.println("Nice choice. You are finally thinking like a normal human being. Too little too late though. Your date does not forgive you\n" +
                                    "and you are single again for like the 5000th time.");
                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException ex) {
                                Thread.currentThread().interrupt();
                            }
                            System.out.println(winnerLooser(user.getScore()));
                            System.out.println("Congratulations you have finished the game! We hope you liked it. In all seriousness though if you feel lonely or sad that you're not\n" +
                                    "in a relationship with someone in highschool don't stress it so much. With About 50% of marriages in America ending in divorce and only 2% of\n" +
                                    "highschool relationships ending in marriage your chances of finding your true love are pretty low...");
                        }
                        else if(answerCon3==3)
                        {
                            System.out.println("(•_•)funny prank man. Just take the L and accept that you have ruined yet another date.");
                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException ex) {
                                Thread.currentThread().interrupt();
                            }
                            end(decScore(user), user);
                            System.out.println(winnerLooser(user.getScore()));
                            System.out.println("Congratulations you have finished the game! We hope you liked it. In all seriousness though if you feel lonely or sad that you're not\n" +
                                    "in a relationship with someone in highschool don't stress it so much. With About 50% of marriages in America ending in divorce and only 2% of\n" +
                                    "highschool relationships ending in marriage your chances of finding your true love are pretty low...");
                        }
                    }
                } else if (answer1 == 1) {
                    System.out.println("Wrong choice, you should've sat between the competitor and your date. While you were in the bathroom your competitor\n" +
                            "managed to impress your date and steal them from you. When you finally come out of the bathroom, your date apologizes and says\n" +
                            "that unfortunately it's not gonna work. Out of embarrassment you offer to pay for the meal and your date agrees. Now you don't even\n" +
                            "have money to take the taxi home and you have to walk. And of course it's raining... When you get home all of your clothes are wet and\n" +
                            "you feel sad. What a terrible day...\n");
                    try {
                        Thread.sleep(7000);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                    end(decScore(user), user);
                    System.out.println(winnerLooser(user.getScore()));
                    System.out.println("Congratulations you have finished the game! We hope you liked it. In all seriousness though if you feel lonely or sad that you're not\n" +
                            "in a relationship with someone in highschool don't stress it so much. With About 50% of marriages in America ending in divorce and only 2% of\n" +
                            "highschool relationships ending in marriage your chances of finding your true love are pretty low...");
                } else if (answer1 == 3) {
                    System.out.println("OHHHH nooo!! You decide to throw the onion at your competitor and completely forget that for the past\n" +
                            "2 months you have actually stuck to your diet and been working out. So when you throw the onion you end up hitting them\n" +
                            "pretty bad right in the face. Soon the police is called and you get taken to jail.\n");

                    end(decScore(user), user);
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
                                "play any tricks on you or take any of your stuff(because you always have to assume people are jerks...)");
                        try {
                            Thread.sleep(7000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }
                        System.out.println("You survive the night, the next day your dad bails you out of jail and you go home. You decide to never go on a date again...\n");
                        end(decScore(user), user);
                        System.out.println(winnerLooser(user.getScore()));
                        System.out.println("Congratulations you have finished the game! We hope you liked it. In all seriousness though if you feel lonely and sad that you're not\n" +
                                "in a relationship with someone in highschool don't stress it so much. With About 50% of marriages in America ending in divorce and only 2% of\n" +
                                "highschool relationships ending in marriage your chances of finding your true love in highschool are pretty low...");
                    }
                    if (answer2 == 2) {
                        System.out.println("Wrong choice, when you lie down on the bench or cot without saying anything you're not showing dominance\n" +
                                "you're giving your fellow inmates a reason to pick on you or claim that you're lying down on their bunk.");
                        try {
                            Thread.sleep(7000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }
                        System.out.println("As you lie down on the bench, someone comes up to you and tells you that it's their spot. You're too tired to argue so you get\n" +
                                "up, but for the rest of the time there people call you \"stinky socks\" because you left them lying out beside the bench when you went to sleep.\n");
                        System.out.println("The next day your dad bails you out of jail and you get to go home. On the way home you ask him to drive you to the store to get new socks.\n");
                        try {
                            Thread.sleep(7000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }
                        end(decScore(user), user);
                        System.out.println(winnerLooser(user.getScore()));
                        System.out.println("Congratulations you have finished the game! We hope you liked it. In all seriousness though if you feel lonely or sad that you're not\n" +
                                "in a relationship with someone in highschool don't stress it so much. With About 50% of marriages in America ending in divorce and only 2% of\n" +
                                "highschool relationships ending in marriage your chances of finding your true love are pretty low...");
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
                        System.out.println("The next day your dad bails you out of jail and you get to go home. When you make it home you realize that you took the wrong toothbrush...\n");
                        end(decScore(user), user);
                        System.out.println(winnerLooser(user.getScore()));
                        System.out.println("Congratulations you have finished the game! We hope you liked it. In all seriousness though if you feel lonely or sad that you're not\n" +
                                "in a relationship with someone in highschool don't stress it so much. With About 50% of marriages in America ending in divorce and only 2% of\n" +
                                "highschool relationships ending in marriage your chances of finding your true love are pretty low...");
                    }
                }
            }
            if (serius.equalsIgnoreCase("No")) {
                System.out.println("OH NO! The situation was in fact VERY SERIOUS. Your date has left with the competitor, and the bill was 123 times more expensive than you thought it would be! ");
                end(user.getScore(), user);
                if (user.getScore() == 0) {
                    System.out.println(winnerLooser(user.getScore()));
                    System.out.println("Congratulations you have finished the game! We hope you liked it. In all seriousness though if you feel lonely or sad that you're not\n" +
                            "in a relationship with someone in highschool don't stress it so much. With About 50% of marriages in America ending in divorce and only 2% of\n" +
                            "highschool relationships ending in marriage your chances of finding your true love are pretty low...");
                }
            }

            //*********************************************************************************************************************************************************************
        }
        //when the user describes themselves as "attractive"*******************************************************************************************************************
        if (personality.equalsIgnoreCase("attractive")) {
            //validAnswer = true;
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
                    attSits.nextSitForAtt12(answerAtt12,user);
                }
                if(answerAtt1==3)
                {
                    int answerAtt13 = userResponseAtt.nextInt();
                    attSits.nextSitForAtt13(answerAtt13,user);
                }
            }
            if(answerAtt==2)
            {
                int answerAtt2 = userResponseAtt.nextInt();
                attSits.nextSitForAtt2(answerAtt2, user);
                if(answerAtt2==1)
                {
                    int answerAtt21 = userResponseAtt.nextInt();
                    attSits.nextSitForAtt21(answerAtt21,user);
                }
                if(answerAtt2==2)
                {
                    int answerAtt22 = userResponseAtt.nextInt();
                    attSits.nextSitForAtt22(answerAtt22,user);
                }
                if(answerAtt2==3)
                {
                    int answerAtt23 = userResponseAtt.nextInt();
                    attSits.nextSitForAtt23(answerAtt23,user);
                }
            }
            if(answerAtt==3)
            {
                int answerAtt3 = userResponseAtt.nextInt();
                attSits.nextSitForAtt3(answerAtt3, user);
                if(answerAtt3==1)
                {
                    int answerAtt31 = userResponseAtt.nextInt();
                    attSits.nextSitForAtt31(answerAtt31,user);
                }
                if(answerAtt3==2)
                {
                    int answerAtt32 = userResponseAtt.nextInt();
                    attSits.nextSitForAtt32(answerAtt32,user);
                }
                if(answerAtt3==3)
                {
                    int answerAtt33 = userResponseAtt.nextInt();
                    attSits.nextSitForAtt33(answerAtt33,user);
                }
            }
        }
        //*********************************************************************************************************************************************************************
    }

}
