class Main {
	public static void main(String[] args)
	{
		if (args.length > 0) {
			System.out.println("Argument"+args[0]);
			for (String val : args)
				System.out.println(val);
		}
               else
                  System.out.println("No arguments given"+args[0]);
	}
}

       
