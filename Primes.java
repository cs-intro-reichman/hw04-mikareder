public class Primes {
    public static void main(String[] args) {
         final int N = Integer.parseInt(args[0]);
         System.out.println("Prime numbers up to " + N + ":");
         int count=0;
         double p;
            for(int i=1; i<=N;i++){
                if (isPrime(i)){
                    System.out.println(i);
                    count++;
                }
                
        }
        p= ((double)count/N) *100.0;
        System.out.println("There are "+count+" primes between 2 and "+N+" ("+(int)p+"% are primes)");
    }
                public static boolean isPrime(int n) {
                if (n < 2) return false;

                for (int i = 2; i * i <= n; i++) {
                    if (n % i == 0) {
                        return false;  
                    }
                }

                return true; 
            }
       
}   