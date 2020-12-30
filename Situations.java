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
    //All the remaining are third if there are two digits after attractiveUPAYO. The rest will be the endings.
    String attractiveUPAYO21 = "Hey, that was smart! Usually, asking outright leads to awkward moments and swift rejections, but how can "
      + "anyone reject someone with such good looks? Anyways, they said yes and you took them out to a restaurant called Sofa King for a "
      + "date. But wait a minute, what is that smell? You realize that you put on the wrong undershirt and now, you stink! Luckily, your date "
      + "hasn't noticed yet, but it is only a matter of time. What do you do next?\n1. Keep your distance for the whole date and hope for the "
      + "best.\n2. Excuse yourself and escape through the bathroom window. From there, make a run for the nearest drugstore and buy the best-"
      + "looking perfume.\n3. End the date immediately and run home.(Your personal image is more important than a crush, after all)";
    String attractiveUPAYO22 = "You know what? That was a sensible choice. However, your \"subtle hints\" did not work and now, your crush has "
      + "a partner. I guess the lesson we can learn from this is to be direct and brave. How will you get your crush back?\n1. Follow the "
      + "relationship very closely and make your move when they break up.\n2. Sabotage the relationship by spreading false rumors. \n3. Talk "
      + "to your crush and tell them how you truly feel.";
    String attractiveUPAYO23 = "Woah, woah, woah. Hold your horses! You can't just do that. Your crush is overwhelmed with surprise and "
      + "just leaves without answering your question. You are humiliated. No one thinks of you as an attractive person anymore, they just "
      + "think of you as 'the pervert'. How will you restore your reputation? \n1. Make a public apology through your social media.\n2. "
      + "Try to justify the situation by saying you were playing truth or dare with your friends and they dared you and you had to do it to "
      + "win the game.\n3. Commit wire fraud.";
    String attractiveUPAYO31 = "This choice does seem like a pretty great one but don't forget, we are talking about the internet. No one has "
      + "forgiven you. You still get clown emojis in your messages. You are fed up with this. What do you do?\n1. Stop using social media for "
      + "a few weeks.\n2. Try to explain the situation from your perspective.\n3. Start an online bullying campaign against this so-called "
      + "\"social media influencer\".";
    String attractiveUPAYO32 = "Hey, this is the correct choice! By saying undecipherable stuff, you give off weird vibes and now, no one "
      + "messes with you. However, there is a downside to being so weird. Now, no one thinks of you as the attractive one in their class. They "
      + "see you as the weird kid and they fear you. No one wants to be your friend. How do you fix this?\n1. Embrace this new weird kid mentality."
      + "\n2. Attend that party your \"friend\" was begging you to go with. \n3. Transfer schools.";
    String attractiveUPAYO33 = "Are you trolling right now? What exactly do you plan to accomplish by faking your death? You eventually have to go "
      + "to school. Also, the principal of your school was notified of this \"suicide note\" and contacted your parents. Your parents grounded you "
      + "for a year. After a few months, you learn from your friend about this great party and you hear your crush will be there. The party is at "
      + "11:00 PM. Problem is, you are still grounded and your parents still haven't forgotten the incident. How do you escape?\n1. You don't escape. "
      + "You accept your punishment.\n2. Escape through the window and hope your parents don't wake up and check on you.\n3. Join the party "
      + "through Zoom.";
    //All the endings. I am assuming they will be about a sentence or two each. Or they will be about a paragraph depending on what I decide.
    String attractiveUPAYO111 = "Wow you handled that so bad, your reputation is ruined.";
    String attractiveUPAYO112 = "They don't stop calling you, driving you deeper and deeper into madness; the restrating order has not helped.";
    String attractiveUPAYO113 = "";
    String attractiveUPAYO121 = "";
    String attractiveUPAYO122 = "";
    String attractiveUPAYO123 = "";
    String attractiveUPAYO131 = "";
    String attractiveUPAYO132 = "";
    String attractiveUPAYO133 = "";
    String attractiveUPAYO211 = "";
    String attractiveUPAYO212 = "";
    String attractiveUPAYO213 = "";
    String attractiveUPAYO221 = "";
    String attractiveUPAYO222 = "";
    String attractiveUPAYO223 = "";
    String attractiveUPAYO231 = "";
    String attractiveUPAYO232 = "";
    String attractiveUPAYO233 = "";
    String attractiveUPAYO311 = "";
    String attractiveUPAYO312 = "";
    String attractiveUPAYO313 = "";
    String attractiveUPAYO321 = "";
    String attractiveUPAYO322 = "";
    String attractiveUPAYO323 = "";
    String attractiveUPAYO331 = "";
    String attractiveUPAYO332 = "";
    String attractiveUPAYO333 = "";
    
    
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
    
    public String nextSitForAtt2(int a)
    {
      if(a==1)
      {
        return attractiveUPAYO21;
      }
      if(a==2)
      {
        return attractiveUPAYO22;
      }
      if(a==3)
      {
        return attractiveUPAYO23;
      }
        return "Teddy bears are the greatest gifts known to mankind"; //ignore this I had to write something
    }
    
    public String nextSitForAtt3(int a)
    {
      if(a==1)
      {
        return attractiveUPAYO31;
      }
      if(a==2)
      {
        return attractiveUPAYO32;
      }
      if(a==3)
      {
        return attractiveUPAYO33;
      }
        return "Teddy bears are the greatest gifts known to mankind"; //ignore this I had to write something
    }
    //All methods below this are for the endings. These haven't been used in the main method yet.
    public String nextSitForAtt11(int a)
    {
      if(a==1)
      {
        return attractiveUPAYO111;
      }
      if(a==2)
      {
        return attractiveUPAYO112;
      }
      if(a==3)
      {
        return attractiveUPAYO113;
      }
        return "Teddy bears are the greatest gifts known to mankind"; //ignore this I had to write something
    }
    
    public String nextSitForAtt12(int a)
    {
      if(a==1)
      {
        return attractiveUPAYO121;
      }
      if(a==2)
      {
        return attractiveUPAYO122;
      }
      if(a==3)
      {
        return attractiveUPAYO123;
      }
        return "Teddy bears are the greatest gifts known to mankind"; //ignore this I had to write something
    }
    
    public String nextSitForAtt13(int a)
    {
      if(a==1)
      {
        return attractiveUPAYO131;
      }
      if(a==2)
      {
        return attractiveUPAYO132;
      }
      if(a==3)
      {
        return attractiveUPAYO133;
      }
        return "Teddy bears are the greatest gifts known to mankind"; //ignore this I had to write something
    }
    
    public String nextSitForAtt21(int a)
    {
      if(a==1)
      {
        return attractiveUPAYO211;
      }
      if(a==2)
      {
        return attractiveUPAYO212;
      }
      if(a==3)
      {
        return attractiveUPAYO213;
      }
        return "Teddy bears are the greatest gifts known to mankind"; //ignore this I had to write something
    }
    
    public String nextSitForAtt22(int a)
    {
      if(a==1)
      {
        return attractiveUPAYO221;
      }
      if(a==2)
      {
        return attractiveUPAYO222;
      }
      if(a==3)
      {
        return attractiveUPAYO223;
      }
        return "Teddy bears are the greatest gifts known to mankind"; //ignore this I had to write something
    }
    
    public String nextSitForAtt23(int a)
    {
      if(a==1)
      {
        return attractiveUPAYO231;
      }
      if(a==2)
      {
        return attractiveUPAYO232;
      }
      if(a==3)
      {
        return attractiveUPAYO233;
      }
        return "Teddy bears are the greatest gifts known to mankind"; //ignore this I had to write something
    }
    
    public String nextSitForAtt31(int a)
    {
      if(a==1)
      {
        return attractiveUPAYO311;
      }
      if(a==2)
      {
        return attractiveUPAYO312;
      }
      if(a==3)
      {
        return attractiveUPAYO313;
      }
        return "Teddy bears are the greatest gifts known to mankind"; //ignore this I had to write something
    }
    
    public String nextSitForAtt32(int a)
    {
      if(a==1)
      {
        return attractiveUPAYO321;
      }
      if(a==2)
      {
        return attractiveUPAYO322;
      }
      if(a==3)
      {
        return attractiveUPAYO323;
      }
        return "Teddy bears are the greatest gifts known to mankind"; //ignore this I had to write something
    }
    
    public String nextSitForAtt33(int a)
    {
      if(a==1)
      {
        return attractiveUPAYO331;
      }
      if(a==2)
      {
        return attractiveUPAYO332;
      }
      if(a==3)
      {
        return attractiveUPAYO333;
      }
        return "Teddy bears are the greatest gifts known to mankind"; //ignore this I had to write something
    }
}
