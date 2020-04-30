import java.util.*;
public class Main
{
    public boolean subsetprob(int a[], int sum){
         boolean b[][] = new boolean[a.length + 1][sum + 1];
        //boolean flag =0;
        for(int i=0;i<=a.length;i++){
            b[i][0]=true;
        }
        for(int i=1;i<=a.length;i++){
            for(int j=1;j<=sum;j++){
                if(j>=a[i-1]){
                    b[i][j]=b[i-1][j]||b[i-1][j-a[i-1]];
                }
                else
                    b[i][j]=b[i-1][j];
            }
        }
        return b[a.length][sum];
    }
	public static void main(String[] args) {
	    Main m = new Main();
		int a[] = {2,3,7,8,10};
		int sum = 11;
		System.out.println(m.subsetprob(a,sum));
	}
}
