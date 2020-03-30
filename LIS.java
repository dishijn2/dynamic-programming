import java.util.*;
class LIS{
	public int lisfunc(int a[], int n){
		int temp[] = new int[n];
		int max = 0;
		for(int i=0;i<n;i++){
			temp[i] = 1; 
		}
		for(int i=1;i<n;i++){
			for(int j=0;j<i;j++){
				if(a[i]>a[j] && temp[i]<temp[j]+1){
					temp[i]=temp[j]+1;
				}
			}
		}
		for(int i=0;i<n;i++){
			if(max<temp[i])
				max=temp[i];
		}
		return max;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		LIS l = new LIS();
		int a[] = {4,5,7,3,1};
		int n=a.length;
		System.out.println(l.lisfunc(a,n));
	}
}