
package items.boots;

import rpg.Global;

public class Trainees_Boots extends Boots {
    
    public Trainees_Boots(){
        
        itemName = "Trainee's Boots";
        
        upgradeCost = 100 + 50 * (itemLevel - 1);
        
        itemCost = 20;
    }
    
    public void onEquip(){
        
        Global.player.armor += 1 * itemLevel;
        
    }
    
    public void onUnequip(){
        
        Global.player.armor -= 1 * itemLevel;
        
    }
    
}
