package day05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing03 extends JFrame {

	private JPanel contentPane;
	private JTextField tf01;
	private JTextField tf02;
	private JTextField tf03;
	private JButton btn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing03 frame = new MySwing03();
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
	public MySwing03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf01 = new JTextField();
		tf01.setBounds(26, 22, 63, 21);
		contentPane.add(tf01);
		tf01.setColumns(10);
		
		JLabel lbl = new JLabel("+");
		lbl.setBounds(101, 25, 13, 15);
		contentPane.add(lbl);
		
		tf02 = new JTextField();
		tf02.setColumns(10);
		tf02.setBounds(119, 22, 63, 21);
		contentPane.add(tf02);
		
		tf03 = new JTextField();
		tf03.setColumns(10);
		tf03.setBounds(253, 22, 63, 21);
		contentPane.add(tf03);
		
		btn = new JButton("=");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}
		});
		btn.setBounds(194, 21, 47, 23);
		contentPane.add(btn);
	}
	
	void myclick() {
		String atf01 = tf01.getText();
		String atf02 = tf02.getText();
		
		int a1 = Integer.parseInt(atf01);
		int a2 = Integer.parseInt(atf02);
		int sum = a1+a2;
		
		tf03.setText(String.valueOf(sum));
		
		
	}
	
	
}
