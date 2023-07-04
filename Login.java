import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame 
{

	private JPanel contentPane;
	//private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run()
			{
				try
				{
					Login frame = new Login();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*JLabel label = new Jlabel("");
		Image img = new ImageIcon(this.getClass().getResource("G:/image.jpg")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(10, 11, 269, 284);
		contentPane.add(label);*/
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(119, 95, 99, 20);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(345, 92, 146, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(119, 184, 99, 20);
		contentPane.add(lblNewLabel_1);
		passwordField = new JPasswordField();
		passwordField.setBounds(345, 181, 146, 26);
		contentPane.add(passwordField);
		
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(228, 290, 115, 29);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("login1.jpg")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(0, 0, 559, 346);
		contentPane.add(label);
		
		
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				String str1=null;
				String str2=null;
				try 
				{
					str1=textField_1.getText();
					str2=passwordField.getText();
					if(str1.isEmpty() && str2.isEmpty())
					{
							JOptionPane.showMessageDialog(btnNewButton, "Please Enter Username and Password");
					}
					else if(str1.isEmpty())
					{
							JOptionPane.showMessageDialog(btnNewButton, "Username Cant be Empty");
					}
					else if(str2.isEmpty())
					{
							JOptionPane.showMessageDialog(btnNewButton, "Password Cant be Empty");
					}
					else
					{
						String str3="select category from login where username='"+str1+"' and password='"+str2+"'";
						
						Class.forName("oracle.jdbc.driver.OracleDriver");
						System.out.println("before");
						Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SHRUTIKA","patil");
						System.out.println("after");
						Statement st= con.createStatement();
						//st.setString(1,str1);
						
						ResultSet rs=st.executeQuery(str3);
						
						if(rs.getString(1)=="Teacher")
						{
							Teacher t=new Teacher();
							t.setVisible(true);
						}
					}
				} 
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
				
		});
		}
}
