import java.util.StringTokenizer;


public class Day7_6 {

	public static void main(String[] args)
	{
		String str="https://admission.sunbeaminfo.com/aspx/RegistrationForm.aspx?BatchID=CD/EAOZS5tEyKUp3pGKKsQ==";
		StringTokenizer stk = new StringTokenizer(str,":/.?=",true);
		
		String token = null;
		
		while(stk.hasMoreTokens())
		{
			token=stk.nextToken();
			System.out.println(token);
		}

	}

}


/*
public class Day7_6 {

	public static void main(String[] args)
	{
		String str="https://admission.sunbeaminfo.com/aspx/RegistrationForm.aspx?BatchID=CD/EAOZS5tEyKUp3pGKKsQ==";
		StringTokenizer stk = new StringTokenizer(str,":/.?=");
		
		String token = null;
		
		while(stk.hasMoreTokens())
		{
			token=stk.nextToken();
			System.out.println(token);
		}

	}

}
*/



/*
public class Day7_6 {

	public static void main(String[] args)
	{
		String str="www.sunbeaminfo.com";
		StringTokenizer stk = new StringTokenizer(str,".");
		
		String token = null;
		
		while(stk.hasMoreTokens())
		{
			token=stk.nextToken();
			System.out.println(token);
		}

	}

}
*/



/*
public class Day7_6 {

	public static void main(String[] args)
	{
		String str="Sunbeam Infotech Pune";
		StringTokenizer stk = new StringTokenizer(str);
		
		String token = null;
		
		while(stk.hasMoreTokens())
		{
			token=stk.nextToken();
			System.out.println(token);
		}

	}

}
*/