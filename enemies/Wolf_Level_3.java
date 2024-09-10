
package enemies;

import javafx.scene.image.Image;
import rpg.Global;

public class Wolf_Level_3 extends Enemy{
    
    public Wolf_Level_3(){
        
        enemyName = "Wolf";
        enemyStartingHealth = 70;
        enemyCurrentHealth = enemyStartingHealth;
        
        awardedXP = 14;
        awardedGold = 3;
        
        enemyCriticalHitChance = 5;
        enemyDodgeChance = 5;
        
        enemyBasicHitDamage = 17;
        
        enemyLevel = 3;
        
        enemyHitChance = 5;
        
        enemyArmor = 13;
    }
    
    public void awardQuestItems(){
        
        if(Global.player.quest != null && Global.player.quest.name.equals("Gathering Trophies")){
            Global.player.questCounter++;
        }
    }
    
    @Override
    public void loadImage() throws Exception{
        
        enemyImage = new Image("imgs\\enemyImgs\\Wolf.jpeg");
        
    }
    
}
