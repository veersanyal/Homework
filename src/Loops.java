
public class Loops {
    int counter;
    int smallcounter;
    public static void main(String[] args) {
        Loops veer = new Loops(10, 5);
        System.out.println("running veer");
        veer.run();
        Loops jyoti = new Loops(9,4);
        System.out.println("running Jyoti");
        jyoti.run();
    }
    Loops (int count, int smallcount) {
        this.smallcounter = smallcount;
        this.counter = count;
    }

    void run (){
        printLoop ()  ;
        printSequence();
        printSum();
        printFactorial();
        printTable(5,10);
    }
    void printLoop () {
        for (int i = 0; i<counter ; i++){
            System.out.println(" All work and no play makes Jack a dull boy");
        }
        printSequence();

    }
     void printSequence (){
        for (int i=1 ; i<counter+1; i++){
            System.out.println(i);
        }

    }
     void printSum(){
        int sum = 0;
        for (int i = 0; i<counter+1; i++){
            sum = sum+ i;
        }
        System.out.println(sum);

    }
     void printFactorial (){
        int fact = 1;
        for (int i = 1; i<smallcounter+1; i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }

     void printTable (int n, int m) {
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