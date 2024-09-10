
package items.belt;

import rpg.Global;

public class Trainees_Belt extends Belt{
    
    public Trainees_Belt(){
        
        itemName = "Trainee's Belt";
        
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
