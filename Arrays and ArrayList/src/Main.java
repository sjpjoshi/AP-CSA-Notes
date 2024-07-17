import java.lang.reflect.Array;
import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        // un-declared
        // variable name[] = new variable[size]
        int list[] = new int[3];
        // the size must be a int, or a whole number

        // 2 ways to set the elements
        list[0] = 1;
        list[1] = 2;
        list[2] = 3;
        //System.out.println(list[2]);

        // the second way is to go via a loop
        for(int i = 0; i < list.length; i++) {
            //System.out.println(list[i]);
        } // for

        // i = 0
        // 0 < 3
        // list[i] = list[0]
        // i++: 1
        // i = 1
        // 1 < 3
        // ..
        // i = 3
        // 3 < 3 X stops

        // pre-declared
        int list2[] = { 1,2,3 };
        for(int i = 0; i < list2.length; i++) {
            //System.out.println(list2[i]);
        }

        // the 2D array
        int list3[][] = new int[2][2];
        list3[0][0] = 1;
        list3[0][1] = 2;
        list3[1][0] = 3;
        list3[1][1] = 4;
        //System.out.println(list3[1][1]);

        int list4[][] =
                { {1,2},
                  {3,4}
                };

        // rows
        for(int i = 0; i < list4.length; i++) {
            // cols
            for(int j = 0; j < list4[0].length; j++) {
                //System.out.print(list4[i][j]);
            }
        }

        char board[][] = new char[3][3];
        char playerX = 'X';
        char playerO = 'O';

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                board[i][j] = ' ';
            }
        }

        board[0][1] = playerX;
        board[1][1] = playerO;

        System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("-----------");
        System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("-----------");
        System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);

        // advanced for loop
        for(int i : list2) {
            //System.out.println(i);
        }

        // list2 = 1 3 3 4
        // i = 1 3 3 4

        // pre-assigning the size of an array
        int arr[] = new int[100];
        int size = 3;

        Scanner scan = new Scanner(System.in);
        // take in some size the scanner
        System.out.print("Enter: ");
        size = scan.nextInt();
        for(int i = 0; i < size; i++) {
            System.out.print("enter arr[" + i + "] : ");
            arr[i] = scan.nextInt();
        }

        for(int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

        // Arraylists are resizable, i dont have to set any size

        // ArrayList<variable> name = new Arraylist<size(optinal)>();
        ArrayList<String> fruits = new ArrayList<>();

        // to add to an arraylist
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        //System.out.println(fruits);
        //System.out.println(fruits.get(0));
        //instead of length, its size() for an arraylist
        for(int i = 0; i < fruits.size(); i++){
            System.out.println(fruits.get(i));
        }

        // to modify an element
        fruits.set(1, "grapes");
        System.out.println(fruits);

        // unlike an array, I can remove an element
        fruits.remove(0);
        System.out.println(fruits);

        System.out.println(fruits.size());

        // advanced for
        for(String f : fruits) {
            System.out.println(f);
        }

        // to compare or to check if a element is equal to each other
        // contains || returns a boolean true or false
        Boolean hasThing = fruits.contains("Apple");
        System.out.println(hasThing);

        // Arraylist for int and double
        //ArrayList<Integer> something = new ArrayList<>();
        //ArrayList<Double> something2 = new ArrayList<>();
        // do you have to worry about 2D array list?
        // no! not even on your ap exam
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
         */

        //but you do have to worry about this
        // I can make an array of classes
        Test arr[] = new Test[10];
        // I can also pass through an arrayList through classes
        // next time we will talk about this

        DataHolder holder = new DataHolder();

        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        holder.addRow(row1);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);
        holder.addRow(row2);

        DataProcessor processor = new DataProcessor();
        processor.processData(holder);


    } // main

} // Main