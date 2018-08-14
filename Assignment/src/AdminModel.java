import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class AdminModel {
   String url = "jdbc:oracle:thin:@//localhost:1521/XE";
   String un = "SYSTEM";
   String pd = "system";
   Connection con = null;
   PreparedStatement pstmt = null;
   ResultSet res = null;
   private String name;
   private String password;
   private String username;
   private String usn;
	private String branch;
	private String sem;
	private String gender;
	private String totalfees;
	private String feespaid;
	private int remainingfees;
   
   public AdminModel()
   {
	   try {
		DriverManager.registerDriver(new OracleDriver());
		con = DriverManager.getConnection(url,un,pd);
		System.out.println("connected");
	} catch (SQLException e) {
		e.printStackTrace();
	}
	   
   }
   public boolean account()
   {
	   try {
	   String s = "insert into Acoount values(?,?,?)";
	   pstmt = con.prepareStatement(s);
	   pstmt.setString(1, name);
	   pstmt.setString(2, username);
	   pstmt.setString(3, password);
	   int row = pstmt.executeUpdate();
	   if(row>0)
	   {
		   return true;
	   }
	   else
	   {
		   return false;
	   }
	  }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	return false;
   }
   public boolean delete()
   {
	try {
	String s = "Delete from Acoount where AccountName = ?";
	pstmt = con.prepareStatement(s);
	pstmt.setString(1, name);
	int row = pstmt.executeUpdate();
	if(row>0)
	{
		return true;
	}
	else
	{
		return false;
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return false;
   }
   public boolean aCCount() {
   try {
		String s = "Select * from Acoount where USERNAME=?";
		pstmt = con.prepareStatement(s);
		pstmt.setString(1, username);
		res = pstmt.executeQuery();
		if(res.next()==true) {
			username = res.getString(2);
			String c = res.getString(3);
			
			if(c.equals(password))
				return true;
			else
				return false;
		}
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		return false;
	   }
   public boolean addStudent() {
		try {
			String query = "INSERT INTO STUDENTS VALUES(?,?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, usn);
			pstmt.setString(3, branch);
			pstmt.setString(4, sem);
			pstmt.setString(5, gender);
			pstmt.setString(6, totalfees);
			pstmt.setString(7, feespaid);
			
			Integer i1 = new Integer(totalfees);
			Integer i2 = new Integer(feespaid);
			int tf = i1.intValue();
			int fp = i2.intValue();
			remainingfees = (tf-fp);
			
			pstmt.setInt(8, remainingfees);
			int status = pstmt.executeUpdate();
			
			if(status>0)
				return true;
			else
				return false;
		} catch(Exception e) {}
		return false;
	}
   public boolean viewStudentDetails() {
		try {
			String query = "SELECT * FROM STUDENTS WHERE NAME=?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, name);
			res = pstmt.executeQuery();
			
			if(res.next()==true) {
				name = res.getString(1);
				usn = res.getString(2);
				branch = res.getString(3);
				sem = res.getString(4);
				gender = res.getString(5);
				totalfees = res.getString(6);
				feespaid = res.getString(7);
				setRemainingfees(res.getInt(8));
					return true;
			}
			else
				return false;
		} catch(Exception e) {}
		return false;
	}
   public boolean editStudent() {
		try {
				String query = "UPDATE STUDENTS SET REMAINING_FEES=?,FEES_PAID=? WHERE USN=?";
				pstmt = con.prepareStatement(query);
				
				Integer i1 = new Integer(feespaid);
				Integer i2 = new Integer(totalfees);
				int fp = i1.intValue();
				int tf = i2.intValue();
				remainingfees = remainingfees-fp;
				fp = tf-remainingfees;
				
				
				pstmt.setInt(1, remainingfees);
				pstmt.setInt(2, fp);
				pstmt.setString(3, usn);

				int status = pstmt.executeUpdate();
			
			if(status>0) {
					return true;
			}
			else
				return false;
		} catch(Exception e) {}
		return false;
	}
	
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getUsn() {
	return usn;
}
public void setUsn(String usn) {
	this.usn = usn;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public String getSem() {
	return sem;
}
public void setSem(String sem) {
	this.sem = sem;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getTotalfees() {
	return totalfees;
}
public void setTotalfees(String totalfees) {
	this.totalfees = totalfees;
}
public String getFeespaid() {
	return feespaid;
}
public void setFeespaid(String feespaid) {
	this.feespaid = feespaid;
}
public int getRemainingfees() {
	return remainingfees;
}
public void setRemainingfees(int remainingfees) {
	this.remainingfees = remainingfees;
}
}
