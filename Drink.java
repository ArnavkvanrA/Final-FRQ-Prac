public class Drink{
  //PART 1
    //Create attributes for the drink class here.
      
    /* Give it attirbutes:
    name
    price with decimals
    if it's cold or not (isCold)
    if it's empty (isEmpty)
    */
    private String name;      // Name of the drink
    private double price;     // Price with decimals
    private boolean isCold;   // If it's cold
    private boolean isEmpty;  // If it's empty

    //Write the constructor for the Drink class. (THIS IS WHAT CREATES an object when its run in the main) 
    //the order for the parameters must be (String, double, boolean, boolean)
    //After creating a constructor test your code in the main to see if you can create some drink.
    public Drink(String name, double price, boolean isCold, boolean isEmpty) {
        this.name = name;
        this.price = price;
        this.isCold = isCold;
        this.isEmpty = isEmpty;
    }

    //Write getters/setters for the methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean getIsCold() {
        return isCold;
    }

    public boolean getIsEmpty() {
        return isEmpty;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIsCold(boolean isCold) {
        this.isCold = isCold;
    }

    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    // Write the method emptyDrink which prints out the message: NameOfDrink "has been drank" and then changes the attribute to be empty
  
    public void emptyDrink(){
      System.out.println(name + " has been drank");
      isEmpty = true;
    }


    
    

    
    
    
     
}
