public class FirstNonRepeatedChar
{ 	
    public static void main(String[] args) 
    { 
        String str ="sammyajhhjhweheuutj,n,nzbvcxbvmnbnzdvxcmnbmnbqwnqe,n,mnzcvx,,knzxcv,nzvms";
        int cnt=0;
        for(int i=0;i<str.length();i++)
        {
        	for(int j=0;j<str.length();j++)
            {
		            	if(str.charAt(i)==str.charAt(j))
			        	{
		                    cnt++;
		                    if(cnt==1)
			        		{
			        		continue;
			        		}
			        	}
	        	}
        	if(cnt==1 && str.charAt(i)!=str.charAt(i+1))
    		{
    			System.out.println(str.charAt(i));
    		}
    		cnt=0;
	    }	
     }
}