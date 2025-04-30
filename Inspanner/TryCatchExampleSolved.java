class TryCatchExampleSolved {
	public static void main(String args[]) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a +b;
			System.out.println(c);
		}
		catch(ArrayIndexOutOfBoundsException abc) {
			System.out.println(abc);
			System.out.println("The format is not correct");
		}
	}
}