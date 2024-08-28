public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(maxFloat(10.2f,25.2f,30.1f));
    }

    static float maxFloat(float a, float b , float c){
        if(a > b && a > c){
            return a;
        }
        else if(b > a && b > c){
            return b;
        }
        else {
            return c;
        }
    }
}