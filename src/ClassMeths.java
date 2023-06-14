public class ClassMeths {
	private String usrName;
	public void setName(String usr) {
		usrName = usr;
	}
	public String getName() {
		return usrName;
	}
	
	public void declaring() {
		System.out.printf("Your username is %s", getName());
	}	
	
}