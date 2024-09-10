
package enemies;

import javafx.scene.image.Image;

public class Bandit_Beastmaster_Level_8 extends Enemy{
    
    public Bandit_Beastmaster_Level_8(){
        
        enemyName = "Bandit Beastmaster";
        enemyStartingHealth = 110;
        enemyCurrentHealth = enemyStartingHealth;
        
        awardedXP = 26;
        awardedGold = 8;
        
        enemyCriticalHitChance = 10;
        enemyDodgeChance = 15;
        
        enemyBasicHitDamage = 26;
        
        enemyLevel = 8;
        
        enemyHitChance = 5;
        
        enemyArmor = 26;
        
    }
    
    @Override
    public void loadImage() throws Exception{
        
        enemyImage = new Image("imgs\\enemyImgs\\Bandit Beastmaster.jpeg");
        
    }
    
}
