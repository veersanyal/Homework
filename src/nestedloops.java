public class nestedloops {
    public static void main(String[] args){
        printtable(5,5);
        printmult(5, 5);
        printincre(5);
        printdecre(5);
        printincco(5);
        printincde(6);
        printincchar(5);
        printdecchar(5);
    }
    static void printtable (int n,int m){
        for(int i =1; i<n+1; i++){
          for(int j =1; j<m+1; j++) {
            System.out.print(i);
        }
          System.out.println("");
        }
    }
    static void printmult (int n,int m) {
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                System.out.print(i*j +" ");
            }
            System.out.println("");
        }
    }
    static void printincre (int n){
        for (int i=1; i<n+1; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
        System.out.println();
    }
    static void printdecre (int n){
        for (int i=n; i>0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
    static void printincco (int n){
        for (int i=1; i<n+1; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println();
    }
    static void printincde (int n){
        for (int i=n; i>0; i--) {
            for (int j = 2; j< i+1; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    static void printincchar (int n){
        for (int i=1; i<n+1; i++) {
            for (int j = 65; j < 65+i; j++) {
                System.out.print((char)j);
            }
            System.out.println("");
        }
        System.out.println();
    }
    static void printdecchar (int n){
        for (int i=n; i>0; i--) {
            for (int j = 90; j>90-i; j--) {
                System.out.print((char)j);
            }
            System.out.println("");
        }
    }
}
