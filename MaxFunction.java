public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the application!");

        Compare<Integer> integerCompare = new Compare<>(10, 15, 20);
        System.out.println("Maximum of integers: " + integerCompare.testMaximum());

        Compare<Double> doubleCompare = new Compare<>(3.5, 2.5, 4.1);
        System.out.println("Maximum of doubles: " + doubleCompare.testMaximum());
    }
}

class Compare<T extends Comparable<T>> {
    private T a;
    private T b;
    private T c;

    Compare(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T testMaximum() {
        return Compare.testMaximum(a, b, c);
    }

    public static <T extends Comparable<T>> T testMaximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
}
