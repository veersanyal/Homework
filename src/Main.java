public class Main {
    public static void main(String[] args) {
        printLoop (1000)  ;
        printSequence(1000);
        printSum( 1000);
        printFactorial(5);
        printTable(5,10);
    }

    static void printLoop (int n) {
        for (int i = 0; i<n ; i++){
            System.out.println(" All work and no play makes Jack a dull boy");
        }

    }
    static void printSequence (int n){
        for (int i=1 ; i<n+1; i++){
            System.out.println(i);
        }

    }
    static void printSum(int n){
        int sum = 0;
        for (int i = 0; i<n+1; i++){
            sum = sum+ i;
        }
        System.out.println(sum);

    }
    static void printFactorial (int n){
        int fact = 1;
        for (int i = 1; i<n+1; i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }

    static void printTable (int n, int m) {
        System.out.print("   "  );
        for (int i = 1; i<m+1; i++){
            System.out.print("| " + i+ " ");
        }
        System.out.println("");
        System.out.println("-----------------------------------");
        for (int i = 1; i<n+1; i++){
            System.out.print (i + "  | ");
            for (int j=1; j<m+1; j++){
                System.out.print(i * j);
                System.out.print("   ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("------------------------------------");

    }
}