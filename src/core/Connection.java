package core;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connection {

    private Connection()
    {

    }

    static private java.sql.Connection connection = null;

    public static java.sql.Connection getInstance()
    {
        if (connection == null)
        {
            try{
                Class.forName("com.mysql.jdbc.Driver");

                connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/hotel","root","");

                //connection.close();

            }catch(Exception e){ System.out.println(e);}

            return connection;
        }else
        {
            return connection;
        }
    }

}
