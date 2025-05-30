package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.co.aforce.beans.UserInfo;
import jp.co.aforce.beans.Users;

public class UsersDAO  extends DAO{
	public UserInfo getUserInfo(String id, String pass) {
	    UserInfo user = null;
	    try {
	        Connection con = getConnection();

	        PreparedStatement st = con.prepareStatement(
	            "SELECT CONCAT(LAST_NAME, ' ', FIRST_NAME) AS full_name, is_admin FROM USERS WHERE MEMBER_ID = ? AND PASSWORD = ?"
	        );
	        st.setString(1, id);
	        st.setString(2, pass);

	        ResultSet rs = st.executeQuery();

	        if (rs.next()) {
	            String fullName = rs.getString("full_name");
	            boolean isAdmin = rs.getInt("is_admin") == 1;

	            user = new UserInfo(fullName, isAdmin);
	        }

	        rs.close();
	        st.close();
	        con.close();

	    } catch (SQLException e) {
	        e.printStackTrace();
	    } catch (Exception e) {
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
			e.setMEMBER_ID(rs.getString("MEMBER_ID"));
			e.setPASSWORD(rs.getString("PASSWORD"));
			e.setLAST_NAME(rs.getString("LAST_NAME"));
			e.setFIRST_NAME(rs.getString("FIRST_NAME"));
			e.setADDRESS(rs.getString("ADDRESS"));
			e.setMAIL_ADDRESS(rs.getString("MAIL_ADDRESS"));
			list.add(e);
		}
		st.close();
		con.close();
		
		return list;
		
		
	}
	
	
}
