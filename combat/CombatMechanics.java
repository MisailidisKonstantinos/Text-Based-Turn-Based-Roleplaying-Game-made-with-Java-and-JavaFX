
package combat;

import java.util.Random;

public class CombatMechanics {
    
    public boolean criticalHit(int criticalChance){
        boolean criticalHit = false;
        
        Random r = new Random();
        int x = r.nextInt(101);
        
        if(x <= criticalChance){
            criticalHit = true;
        }
        
        return criticalHit;
    }
    
    public boolean successfulHit(int hitChance, int dodgeChance){
        
        boolean success = true;
        int chance = dodgeChance - hitChance;
        
        Random r = new Random();
        int x = r.nextInt(101);
        
        if(x <= chance){
            success = false;
        }
        
        return success;
    }
}
