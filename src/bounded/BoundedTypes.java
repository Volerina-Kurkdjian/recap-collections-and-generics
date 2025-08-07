package bounded;

public class BoundedTypes {

    public <T extends Comparable<T>> T calculateMin(T firstValue, T secondValue){
       return (firstValue.compareTo( secondValue)>0) ? secondValue : firstValue;
    }
}
