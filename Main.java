import java.util.Scanner;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Generate_List generate = new Generate_List();
        Sorting sort = new Sorting();

        System.out.println("Would you like to randomly generate values?");
        Scanner input = new Scanner(System.in);

        String answer = input.nextLine().toLowerCase();
        if(answer.equals("yes") || answer.equals("y")) {
            List<Integer> unsorted;
            List<Integer> sorted;

            unsorted = generate.generateValues();
            System.out.println("Unsorted list: " + unsorted);

            sorted = sort.sort(unsorted);
            System.out.println("Sorted list: " + sorted);
        }
    }
}
