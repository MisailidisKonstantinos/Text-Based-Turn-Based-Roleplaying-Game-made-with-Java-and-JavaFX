
package quests;

public class The_Mother_Of_Wolves extends Quest{
    
    public The_Mother_Of_Wolves(){
        
        name = "The Mother Of Wolves";
        awardedXP = 35;
        awardedGold = 20;
        
        requirements = 1;
        type = "Killing";
        enemyName = "Den Mother";
        progressionType = "Subzone";
        
        activated = false;
        finished = false;
    }
}
