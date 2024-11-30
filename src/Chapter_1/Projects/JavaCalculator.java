package Chapter_1.Projects;

import java.util.*;

public class JavaCalculator{

    public static int winningCandiate(int[ ]a, int[] b){

   HashMap<Integer, List<Integer>> track = new HashMap<>();

   for(int i = 0; i < a.length; i++){

       if(!track.containsKey(a[i])){
           List<Integer> list = new ArrayList<>();
           if(b[i] >= 18) list.add(b[i]);
           track.put(a[i], list);
       }else{
           List<Integer> list = track.get(a[i]);
           if(b[i] >= 18) list.add(b[i]);
       }

   }


   int candidate = -1;
   int length = 0;
        for (Map.Entry<Integer, List<Integer>> entry : track.entrySet()) {

            if(entry.getValue().size() > length){
                length = entry.getValue().size();
                candidate = entry.getKey();
            }

        }



   return candidate;
    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();


        int[] candidate = new int[num];
        int[] age = new int[num];



        for(int i = 0; i < num; i++)
            candidate[i] = sc.nextInt();

        for(int i = 0; i < num; i++)
            age[i] = sc.nextInt();


        String res = Arrays.toString(candidate);
        String res1 = Arrays.toString(age);


        int result = winningCandiate(candidate, age);
        System.out.println(result);
        sc.close();

    }
}
