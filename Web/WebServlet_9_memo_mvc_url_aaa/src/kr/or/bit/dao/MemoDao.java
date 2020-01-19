package kr.or.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import kr.or.bit.dto.Memo;
import kr.or.bit.utils.SingletonHelper;

public class MemoDao {
    DataSource ds = null;
    
    public MemoDao() {
      Context context;
      try {
        context = new InitialContext();
        ds = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    
    public List<Memo> memoGetAllList() {
      
      Connection conn = null;
      Statement stmt = null;
      ResultSet rs = null;
      List<Memo> list = new ArrayList<Memo>();
      try {
        conn = ds.getConnection();
        stmt = conn.createStatement();
        String sql = "select id, email, content from memo";
        rs = stmt.executeQuery(sql);
        
        
        if(rs.next()) {
          do {
            Memo m = new Memo();
            m.setId(rs.getString(1));
            m.setEmail(rs.getString(2));
            m.setContent(rs.getString(3));
            list.add(m);
          }while(rs.next());
        } 
      } catch(Exception e) {
        System.out.println(e.getMessage());
      } finally {
        if(rs != null) try {rs.close();} catch(Exception e) {}
        if(stmt != null) try {stmt.close();} catch(Exception e) {}
        if(conn != null) try {conn.close();} catch(Exception e) {}
      }
      
      return list;
    }
    
    public int insertMemo(Memo m) {
      
      Connection conn = null;
      PreparedStatement pstmt = null;
      int row = 0;
      try {
        conn = ds.getConnection();
        String sql = "insert into memo(id, email, content) values(?, ?, ?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, m.getId());
        pstmt.setString(2, m.getEmail());
        pstmt.setString(3, m.getContent());
        
        row = pstmt.executeUpdate();
        
        
      }catch(Exception e) {
          System.out.println(e.getMessage());
          row = -1;
      }finally {
        try {
           if(pstmt != null) {pstmt.close();}
           if(conn != null) {conn.close();}
          
        } catch (SQLException e) {
          System.out.println(e.getMessage());
        }
      }
      return row;
    }
    
    
    public String memoIdCheck(String id) {
      Connection conn = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      String check = null;
      try {
        conn = ds.getConnection();
        String sql = "select id from memo where id=?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, id);
        rs = pstmt.executeQuery();
        
        if(rs.next()) {
          check = "true";
        } else {
          check = "false";
        }
      }catch(Exception e) {
        System.out.println(e.getMessage());
      }finally {
        try {
          if(rs !=null) {rs.close();}
          if(pstmt !=null) {pstmt.close();}
          if(conn !=null) {conn.close();}
        } catch (Exception e) {
          System.out.println(e.getMessage());
        }
      }
      return check;
    }
    
}


