package LearnStringProg;

public class ReverseStringExtractNo_08Dec {
	public static void main(String[] args) {
		String s = "Aabb1235dd45ee1ff44";

		String[] st = s.split("[A-Z a-z]");
		
		for (int i = st.length-1; i >=0 ; i--) 
		{
			System.out.print(st[i]+" ");
			
		}
		

	}

}
