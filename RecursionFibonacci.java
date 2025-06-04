class RecursionFibonacci{
    static int fibonacci(int n){
        if(n==0){ // base case1
        return 0;
        }else if (n==1){ //base case2
        return 1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);//recursion call 
        }
    }
    public static void main(String[] args){
        int terms=7;
        System.out.print("Fibonacci series:");
        for(int i=0; i<terms; i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
}