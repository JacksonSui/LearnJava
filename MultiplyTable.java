/**
 * Created by jiash on 2017-04-22.
 */
class OneMulty{
    int m;
    void multi(int n){
        System.out.print(m + "*" + n + "=" + m*n + " ");
    }
}

public class MultiplyTable {
    public static void main(String[] args){
        OneMulty mul = new OneMulty();
        for(int i=1;i<=9;i++){
            mul.m=i;
            for(int n=1;n<=i;n++)
                mul.multi(n);
            System.out.println();
        }
    }
}
