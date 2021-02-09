package com.rays.marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MarksheetModel {
		/*public void add(MarksheetBean bean) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
        conn.setAutoCommit(false);
		PreparedStatement pe= conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?,?)");
        
		pe.setInt(1, bean.getId());
		pe.setString(2,bean.getRollno());
        pe.setString(3, bean.getFname());
		pe.setString(4, bean.getLname());
		pe.setInt(5, bean.getPhy());
		pe.setInt(6, bean.getChe());
		pe.setInt(7, bean.getMat());
		
		pe.executeUpdate();
		conn.commit();
		System.out.println("INSERTED");
		
		pe.close();
		conn.close();*/

	/*public void update(MarksheetBean bean) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
        conn.setAutoCommit(false);
		PreparedStatement pe= conn.prepareStatement("update marksheet set rollno =?,fname=?,lname=?,phy =?,che=?,mat=? where id =?");
        

		pe.setString(1,bean.getRollno());
        pe.setString(2, bean.getFname());
		pe.setString(3, bean.getLname());
		pe.setInt(4, bean.getPhy());
		pe.setInt(5, bean.getChe());
		pe.setInt(6, bean.getMat());
		pe.setInt(7, bean.getId());
		
		pe.executeUpdate();
		conn.commit();
		System.out.println("UPDATED");
		
		pe.close();
		conn.close();
		*/
	
	
		/*public void delete(MarksheetBean bean) throws Exception{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
	        conn.setAutoCommit(false);
			PreparedStatement pe= conn.prepareStatement("delete from marksheet where id = ?");
	        
			pe.setInt(1, bean.getId());
		    pe.executeUpdate();
			conn.commit();
			System.out.println("DELETED");
			
			pe.close();
			conn.close();*/

		/*public void get(MarksheetBean bean) throws Exception{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
	        conn.setAutoCommit(false);
			PreparedStatement pe= conn.prepareStatement("select * from marksheet where rollno=?"); 
			pe.setString(1, bean.getRollno());
			ResultSet rs = (ResultSet) pe.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getInt(5));
				System.out.println(rs.getInt(6));
				System.out.println(rs.getInt(7));
			}			
				pe.close();
				conn.close();
		}
		}*/
	
	
	public void search(MarksheetBean bean) throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
    conn.setAutoCommit(false);
	PreparedStatement pe= conn.prepareStatement("select * from marksheet where id=?");
 
	pe.setInt(1, bean.getId());
	ResultSet rs = (ResultSet) pe.executeQuery();
	while (rs.next()) {
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));
		System.out.println(rs.getString(4));
		System.out.println(rs.getInt(5));
		System.out.println(rs.getInt(6));
		System.out.println(rs.getInt(7));
	pe.close();
	conn.close();
	}
	}
}
	
	/*	public void MeritList(MarksheetBean Beans) throws Exception{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		    conn.setAutoCommit(false);
			PreparedStatement pe= conn.prepareStatement("select *,(phy+che+mat) as total, (((phy+che+mat)/300)*100) as percentage from marksheet");
		    ResultSet rs = (ResultSet) pe.executeQuery();
		    while (rs.next()) {
		    	System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getInt(5));
				System.out.println(rs.getInt(6));
				System.out.println(rs.getInt(7));
				System.out.println(rs.getInt(8));
				System.out.println(rs.getInt(9) + "%");
		    }
		    
			
			pe.close();
			conn.close();
}
		}
*/

	