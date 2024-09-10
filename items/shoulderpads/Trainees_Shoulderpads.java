
package items.shoulderpads;

import rpg.Global;

public class Trainees_Shoulderpads extends Shoulderpads{
    
    public Trainees_Shoulderpads(){
        
        itemName = "Trainee's Shoulderpads";
        
        upgradeCost = 120 + 50 * (itemLevel - 1);
        
        itemCost = 25;
    }
    
    public void onEquip(){
        
        Global.player.armor += 2 * itemLevel;
    }
    
    public void onUnequip(){
        
        Global.player.armor -= 2 * itemLevel;
        
    }
}
