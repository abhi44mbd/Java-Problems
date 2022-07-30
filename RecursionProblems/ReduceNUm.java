public class ReduceNUm {
    public static void main(String[] args) {
     /*   int num = 14 ;
        int count = 0;
        while(num >0){

            if(num % 2==0){
                num/=2;
                count++;
            }
            else
            {
                num-=1;
                count++;
            }
        }
        System.out.println(count);*/


        // By recursion
        int ans = numberOfSteps(14);
        System.out.println(ans);

    }
    static int numberOfSteps(int n){
        return helper(n , 0);
    }

    static int helper(int n , int steps){
        if(n==0)
            return steps;
        if(n%2==0){
            return helper(n/2, steps+1);
        }
        else
            return helper(n-1,steps+1);
    }
}
