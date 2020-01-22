import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener { // Components of the Form
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
    private JLabel qtypassenger;
    private JTextField tqtypassenger;
    private JButton sub;
    private JButton reset;
    private JLabel days;
    private JTextField tdays;
    private JLabel bill;
    private JTextField tbill;
    private JLabel deposite;
    private JTextField tdeposite;




    // constructor, to initialize the components
    // with default values.
    public MyFrame() {

        setTitle("رجیستر مسافر");
        setBounds(300, 90, 600, 600);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("معرفی مسافر");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(200, 30);
        title.setLocation(200, 10);
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

        mno = new JLabel(" : شماره موبایل");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(115, 20);
        mno.setLocation(95, 170);
        c.add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(150, 20);
        tmno.setLocation(200, 170);
        c.add(tmno);

        nationalcode = new JLabel(" : کدملی");
        nationalcode.setFont(new Font("Arial", Font.PLAIN, 20));
        nationalcode.setSize(100, 20);
        nationalcode.setLocation(145, 220);
        c.add(nationalcode);

        tnationalcode = new JTextField();
        tnationalcode.setFont(new Font("Arial", Font.PLAIN, 15));
        tnationalcode.setSize(150, 20);
        tnationalcode.setLocation(200, 220);
        c.add(tnationalcode);


        days = new JLabel(": تعداد روزهای اقامت");
        days.setFont(new Font("Arial", Font.PLAIN, 20));
        days.setSize(150, 20);
        days.setLocation(47, 270);
        c.add(days);

        tdays = new JTextField();
        tdays.setFont(new Font("Arial", Font.PLAIN, 15));
        tdays.setSize(190, 20);
        tdays.setLocation(200, 270);
        c.add(tdays);

        bill = new JLabel(": صورتحساب");
        bill.setFont(new Font("Arial", Font.PLAIN, 20));
        bill.setSize(100, 20);
        bill.setLocation(100, 320);
        c.add(bill);

        tbill = new JTextField();
        tbill.setFont(new Font("Arial", Font.PLAIN, 15));
        tbill.setSize(190, 20);
        tbill.setLocation(200, 320);
        c.add(tbill);

        deposite = new JLabel(": پیش پرداخت");
        deposite.setFont(new Font("Arial", Font.PLAIN, 20));
        deposite.setSize(100, 20);
        deposite.setLocation(100, 370);
        c.add(deposite);

        tdeposite = new JTextField();
        tdeposite.setFont(new Font("Arial", Font.PLAIN, 15));
        tdeposite.setSize(190, 20);
        tdeposite.setLocation(200, 370);
        c.add(tdeposite);

        qtypassenger = new JLabel(": تعداد مسافر");
        qtypassenger.setFont(new Font("Arial", Font.PLAIN, 20));
        qtypassenger.setSize(100, 20);
        qtypassenger.setLocation(107, 420);
        c.add(qtypassenger);

        tqtypassenger = new JTextField();
        tqtypassenger.setFont(new Font("Arial", Font.PLAIN, 15));
        tqtypassenger.setSize(150, 20);
        tqtypassenger.setLocation(200, 420);
        c.add(tqtypassenger);

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

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}


