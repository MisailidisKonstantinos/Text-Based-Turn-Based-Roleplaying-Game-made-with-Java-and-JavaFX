
package enemies;

import items.Item;
import java.util.ArrayList;
import java.util.Random;
import rpg.Global;
import javafx.scene.image.Image;


public class Enemy {
    
    public String enemyName;
    public int enemyStartingHealth;
    public int enemyCurrentHealth;
    
    public int awardedXP;
    public int awardedGold;
    
    public int enemyCriticalHitChance;
    public int enemyDodgeChance;
    
    public int enemyLevel;
    
    public int enemyBasicHitDamage;
    
    public int enemyHitChance;
    
    public int enemyArmor;
    
    public ArrayList<Item> itemRewards = new ArrayList();
    public int itemDropChance =40;
    
    public boolean stunned = false;
    public int stunnedCounter = 0;
    public int stunDuration = -1;
    
    public Image enemyImage;
    
    public void onDefeat(){
        
        awardXP();
        awardItems();
        awardQuestItems();
    }
    
    public void awardXP(){
        int levelDifference = Math.abs(Global.player.level - enemyLevel);
        
        if(Global.player.level > enemyLevel){
            
            if(levelDifference < 4){
                
                Global.player.exp += awardedXP - awardedXP * levelDifference / 100;
                
            }
        }
        else{
            Global.player.exp += awardedXP + awardedXP * levelDifference / 100;
        }
        
    }
    
    public void awardItems(){
        
        Global.player.playerGold += awardedGold;
        
        if(!itemRewards.isEmpty()){
            Random r = new Random();
            int x = r.nextInt(101);

            if(x <= itemDropChance){

                r = new Random();
                x = r.nextInt(itemRewards.size());

                Global.player.bag.add(itemRewards.get(x));
            }
        }
        
    }
    
    public void awardQuestItems(){
        
    }
    
    public void loadImage() throws Exception{
        
    }
}
