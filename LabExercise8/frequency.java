Package lab ex 8;
import java.io.*;
import java.util.*;
class frequency
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);

//Prompting user for input
System.out.print("The Given String is : ");
String input=sc.next().toLowerCase(); 
int len=input.length();
int index=0;

//Array used to store frquency with same index as String input
int ans[]=new int[len];

do
{
int count=0;

//Comparing every element with every other element and Storing their frequency in another integer array
for(int i =0;i<len;i++)
{

if(input.charAt(index)==input.charAt(i))
{
count++;
}
}
ans[index]=count;
index++;
}
while(index<len);

//Computing the element with highest frequency from array where frequencies are stored 
int max=0;
for(int j=0;j<len-1;j++)
{
for (int i=1; i<len; i++) {
	if(ans[i]>=ans[j] && ans[i]>=ans[max])
	{
     max=i;
	}
	else if(ans[j]>=ans[max])
		{
			max=j;
		}
}
}


//Replacing the element with highest frequency with zero in frequency array

for(int i=0;i<len;i++)
{
	if (ans[i]==ans[max]) {
		ans[i]=0;
	}
}

//Computing the element with highest frequency from frequency array which is the second most frequent character 

max=0;
for(int j=len-1;j>=0;j--)
{
for (int i=len-2; i>=1; i--) {
	if(ans[i]>=ans[j] && ans[i]>=ans[max])
	{
     max=i;
	}
	else if(ans[j]>=ans[max])
		{
			max=j;
		}
}
}


System.out.print("The second most frequent character in the string : "+input.charAt(max));

}

}