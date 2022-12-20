package hh;
import java.net.SocketOption;
import java.util.*;
public class ººÅµËþ {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        tower(a,'A','B','C');
    }
    public static void tower(int a,char A,char B,char C){
        if(a==1){
            System.out.println(A+"->"+C);
        }else {
            tower(a-1,A,C,B);
            System.out.println(A+"->"+C);
            tower(a-1,B,A,C);

        }
    }
}
