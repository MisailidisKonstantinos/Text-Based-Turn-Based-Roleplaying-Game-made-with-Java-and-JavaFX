
package zones;

import java.util.ArrayList;

public class ZoneLoader {
    
    public ArrayList<Zones> zones = new ArrayList();
    
    public ZoneLoader(){
        zones.add(new The_Eastern_Plains());
        zones.add(new Virid_Arbor());
        zones.add(new Primus_Mons());
        zones.add(new Villages_Of_Gorm());
    }
}
