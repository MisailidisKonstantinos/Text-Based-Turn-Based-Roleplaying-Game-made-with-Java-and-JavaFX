
package items.weapons;

import rpg.Global;

public class Training_Sword extends Weapon {
    
    public Training_Sword(){
        
        itemName = "Training Sword";
        
        upgradeCost = 160 + 50 * (itemLevel - 1);
        
        itemCost = 50;
    }
    
    public void onEquip(){
        
        Global.player.basicDamage += 1 * itemLevel;
        
    }
    
    public void onUnequip(){
        
        Global.player.basicDamage += 1 * itemLevel;
        
    }
    
}
