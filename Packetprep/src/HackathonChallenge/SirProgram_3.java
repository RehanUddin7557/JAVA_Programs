package HackathonChallenge;

public class SirProgram_3 {
	public static void main(String[] args)
	{
		int[] data = {6,17};//one//two//six//seventeen///1+4=5
		String eachDigitText;
		
		
		
		int eachVowelCount,sum=0,pairSum=0,resSum = 0;;
		for(int i=0;i<data.length;i++) {
		eachDigitText = digitToText(data[i]);
		eachVowelCount = countVowels(eachDigitText);
		sum = sum + eachVowelCount;
		}// for

		System.out.println("Sum....sum"+sum);

		for(int i=0;i<data.length;i++) {
		for(int j=i+1;j<data.length;j++) {
		pairSum = data[i]+data[j];

		if(sum == pairSum) {
		resSum++;
		}//if
		}//j
		}//i

		System.out.println("Result Sum........  "+resSum);

		}// main

		private static int countVowels(String eachDigitText) {
		int count =0;
		char ch;
		for(int index=0;index<eachDigitText.length();index++) {
		ch= eachDigitText.charAt(index);
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u': count++;
		}
		}
		return count;
		}

		private static String oneToNine(int n) {
		String res = "";
		switch(n) {

		case 1: res = "one";break;
		case 2: res = "two";break;
		case 3: res = "three"; break;
		case 4: res = "four"; break;
		case 5: res = "five"; break;
		case 6: res = "six"; break;
		case 7: res = "seven";break;
		case 8: res ="eight";break;
		case 9: res = "nine";break;
		}

		return res;
		}



		private static String  digitToText(int num) {

		String res = "";

		if(num >=21 && num <=99) {

		res = twoDigitNoText(num);
		}
		else if(num >=1 && num <=9) {
		res = oneToNine(num);
		}
		else {

		switch(num) {

		case 10: res = "ten";break;
		case 11: res = "eleven"; break;
		case 12: res = "tweleve"; break;
		case 13: res = "thirteen";break;
		case 14: res = "fourteen";break;
		case 15: res = "fifteen";break;
		case 16: res = "sixteen"; break;
		case 17: res = "seventeen";break;
		case 18: res = "eighteen";break;
		case 19: res = "nineteen";break;
		case 20: res = "twenty";break;
		case 30: res = "thirty";break;
		case 40: res = "fourty";break;
		case 50: res = "fifty";break;
		case 60: res = "sixty";break;
		case 70: res = "seventy";break;
		case 80: res = "eighty";break;
		case 90: res = "ninety";break;
		case 100: res = "hundred";break;

		}
		}

		return res;
		}

		private static String twoDigitNoText(int num) {
		String twoRes = "";
		int first,last;
		last= num % 10;
		first = num/10;
		
		switch(first) 
		{
		case 2: twoRes = "twenty";break;
		case 3: twoRes = "thirty";break;
		case 4: twoRes = "fourty";break;
		case 5: twoRes = "fifty";break;
		case 6: twoRes = "sixty";break;
		case 7: twoRes = "seventy";break;
		case 8: twoRes = "eighty";break;
		case 9: twoRes = "ninety";break;
		}
		twoRes = twoRes + oneToNine(last);
		return twoRes;
		}
}
