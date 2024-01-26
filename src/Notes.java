public class Notes {
    //RECURSION

    //--Factorial problem on board--
        //5! = 5x4x3x2x1 -> can be written as 5 * 4!
        //4! = 4x3x2x1 -> 4 * 3!
        //3! = 3x2x1 -> 3 * 2!
        //2! = 2x1 -> 2 * 1!
        //1! = 1 ^goes into the other factorials

        //Therefore the recursive factorial equation can be written as:
        //f(n) = n * f(n-1)

    /**
     * computes the factorial of n using standard recursion
     * @param n: int, inputted number
     * @return factorial of n
     */
    public static int factorialRecursive(int n){
        //base case
        if (n<=1){
            return 1;
        }else{
            //recursive case
            return n * factorialRecursive(n-1);
        }
    }

    //fibonacci numbers
    public static long fibonacciRecursive(long n){
        if (n<=1){
            return n;
        }else{
            //recursive case
            return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
        }
    }

    //reviewing accumulators
    //f(4,1) -> accumulator building from ground up, initialize with one
    /*  n,a                     ^ returns to previous call
    //  |                       |
    //  -> f(3,1*4)           ^24
    //       n,a                ^ returns to previous call
    //       |                  |
    //       -> f(2,4*3)      ^24
    //            n,a           ^ returns to previous call
    //            |             |
    //            ->f(1,12x2) ^24

     */

    /**
     * driver method for the recursive tail factorial
     * @param n
     * @return factorial of n
     */
    public static int factorialTailRecursive(int n){
        return factorialTailRecursiveHelper(n,1);
    }

    /**
     * computes the factorial of n using tail recursion
     * @param n: inputted number
     * @param acc: accumulator that is returned
     * @return factorial of n
     */
    //make private method so this method is not accessible to outside methods any longer (since it is a helper method)
    private static int factorialTailRecursiveHelper(int n, int acc){
        //base case
        if(n <=1){
            return acc;
        }else{
            //recursive case
            return factorialTailRecursiveHelper(n-1, acc*n);
        }
    }

    /**
     *
     * @param n
     * @return
     */
    public static long fibonacciTailRecursive(long n){
        return fibonacciTailRecursiveHelper(n,1,0);
    }

    /**
     * recursive helper method to compute the nth fibonacci number using tail recursion
     * @param n
     * @param acc
     * @param last
     * @return nth fibonacci number
     */
    public static long fibonacciTailRecursiveHelper(long n, long acc, long last){
        //base case
        if  (n<=1){
            return acc;
        }else{
            //recursive case
            return fibonacciTailRecursiveHelper(n-1,acc+last,acc);
        }
    }
    public static void main(String[] args) {
        //int x = 0; -> never reaches base case -> stack overflow error -> change code from if(n==1) to if(n<=1)
        //int x = 5;
        //System.out.println("String");
        //System.out.println(x + "! = " + factorialRecursive(x));

        long x = 9;
        System.out.println("fibonacci("+x+") = " + fibonacciRecursive(x));

    }
}
