package Mypackage;
class kiran{
    int tableno; String order;
    public void met(){
        System.out.println(tableno);
        System.out.println(order);
    }
    public void  met1(){
        int sum=tableno+2;
        System.out.println(sum);
        System.out.println(order.length());
    }
}
public class insideclass {
    public static void main(String[] args) {
        kiran ki= new kiran();
        ki.tableno=14; ki.order="chilly panner";
        ki.met();
        ki.met1();
    }
}
