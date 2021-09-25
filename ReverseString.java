public class ReverseString {
	public static void main(String[] args)
	{
		String g = "Geekster is my class";
		char[] t = g.toCharArray();
		int l, r = 0;
		r = t.length - 1;

		for (l = 0; l < r; l++, r--) {
	
			char temp = t[l];
			t[l] = t[r];
			t[r] = temp;

		}

		for (char c : t)
			System.out.print(c);
		System.out.println();
	}
}
