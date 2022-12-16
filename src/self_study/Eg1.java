package self_study;

public class Eg1 {

	public static void main(String[] args) {


		String m="Satara";
		String rev="";
		
		for (int i=m.length()-1;i>=0;i--)
		{
			char p = m.charAt(i);
			
			rev=rev+p;
		}
		System.err.println(rev);
	}

}
