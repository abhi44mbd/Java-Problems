import com.sun.jdi.connect.Connector;

public class Factorial {
    public static void main(String [] args){
        int num = 0;
        System.out.println(fact(num));

    }

    private static int fact(int num) {
        if(num<=1)
            return 1;
        else
            return num* fact(num-1);
    }
}
