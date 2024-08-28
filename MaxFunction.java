public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to application");

        System.out.println(maxint(10,25,12));
        System.out.println(maxFloat(10.2f,25.2f,30.1f));
        System.out.println(maxString("Apple", "Peach" , "Banana"));
    }
    static int maxint(int a , int b , int c){
        int max = 0;
        max = Math.max(a , b);
        max = Math.max(max , c);

        return max;


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
    static String maxString(String a , String b, String c){
        String max = a;

        if(b.compareTo(max) > 0){
            max = b;
        }
        else if(c.compareTo(max) > 0){
            max = c;
        }

        return max;
    }
}