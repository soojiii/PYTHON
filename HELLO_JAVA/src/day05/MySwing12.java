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

public class MySwing12 extends JFrame {

	private JPanel contentPane;
	private JTextField tf;
	JTextArea ta;
	String com ="123";
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing12 frame = new MySwing12();
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
	public MySwing12() {
		
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
		randomCom();
		
	}
	
	void myclick() {
		String mine = tf.getText();
		int s = getStrike(mine, com);
		int b = getBall(mine, com);
		
		String line = mine+"\t"+s+"S"+b+"B\n";
		
		String str_old = ta.getText();
		
		ta.setText(str_old+line);
		tf.setText("");
		
		if(s==3) {
			JOptionPane.showMessageDialog(null, "정답입니다.\n"+mine);
		}
	}
	
	int getStrike(String mine, String com) {
		int ret = 0;
		String m1 = mine.substring(0,1);
		String m2 = mine.substring(1,2);
		String m3 = mine.substring(2,3);
		
		String c1 = com.substring(0,1);
		String c2 = com.substring(1,2);
		String c3 = com.substring(2,3);
		
		if(c1.equals(m1)) ret++;
		if(c2.equals(m2)) ret++;
		if(c3.equals(m3)) ret++;
		
		return ret;
	}
	
	int getBall(String mine, String com) {
		int ret = 0;
		String m1 = mine.substring(0,1);
		String m2 = mine.substring(1,2);
		String m3 = mine.substring(2,3);
		
		String c1 = com.substring(0,1);
		String c2 = com.substring(1,2);
		String c3 = com.substring(2,3);
		
		if(c1.equals(m2)||c1.equals(m3)) ret++;
		if(c2.equals(m1)||c1.equals(m3)) ret++;
		if(c3.equals(m1)||c1.equals(m2)) ret++;
		
		return ret;
	}
	
	
	void randomCom() {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i < 1000; i++) {
			int rnd = (int) (Math.random()*9);
			int a = arr[0];
			arr[0]=arr[rnd];
			arr[rnd]=a;
		}
		com = arr[0]+""+arr[1]+""+arr[2];
		System.out.println("com:"+com);
	}
	

}
