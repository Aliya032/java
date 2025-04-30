class NumberFormatExceptionExample {
	public static void main(String args[]) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a + b;
			System.out.println("the sum of given numbers is: " + c);
		}
		catch (NumberFormatException e) {
			System.out.println("caught" + e);
			System.out.println("Please enter only integer values");
		}
		System.out.println("Execution is done");
	}
}
