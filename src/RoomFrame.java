

import core.Connection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RoomFrame extends JFrame implements ActionListener {
    private Container c;
    private JLabel title;
    private JLabel roomcode;
    private JTextField troomcode;
    private JLabel roomtype;
    private JComboBox troomtype;
    private JLabel roomnumber;
    private JTextField troomnumber;
    private JLabel status;
    private JCheckBox bstatus;
    private JCheckBox bstatus2;
    private JButton sub;
    private JButton reset;

    private String[] petStrings = { };


    public RoomFrame(){

        setTitle("اتاق");
        setBounds(300,90,600,600);
        setResizable(false);



        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("فرم مشخصات اتاق");
        title.setFont(new Font("Arial",Font.PLAIN,30));
        title.setSize(300, 35);
        title.setLocation(200,10);
        c.add(title);

        roomcode = new JLabel(": کد اتاق");
        roomcode.setFont(new Font("Arial", Font.PLAIN, 20));
        roomcode.setSize(100, 20);
        roomcode.setLocation(135, 70);
        c.add(roomcode);

        troomcode = new JTextField();
        troomcode.setFont(new Font("Arial", Font.PLAIN, 15));
        troomcode.setSize(190, 20);
        troomcode.setLocation(200, 70);
        c.add(troomcode);

        roomtype = new JLabel(": انتخاب نوع اتاق");
        roomtype.setFont(new Font("Arial", Font.PLAIN, 20));
        roomtype.setSize(120, 25);
        roomtype.setLocation(75, 120);
        c.add(roomtype);

        troomtype = new JComboBox(petStrings);
        troomtype.setFont(new Font("Arial", Font.PLAIN, 15));
        troomtype.setSize(190, 25);
        troomtype.setLocation(200, 120);
        troomtype.setLocation(200, 120);
        troomtype.addActionListener(this);
        c.add(troomtype);

        String s = "select * from room_type";
        try {
            ResultSet resultSet = Connection.getInstance().createStatement().executeQuery(s);

            while (resultSet.next())
            {
                troomtype.addItem(resultSet.getString(2));
                System.out.println();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        roomnumber = new JLabel(": شماره اتاق");
        roomnumber.setFont(new Font("Arial", Font.PLAIN, 20));
        roomnumber.setSize(100, 20);
        roomnumber.setLocation(110, 180);
        c.add(roomnumber);

        troomnumber = new JTextField();
        troomnumber.setFont(new Font("Arial", Font.PLAIN, 15));
        troomnumber.setSize(150, 20);
        troomnumber.setLocation(200, 180);
        c.add(troomnumber);

        status = new JLabel(": وضعیت اتاق");
        status.setFont(new Font("Arial", Font.PLAIN, 20));
        status.setSize(100, 20);
        status.setLocation(97, 220);
        c.add(status);

        bstatus = new JCheckBox("پر");
        bstatus.setBounds(250,205,50,50);
        c.add(bstatus);


        bstatus2 = new JCheckBox("خالی");
        bstatus2.setBounds(350,205,50,50);
        c.add(bstatus2);

        ButtonGroup group = new ButtonGroup();
        group.add(bstatus);
        group.add(bstatus2);

        sub = new JButton("تایید");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(180, 470);
        sub.addActionListener(this);
        sub.setActionCommand("xx");
        c.add(sub);

        reset = new JButton("انصراف");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(300, 470);
        reset.addActionListener(this);
        reset.setActionCommand("yy");

        c.add(reset);

        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("xx"))
        {
            try{

                String s = "INSERT INTO room (room_code, room_type, room_number, status) VALUES ('"+troomcode.getText()+"','"+troomtype+"','"+troomnumber.getText()+"'.'"+bstatus+"')";
                Connection.getInstance().createStatement().execute(s);
                setVisible(false);
                dispose();
            } catch (SQLException ex){
                ex.printStackTrace();
            }

        }else if(e.getActionCommand().equals("yy"))
        {
            String s = "select * from room_type";
            try {
                ResultSet resultSet = Connection.getInstance().createStatement().executeQuery(s);

                while (resultSet.next())
                {
                    System.out.println(resultSet.getObject(0));
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

    }
}
