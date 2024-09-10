
package enemies;

import items.belt.Trainees_Belt;
import items.boots.Trainees_Boots;
import items.chest.Trainees_Chestplate;
import items.gloves.Trainees_Gloves;
import javafx.scene.image.Image;

public class Trainee_Level_1 extends Enemy{
    
    public Trainee_Level_1(){
        
        enemyName = "Trainee";
        enemyStartingHealth = 40;
        enemyCurrentHealth = enemyStartingHealth;
        
        awardedXP = 10;
        awardedGold = 1;
        
        itemRewards.add(new Trainees_Belt());
        itemRewards.add(new Trainees_Boots());
        itemRewards.add(new Trainees_Chestplate());
        itemRewards.add(new Trainees_Gloves());
        
        enemyCriticalHitChance = 10;
        enemyDodgeChance = 15;
        
        enemyBasicHitDamage = 10;
        
        enemyLevel = 1;
        
        enemyHitChance = 5;
        
        enemyArmor = 10;
    }
    
    @Override
    public void loadImage() throws Exception{
        
        enemyImage = new Image("imgs\\enemyImgs\\Trainee.jpeg");
        
    }
}
