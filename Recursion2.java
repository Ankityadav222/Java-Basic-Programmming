public class Recursion2 {

    static void finction(int i, int n){
        if( i < 1) return;
        System.out.println(i);


        finction(i-1, n);

    }
    public static void main(String[] args) {
        int n =  10;
        finction(n, n);
    }
}
