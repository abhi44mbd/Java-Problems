public class DigitProduct {
    public static void main(String[] args) {
/*        int n= 12113;
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            sum = sum + rem;

            n = n/10;

    }
        System.out.println(sum);*/


        // recusive approach

        int n = 1 ;

        // if negative number entered.
        if (n < 0)
            n = n * (-1);
        System.out.println(product(n));

    }

    private static int product(int n) {

        if (n%10 == n)
            return n;
        return product(n / 10) * (n % 10);
    }

}
