import core.Connection;

import javax.swing.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void main(String[] args) throws SQLException {

       // String s = "INSERT INTO passenger (`first_name`,`last_name`, national_code) VALUES ('boogh','Male',222222)";

        String s = "SELECT * FROM passenger";
        ResultSet resultSet = Connection.getInstance().createStatement().executeQuery(s);

        while (resultSet.next())
        {
            System.out.println(resultSet.getString("first_name"));
        }

        Connection.getInstance().close();

        JFrame jFrame = new JFrame();
        jFrame.setTitle("test");
        jFrame.setBounds(300, 90, 900, 600);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
    }
}
