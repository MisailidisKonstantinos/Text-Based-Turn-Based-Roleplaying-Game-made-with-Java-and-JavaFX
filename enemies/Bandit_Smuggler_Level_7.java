
package enemies;

import javafx.scene.image.Image;
import rpg.Global;

public class Bandit_Smuggler_Level_7 extends Enemy{
    
    public Bandit_Smuggler_Level_7(){
        
        enemyName = "Bandit Smuggler";
        enemyStartingHealth = 100;
        enemyCurrentHealth = enemyStartingHealth;
        
        awardedXP = 24;
        awardedGold = 6;
        
        enemyCriticalHitChance = 10;
        enemyDodgeChance = 15;
        
        enemyBasicHitDamage = 24;
        
        enemyLevel = 7;
        
        enemyHitChance = 5;
        
        enemyArmor = 24;
        
    }
    
    public void awardQuestItems(){
         
         if(Global.player.quest != null && Global.player.quest.name.equals("Smuggling The Smugglers")){
             Global.player.questCounter ++;
         }
     }
    
    @Override
    public void loadImage() throws Exception{
        
        enemyImage = new Image("imgs\\enemyImgs\\Bandit Smuggler.jpeg");
        
    }
    
}
