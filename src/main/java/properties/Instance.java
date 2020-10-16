package properties;

public class Instance {
	private Instance() {
		
	}
	
	public static FileReadMan getInsta() {
		FileReadMan ob=new FileReadMan();
		return ob;
	}

}
