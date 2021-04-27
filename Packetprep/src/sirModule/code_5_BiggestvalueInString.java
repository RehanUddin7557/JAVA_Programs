package sirModule;

public class code_5_BiggestvalueInString
{

	public static void main(String[] args) 
	{
	int 		num=1279839,	res=0,  store; // 131513366899
		
			while(num > 0) 
			{
			store = num % 10;// 1279 % 10 
			
				if(store == 9) 
				{
				res = store;
				break;
				}
				else if(res < store )
				{
				res = store;
				}
				
			num = num / 10;// 1279 / 10 == 127
		}

		System.out.println("Max ...." + res);
	}

}
