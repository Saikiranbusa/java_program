package Mypackage;

public class overload {
    public static void span() {
        System.out.println("kiran");
    }
    public static void span(int s) {
        System.out.println("kiran"+s);
    }
    public static void main(String[] args){
        overload k= new overload();
        k.span();

    }
}
