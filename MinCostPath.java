import java.util.*;
class MinCostPath {
	public int minfunc(int a[][], int m, int n){
		int t[][] = new int[m][n];
		t[0][0] = a[0][0];
		for(int i=1;i<m;i++){
			t[i][0]=a[i][0]+t[i-1][0];
		}
		for(int j=1;j<n;j++){
			t[0][j] = a[0][j]+a[0][j-1];
		}
		for(int i=1;i<m;i++){
			for(int j=1;j<n;j++){
				t[i][j]=Math.min(t[i][j-1]+a[i][j],t[i-1][j]+a[i][j]);
			}
		}
		return t[m-1][n-1];
	}
	public static void main(String args[]){
		MinCostPath m = new MinCostPath();
		int a[][] = {{1,3,5,8},
					{4,2,1,7},
					{4,3,2,3}};
		System.out.println(m.minfunc(a,3,4));
	}	
}
