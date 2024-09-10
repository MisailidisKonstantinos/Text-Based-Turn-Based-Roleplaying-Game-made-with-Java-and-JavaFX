
package rpg;

import java.util.ArrayList;
import zones.ZoneLoader;
import zones.Zones;

public class Global {
    
    public static Player player = new Player();
    
    ZoneLoader zoneLoader = new ZoneLoader();
    
    public static ArrayList<Zones> zones = new ArrayList();
    
    public static ArrayList<String> primaryStatsList = new ArrayList();
    public static ArrayList<String> statsList = new ArrayList();
    
}
