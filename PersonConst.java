
public class PersonConst {
	public static final int a =15; 
	private String name;
	private String address;
	public PersonConst () {
		System.out.println("Default Constructor");
	}
	public PersonConst (String name,String address) {
		this.name = name;
		this.address = address;
	}
	public static void main(String[] args) {
		PersonConst P= new PersonConst ();
		PersonConst P1 = new PersonConst("ajay" , "30 vishnupri");
		System.out.println(P1.name);
		System.out.println(P1.address);
		System.out.println(PersonConst.a);
	}	
}
