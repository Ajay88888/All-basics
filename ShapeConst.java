public class ShapeConst {
public static final double p = 3.14;

	private String color;
	private int borderWidth;
	public ShapeConst () {
		System.out.println("DEFAULT CONSTRUCTOR");
		}
	public ShapeConst (String color,int bw) {
		this.color = color;
		borderWidth = bw;
	}
	public static void main(String[] args) {
		ShapeConst s = new ShapeConst ();
		ShapeConst s1 = new ShapeConst("grey" , 10);
		System.out.println(s1.color);
		System.out.println(s1.borderWidth);
		System.out.println(ShapeConst.p);
	}
}
