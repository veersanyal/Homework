public class Sign {
    public static final int HEIGHT = 7;

    public static void main(String[] args) {
        border();
        System.out.println();
        body();
        border();
    }
    static void border(){
        System.out.print("#");
        int counter = HEIGHT+9;
                for(int i = 0; i<counter; i++){
                    System.out.print("=");
        }
        System.out.print("#");
    }
    static void body(){
        for(int i= 0; i<HEIGHT; i++){
            line(i, HEIGHT+10);
            System.out.println();
        }
        for(int i= HEIGHT; i>-1; i--){
            line(i, HEIGHT+10);
            System.out.println();
        }
    }
    static void line(int length, int totallength){
        System.out.print("|");
        for(int i=0; i<((totallength-4)-(2*length))/2; i++ ){
            System.out.print(" ");
        }
        System.out.print("<>");
        for (int i=0;i<(2*length);i++) {
            System.out.print(".");
        };
        //for loop for dots
        System.out.print("<>");
        for(int i=0; i<(totallength-4-2*length)/2; i++ ){
            System.out.print(" ");
        }        System.out.print("|");
    }
}