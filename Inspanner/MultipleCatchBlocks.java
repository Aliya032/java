class MultipleCatchBlocks{
	public static void main(String args[]) {
		int a[] = {23, 24, 25};
		try {
			a[1] = 77;
			System.out.println(a[1]);
			String s = null;
			System.out.println(s.length());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array size is less " + e);
		}
		catch (NullPointerException e) {
			System.out.println("String should not be null");
		}
		System.out.println("done");
	}
}