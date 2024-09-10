
package enemies;

import javafx.scene.image.Image;

public class Wolf_Den_Mother extends Enemy{
    
    public Wolf_Den_Mother(){
        
        enemyName = "Den Mother";
        enemyStartingHealth = 100;
        enemyCurrentHealth = enemyStartingHealth;
        
        awardedXP = 22;
        awardedGold = 5;
        
        enemyCriticalHitChance = 10;
        enemyDodgeChance = 15;
        
        enemyBasicHitDamage = 22;
        
        enemyLevel = 5;
        
        enemyHitChance = 5;
        
        enemyArmor = 20;
    }
    
    @Override
    public void loadImage() throws Exception{
        
        enemyImage = new Image("imgs\\enemyImgs\\Den Mother.jpeg");
        
    }
    
}
