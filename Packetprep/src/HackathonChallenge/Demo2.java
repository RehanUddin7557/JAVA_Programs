package HackathonChallenge;

public class Demo2 {

	public static void main(String[] args) 
	
	{
		int start=3,end=7,sum=0;
		
		for(int index=start;index<=end;index++)
		{
			for(int i=index;1==1;i++)
			{
			if(isSpecialno(i)==true)
			{
         System.out.println(i);
				sum=sum+i;
				break;
			}
			}
		}

System.out.println("special characters are" + sum);
	}

	private static boolean isSpecialno(int n) {
		boolean res=false;
		int r;
		
		while(n>0)
		{
			r=n%10;
			
			if((r==2)||(r==5)) 
			{
				res=true;
			}
			else {
				res = false;
				break;
			}
			n=n/10;
		}
		
		return res;
	}

}

/*
 * In the Byteland country, a string S is said to super ASCII string if and only
 * if the count of each character in the string is equal to its ASCII value. In
 * the Byteland country ASCII code of ‘a’ is 1, ‘b’ is 2, …, ‘z’ is 26. The task
 * is to find out whether the given string is a super ASCII string or not. If
 * true, then print “Yes” otherwise print “No”.
 * 
 * Examples:
 * 
 * Input: S = “bba” Output: Yes Explanation: The count of character ‘b’ is 2 and
 * the ASCII value of ‘b’ is also 2. The count of character ‘a’ is 1. and the
 * ASCII value of ‘a’ is also 1. Hence, string “bba” is super ASCII String.
 * 
 * Input: S = “ssba” Output: No Explanation: The count of character ‘s’ is 2 and
 * the ASCII value of ‘s’ is 19. The count of character ‘b’ is 1. and the ASCII
 * value of ‘b’ is 2. Hence, string “ssba” is not a super ASCII String.
 * 
 */