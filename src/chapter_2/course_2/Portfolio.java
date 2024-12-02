package chapter_2;

public class Portfolio <T>{

    T[] data;
    
    public Portfolio(int capacity){
//        data = new T[capacity]; // illegal way of doing
        data = (T[]) new Object[capacity];
    }

    public T get(int index){return data[index];}
    public void set(int index, T element){data[index] = element;}
}
