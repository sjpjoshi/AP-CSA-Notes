import java.util.ArrayList;
// https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

public class DataProcessor {

    public void processData(DataHolder holder) {
        ArrayList<ArrayList<Integer>> data = holder.getData();
        for(ArrayList<Integer> list : data) {
            // for arraylist, you must say Integer, not int
            for(Integer i : list) {
                System.out.println(i + " ");
            }
            System.out.println();
        }
    }

}
