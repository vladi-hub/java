package com.sf.quartz.scheduler;

import java.sql.*;
import java.util.*;

import javax.naming.*;
import javax.sql.*;

public class ExpirationUtil {

	private static final String sqlQueryDay = "SELECT c.ptid,c.signdate,\"CMR\",c.policyNo FROM CMR as c where c.signdate = (DATE_ADD(CURDATE(),INTERVAL 1 WEEK))"+
			"UNION ALL"+ 
"SELECT g.id,g.signdate,\"GO\",g.policyNo FROM GOIns as g where g.signdate = (DATE_ADD(CURDATE(),INTERVAL 1 WEEK))"+
"UNION ALL" + 
"SELECT k.id,k.signdate,\"Kasko\",k.policyNo FROM KaskoIns as k where k.signdate = (DATE_ADD(CURDATE(),INTERVAL 1 WEEK))";

	private static final String sqlQueryWeek = "SELECT c.ptid,c.signdate,\"CMR\",c.policyNo FROM CMR as c where c.signdate = (DATE_ADD(CURDATE(),INTERVAL 1 WEEK))"+
			"UNION ALL"+ 
"SELECT g.id,g.signdate,\"GO\",g.policyNo FROM GOIns as g where g.signdate = (DATE_ADD(CURDATE(),INTERVAL 1 WEEK))"+
"UNION ALL" + 
"SELECT k.id,k.signdate,\"Kasko\",k.policyNo FROM KaskoIns as k where k.signdate = (DATE_ADD(CURDATE(),INTERVAL 1 WEEK))";

	private static final String sqlQueryMonth = "SELECT c.ptid,c.signdate,\"CMR\" FROM CMR as c where c.signdate = (DATE_ADD(CURDATE(),INTERVAL 1 MONTH))"+
			"UNION ALL"+ 
"SELECT g.id,g.signdate,\"GO\" FROM GOIns as g where g.signdate = (DATE_ADD(CURDATE(),INTERVAL 1 MONTH))"+
"UNION ALL" + 
"SELECT k.id,k.signdate,\"Kasko\" FROM KaskoIns as k where k.signdate = (DATE_ADD(CURDATE(),INTERVAL 1 MONTH))";


	public static List<InsuranceDataBean> loadDailyExpiringPolicies() {
		Connection conn = null;
        PreparedStatement prSt = null;
        List<InsuranceDataBean> res = new ArrayList<InsuranceDataBean>();
        try{
	        Context initCtx = new InitialContext();
	        Context envCtx = (Context) initCtx.lookup("java:comp/env");
	
	        // Look up our data source
	        DataSource ds = (DataSource)
	          envCtx.lookup("jdbc/SmartFinanceDS");
	
	        // Allocate and use a connection from the pool
	        conn = ds.getConnection();
	        prSt = conn.prepareStatement(sqlQueryDay);
	        ResultSet rs = prSt.executeQuery();
	        while(rs.next()){
	        	InsuranceDataBean newRow = new InsuranceDataBean();
	        	
	        	newRow.setId(rs.getLong(1));
	        	newRow.setEnddate(rs.getString(2));
	        	newRow.setType(rs.getString(3));
	        	newRow.setPolicyNo(rs.getString(4));
	        	
	        	res.add(newRow);
	        }
        } catch (Exception ex){
        	ex.printStackTrace();
        } finally {
        	if (conn != null){
        		try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
		return res;
	}
	
	public static List<InsuranceDataBean> loadWeeklyExpirationPolicies() {
		Connection conn = null;
        PreparedStatement prSt = null;
        List<InsuranceDataBean> res = new ArrayList<InsuranceDataBean>();
        try{
	        Context initCtx = new InitialContext();
	        Context envCtx = (Context) initCtx.lookup("java:comp/env");
	
	        // Look up our data source
	        DataSource ds = (DataSource)
	          envCtx.lookup("jdbc/SmartFinanceDS");
	
	        // Allocate and use a connection from the pool
	        conn = ds.getConnection();
	        prSt = conn.prepareStatement(sqlQueryWeek);
	        ResultSet rs = prSt.executeQuery();
	        while(rs.next()){
	        	InsuranceDataBean newRow = new InsuranceDataBean();
	        	
	        	newRow.setId(rs.getLong(1));
	        	newRow.setEnddate(rs.getString(2));
	        	newRow.setType(rs.getString(3));
	        	newRow.setPolicyNo(rs.getString(4));
	        	
	        	res.add(newRow);
	        }
        } catch (Exception ex){
        	ex.printStackTrace();
        } finally {
        	if (conn != null){
        		try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
		return res;
	}
	
	public static List<InsuranceDataBean> loadMonthlyExpirePolicies() {
		Connection conn = null;
        PreparedStatement prSt = null;
        List<InsuranceDataBean> res = new ArrayList<InsuranceDataBean>();
        try{
	        Context initCtx = new InitialContext();
	        Context envCtx = (Context) initCtx.lookup("java:comp/env");
	
	        // Look up our data source
	        DataSource ds = (DataSource)
	          envCtx.lookup("jdbc/SmartFinanceDS");
	
	        // Allocate and use a connection from the pool
	        conn = ds.getConnection();
	        prSt = conn.prepareStatement(sqlQueryMonth);
	        ResultSet rs = prSt.executeQuery();
	        while(rs.next()){
	        	InsuranceDataBean newRow = new InsuranceDataBean();
	        	
	        	newRow.setId(rs.getLong(1));
	        	newRow.setEnddate(rs.getString(2));
	        	newRow.setType(rs.getString(3));
	        	newRow.setPolicyNo(rs.getString(4));
	        	
	        	res.add(newRow);
	        }
        } catch (Exception ex){
        	ex.printStackTrace();
        } finally {
        	if (conn != null){
        		try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
		return res;
	}
}
