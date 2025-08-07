package bounded;

public class ThirdExercise {

//    In this exercise, your task is to construct a generic method that takes a T[] one-dimensional array
//    as the input with a T item and it counts that how many items are greater than this specified T item.

    //[1, 2, 3, 4, 5] and item=3 --> result is 2 because 4, 5 are greater than 3.

    //[1.4, 2.1, 3.9, 4.3, 5.1] and item=2.0 --> result is 4 because 2.1, 3.9, 4.3, 5.1 are greater than 2.0.

    //["a", "b", "f", "d", "e"] and item="c" --> result is 3 because "f", "d", "e" are greater than "c" in the alphabetical order.

    // method name must be: countGreaterItems(T[] items, T item) !!!
   public <T extends Comparable<T>> int countGreaterItems(T[] items, T item){

       int count=0;
        for(T t:items){
            if (t.compareTo(item) > 0) {
                count++;
            }
        }
        return count;
    }
}
