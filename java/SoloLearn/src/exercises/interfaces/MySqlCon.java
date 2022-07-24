package exercises.interfaces;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
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
      /*
      MysqlDataSource ds = new MysqlDataSource();
      ds.setUser("daniel");
      ds.setPassword("1q2w3e");
      ds.setServerName("localhost:3306/db_servico_hora");

      Connection con = ds.getConnection();
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery("select * from funcionarios");

      con.close();
      st.close();
       */

      MysqlDataSource mysqlds = new MysqlDataSource();
      mysqlds.setURL(DBURL);
      mysqlds.setUser(DBUSER);
      mysqlds.setPassword(DBPASS);

      Connection conn = mysqlds.getConnection();
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
