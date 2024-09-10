
package enemies;

import javafx.scene.image.Image;

public class Bandit_Cutthroat_Level_5 extends Enemy{
    
    public Bandit_Cutthroat_Level_5(){
        
        enemyName = "Bandit Cutthroat";
        enemyStartingHealth = 80;
        enemyCurrentHealth = enemyStartingHealth;
        
        awardedXP = 20;
        awardedGold = 5;
        
        enemyCriticalHitChance = 10;
        enemyDodgeChance = 15;
        
        enemyBasicHitDamage = 20;
        
        enemyLevel = 5;
        
        enemyHitChance = 5;
        
        enemyArmor = 20;
    }
    
    @Override
    public void loadImage() throws Exception{
        
        enemyImage = new Image("imgs\\enemyImgs\\Bandit Cutthroat.jpeg");
        
    }
    
}
