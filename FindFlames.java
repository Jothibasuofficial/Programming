import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindFlames {
	
	public static void main(String args[]) throws IOException
	{   
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter your name: ");
	    String yourName=br.readLine();
	    System.out.println("Enter your partner's name: ");
	    String partnerName=br.readLine();
		StringBuffer s1=new StringBuffer(yourName);
		StringBuffer s2=new StringBuffer(partnerName);
		int a=s1.length();
		int b=s2.length();

	    //comparing two names
		label: for(int i=0;i<a;i++)
		{
			char c=s1.charAt(i);
		//	System.out.println(c);
			for(int j=0;j<b;j++)
			{
				char d=s2.charAt(j);
				if(c==d)
				{
					 ////k++;
					 s1.deleteCharAt(i);
					 s2.deleteCharAt(j);
					 ////System.out.println(s1 +" " +s2);
					 a=s1.length();
					 //m=a;
					 b=s2.length();
					 i=0;
					 j=0;
					// continue label;
				}
						}

	
		}
	  int d=(a+b);
	  System.out.println("the number is : " +d);
	  //int n=-1,l=0,p=0;
	  StringBuffer s3=new StringBuffer("flames");
	  String s4=new String();

      label1:	for(int i=0;i<5;i++)
				{
    	  			int n=-1,l=0,p=0;
    	  			for(int j=1;j<=d;j++)
    	  			{
    	  				n++;
    	  				l++;
    	  				//int p=0;
    	  				if(n>s3.length()-1)
    	  				{
    	  					char e=s3.charAt(p);
    	  					if(l==d)
    	  					{
    	  						s3.deleteCharAt(p);
    	  						//String s4=new String();
    	  						s4=s3.substring(p,s3.length());
    	  						////System.out.println(s4);
    	  						s3.delete(p,s3.length());
    	  						////System.out.println(s3);
    	  						s3.insert(0,s4);
    	  						////System.out.println(s3);
    	  						break;
    	  					}
    	  					else{ 
    	  						p++;
    	  						if(p==s3.length())
    	  						{
    	  							p=0;
    	  						}
                        }
				}
			else
				{
				char e=s3.charAt(n);
				if(l==d)
					{
					s3.deleteCharAt(n);

					s4=s3.substring(n,s3.length());
					////System.out.println(s4);
					s3.delete(n,s3.length());
			    	////System.out.println(s3);
					s3.insert(0,s4);
					////System.out.println(s3);
			    	break;
					}
					//break;
	    		}

    		}
   		 }
    ////System.out.println(s3);
    char result=s3.charAt(0);
    switch(result){
    	case 'f':
    	     System.out.println(partnerName+" is your Friend");
    	     break;
    	case 'l':
    		 System.out.println(partnerName+" is your Love");
    		 break;
        case 'a':
        	 System.out.println(partnerName+" is your Affection");
        	 break;
        case 'm':
        	 System.out.println("You are going to marry "+ partnerName);
        	 break;
        case 'e':
        	 System.out.println(partnerName + " is your Enemy");
        	 break;
        case 's':
        	 System.out.println(partnerName +" is ur Sister");
        	 break;
    		      }
	}

}
