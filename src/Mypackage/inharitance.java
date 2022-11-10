package Mypackage;
class sai{
    int x;
    int y;

    public int cal(int x, int y){
        return x+y;
    }
}
class sai1 extends sai{
    public int cal1(int x, int y) {
        return x-y;
    }

}
class sai2 extends sai1{
    public int cal2(int x, int y) {
        return x*y;
    }


}
public class inharitance {
    public static void main(String[] args) {
        sai2 s = new sai2();
        //sai s1 = new sai1();
        System.out.println(s.cal(5, 2));
        System.out.println(s.cal1(5, 2));
        System.out.println(s.cal2(5, 2));
    }
}
