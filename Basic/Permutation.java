 
public class Permutation 
{ 
	public static void main(String[] args) 
	{ 
		String str = "ABC"; 
		int n = str.length(); 
		Permutation permutation = 
		new Permutation(); 
		permutation.permute(str, 0, n-1); 
	} 
	private void permute(String str, 
						int fix, int length) 
	{ 
		if (fix == length) 
			System.out.println(str); 
		else
		{ 
			for (int i = fix; i <= length; i++) 
			{ 
				str = swap(str,fix,i); 
				permute(str, fix+1, length); 
				str = swap(str,fix,i); 
			} 
		} 
	} 
	public String swap(String a, 
					int i, int j) 
	{ 
		char temp; 
		char[] charArray = a.toCharArray(); 
		temp = charArray[i] ; 
		charArray[i] = charArray[j]; 
		charArray[j] = temp; 
		return String.valueOf(charArray); 
	} 
} 

