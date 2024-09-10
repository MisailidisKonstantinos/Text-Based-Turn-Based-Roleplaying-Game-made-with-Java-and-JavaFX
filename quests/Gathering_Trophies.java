
package quests;

public class Gathering_Trophies extends Quest{
    
    public Gathering_Trophies(){
        
        name = "Gathering Trophies";
        awardedXP = 25;
        awardedGold = 15;
        
        requirements = 5;
        progressionType = "Quest";
        
        activated = false;
        finished = false;
        
    }
    
}
