/**
 * Created by jiash on 2017-04-22.
 */

public class MultiplyTable {
    public static void main(String[] args){
        for(int m=1;m<=9;m++){
            for(int n=1;n<=m;n++)
                System.out.print(m + "*" + n + "=" + m*n + " ");
            System.out.println();
        }
    }
}
