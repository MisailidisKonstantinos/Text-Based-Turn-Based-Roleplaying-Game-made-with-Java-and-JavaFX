
package quests;

public class Tamed_But_Still_Wild extends Quest{
    
    public Tamed_But_Still_Wild(){
       
        name = "Tamed But Still Wild";
        awardedXP = 70;
        awardedGold = 20;
        
        requirements = 6;
        type = "Killing";
        enemyName = "Tamed Wolf";
        progressionType = "Quest";
    }
    
}
