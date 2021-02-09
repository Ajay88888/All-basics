package com.rays.marksheet;

public class TestMarksheet {
	public static void main(String[] args) throws Exception {
//		testAdd();
//		update();
//		delete();
//		get();
	search();
//		meritlist();
	}
	private static void search() throws Exception {
		MarksheetBean bean4=new MarksheetBean();
		bean4.setId(2);
		MarksheetModel m=new MarksheetModel();
		m.search(bean4);
	}
}
	

	/*private static void meritlist()  throws Exception{
		MarksheetBean bean7 = new MarksheetBean();
		MarksheetModel m7 = new MarksheetModel();
		((MarksheetModel) model).meritList(bean7);
	}
}*/
	
	/*private static void get() throws Exception {
		MarksheetBean bean3=new MarksheetBean();
		bean3.setRollno("Rays106");
		MarksheetModel m=new MarksheetModel();
		m.get(bean3);
	}
	*/
	
	/*public static void testAdd() throws Exception {
		MarksheetBean bean=new MarksheetBean();
		bean.setId(2);
		bean.setRollno("Rays102");
		bean.setFname("ayush");
		bean.setLname("parmar");
		bean.setPhy(60);
		bean.setChe(70);
		bean.setMat(50);
		
		MarksheetModel m=new MarksheetModel();
		m.add(bean);
		*/

		
	/*public static void update() throws Exception {
		MarksheetBean bean=new MarksheetBean();
		bean.setId(1);
		bean.setRollno("Rays106");
		bean.setFname("mak");
		bean.setLname("jhon");
		bean.setPhy(50);
		bean.setChe(66);
		bean.setMat(76);
		
		MarksheetModel m=new MarksheetModel();
		m.update(bean);*/
	
	
	/*public  static void delete() throws Exception {
		MarksheetBean bean=new MarksheetBean();
		bean.setId(2);
		
		
		MarksheetModel m=new MarksheetModel();
		m.delete(bean);
	*/


	
