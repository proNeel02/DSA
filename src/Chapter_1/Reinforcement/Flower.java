package Chapter_1.Reinforcement;

public class Flower {


    private String name;
    private int petals;
    private float price;

    public Flower(String name, int petals, float price){
     this.name = name;
     this.petals = petals;
     this.price = price;
    }


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }


    public void setPetals(int petals){
        this.petals = petals;
    }
    public int getPetals(){
        return this.petals;
    }

    public void setPrice(float price){
        this.price = price;
    }
    public float getPrice(){
        return this.price;
    }


    public static void main(String[] args) {
        Flower f = new Flower("Rose", 10, 25.88f);



    }

}
