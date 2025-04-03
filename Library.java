import java.util.Hashtable;
/* This is a stub for the Library class */
public class Library extends Building implements LibraryRequirements {

// Attributes
private Hashtable<String, Boolean> collection;
boolean hasElevator;

/**
 * @param name
 * @param address
 * @param nFloors
 */
public Library(String name, String address, int nFloors ) {
  super(name, address, nFloors);
  System.out.println("You have built a library: 📖");
  this.collection = new Hashtable<String, Boolean>();
  this.hasElevator = true;
}

    /**
     * @param args
     */
    public static void main(String[] args) {
      Library myLibrary = new Library("Kiara's library", "123 St", 3);
      System.out.println(myLibrary);
      // myLibrary.addTitle("Harry Potter");
      // myLibrary.checkOut("Harry Potter");
      // myLibrary.isAvailable("Harry Potter");
      // myLibrary.printCollection();
      //myLibrary.containsTitle("Harry Potter");
    }

    public void showOptions() {
      super.showOptions();
      System.out.println("Available options at " + this.name + ":\n + addTitle(String title) \n + removeTitle(String title) \n + checkOut(String title) \n + returnBook(String title) \n + containsTitle(String title) \n + isAvailable(String title) \n + printCollection()");
    }
    public void goToFloor(int floorNum){
      super.goToFloor(activeFloor);
      if (this.activeFloor == -1) {
        throw new RuntimeException("You are not inside this library. Must call enter() before navigating between floors.");
    }
        if (floorNum < 1 || floorNum > this.nFloors) {
        throw new RuntimeException("Invalid floor number. Valid range for this Building is 1-" + this.nFloors +".");
    }
    System.out.println("You are now on floor #" + floorNum + " of " + this.name);
    this.activeFloor = floorNum;
    
    }

    /**
     * adds specific title to the collection hashtable 
     * @param title of book being added
     */
    @Override
    public void addTitle(String title) {
      collection.put(title, true);
      System.out.println(title + " " + "has been added to the library collection");
    }
    /**
     * removes specific title to the collection hashtable 
     * @param title of book being removed
     * @return title of the book removed from the collection
     */
    @Override
    public String removeTitle(String title) {
      collection.remove(title);
      return title;
    }

    /**
     * if title is contained within the collection, this function makes the value false to checkout
     * @param title of book to checkout
     */
    @Override
    public void checkOut(String title) {
    if (collection.containsKey(title)){
      collection.replace(title, false);
    } else {
      System.out.println("Book not available");
    }
    }
     /**
     * returns book back into collection by changing value to true
     * @param title of book to return
     */
    @Override
    public void returnBook(String title) {
    if (collection.containsKey(title)) {
      collection.replace(title, true);
    } else {
      System.out.println("Book not available");
    }
    }
    /**
     * checks if title is contained within the collection
     * @param title of book
     * @return true or false depending on if the collection contains the title
     */
    @Override
    public boolean containsTitle(String title) {
      if (collection.containsKey(title)) {
        return true;  
      } else {
        return false;
      }
    }
     /**
     * Checks if title is available in collection 
     * @param title of the boock
     * @return true or false depending on whether the title is available in the collection
     */
    @Override
    public boolean isAvailable(String title) {
      if (collection.containsKey(title)){
        return collection.get(title) ;
      } else {
        return false;
      }
    }
    /**
     * Prints out the hashtable and checks if it is null 
     * @return true or false depending on if the hashtable is null and empty or not
     */
    @Override
    public boolean printCollection() {
      if (collection == null  || collection.isEmpty()){
        return false;
      } else {
        System.out.println(collection.toString());
        return true;
      }
      
    }
  
  }