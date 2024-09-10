
package enemies;

import javafx.scene.image.Image;
import rpg.Global;

public class Bandit_Smuggler_Level_6 extends Enemy{
    
     public Bandit_Smuggler_Level_6(){
         
        enemyName = "Bandit Smuggler";
        enemyStartingHealth = 90;
        enemyCurrentHealth = enemyStartingHealth;
        
        awardedXP = 22;
        awardedGold = 6;
        
        enemyCriticalHitChance = 10;
        enemyDodgeChance = 15;
        
        enemyBasicHitDamage = 22;
        
        enemyLevel = 6;
        
        enemyHitChance = 5;
        
        enemyArmor = 22;
        
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
