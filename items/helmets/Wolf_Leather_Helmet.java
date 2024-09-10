/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package items.helmets;

import rpg.Global;

/**
 *
 * @author Lenovo
 */
public class Wolf_Leather_Helmet extends Helmet{
    
    public Wolf_Leather_Helmet(){
        itemName = "TWolf Leather Helmet";
        
        upgradeCost = 120 + 50 * (itemLevel - 1);
        
        itemCost = 40;
    }
    
    public void onEquip(){
        
        Global.player.armor += 4 * itemLevel;
        
    }
    
    public void onUnequip(){
        
        Global.player.armor -= 4 * itemLevel;
        
    }
}
