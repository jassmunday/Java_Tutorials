public class java34recursion {
    static int fibonacci(int n){
       if(n==0) {
           return 0;
       }
        if(n == 1 || n == 2){
            return 1;
        }

       return fibonacci(n-1)+fibonacci(n-2);

    };
    public static void main(String[] args) {
        int max=10;
        for(int i=0;i<max;i++)
        {
            System.out.println(fibonacci(i));
        }
    }
}
