import java.util.*;
public class MaxsumSS {
	public int maxsumfunc(int a[]){
		int len = a.length;
		int max=0;
		int temp[] = new int[len];
		for(int i=0;i<len;i++){
			temp[i]=a[i];
		}
		for(int i=1;i<len;i++){
			for(int j =0;j<i;j++){
				if(a[j]<a[i]){
					temp[i]=Math.max(temp[i],temp[j]+a[i]);
				}
			}
		}
		for(int k=0;k<len;k++){
			if(temp[k]>=max){
				max=temp[k];
			}
		}
		return max;
	}
	public static void main(String args[]){
		MaxsumSS m = new MaxsumSS();
		int a[] = {4,6,1,5,3,7};
		System.out.println(m.maxsumfunc(a));
	}
}