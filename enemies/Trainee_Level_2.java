
package enemies;

import items.helmets.Trainees_Helmet;
import items.leggings.Trainees_Leggings;
import items.shoulderpads.Trainees_Shoulderpads;
import items.wristbands.Trainees_Wristbands;
import javafx.scene.image.Image;

public class Trainee_Level_2 extends Enemy{
    
    public Trainee_Level_2(){
        
        enemyName = "Trainee";
        enemyStartingHealth = 50;
        enemyCurrentHealth = enemyStartingHealth;
        
        awardedXP = 12;
        awardedGold = 1;
        
        itemRewards.add(new Trainees_Helmet());
        itemRewards.add(new Trainees_Leggings());
        itemRewards.add(new Trainees_Shoulderpads());
        itemRewards.add(new Trainees_Wristbands());
        
        enemyCriticalHitChance = 10;
        enemyDodgeChance = 15;
        
        enemyBasicHitDamage = 12;
        
        enemyLevel = 2;
        
        enemyHitChance = 5;
        
        enemyArmor = 12;
    }
    
    @Override
    public void loadImage() throws Exception{
        
        enemyImage = new Image("imgs\\enemyImgs\\Trainee.jpeg");
        
    }
    
}
