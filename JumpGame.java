import java.util.*;
class JumpGame {
	public int minjump(int a[],int n){
		int minarr[] = new int[n];
		Arrays.fill(minarr,Integer.MAX_VALUE);
		minarr[0]=0;
		//minarr[1]=1;
		//patharr[0]=0;
		for(int i=1;i<n;i++){
			for(int j=0;j<i;j++){
				if(i<=a[j]+j){
					minarr[i]=Math.min(minarr[i],minarr[j]+1);	
				}
				
			}
		}
		return minarr[n-1];
	}
	public static void main(String args[]){
		JumpGame obj = new JumpGame();
		int a[] = {2,1,1,2,3};
		int n = a.length;
		System.out.println(obj.minjump(a,n));
	}
}