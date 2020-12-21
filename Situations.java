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
}