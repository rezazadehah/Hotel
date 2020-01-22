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

        String s = "SELECT * FROM room_type";
        ResultSet resultSet = Connection.getInstance().createStatement().executeQuery(s);

        while (resultSet.next())
        {
            System.out.println(resultSet.getString("type"));
        }
        MyFrame f = new MyFrame();
        Employee e = new Employee();
        RoomTypeFrame t = new RoomTypeFrame();
        RoomFrame r = new RoomFrame();


    }
}
