
package enemies;

import javafx.scene.image.Image;

public class Bandit_Cutthroat_Level_6 extends Enemy{
    
    public Bandit_Cutthroat_Level_6(){
        
        enemyName = "Bandit Cutthroat";
        enemyStartingHealth = 90;
        enemyCurrentHealth = enemyStartingHealth;
        
        awardedXP = 22;
        awardedGold = 5;
        
        enemyCriticalHitChance = 10;
        enemyDodgeChance = 15;
        
        enemyBasicHitDamage = 22;
        
        enemyLevel = 6;
        
        enemyHitChance = 5;
        
        enemyArmor = 22;
    }
    
    @Override
    public void loadImage() throws Exception{
        
        enemyImage = new Image("imgs\\enemyImgs\\Bandit Cutthroat.jpeg");
        
    }
}
