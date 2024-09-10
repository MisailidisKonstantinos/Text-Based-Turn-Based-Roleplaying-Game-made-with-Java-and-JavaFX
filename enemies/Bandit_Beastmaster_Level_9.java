
package enemies;

import javafx.scene.image.Image;

public class Bandit_Beastmaster_Level_9 extends Enemy{
    
    public Bandit_Beastmaster_Level_9(){
        
        enemyName = "Bandit Beastmaster";
        enemyStartingHealth = 120;
        enemyCurrentHealth = enemyStartingHealth;
        
        awardedXP = 28;
        awardedGold = 8;
        
        enemyCriticalHitChance = 10;
        enemyDodgeChance = 15;
        
        enemyBasicHitDamage = 28;
        
        enemyLevel = 9;
        
        enemyHitChance = 5;
        
        enemyArmor = 28;
        
    }
    
    @Override
    public void loadImage() throws Exception{
        
        enemyImage = new Image("imgs\\enemyImgs\\Bandit Beastmaster.jpeg");
        
    }
    
}
