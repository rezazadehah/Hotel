import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Employee extends JFrame implements ActionListener {

    private Container c;
    private JLabel title;
    private JLabel firstname;
    private JLabel lastname;
    private JTextField tfname;
    private JLabel nationalcode;
    private JTextField tnationalcode;
    private JTextField tlname;
    private JLabel mno;
    private JTextField tmno;
    private JLabel address;
    private JTextArea taddress;
    private JLabel post;
    private JTextField tpost;
    private JLabel salary;
    private JTextField tsalary;
    private JButton sub;
    private JButton reset;

    public Employee()
    {
        setTitle("معرفی کارمندان");
        setBounds(300,90,600,600);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("فرم مشخصات کارمندان");
        title.setFont(new Font("Arial",Font.PLAIN,30));
        title.setLocation(200,10);
        title.setSize(300, 35);
        c.add(title);

        firstname = new JLabel(": نام");
        firstname.setFont(new Font("Arial", Font.PLAIN, 20));
        firstname.setSize(100, 20);
        firstname.setLocation(167, 70);
        c.add(firstname);

        tfname = new JTextField();
        tfname.setFont(new Font("Arial", Font.PLAIN, 15));
        tfname.setSize(190, 20);
        tfname.setLocation(200, 70);
        c.add(tfname);

        lastname = new JLabel(": نام خانوادگی");
        lastname.setFont(new Font("Arial", Font.PLAIN, 20));
        lastname.setSize(100, 20);
        lastname.setLocation(100, 120);
        c.add(lastname);

        tlname = new JTextField();
        tlname.setFont(new Font("Arial", Font.PLAIN, 15));
        tlname.setSize(190, 20);
        tlname.setLocation(200, 120);
        c.add(tlname);

        nationalcode = new JLabel(": کدملی");
        nationalcode.setFont(new Font("Arial", Font.PLAIN, 20));
        nationalcode.setSize(100, 20);
        nationalcode.setLocation(145, 170);
        c.add(nationalcode);

        tnationalcode = new JTextField();
        tnationalcode.setFont(new Font("Arial", Font.PLAIN, 15));
        tnationalcode.setSize(150, 20);
        tnationalcode.setLocation(200, 170);
        c.add(tnationalcode);

        mno = new JLabel(": شماره موبایل");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(95, 220);
        c.add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(150, 20);
        tmno.setLocation(200, 220);
        c.add(tmno);

        address = new JLabel(": آدرس");
        address.setFont(new Font("Arial", Font.PLAIN, 20));
        address.setSize(100, 20);
        address.setLocation(145, 300);
        c.add(address);

        taddress = new JTextArea();
        taddress.setFont(new Font("Arial", Font.PLAIN, 15));
        taddress.setSize(300, 75);
        taddress.setLocation(200, 300);
        taddress.setLineWrap(true);
        c.add(taddress);

        post = new JLabel(": سمت");
        post.setFont(new Font("Arial", Font.PLAIN, 20));
        post.setSize(100, 20);
        post.setLocation(150, 400);
        c.add(post);

        tpost = new JTextField();
        tpost.setFont(new Font("Arial", Font.PLAIN, 15));
        tpost.setSize(150,20);
        tpost.setLocation(200, 400);
        c.add(tpost);

        salary = new JLabel(": درآمد");
        salary.setFont(new Font("Arial", Font.PLAIN, 20));
        salary.setSize(100, 20);
        salary.setLocation(147, 450);
        c.add(salary);

        tsalary = new JTextField();
        tsalary.setFont(new Font("Arial", Font.PLAIN, 15));
        tsalary.setSize(150,20);
        tsalary.setLocation(200, 450);
        c.add(tsalary);

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

    }
}
