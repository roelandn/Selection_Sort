import java.util.ArrayList;
import java.util.List;

public class Sorting {
    public List<Integer> sort(List<Integer> unsorted) {

        List<Integer> sorted = new ArrayList<>();
        int currentValue, lowestValue, lowestLocation;
        boolean lower;

        int length = unsorted.size();

        //Sort and print values
        for (Integer i = 0; i < length; i++) {
            lowestValue = unsorted.get(0);
            lowestLocation = 0;

            //Loop over all values and look for a lower one
            for (Integer k = 0; k < (length - i); k++) {
                currentValue = unsorted.get(k);
                if (currentValue < lowestValue) {
                    lowestValue = currentValue;
                    lowestLocation = k;
                }
            }

            //Add lowest value to sorted List and remove it from unsorted List
            sorted.add(unsorted.remove(lowestLocation));
        }
        return sorted;
    }
}