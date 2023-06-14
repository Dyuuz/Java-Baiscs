class AbstractMain{
	public static void main(String []args) {
		Page myObj = new Page();
		
		System.out.println(myObj.name+ "'s obsession with "+ myObj.skills + " skills has made him $"+ myObj.profit+" "
				+ "profit with just "+myObj.frequency+" trades today.");
		myObj.print();
	}
}