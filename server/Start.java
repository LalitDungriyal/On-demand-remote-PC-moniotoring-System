import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private Connection conn = null;
	private JFormattedTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
					frame.getContentPane().setBackground(Color.WHITE);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(375, 200, 500, 300);

		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblimg = new JLabel(new ImageIcon("file.jpg"));
		
		lblimg.setBounds(0,12,56, 56);
		contentPane.add(lblimg);

		JLabel lblTitle = new JLabel("ON DEMAND REMOTE PC MONITORING SYSTEM");
		lblTitle.setFont(new Font("Colonna MT", Font.BOLD, 18));
		lblTitle.setForeground(Color.BLUE);
		lblTitle.setBounds(60, 22, 500, 35);
		contentPane.add(lblTitle);
		

		JLabel lblHR= new JLabel("-----------------------------------------------------------------------");
		lblHR.setFont(new Font("Colonna MT", Font.BOLD, 18));
		lblHR.setForeground(Color.GRAY);
		lblHR.setBounds(0, 60, 500, 35);
		contentPane.add(lblHR);

		JButton btnAbt = new JButton("About");
		btnAbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aboutUs();
			}
		});
		btnAbt.setBackground(Color.WHITE);
		btnAbt.setBounds(170, 180, 150, 30);
		contentPane.add(btnAbt);


		JButton ok_btn = new JButton("Set Password");
		ok_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setpassword();
			}
		});
		ok_btn.setBackground(Color.WHITE);
		ok_btn.setBounds(76, 110, 150, 60);
		contentPane.add(ok_btn);
		
		JButton btnCancel = new JButton("Exit");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBounds(276, 110, 150, 60);
		contentPane.add(btnCancel);

		
	}
	public void setpassword(){

		SetPassword frame1= new SetPassword();
	    	frame1.setSize(300,80);
	    	frame1.setLocation(500,300);
		frame1.setVisible(true);

	}
	public void aboutUs()
	{
		About frame1= new About();
	    			frame1.setSize(500,300);
	    			frame1.setLocation(375,200);
					frame1.setVisible(true);
	}
}
