
package enemies;

import javafx.scene.image.Image;

public class Tamed_Wolf_Level_7 extends Enemy{
    
    public Tamed_Wolf_Level_7(){
        
        enemyName = "Tamed Wolf";
        enemyStartingHealth = 100;
        enemyCurrentHealth = enemyStartingHealth;
        
        awardedXP = 24;
        awardedGold = 5;
        
        enemyCriticalHitChance = 10;
        enemyDodgeChance = 15;
        
        enemyBasicHitDamage = 24;
        
        enemyLevel = 7;
        
        enemyHitChance = 5;
        
        enemyArmor = 24;
    }
    
    @Override
    public void loadImage() throws Exception{
        
        enemyImage = new Image("imgs\\enemyImgs\\Tamed Wolf.jpeg");
        
    }
    
}
