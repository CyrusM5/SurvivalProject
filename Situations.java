public class Situations {
    //story is a string that we can write for what happens... we then just put it as one of the parameters
    //in the constructor

    //storyNum is the number of the situation, I thought we could use this so that when we randomly generate them
    //it would be easier, though I'm not sure it will work like that since we randomly generate only specific stories.
    //either way we could delete it later.


    String comp = "Oh no! A competitor has arrived!";
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
    
    //I decided to do my situations here for now because the main class has started to look really messy.
    //All the situations for attractive personality and how it will be ordered.
    //I think the narrator has gotta have some swagger and personality.
    //I didn't really look at the book at all when making these situations. I don't think I did anything illegal. The book is trash anyways.
    //Noooooooo, I am just kidding! The book is great (although it has proven to be useless) but just amazing!
    //1st situation
    String attractiveUglyPersonAsksYouOut = "Here you are, sitting at the library. You really seem to enjoy that dictionary. But then"
      + " you notice a person approaching you. Be wary, as this person is prone to fits of rage and yelling. The person asks you out."
      + " You appreciate the gesture, but you don't feel the same way. You say:\n1.\"Yes, I've been waiting for you to ask me that forever.\""
      + "\n2.\"You are a great and lovely person but we just are not meant to be.\"\n3.\"I'm going to be honest. We are not compatible.\"";
    //2nd situation
    String attractiveUPAYO1 = "That was a terrible choice. Now, you have spent 2 miserable weeks and you hate how this person never "
      + "thinks. You suspect they have no filter between though and speech. You decide to break up with them. But how?\n1. You treat the person to a nice "
      + "3-meal course. At the end, you say all the usual break-up \"It's not you, it's me and blah blah....\" and you break up!"
      + "\n2. Hey, it is December 24th! So, if you break up now, over text, they'll get over it by the time schools open up and "
      + "you see them again!\n3. Meet with them face-to-face and tell them straight up that you will not date them.";
    //Also 2nd situation
    String attractiveUPAYO2 = "Now, that's what I call a pro. You have mastered the skill of smooth-talking. The person took it well. "
      + "The truth is, you only like one person in the entire school. Now, with the extra ego that came with the rejection, you decide "
      + "to ask out the person you like. How do you do it?\n1. You ask them outright. \n2. You become their friend and try to drop subtle "
      + "hints while talking to them.\n3. You kiss them outright and you ask \"I would love to date you\" while pointing at "
      + "yourself.";
    //Also 2nd situation
    String attractiveUPAYO3 = "You idiot. You didn't know at the time, but this person was a HUUUUGE social media influencer with 2,345 "
      + "FOLLOWERS. That's more than the entire graduating class! They also have 18 bestfriends! Now, "
      + "they are coming for you. Your DMs are full of clown emojis! You act like you don't care but really, you are deeply hurt :( "
      + "\nWhat do you do to stop this?\n1. Make a public apology and say you were wrong.\n2. Start posting in "
      + "Cuneiform, the earliest known system of writing. \n3. Call you representative or senator and ask for them to vouche for you.";
    //3rd situation
    String attractiveUPAYO11 = "HAHAHAHA! They got a good laugh out of that one! The person thought you were joking! Seriously, who spends $80 "
      + "just to break up. I am dying of laughter! If only, I was as attractive as you. At least I am not as dumb. HAHAHHA! Now you are in a "
      + "bit of a pickle. Alright, I'll help you out. Imagine that I set out the perfect time and place. All you have to say is the phrase that "
      + "will successfully end the relationship. What do you say?\n1.\"I don't like you, we should definitely be better off apart! Good-bye!\"\n2.\"I "
      + "prefer if we took a break for some time. I will call you but for now, adios...\"\n3.\"I'm not sure if this can work anymore. "
      + "I want to be alone.\"";
    //Yes also 3rd situation
    String attractiveUPAYO12 = "WOAH! I am mindblown! This worked! I am just kidding. Of course it didn't work, are you dumb? This person is "
      + "an actual social media influencer! They called you out publicly and posted 8 times about how terrible you were and how they are depressed "
      + "now. All their fans are coming for you! Your DMs are full of clown emojis! You act like you don't care but really, you are deeply hurt :( "
      + "\nWhat do you do to stop this?\n1. Make a public apology and say you were wrong.\n2. Start posting in "
      + "Cuneiform, the earliest known system of writing. \n3. Call you representative or senator and ask for them to vouche for you.";
    //Yes. Yet another 3rd situation.
    String attractiveUPAYO13 = "Ok, I think that went well. They seem, sad-ish but it's all rad-ish! Hey, this is weird: The person that you "
      + "rejected has called you 18 times while you were asleep. Oh no, this seems like a classic case of an obsessive ex. Sorry to tell you, "
      + "but it doesn't seem like it's stopping anytime soon. What do you do?\n1. DM them:\"AHHHHHHHH! STOOOOP! please?\"\n2. Meet with them "
      + "and try to reason and say you don't want them to call you anymore.\n3. Tell them you will call the authorities next time they call "
      + "you or contact you in any way.";
    //All the remaining are third if there are two digits after attractiveUPAYO. The rest will be the endings.
    String attractiveUPAYO21 = "Hey, that was smart! Usually, asking outright leads to awkward moments and swift rejections, but how can "
      + "anyone reject someone with such good looks? Anyways, they said yes and you took them out to a restaurant called Subway for a "
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
      + "think of you as 'the creep'. How will you restore your reputation? \n1. Make a public apology through your social media.\n2. "
      + "Try to justify the situation by saying you were playing truth or dare with your friends and they dared you and you had to do it to "
      + "win the game.\n3. Commit wire fraud.";
    String attractiveUPAYO31 = "This choice does seem like a pretty great one but don't forget, we are talking about the internet. No one has "
      + "forgiven you. You still get clown emojis in your messages. You are fed up with this. What do you do?\n1. Stop using social media for "
      + "a few weeks.\n2. Try to explain the situation from your perspective.\n3. Start posting cooking tutortials as a distraction. ";
    String attractiveUPAYO32 = "Hey, this is the correct choice! By posting in cuneiform, you give off weird and confusing vibes and now, no one "
      + "messes with you. However, there is a downside to being so weird. Now, no one thinks of you as the attractive one in their class. They "
      + "see you as the weird kid and they fear you. No one wants to be your friend. How do you fix this?\n1. Embrace this new weird kid mentality."
      + "\n2. Attend that party your \"friend\" was begging you to go with. \n3. Transfer schools.";
    String attractiveUPAYO33 = "Are you trolling right now? What exactly do you plan to accomplish by calling a government represenatitve? They have more important problems to deal with! You eventually have to go "
      + "to school. Also, the principal of your school was notified of this \"waste of precious congressional time\" and contacted your parents. Your parents grounded you "
      + "for a year. After a few months, you learn from your friend about this great party and you hear your crush will be there. The party is at "
      + "11:00 PM. Problem is, you are still grounded and your parents still haven't forgotten the incident. How do you escape?\n1. You don't escape. "
      + "You accept your punishment.\n2. Escape through the window and hope your parents don't wake up and check on you.\n3. Join the party "
      + "through Zoom.";
    //All the endings. I am assuming they will be about a sentence or two each. Or they will be about a paragraph depending on what I decide.
    String attractiveUPAYO111 = "Wow you handled that so bad, your reputation is ruined.";
    String attractiveUPAYO112 = "They don't stop calling you, driving you deeper and deeper into madness; the restrating order has not helped.";
    String attractiveUPAYO113 = "Your partner is upset, but they understand. You part on decent terms.";
    String attractiveUPAYO121 = "Though you don't stop everyone, the majority of people see that you have truly had time to reflect, and have stopped the harrassement.";
    String attractiveUPAYO122 = "Everyone is really confused; some decide to leave you alone, but most see it as the distraction it is, and continue.";
    String attractiveUPAYO123 = "You called your representative, and they were infruiated that you wasted their time with such trivial matters. You are now on a political blacklist.";
    String attractiveUPAYO131 = "This does not work, the messages continue.";
    String attractiveUPAYO132 = "Though it took over 2 1/2 hours, your ex finally understood the situation, and you have not heard from them in the past 12 days.";
    String attractiveUPAYO133 = "This is also a good option, as after you alert the authorities and the situation is explained to you and your ex, your ex reliquishes.";
    String attractiveUPAYO211 = "Your date did not smell you, but was perplexed why you kept your distance. However, they still enjoyed your time together, and would like to try another date.";
    String attractiveUPAYO212 = "You took too long and your date assumed you abandoned them, so they are refusing to return your calls, and are leaving you on read.";
    String attractiveUPAYO213 = "Your date started to cry because they assumed you ended the date because of them. A+ job on insensitivity.";
    String attractiveUPAYO221 = "You waste precious months of your life, and when you get your chance your crush sees that you are taking advantage of them, and ends the friendship.";
    String attractiveUPAYO222 = "Your rumors ended their relationship as well making your crush very upset. You feel absolutely horrible.";
    String attractiveUPAYO223 = "They tell you they like you too, but would like to remain friends. Though you are disappointed, you are happy to keep the friendship.";
    String attractiveUPAYO231 = "Though you are not forgiven, people now understand and see your remorce.";
    String attractiveUPAYO232 = "You are immediately called out, and you are now getting the silent treatment from most.";
    String attractiveUPAYO233 = "On top of being creepy, you are now facing up to 20 to 30 years in prison.";
    String attractiveUPAYO311 = "You feel much better phyiscally and mentally, and most of the heat has died down. Although many are aphrehensive of you, you are ready to live again.";
    String attractiveUPAYO312 = "Oh no, not the best idea. Most people believe that you are trying to shift the blame onto your ex, and the clown emojis continue.";
    String attractiveUPAYO313 = "You are accused of deflecting(which you are), people now start to explain to you the impact your words have, and you slowly gain perspective. ";
    String attractiveUPAYO321 = "Good choice! Though you are not as popular as you used to be, you find it freeing to embrace the weirder parts of yourself. You also meet some cool new people you wouldn't had met otherwise.";
    String attractiveUPAYO322 = "It isn't as bad as you thought, thankfully, but everyone just calls you weird when you try to talk to them, and you're kinda bumded out/";
    String attractiveUPAYO323 = "You felt like you had become a pariah, so you transfer schools, hope you feel better and more at peace.";
    String attractiveUPAYO331 = "Well, this is the least fun option, but it is right. You know what you did was kinda dumb, and you just need to learn and heal from it.";
    String attractiveUPAYO332 = "Wow, this is terrible. Not only are you risking contracting Covid-19, but your parents found out, and now all Internet privlages are taken away as well. Nice going, kid.";
    String attractiveUPAYO333 = "Hey, you're able to hang out with friends, you're not putting yourself or your family at risk, and your not technically breaking your punishment >:)";
    
    
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
