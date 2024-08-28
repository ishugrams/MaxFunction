public class MaxFunction {
    public static void main(String[] args) {
        System.out.println("Welcome to application!");
        System.out.println(maxint(10,25,12));
    }
    static int maxint(int a , int b , int c){
        int max = 0;
        max = Math.max(a , b);
        max = Math.max(max , c);

        return max;
    }
}