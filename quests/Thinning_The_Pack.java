
package quests;

public class Thinning_The_Pack extends Quest{
    
    public Thinning_The_Pack(){
        
        name = "Thinning The Pack";
        awardedXP = 25;
        awardedGold = 15;
        
        requirements = 8;
        type = "Killing";
        enemyName = "Wolf";
        progressionType = "Quest";
        
        activated = false;
        finished = false;
        
    }
    
}
