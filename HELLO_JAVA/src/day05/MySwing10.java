package day05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing10 extends JFrame {

	private JPanel contentPane;
	private JTextField tf_mine;
	private JTextField tf_com;
	private JTextField tf_result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing10 frame = new MySwing10();
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
	public MySwing10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 260, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_mine = new JLabel("나:");
		lbl_mine.setBounds(26, 22, 57, 15);
		contentPane.add(lbl_mine);
		
		JLabel lbl_com = new JLabel("컴:");
		lbl_com.setBounds(26, 58, 57, 15);
		contentPane.add(lbl_com);
		
		JLabel lbl_result = new JLabel("결과:");
		lbl_result.setBounds(26, 96, 57, 15);
		contentPane.add(lbl_result);
		
		tf_mine = new JTextField();
		tf_mine.setBounds(79, 19, 116, 21);
		contentPane.add(tf_mine);
		tf_mine.setColumns(10);
		
		tf_com = new JTextField();
		tf_com.setColumns(10);
		tf_com.setBounds(79, 55, 116, 21);
		contentPane.add(tf_com);
		
		tf_result = new JTextField();
		tf_result.setColumns(10);
		tf_result.setBounds(79, 93, 116, 21);
		contentPane.add(tf_result);
		
		JButton btn = new JButton("게임하기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}
		});
		btn.setBounds(26, 134, 169, 23);
		contentPane.add(btn);
	}
	
	void myclick() {
		String my = tf_mine.getText();
		String com = "";
		String result = "";
		
		double ran = Math.random();
		
		if(ran>0.66) {
			com = "가위";
		}else if(ran>0.33) {
			com = "바위";
		}else {
			com = "보";
		}
		
//		if(my.equals(com)) {
//			result = "비김";
//		}else if(my.equals("가위")&&com.equals("보")
//			   ||my.equals("바위")&&com.equals("가위")
//			   ||my.equals("보")&&com.equals("바위")) {
//			result = "이김";
//		}else {
//			result = "짐";
//		}

		if(my.equals("가위")&&com.equals("가위")) result="비김";
		if(my.equals("가위")&&com.equals("바위")) result="짐";
		if(my.equals("가위")&&com.equals("보")) result="이김";
		
		if(my.equals("바위")&&com.equals("가위")) result="이김";
		if(my.equals("바위")&&com.equals("바위")) result="비김";
		if(my.equals("바위")&&com.equals("보")) result="짐";
		
		if(my.equals("보")&&com.equals("가위")) result="짐";
		if(my.equals("보")&&com.equals("바위")) result="이김";
		if(my.equals("보")&&com.equals("보")) result="비김";
		
		
		tf_com.setText(com);
		tf_result.setText(result);
		
	}
	
}
