
package items.gloves;

import rpg.Global;

public class Trainees_Gloves extends Gloves{
    
    public Trainees_Gloves(){
        
        itemName = "Trainee's Gloves";
        
        upgradeCost = 100;
        
        itemCost = 20;
    }
    
    public void onEquip(){
        
        Global.player.armor += 1 * itemLevel;
        
    }
    
    public void onUnequip(){
        
        Global.player.armor -= 1 * itemLevel;
        
    }
    
}
