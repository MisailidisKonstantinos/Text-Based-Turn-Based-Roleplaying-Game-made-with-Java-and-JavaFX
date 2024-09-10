
package zones;

import subzones.The_Abandoned_Road;
import subzones.The_Treeline;
import subzones.Training_Grounds;
import subzones.Wolf_Den;

public class The_Eastern_Plains extends Zones{
    
    public The_Eastern_Plains(){
        
        name = "The Eastern Plains";
        
        subzone1 = new Training_Grounds();
        subzone2 = new Wolf_Den();
        subzone3 = new The_Abandoned_Road();
        subzone4 = new The_Treeline();
        
        subzones.add(subzone1);
        subzones.add(subzone2);
        subzones.add(subzone3);
        subzones.add(subzone4);
        
    }
}
