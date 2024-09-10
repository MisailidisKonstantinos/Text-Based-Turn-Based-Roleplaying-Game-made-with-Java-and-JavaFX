
package enemies;

import javafx.scene.image.Image;

public class Duncan_The_Warlord extends Enemy{
    
    public Duncan_The_Warlord(){
        
        enemyName = "Duncan The Warlord";
        enemyStartingHealth = 140;
        enemyCurrentHealth = enemyStartingHealth;
        
        awardedXP = 30;
        awardedGold = 12;
        
        enemyCriticalHitChance = 10;
        enemyDodgeChance = 15;
        
        enemyBasicHitDamage = 30;
        
        enemyLevel = 10;
        
        enemyHitChance = 5;
        
        enemyArmor = 30;
        
    }
    
    @Override
    public void loadImage() throws Exception{
        
        enemyImage = new Image("imgs\\enemyImgs\\Duncan.jpeg");
        
    }
    
}
