package cucumbermap;

public class splitString {
	

public static void solution(String a)
{
	StringBuffer alpha=new StringBuffer(),
	               num=new StringBuffer(),
	             charr=new StringBuffer();
	
	for(int i=0; i<a.length(); i++)
	{
		if(Character.isAlphabetic(a.charAt(i)))
		{
			alpha.append(a.charAt(i));
		}else if(Character.isDigit(a.charAt(i)))
		{
			num.append(a.charAt(i));
		}else
		{
			charr.append(a.charAt(i));
		}
	}
	
	System.out.println(alpha);
	System.out.println(num);
	System.out.println(charr);

}
	
public static void main(String[] args) 
{

	solution("(1Hri<234s<5h*6>7ike8>s9h1)0");

	
	
}
}
