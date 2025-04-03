
/* This is a stub for the Cafe class */
 


public class Cafe extends Building implements CafeRequirements{
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory
  
    /**
     * FULL constructor, assigns starting values to stocked items
     * @param name
     * @param address
     * @param nFloors
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
        this.nCoffeeOunces = 50;
        this.nSugarPackets = 15;
        this.nCreams = 20;
        this.nCups = 20;
    }
 
    /* Overloaded construtor with name only */
    public Cafe(String name){
        super();
        this.name = name;

    }

    /* Overloaded method*/
    public void goUp() {
        this.goToFloor(this.activeFloor);
        System.out.println("There's only one floor in this Cafe open to the costumers.");
    }

    /**
     * shows other methods/options specific to cafe subclass
     */
    public void showOptions() {
        super.showOptions();
        System.out.println("Available options at " + this.name + ":\n + sellCoffee(int size, int nSugarPackets, int nCreams) \n + restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups)");
    }
    
    /*
     * doesn't permit movement off the first floor
     */
    @Override
    public void goToFloor(int floorNum){
        super.goToFloor(activeFloor);
        if (this.activeFloor != 1) {
          throw new RuntimeException("This space is off limit to costumers. Must call enter() before navigating between floors.");
      }
          if (floorNum < 1 || floorNum > this.nFloors) {
          throw new RuntimeException("Invalid floor number. Valid range for this Building is 1-" + this.nFloors +".");
      }
      System.out.println("You are now on floor #" + floorNum + " of " + this.name);
      this.activeFloor = floorNum;
    }


 
    /**
     * @param args
     */
    public static void main(String[] args) {
        Cafe myCafe = new Cafe("Victoria's Little Cafe", "99 Green St", 1, 50, 15, 20, 20);
        System.out.println(myCafe);
       
    }
 
 
    /**
     * decreases the inventory when a coffee is sold
     * @param size
     * @param nSugarPackets
     * @param nCreams
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if (nCoffeeOunces < size || nSugarPackets < this.nSugarPackets || nCreams < this.nCreams || nCups < 1){
            restock(nCoffeeOunces, nSugarPackets, nCreams, nCups);
        } else {
            nCoffeeOunces -= size;
            this.nSugarPackets -= nSugarPackets;
            this.nCreams -= nCreams;
            nCups -= 1;
        }
 
 
    }
 
 
    /**
     * restocks items when necessary
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        nCoffeeOunces = 50;
        this.nSugarPackets = 15;
        this.nCreams = 20;
        nCups = 20;
 
 
    }
 }
 