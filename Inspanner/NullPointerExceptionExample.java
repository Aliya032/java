class NullPointerExceptionExample{
	public static void main(String args[]) {
		try {
			String s = null;
			System.out.println(s.length());
		}
		catch (NullPointerException v) {
			System.out.println("String should not be null");
			System.out.println(v);
		}
		System.out.println("Done execution");
	}
}