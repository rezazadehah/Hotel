import core.Connection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.SQLException;

public class RoomTypeFrame extends JFrame implements ActionListener {

    private Container c;
    private JLabel title;
    private JLabel type;
    private JTextField ttype;
    private JLabel feature;
    private JTextArea tfeature;
    private JLabel cost;
    private JTextField tcost;
    private JButton sub;
    private JButton reset;
    private JScrollPane scrool;

    public RoomTypeFrame(){

        setTitle("نوع اتاق");
        setBounds(300,90,600,600);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("تعریف نوع اتاق");
        title.setFont(new Font("Arial",Font.PLAIN,30));
        title.setSize(300, 35);
        title.setLocation(200,20);
        c.add(title);


        type = new JLabel(": نوع اتاق");
        type.setFont(new Font("Arial", Font.PLAIN, 20));
        type.setSize(100, 20);
        type.setLocation(125, 70);
        c.add(type);

        ttype = new JTextField();
        ttype.setFont(new Font("Arial", Font.PLAIN, 15));
        ttype.setSize(150, 20);
        ttype.setLocation(200, 70);
        c.add(ttype);

        feature = new JLabel(": امکانات اتاق");
        feature.setFont(new Font("Arial", Font.PLAIN, 20));
        feature.setSize(100, 20);
        feature.setLocation(98, 120);
        c.add(feature);

        tfeature = new JTextArea();
        tfeature.setFont(new Font("Arial", Font.PLAIN, 15));
        tfeature.setSize(300, 75);
        tfeature.setLocation(200, 120);
        tfeature.setLineWrap(true);
        c.add(tfeature);

        cost = new JLabel(": قیمت اتاق");
        cost.setFont(new Font("Arial", Font.PLAIN, 20));
        cost.setSize(100, 20);
        cost.setLocation(118, 230);
        c.add(cost);

        tcost = new JTextField();
        tcost.setFont(new Font("Arial", Font.PLAIN, 15));
        tcost.setSize(150,20);
        tcost.setLocation(200, 230);
        c.add(tcost);

        sub = new JButton("تایید");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(180, 500);
        sub.addActionListener(this);
        sub.setActionCommand("xx");
        c.add(sub);

        reset = new JButton("انصراف");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(300, 500);
        reset.addActionListener(this);
        reset.setActionCommand("yy");
        c.add(reset);

        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("xx"))
        {
            try {


                 String s = "INSERT INTO room_type (`type`,`feature`, `cost`) VALUES ('"+ttype.getText()+"','"+tfeature.getText()+"','"+tcost.getText()+"')";
                Connection.getInstance().createStatement().execute(s);
                setVisible(false); //you can't see me!
                dispose();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }

}
