
package quests;

public class The_Bandit_Leader extends Quest{
    
    public The_Bandit_Leader(){
        
        name = "The Bandint Leader";
        awardedXP = 110;
        awardedGold = 30;
        
        requirements = 1;
        type = "Killing";
        enemyName = "Duncan The Warlord";
        progressionType = "Zone";
    }
    
}
