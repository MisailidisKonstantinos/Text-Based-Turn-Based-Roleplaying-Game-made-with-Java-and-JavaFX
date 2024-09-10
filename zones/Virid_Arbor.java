
package zones;

import subzones.Hunters_Cabin;
import subzones.Riverside;
import subzones.Roots_Of_The_Mountain;
import subzones.Woodlands;

public class Virid_Arbor extends Zones{
    
    public Virid_Arbor(){
        
        name = "Virid Arbor";
        
        subzone1 = new Woodlands();
        subzone2 = new Hunters_Cabin();
        subzone3 = new Riverside();
        subzone4 = new Roots_Of_The_Mountain();
        
        subzones.add(subzone1);
        subzones.add(subzone2);
        subzones.add(subzone3);
        subzones.add(subzone4);
    }
    
}
