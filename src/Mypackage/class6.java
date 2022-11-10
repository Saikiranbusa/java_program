package Mypackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class6 {
    public static void main(String[] args) throws IOException {
        int s, r, t;
        System.out.println("give your number");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        s=Integer.parseInt(br.readLine());
        r=Integer.parseInt(br.readLine());
        t=Integer.parseInt(br.readLine());
        switch (s){
            case 1:
                if (r<t);
                System.out.println(r+t);
                break;
            case 2:
                if (r>=t);
                System.out.println(r-t);
                break;
            default:
                System.out.println("wrong num" );
        }
    }
}
