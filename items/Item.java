
package items;

public class Item {
    
    public String itemName;
    public String itemType;
    
    public int itemSlot;
    
    public int itemLevel = 1;
    public int upgradeCost;
    public int itemCost;
    
    public void onEquip(){
        //εδώ θα αυξανονται τα stats οταν γινεται equip
    }
    
    public void onUnequip(){
        //εδω θα αφαιρουνται τα stats.
    }

}
