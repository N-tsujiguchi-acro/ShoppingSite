package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.co.aforce.beans.Users;

public class UsersDAO  extends DAO{
	public String getNames(String id, String pass) {
		String user = null;
		try {
			Connection con=getConnection();
			
			PreparedStatement st=con.prepareStatement(
				"SELECT CONCAT(LAST_NAME, ' ', FIRST_NAME) AS full_name FROM USERS WHERE MEMBER_ID = ? AND PASSWORD = ?"
			);
			st.setString(1, id);
			st.setString(2, pass);
			
			ResultSet rs = st.executeQuery();
			
			if (rs.next()) {
			    user = rs.getString("FULL_NAME");
			    
			    
			} 

			
			  rs.close();
			  st.close();
			  con.close();
			  
			  
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		return user;
	
		
		
	}

	public List<Users> findAll(String all)throws Exception {
		List<Users> list=new ArrayList<>();
		
		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement(
			"select * from USERS"
		);
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			Users e=new Users();
			e.setMember_id(rs.getString("MEMBER_ID"));
			e.setPassword(rs.getString("PASSWORD"));
			e.setLast_name(rs.getString("LAST_NAME"));
			e.setFirst_name(rs.getString("FIRST_NAME"));
			e.setAddress(rs.getString("ADDRESS"));
			e.setMail(rs.getString("MAIL_ADDRESS"));
			list.add(e);
		}
		st.close();
		con.close();
		
		return list;
		
		
	}
	
	
}
