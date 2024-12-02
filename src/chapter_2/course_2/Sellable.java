package chapter_2;

public interface Sellable {

    // returning a description of an object
    public String description();

    //Return the list price in cents
    public int listPrice();

    //Return the lowest price in cents we will accept
    public int lowestPrice();
}
