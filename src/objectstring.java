//Write a program that prints out the first five letters of a
//string, then the last five letters of a string.  Use only two
//variables.
public class objectstring {
public static void main (String[] args){
    String str="This is the string for testing";
printstring(5, str);
}
    static void printstring (int n, String s){
    int length=s.length();
    if( length<n){
        System.out.println("The string is too small");
        return;
    }
    System.out.println("printing first " + n + " letters");
    System.out.println(s.substring (0,n-1));
    System.out.println("printing last " + n + " letters");
    System.out.println(s.substring (length-n, length));
    }
}
