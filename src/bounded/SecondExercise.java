package bounded;

public class SecondExercise {
    // here you have to implement a generic method to add 2 numbers and return the result
    // name of the method must be add(num1, num2) - with 2 arguments num1 and num2 !!!

    public <T extends Number> T add(T first, T second){
        if (first instanceof Integer && second instanceof Integer) {
            return (T) (Integer) ((Integer) first + (Integer) second);
        } else if (first instanceof Double && second instanceof Double) {
            return (T) (Double) ((Double) first + (Double) second);
        } else if (first instanceof Long && second instanceof Long) {
            return (T) (Long) ((Long) first + (Long) second);
        } else if (first instanceof Float && second instanceof Float) {
            return (T) (Float) ((Float) first + (Float) second);
        } else {
            throw new IllegalArgumentException("Unsupported types for addition: " +
                    first.getClass() + " and " + second.getClass());
        }
    }
}
