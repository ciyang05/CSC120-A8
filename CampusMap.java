import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        myMap.addBuilding(new House("Cutter House", "10 Prospect St, Northampton, MA 01060", 4, true));
        myMap.addBuilding(new Building("Julia Child Campus Center", " Smith College Campus Center, 100 Elm St, Northampton, MA 01063", 3));
        myMap.addBuilding(new Building("Mwangi Cultural Center", "12 Prospect St, Northampton, MA 01063", 1));
        myMap.addBuilding(new House("Wilson House", "1 Paradise Rd, Northampton, MA 01063", 5, true));
        myMap.addBuilding(new Building("Jandon Center", "College Ln, Northampton, MA 01063", 1));
        myMap.addBuilding(new Building("Emerson House", "1 Paradise Rd, Northampton, MA 01063", 5));
        myMap.addBuilding(new House("Haven-Wesley", "1 Random Rd, Northampton, MA 01063", 4, true));
        myMap.addBuilding(new House("Lamont", "17 Prospect St, Northampton, MA 01063", 4, true));
        myMap.addBuilding(new Building("McConnell Hall", "1 Science St, Northampton, MA 01063", 4));
        myMap.addBuilding(new House("President's House", "1 Presidential St, Northampton, MA 01063", 3, true));
        myMap.addBuilding(new House("Ziskind House", "1 Henshaw Ave, Northampton, MA 01063", 4, true));
        myMap.addBuilding(new Library("Neilson Library", "7 Neilson Drive, Northampton, MA 01063", 5));
        
        System.out.println(myMap);
    }
    
}
