
// create a recursion fun to print no.s from N to 1 by recursion
public class N_to_1 {
    public static void main(String[] args) {
        funRev(5);


    }
    static void fun(int n ){
        if(n==1)
            System.out.println(n);
        else{
            System.out.println(n);
            fun(n-1);
        }
    }
    // reverse order print
    static void funRev(int n ){
        if(n==1)
            System.out.println(n);
        else{
            funRev(n-1);
            System.out.println(n);
        }
    }
}
