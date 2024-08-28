public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the application!");

        Compare<Integer> integerCompare = new Compare<>(10, 15, 20, 25, 5);
        integerCompare.testMaximum();  // This will print the maximum value to stdout

        Compare<Double> doubleCompare = new Compare<>(3.5, 2.5, 4.1, 5.2, 1.8);
        doubleCompare.testMaximum();  // This will print the maximum value to stdout
    }
}

class Compare<T extends Comparable<T>> {
    private T[] values;

    @SafeVarargs
    Compare(T... values) {
        this.values = values;
    }

    public T testMaximum() {
        T max = Compare.testMaximum(values);
        printMax(max);
        return max;
    }

    public static <T extends Comparable<T>> T testMaximum(T... values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("At least one value must be provided");
        }

        T max = values[0];
        for (T value : values) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }
        return max;
    }

    public void printMax(T max) {
        System.out.println("Maximum value: " + max);
    }
}
