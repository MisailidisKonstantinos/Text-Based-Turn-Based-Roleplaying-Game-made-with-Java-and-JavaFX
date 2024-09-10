
package enemies;

import javafx.scene.image.Image;

public class Tamed_Wolf_Level_8 extends Enemy{
    
    public Tamed_Wolf_Level_8(){
        
        enemyName = "Tamed Wolf";
        enemyStartingHealth = 110;
        enemyCurrentHealth = enemyStartingHealth;
        
        awardedXP = 26;
        awardedGold = 5;
        
        enemyCriticalHitChance = 10;
        enemyDodgeChance = 15;
        
        enemyBasicHitDamage = 26;
        
        enemyLevel = 8;
        
        enemyHitChance = 5;
        
        enemyArmor = 26;
    }
    
    @Override
    public void loadImage() throws Exception{
        
        enemyImage = new Image("imgs\\enemyImgs\\Tamed Wolf.jpeg");
        
    }
    
}
