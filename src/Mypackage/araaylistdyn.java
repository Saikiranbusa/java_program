package Mypackage;

public class araaylistdyn {
    public static int sum (int...numbers){ //int[] numbers ={1,2,3,4,5}
        int sum=0;
        for(int j=0; j<numbers.length;j++){
            sum=sum+numbers[j];
        }return sum;
    }
    public static void main(String[] args){
        araaylistdyn  cw=new  araaylistdyn();
        System.out.println(cw.sum(1,2,3,4,5));
    }
}