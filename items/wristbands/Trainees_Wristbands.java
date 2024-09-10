
package items.wristbands;

import rpg.Global;

public class Trainees_Wristbands extends Wristband{
    
    public Trainees_Wristbands(){
        
        itemName = "Trainee's Wristbands";
        
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
