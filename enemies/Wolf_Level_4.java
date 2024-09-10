
package enemies;

import javafx.scene.image.Image;
import rpg.Global;

public class Wolf_Level_4 extends Enemy{
    
    public Wolf_Level_4(){
        
        enemyName = "Wolf";
        enemyStartingHealth = 80;
        enemyCurrentHealth = enemyStartingHealth;
        
        awardedXP = 16;
        awardedGold = 3;
        
        enemyCriticalHitChance = 5;
        enemyDodgeChance = 5;
        
        enemyBasicHitDamage = 20;
        
        enemyLevel = 4;
        
        enemyHitChance = 5;
        
        enemyArmor = 14;
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
