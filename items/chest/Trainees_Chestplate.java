
package items.chest;

import rpg.Global;

public class Trainees_Chestplate extends Chest{
    
    public Trainees_Chestplate(){
        
        itemName = "Trainee's Chestplate";
        
        upgradeCost = 150 + 50 * (itemLevel - 1);
        
        itemCost = 30;
    }
    
    public void onEquip(){
        
        Global.player.armor += 3 * itemLevel;
        
    }
    
    public void onUnequip(){
        
        Global.player.armor -= 3 * itemLevel;
        
    }
}
