package day05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing12_1 extends JFrame {

	private JPanel contentPane;
	private JTextField tf;
	JTextArea ta;
	String com1 ="";
	String com2 ="";
	String com3 ="";
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing12_1 frame = new MySwing12_1();
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
	public MySwing12_1() {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i < 100; i++) {
			int rnd = (int) (Math.random()*9);
			int a = arr[0];
			arr[0]=arr[rnd];
			arr[rnd]=a;
		}
		com1 = String.valueOf(arr[0]);
		com2 = String.valueOf(arr[1]);
		com3 = String.valueOf(arr[2]);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 272, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel("맞출수 :");
		lbl.setBounds(30, 45, 57, 15);
		contentPane.add(lbl);
		
		JButton btn = new JButton("맞춰보기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}
		});
		btn.setBounds(30, 73, 191, 23);
		contentPane.add(btn);
		
		tf = new JTextField();
		tf.setBounds(105, 42, 116, 21);
		contentPane.add(tf);
		tf.setColumns(10);
		
		ta = new JTextArea();
		ta.setBounds(30, 106, 191, 280);
		contentPane.add(ta);
	}
	
	void myclick() {
		System.out.println(com1+com2+com3);
		String my = tf.getText();
		String my1 = my.substring(0,1);
		String my2 = my.substring(1,2);
		String my3 = my.substring(2,3);

		int s = 0;
		int b = 0;
		
		if(com1.equals(my1)) s++;
		if(com2.equals(my2)) s++;
		if(com3.equals(my3)) s++;
		
		if(com1.equals(my2)) b++;
		if(com1.equals(my3)) b++;
		
		if(com2.equals(my1)) b++;
		if(com2.equals(my3)) b++;
		
		if(com3.equals(my1)) b++;
		if(com3.equals(my2)) b++;
		
		String aa = ta.getText();
		 
		aa = aa+my+"  "+s+"S"+b+"B\n";
		String c = my+"  "+s+"S"+b+"B\n";
		
		ta.setText(aa);
		if(s==3) {
			JOptionPane.showMessageDialog(null, c+"정답!");
			ta.setText("");
			tf.setText("");
			int[] arr = {1,2,3,4,5,6,7,8,9};
			
			for (int i = 0; i < 100; i++) {
				int rnd = (int) (Math.random()*9);
				int a = arr[0];
				arr[0]=arr[rnd];
				arr[rnd]=a;
			}
			com1 = String.valueOf(arr[0]);
			com2 = String.valueOf(arr[1]);
			com3 = String.valueOf(arr[2]);
		}
	}
}
