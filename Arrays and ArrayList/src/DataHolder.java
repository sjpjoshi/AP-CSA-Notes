import java.util.ArrayList;

public class DataHolder {
    private ArrayList<ArrayList<Integer>> data;

    public DataHolder() {
        data = new ArrayList<>();
    }
    public void addRow(ArrayList<Integer> row) {
        data.add(row);
    }

    public ArrayList<ArrayList<Integer>> getData() {
        return data;
    }

}
