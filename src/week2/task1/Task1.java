package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        if(a!=0){
            return gcd(a%b,a);
        }
        else{
            return b;
        }
        return 0;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        return 0;
    }
}
