import java.util.ArrayList;

/* This is a stub for the House class */
public class House extends Building implements HouseRequirements{

  // Attributes 
  private ArrayList <Student> residents;
  private boolean hasDiningRoom;

  /**
   * overloaded constructor with name only
   * @param name
   */
  public House (String name) {
    this.name = name;
  }

  /**
   * overloaded constructor with name and address only
   * @param name
   * @param address
   */
  public House (String name, String address) {
    this.name = name;
    this.address = address;
  }


  /**
   * full constructor
   * @param name
   * @param address
   * @param nFloors
   * @param hasDiningRoom
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) { // still passing in boolean, but it won't be used in super
    super(name, address, nFloors); // creates a house using the Building class, must use same parameters as Building constructor
    this.residents = new ArrayList<Student>(); // <String> indicates what kind of data will be stored in ArrayList
    this.hasDiningRoom = hasDiningRoom;

    System.out.println("You have built a house: 🏠");
  }


  /**
   * shows other methods/options specific to house subclass
   */
  public void showOptions() {
    super.showOptions();
    System.out.println("Available options at " + this.name + ":\n + hasDiningRoom() \n + nResidents() \n + moveIn(Student s) \n + moveOut(Student s) \n + isResident(Student s)");
  }


/**
 * accesses boolean value of the hasDiningRoom attribute
 * @return true or false depending on if house has a dining room
 */
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }


  /**
   * accesses the number of residents in "residents" ArrayList
   * @return size of the "residents" list and/or number of residents in the list
   */
  public int nResidents() {
    return this.residents.size();
  }


  /**
   * checks if student is already a resident and updates the "residents" arraylist everytime someone moves in
   * @param name
   */
  public void moveIn(Student s) {
    if (!residents.contains(s)) {
      residents.add(s);
    } 

  }


  /**
   * checks if student is a resident and updates the "residents" arraylist everytime someone moves out
   * @param name
   * @return s
   */
  public Student moveOut(Student s) {
    if (residents.contains(s)) {
      residents.remove(s);
    } return s;

  }


  /**
   * checks if a given student is a resident of the "House"
   * @param person
   * @return true or false depending on if the student is a resident
   */
  public boolean isResident(Student s) {
    if (residents.contains(s)) {
      return true;
    } else {
      return false;
    }
  } 


  /**
   * the main function for "House" class, which calls the constructor to initialize a new house
   * @param args
   */
  public static void main(String[] args) {
   House myHouse = new House("Cutter", "1 Prospect St", 4, true);
   System.out.println(myHouse);
  }

}