import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		String a, longWord,shortWord;
		
		int length,positionLongWord=0,positionShortWord=0,length1=0,i;
		
		ArrayList<String> words= new ArrayList<String>();
		
		System.out.print("Please enter some words ending with Q: ");

		// part a 
		a = in.next();
		while(!(a.equals("Q")))
		{ 
			words.add(a);
			a=in.next();
		}

		// part b
		System.out.print("The words with even number of characters: ");
		for(String val:words)
		{
			length=val.length();
			if(length%2==0)
			{ 
				System.out.print(val+" ");
			}
		}
		System.out.println("");

		// part c 
		length1=(words.get(0)).length();
		for(i=0;i<words.size();i++)
		{
			length=(words.get(i)).length();
			if(length1<length)
			{
				length1=length;
			}
		}
		
		System.out.print("The longest word(s): ");
		for(i=0;i<words.size();i++)
		{
			length=(words.get(i)).length();
			if(length1==length)
			{
				longWord=words.get(i);
				positionLongWord=i+1;
				System.out.print(longWord+" (its order in the list is "+positionLongWord+") ");
			}
		}
		System.out.println("");

		// part d
		length1=(words.get(0)).length();
		for(i=0;i<words.size();i++)
		{
			length=(words.get(i)).length();
			if(length1>length)
			{
				length1=length;
			}
		}
		
		System.out.print("The shortest word(s): ");
		for(i=0;i<words.size();i++)
		{
			length=(words.get(i)).length();
			if(length1==length)
			{
				shortWord=words.get(i);
				positionShortWord=i+1;
				System.out.print(shortWord+" (its order in the list is "+positionShortWord+") " );
			}
		}
		in.close();
	}
}