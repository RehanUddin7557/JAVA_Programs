package HackathonChallenge;




public class Demo1 
{
		
 private static final char[] String = null;




private static String ConverttoText(int n)
	 {
		 String res=" ";
		 
		 
		 if(n>=21 && n<=99)
		 {
			 res = twoDigit(n);
		 
		 }
		 else
		 {
			//switch
			 switch(n) {
			 case 1: res="one"; break;
			 case 2: res="two"; break;
			 case 3: res="three"; break;
			 case 4: res="four"; break;
			 case 5: res="five"; break;
			 case 6: res="six"; break;
			 case 7: res="seven"; break;
			 case 8: res="eight"; break;
			 case 9: res="nine"; break;
			 case 10: res="ten"; break;
			 case 11: res="eleven"; break;
			 case 12: res="twelve"; break;
			 case 13: res="thirteen"; break;
			 case 14: res="fourteen"; break;
			 case 15: res="fifteen"; break;
			 case 16: res="sixteen"; break;
			 case 17: res="seventeen"; break;
			 case 18: res="eighteen"; break;
			 case 19: res="nineteen"; break;
			 
		 
			 
			 case 20: res="twenty"; break;
			 case 30: res="thirty"; break;
			 case 40: res="forty"; break;
			 case 50: res="fifty"; break;
			 case 60: res="sixty"; break;
			 case 70: res="seventy"; break;
			 case 80: res="eighty"; break;
			 case 90: res="ninety"; break;
			 case 100: res="hundred"; break; 
		 }
		 }
		return res;
	 }
		 
		 
		 

		 
		 
		 
		 
		 //IF METHOD
//		      if(n==1) res ="one";	      
//		 else if(n==2) res="two";
//		 else if(n==3) res="three";
//		 else if(n==4) res="four";
//		 else if(n==5) res="five";
//		 else if(n==6) res="six";
//		 else if(n==7) res="seven";
//		 else if(n==8) res="eight";
//		 else if(n==9) res="nine";
//		 else if(n==10) res="ten";
//		 else if(n==11) res="eleven";
//		 else if(n==12) res="twelve";
//		 else if(n==13) res="thirteen";
//		 else if(n==14) res="fourteen";
//		 else if(n==15) res="fifteen";
//		 else if(n==16) res="sixteen";
//		 else if(n==17) res="seventeen";
//		 else if(n==18) res="eighteen";
//		 else if(n==19) res="nineteen";
//		      
//		 else if(n==20) res="twenty";
//		 else if(n==30) res="thirty";
//		 else if(n==40) res="forty";
//		 else if(n==50) res="fifty";
//		 else if(n==60) res="sixty";
//		 else if(n==70) res="seventy";
//		 else if(n==80) res="eighty";
//		 else if(n==90) res="ninety";
//		 else if(n==100) res="hundred";
		
		 
//		 else 
//		 {
//			 res = twoDigit(n);
//		 }
//			return res;
//		 
//	 }  
// 
 
		      
	private static String twoDigit(int m)
		{
		 		 String twoRes =" ";
		 		 
		 		 int first,last;
		 		 
		 		 last= m %10;
		 		 first=m/10;
		 		 
		 	switch(m) 
		 	{
		 	
		 	
		 	 case 2: twoRes="twenty"; break;
			 case 3: twoRes="thirty"; break;
			 case 4: twoRes="forty"; break;
			 case 5: twoRes="fifty"; break;
			 case 6: twoRes="sixty"; break;
			 case 7: twoRes="seventy"; break;
			 case 8: twoRes="eighty"; break;
			 case 9: twoRes="ninety"; break;
		 	
		 	
		 	}
		 		 
		 	
		 	switch(first)
		 	{
		 	
		 	 case 1: twoRes=twoRes+ "one"; break;
			 case 2: twoRes=twoRes+ "two"; break;
			 case 3: twoRes=twoRes+ "three"; break;
			 case 4: twoRes=twoRes+ "four"; break;
			 case 5: twoRes=twoRes+ "five"; break;
			 case 6: twoRes=twoRes+ "six"; break;
			 case 7: twoRes=twoRes+ "seven"; break;
			 case 8: twoRes=twoRes+ "eight"; break;
			 case 9: twoRes=twoRes+ "nine"; break;
		 	
		 	}
		 	
		 	
		 	
		 	//if method
		 		 
//		 	          if(first==2)  twoRes="twenty";
//				 else if(first==3)  twoRes="thirty";
//				 else if(first==4)  twoRes="forty";
//				 else if(first==5)  twoRes="fifty";
//				 else if(first==6)  twoRes="sixty";
//				 else if(first==7)  twoRes="seventy";
//				 else if(first==8)  twoRes="eighty";
//				 else if(first==9)  twoRes="ninety";
//				 
//		 		 
//		 		              if(last==1)  twoRes = twoRes + "one";
//						 else if(last==2)  twoRes = twoRes + "two";
//						 else if(last==3)  twoRes = twoRes + "three";
//						 else if(last==4)  twoRes = twoRes + "four";
//						 else if(last==5)  twoRes = twoRes + "five";
//						 else if(last==6)  twoRes = twoRes + "six";
//						 else if(last==7)  twoRes = twoRes + "seven";
//						 else if(last==8)  twoRes = twoRes + "eight";
//						 else if(last==9)  twoRes = twoRes + "nine";
//							
		 		              
		 		              return twoRes;
						 
		
		  }
	
	
	static int countVowels(String name)
	{
		int count=0;
		
		for(int i=0;i<name.length();i++)
		{
			if((name.charAt(i)=='a') || (name.charAt(i)=='e') || (name.charAt(i)=='i') || (name.charAt(i)=='o') ||
			(name.charAt(i)=='u') )
			{
				count++;
			}
		}
		return count;
		
	}
	
	
	
 
	public static void main(String[] args) 
	{
		
		int[] data= {1,2,3,4,5};
	
		
		
		
		
		System.out.println(String);
		
		
//		int d=0;
//		
//		for(int index=0;index < data.length;index++)
//		{
//		String sample = ConverttoText(data[index]);
//		
//		int t =countVowels(sample);
//		d=d+t;
//	    }
//		
//		
//		int pSum=0,finalres=0;
//		
//		for(int i=0;i<data.length;i++)
//		{
//			for(int j=i+1;j<data.length;j++)
//			{
//				pSum =data[i]+data[j];
//				if(pSum==d)
//				{
//					finalres++;
//				}
//			}
//		}
//		
		
		

	}
	





}
