
package items.helmets;

import rpg.Global;

public class Trainees_Helmet extends Helmet{
    
    public Trainees_Helmet(){
        
        itemName = "Trainee's Helmet";
        
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
