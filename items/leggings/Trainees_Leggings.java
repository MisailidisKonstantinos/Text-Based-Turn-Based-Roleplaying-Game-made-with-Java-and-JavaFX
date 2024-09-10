
package items.leggings;

import rpg.Global;

public class Trainees_Leggings extends Leggings{
    
    public Trainees_Leggings(){
        
        itemName = "Trainee's Leggings";
        
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
