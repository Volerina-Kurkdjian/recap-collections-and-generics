import java.io.Serializable;
import java.util.List;

public class WildCards {


    //implement copy method (it is present in Collections by the way)
    // that's able to copy the items from a source list into a destination list.
    // Use wildcards with the appropriate bounds!

    public void copy(List source, List destination) {

        for(Object i:source){
            destination.add(i);
        }
        destination.stream().forEach(System.out::println);
    }
}
