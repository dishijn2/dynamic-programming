#include <iostream>
#include<string>
using namespace std;

int longestsub(string s1,string s2, int len1,int len2) {
	int LCS[len1+1][len2+2];
	for(int i=0;i<=len1;i++)
		LCS[i][0]=0;
	for(int j=0;j<=len2;j++)
		LCS[0][j]=0;
	for(int i=1;i<=len1;i++){
		for(int j=1;j<=len2;j++){
			if(s1[i-1]==s2[j-1]){
				LCS[i][j]=1+LCS[i-1][j-1];
			}
			else
				LCS[i][j]=max(LCS[i-1][j],LCS[i][j-1]);
		}
	}
	return LCS[len1][len2];
}
int main()
{
	string s1,s2;
	getline(cin,s1);
	getline(cin,s2);
	int len1 = s1.length();
	int len2 = s2.length();
    cout<<longestsub(s1,s2,len1,len2);
}
