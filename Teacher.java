import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Font;

public class Teacher extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teacher frame = new Teacher();
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
	public Teacher() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 645);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTeacherName = new JLabel("Subject");
		lblTeacherName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTeacherName.setBounds(88, 41, 114, 20);
		contentPane.add(lblTeacherName);
		
		JLabel lblNewLabel = new JLabel("Session");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(88, 92, 69, 20);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(217, 38, 145, 26);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(217, 89, 145, 26);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_1 = new JLabel("Student ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(56, 163, 114, 20);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("PRESENT");
		chckbxNewCheckBox.setBounds(223, 202, 139, 29);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_2 = new JLabel("Presenty Status");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(266, 163, 145, 20);
		contentPane.add(lblNewLabel_2);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("ABSENT");
		chckbxNewCheckBox_1.setBounds(371, 202, 103, 29);
		contentPane.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_3 = new JLabel("1");
		lblNewLabel_3.setBounds(88, 206, 69, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("2");
		lblNewLabel_4.setBounds(88, 247, 69, 20);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("3");
		lblNewLabel_5.setBounds(88, 283, 69, 20);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("4");
		lblNewLabel_6.setBounds(88, 319, 69, 20);
		contentPane.add(lblNewLabel_6);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("PRESENT");
		chckbxNewCheckBox_2.setBounds(223, 243, 139, 29);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("ABSENT");
		chckbxNewCheckBox_3.setBounds(371, 243, 139, 29);
		contentPane.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("PRESENT");
		chckbxNewCheckBox_4.setBounds(223, 279, 139, 29);
		contentPane.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("ABSENT");
		chckbxNewCheckBox_5.setBounds(371, 279, 139, 29);
		contentPane.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("PRESENT");
		chckbxNewCheckBox_6.setBounds(223, 315, 139, 29);
		contentPane.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("ABSENT");
		chckbxNewCheckBox_7.setBounds(371, 315, 149, 29);
		contentPane.add(chckbxNewCheckBox_7);
		
		JLabel lblNewLabel_7 = new JLabel("5");
		lblNewLabel_7.setBounds(88, 361, 40, 20);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("6");
		lblNewLabel_8.setBounds(88, 397, 50, 20);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("7");
		lblNewLabel_9.setBounds(88, 433, 50, 20);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("8");
		lblNewLabel_10.setBounds(88, 469, 50, 20);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("9");
		lblNewLabel_11.setBounds(88, 505, 50, 20);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("10");
		lblNewLabel_12.setBounds(88, 536, 50, 20);
		contentPane.add(lblNewLabel_12);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("PRESENT");
		chckbxNewCheckBox_8.setBounds(223, 357, 139, 29);
		contentPane.add(chckbxNewCheckBox_8);
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("ABSENT");
		chckbxNewCheckBox_9.setBounds(371, 357, 139, 29);
		contentPane.add(chckbxNewCheckBox_9);
		
		JCheckBox chckbxNewCheckBox_10 = new JCheckBox("PRESENT");
		chckbxNewCheckBox_10.setBounds(223, 393, 139, 29);
		contentPane.add(chckbxNewCheckBox_10);
		
		JCheckBox chckbxNewCheckBox_11 = new JCheckBox("ABSENT");
		chckbxNewCheckBox_11.setBounds(371, 397, 139, 29);
		contentPane.add(chckbxNewCheckBox_11);
		
		JCheckBox chckbxNewCheckBox_12 = new JCheckBox("PRESENT");
		chckbxNewCheckBox_12.setBounds(223, 429, 107, 29);
		contentPane.add(chckbxNewCheckBox_12);
		
		JCheckBox chckbxNewCheckBox_13 = new JCheckBox("ABSENT");
		chckbxNewCheckBox_13.setBounds(371, 429, 139, 29);
		contentPane.add(chckbxNewCheckBox_13);
		
		JCheckBox chckbxNewCheckBox_14 = new JCheckBox("PRESENT");
		chckbxNewCheckBox_14.setBounds(223, 465, 139, 29);
		contentPane.add(chckbxNewCheckBox_14);
		
		JCheckBox chckbxNewCheckBox_15 = new JCheckBox("ABSENT");
		chckbxNewCheckBox_15.setBounds(371, 465, 139, 29);
		contentPane.add(chckbxNewCheckBox_15);
		
		JCheckBox chckbxNewCheckBox_16 = new JCheckBox("PRESENT");
		chckbxNewCheckBox_16.setBounds(223, 501, 139, 29);
		contentPane.add(chckbxNewCheckBox_16);
		
		JCheckBox chckbxNewCheckBox_17 = new JCheckBox("ABSENT");
		chckbxNewCheckBox_17.setBounds(371, 501, 139, 29);
		contentPane.add(chckbxNewCheckBox_17);
		
		JCheckBox chckbxNewCheckBox_18 = new JCheckBox("PRESENT");
		chckbxNewCheckBox_18.setBounds(223, 532, 139, 29);
		contentPane.add(chckbxNewCheckBox_18);
		
		JCheckBox chckbxNewCheckBox_19 = new JCheckBox("ABSENT");
		chckbxNewCheckBox_19.setBounds(371, 536, 139, 29);
		contentPane.add(chckbxNewCheckBox_19);
		
		JButton btnNewButton = new JButton("Log Out");
		btnNewButton.setBounds(641, 37, 115, 29);
		contentPane.add(btnNewButton);
	}
}
