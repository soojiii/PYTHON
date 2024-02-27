package day05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing08 extends JFrame {

	private JPanel contentPane;
	private JTextField tf01;
	private JTextField tf02;
	private JTextField tf03;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing08 frame = new MySwing08();
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
	public MySwing08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf01 = new JTextField();
		tf01.setBounds(12, 52, 66, 21);
		contentPane.add(tf01);
		tf01.setColumns(10);
		
		tf02 = new JTextField();
		tf02.setColumns(10);
		tf02.setBounds(121, 52, 66, 21);
		contentPane.add(tf02);
		
		tf03 = new JTextField();
		tf03.setColumns(10);
		tf03.setBounds(305, 52, 87, 21);
		contentPane.add(tf03);
		
		JLabel lbl = new JLabel("에서");
		lbl.setBounds(90, 55, 30, 15);
		contentPane.add(lbl);
		
		JButton btn = new JButton("까지합은");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}
		});
		btn.setBounds(199, 51, 94, 23);
		contentPane.add(btn);
	}
	
	void myclick() {
		int a = Integer.parseInt(tf01.getText());
		int b = Integer.parseInt(tf02.getText());
		int sum=0;
		
		for(int i=a; i<=b; i++) {
			sum += i;
		}
		tf03.setText(String.valueOf(sum));
		
	}
	
}
