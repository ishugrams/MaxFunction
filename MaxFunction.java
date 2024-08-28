

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to apllication!");


        Compare<Integer> c = new Compare<>(10, 15, 20);
        System.out.println(c.compare(c.a, c.b, c.c));
    }
}

class Compare<T>{
    T a;
    T b;
    T c;

    Compare(T a , T b ,T c){
        this.a = a;
        this.b = b;
        this.c  = c;
    }

    public <T extends Comparable<T>> T compare(T a ,T b ,T c){
        T max = a;
        if(b.compareTo(max) >0){
            max = b;
        }
        else if(c.compareTo(max) > 0){
            max = c;
        }

        return max;
    }
}