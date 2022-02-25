import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.ActionListener;
import java.net.Socket;
import java.awt.event.ActionEvent;

public class Start extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private Connection conn = null;
	private JFormattedTextField password;

	final static String port="4907";

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


		JLabel lblIP = new JLabel("Enter Server IP");
		lblIP.setFont(new Font("Ariel", Font.BOLD, 14));
		lblIP.setForeground(Color.BLUE);
		lblIP.setBounds(60, 76, 500, 35);
		contentPane.add(lblIP);


		JTextField input=new JTextField();
		input.setFont(new Font("Ariel", Font.BOLD, 14));
		input.setForeground(Color.BLACK);
		input.setBackground(Color.WHITE);
		
		input.setBounds(60, 112, 200, 25);
		contentPane.add(input);

		JButton ok_btn = new JButton("Connect");
		ok_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connect(input);
			}
		});
		ok_btn.setBackground(Color.WHITE);
		ok_btn.setBounds(60, 160, 150, 60);
		contentPane.add(ok_btn);
		
		JButton btnCancel = new JButton("Exit");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancel.setBackground(Color.WHITE);
		btnCancel.setBounds(260, 160, 150, 60);
		contentPane.add(btnCancel);

		
	}
	public void connect(JTextField input){

		String ip = input.getText();
			new Start().initialize(ip, Integer.parseInt(port));
			}

	public void initialize(String ip, int port){
			try{
				
				Socket sc = new Socket(ip,port);
				System.out.println("Connecting to the Server");
				//Authenticate class is responsible for security purposes
				Authenticate frame1= new Authenticate(sc);
	
				frame1.setSize(300,80);
				frame1.setLocation(500,300);
				frame1.setVisible(true);
			} catch (Exception ex){
				ex.printStackTrace();
			}

	}
}




