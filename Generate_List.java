import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Generate_List {
    public List<Integer> generateValues(){

        List<Integer> unsorted;
        //Settings
        Integer length = 10;
        Integer range_min = 0;
        Integer range_max = 50;

        //Generate and print random values
        Random prng = new Random();
        IntStream stream = prng.ints(length, range_min, range_max);
        unsorted = stream.boxed().collect(Collectors.toList());

        return unsorted;
    }
}
