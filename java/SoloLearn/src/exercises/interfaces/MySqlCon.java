package exercises.interfaces;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlCon {

  public static void main(String[] args) {

    final String DBURL = "jdbc:mysql://localhost:3306/db_servico_hora";
    final String DBUSER = "daniel";
    final String DBPASS = "1q2w3e";

    try {
      // Old Way
      /*
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_servico_hora","daniel","1q2w3e");
      Statement s = con.createStatement();
      ResultSet rs = s.executeQuery("select * from funcionarios");
      */

      // New Way
      MysqlDataSource mySqlDs = new MysqlDataSource();
      mySqlDs.setURL(DBURL);
      mySqlDs.setUser(DBUSER);
      mySqlDs.setPassword(DBPASS);

      Connection conn = mySqlDs.getConnection();
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery("select * from funcionarios");

      while (rs.next()){
        System.out.println(rs.getString(2));
      }

    }catch (Exception e){
      System.out.println(e);
    }

  }
}
