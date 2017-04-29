import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Generate_List generate = new Generate_List();
        Sorting sort = new Sorting();

        List<Integer> unsorted;
        List<Integer> sorted;


        System.out.println("Would you like to randomly generate values?");
        Scanner input = new Scanner(System.in);

        String answer = input.nextLine().toLowerCase();
        if(answer.equals("yes") || answer.equals("y")) {

            //Generate unsorted values
            unsorted = generate.generateValues();
            System.out.println("Unsorted list: " + unsorted);

            //Sort
            sorted = sort.sort(unsorted);
            System.out.println("Sorted list: " + sorted);

        } else if(answer.equals("no") || answer.equals("n")) {

            //Get input
            String inputListString;
            System.out.println("Please enter a list of Integers seperated by commas below.");

            //Convert input to List<Integer>
            inputListString = input.nextLine();
            List<String> unsortedTemp = new ArrayList<String>(Arrays.asList(inputListString.split(",")));
            unsorted = unsortedTemp.stream().map(Integer::parseInt).collect(Collectors.toList());
            System.out.println("Unsorted list: " + unsorted);

            //Sort
            sorted = sort.sort(unsorted);
            System.out.println("Sorted list: " + sorted);

        } else {
            System.out.println("Did not understand that input. Please try again.");
            main(args);
        }
    }
}
