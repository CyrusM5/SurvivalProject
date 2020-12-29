public class Situations {
    //story is a string that we can write for what happens... we then just put it as one of the parameters
    //in the constructor

    //storyNum is the number of the situation, I thought we could use this so that when we randomly generate them
    //it would be easier, though I'm not sure it will work like that since we randomly generate only specific stories.
    //either way we could delete it later.


    String comp = "Oh no! A competitor has arrived!";
    String panic = "Oh no! You're having a panic attack!";
    String breakdown = "Oh no! You're on the verge of a nervous breakdown!";
    String honeymoon1 = "Oh no! Your spouse suffered extreme sunburn!";
    String honeymoon2 = "Oh no! Your spouse suffered an acute tounge injury!";
    String anniversary = "Oh no! You forgot your anniversary!";
    private String iIncident;
    private String character;
    public static int storyScore;
    public Situations(String a, String b){
        this.iIncident = a;
        this.character = b;
        storyScore = 0;
    }
    public String toStringComp(){
        return this.character + ", " + this.iIncident + " " + comp;
    }
    public String toStringPanic(){
        return this.character + ", " + this.iIncident + " " + panic;
    }
    public String toStringBreak(){
        return this.character + ", " + this.iIncident + " " + breakdown;
    }
    public String toStringHoneymoon1(){
        return this.character + ", " + this.iIncident + " " + honeymoon1;
    }
    public String toStringHoneymoon2(){
        return this.character + ", " + this.iIncident + " " + honeymoon2;
    }
    public String toStringAnniversary(){
        return this.character + ", " + this.iIncident + " " + anniversary;
    }
    //anniversary
    
    //I decided to do my situations here for now because the main class has started to look really messy.
    //All the situations for attractive personality and how it will be ordered.
    //I think the narrator has gotta have some swagger and personality.
    //I didn't really look at the book at all when making these situations. I don't think I did anything illegal. The book is trash anyways.
    //Noooooooo, I am just kidding! The book is great (although it has proven to be useless) but just amazing!
    //1st situation
    String attractiveUglyPersonAsksYouOut = "Here you are, sitting at the library. You really seem to enjoy that dictionary. But then"
      + " you notice a person approaching you. Be wary, as this person is prone to fits of rage and yelling. The person asks you out."
      + " You appreciate the gesture, but you don't feel the same way. You say:\n1.\"Yes, I've been waiting for you to ask me that forever.\""
      + "\n2.\"You are a great and lovely person but we just are not meant to be.\"\n3.\"I'm going to be honest. You ugly as hell.\"";
    //2nd situation
    String attractiveUPAYO1 = "That was a terrible choice. Now, you have spent 2 miserable weeks and you hate how this person never "
      + "thinks. You suspect they are mentally retarded. You decide to break up with them. But how?\n1. You treat the person to a nice "
      + "3-meal course. At the end, you say all the usual break-up \"It's not you, it's me and blah blah....\" and you break up!"
      + "\n2. Hey, it is December 24th! So, if you break up now, over text, they'll get over it by the time schools open up and "
      + "you see them again!\n3. Meet with them face-to-face and tell them straight up that you will not date them.";
    //Also 2nd situation
    String attractiveUPAYO2 = "Now, that's what I call a pro. You have mastered the skill of smooth-talking. The person took it well. "
      + "The truth is, you only like one person in the entire school. Now, with the extra ego that came with the rejection, you decide "
      + "to ask out the person you like. How do you do it?\n1. You ask them outright. \n2. You become their friend and try to drop subtle "
      + "hints while talking to them.\n3. You kiss them outright and you ask \"How would you like to be with me, baby?\" while pointing at "
      + "yourself.";
    //Also 2nd situation
    String attractiveUPAYO3 = "You idiot. You didn't know at the time, but this person was a HUUUUGE social media influencer with 2,374 "
      + "FOLLOWERS. That's more than the entire graduating class! They also have 18 bestfriends! Now, they have started a witch hunt and "
      + "they are coming for you buddy. Your DMs are full of clown emojis! You act like you don't care but really, you are deeply hurt :( "
      + "\nWhat do you do to stop this?\n1. Make a public apology and say you were wrong.\n2. Start saying some cryptic undecipherable weird "
      + "stuff. \n3. Type up a suicide letter and post it and lay low for a while.";
    //3rd situation
    String attractiveUPAYO11 = "HAHAHAHA! They got a good laugh out of that one! The person thought you were joking! Seriously, who spends $80 "
      + "just to break up. I am dying of laughter! If only, I was as attractive as you. At least I am not as dumb. HAHAHHA! Now you are in a "
      + "bit of a pickle. Alright, I'll help you out. Imagine that I set out the perfect time and place. All you have to say is the phrase that "
      + "will successfully end the relationship. What do you say?\n1.\"I don't like you, you fat cow! Get the hell out of my life!\"\n2.\"I "
      + "prefer if we took a break for some time. I will call you but for now, adios...\"\n3.\"I'm not sure if this can work anymore. "
      + "I want to be alone.\"";
    //Yes also 3rd situation
    String attractiveUPAYO12 = "WOAH! I am mindblown! This worked! I am just kidding. Of course it didn't work, are you dumb? This person is "
      + "an actual social media influencer! They called you out publicly and posted 8 times about how terrible you were and how they are depressed "
      + "now. All their fans are coming for you! Your DMs are full of clown emojis! You act like you don't care but really, you are deeply hurt :( "
      + "\nWhat do you do to stop this?\n1. Make a public apology and say you were wrong.\n2. Start saying some cryptic undecipherable weird "
      + "stuff. \n3. Type up a suicide letter and post it and lay low for a while.";
    //Yes. Yet another 3rd situation.
    String attractiveUPAYO13 = "Ok, I think that went well. They seem, sad-ish but it's all rad-ish! Hey, this is weird: The person that you "
      + "rejected has called you 18 times while you were asleep. Oh no, this seems like a classic case of an obsessive ex. Sorry to tell you, "
      + "but it doesn't seem like it's stopping anytime soon. What do you do?\n1. DM them:\"AHHHHHHHH! STOOOOP! please?\"\n2. Meet with them "
      + "and try to reason and say you don't want them to call you anymore.\n3. Tell them you will call the authorities next time they call "
      + "you or contact you in any way.";
    //Still have to do the 3rd situation for the other 6 possibilities but not now
    //Now, the methods so that I can actually call these in the main class
    public String toStringAttractive()
    {
      return attractiveUglyPersonAsksYouOut;
    }
    
    public String nextSitForAtt(int a)
    {
      if(a==1)
      {
        return attractiveUPAYO1;
      }
      if(a==2)
      {
        return attractiveUPAYO2;
      }
      if(a==3)
      {
        return attractiveUPAYO3;
      }
        return "Teddy bears are the greatest gifts known to mankind"; //ignore this I had to write something
    }
    
    public String nextSitForAtt1(int a)
    {
      if(a==1)
      {
        return attractiveUPAYO11;
      }
      if(a==2)
      {
        return attractiveUPAYO12;
      }
      if(a==3)
      {
        return attractiveUPAYO13;
      }
     return "I love teddy bears especially human sized ones"; //ignore this I had to write something 
    }
}
