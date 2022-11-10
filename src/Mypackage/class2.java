package Mypackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface class2 {
    public static void main(String[] args) throws IOException {
        int i; int j;
         System.out.println("Enter two number");
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         i=Integer.parseInt(br.readLine());
         j=Integer.parseInt(br.readLine());
         System.out.println(i);
        System.out.println(j);
         int sum=i+j;
          int sub=i-j;
          int div=i/j;
          int mul=i*j;
          System.out.println(sum);
         System.out.println(sub);
         System.out.println(div);
         System.out.println(mul);
    }
}