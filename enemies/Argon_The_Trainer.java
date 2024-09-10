
package enemies;

import items.belt.Trainees_Belt;
import items.boots.Trainees_Boots;
import items.chest.Trainees_Chestplate;
import items.gloves.Trainees_Gloves;
import items.helmets.Trainees_Helmet;
import items.leggings.Trainees_Leggings;
import items.shoulderpads.Trainees_Shoulderpads;
import items.wristbands.Trainees_Wristbands;
import javafx.scene.image.Image;

public class Argon_The_Trainer extends Enemy{
    
    public Argon_The_Trainer(){
        
        enemyName = "Argon the Trainer";
        enemyStartingHealth = 70;
        enemyCurrentHealth = enemyStartingHealth;
        
        awardedXP = 15;
        awardedGold = 3;
        
        itemRewards.add(new Trainees_Belt());
        itemRewards.add(new Trainees_Boots());
        itemRewards.add(new Trainees_Chestplate());
        itemRewards.add(new Trainees_Gloves());
        itemRewards.add(new Trainees_Helmet());
        itemRewards.add(new Trainees_Leggings());
        itemRewards.add(new Trainees_Shoulderpads());
        itemRewards.add(new Trainees_Wristbands());
        
        enemyCriticalHitChance = 10;
        enemyDodgeChance = 15;
        
        enemyBasicHitDamage = 15;
        
        enemyLevel = 2;
        
        enemyHitChance = 5;
        
        enemyArmor = 15;
    }
    
    @Override
    public void loadImage() throws Exception{
        
        enemyImage = new Image("imgs\\enemyImgs\\Argon The Trainer.jpeg");
        
    }
}
