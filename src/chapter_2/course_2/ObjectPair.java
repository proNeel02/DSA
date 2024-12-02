package chapter_2;

public class ObjectPair {

  private final Object first;
  private final Object second;

  public ObjectPair(Object a, Object b){
      first = a;
      second = b;
  }

  public Object getFirst(){
      return first;
  }

  public Object getSecond(){
      return second;
  }

    public static void main(String[] args) {
        ObjectPair bid  = new ObjectPair("ORCL",32.07);

         Object first = bid.getFirst();
         Object second = bid.getSecond();

         System.out.println("first ==> "+first);
         System.out.println("second ==> "+second);
  }
}