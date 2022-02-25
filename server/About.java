import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;
import java.awt.*;

public class About extends JFrame implements ActionListener{

    About()
    {
		setBounds(375, 200, 500, 200);

		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

        JLabel lb=new JLabel("Version :  1.0");
        lb.setBounds(5,10,100,20);
        contentPane.add(lb);

        JLabel dev=new JLabel("Developer :  Lalit Dungriyal");
        dev.setBounds(5,30,200,20);
        contentPane.add(dev);

        JLabel abt=new JLabel("About project");
        abt.setBounds(5,70,100,20);
        contentPane.add(abt);

        JTextArea ar=new JTextArea();
        ar.setBounds(5,100,400,200);
        ar.append("On demand Pc monitoring System is a project that allows the admin to\n monitor the user screen whenever required(on demand).Unlike other\n normal pc monitoring systems, it can allows the admin to monitor the\n user screen without his permission. ");
        ar.setEditable(false);
        contentPane.add(ar);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame fr=new About();
    }
    
}
