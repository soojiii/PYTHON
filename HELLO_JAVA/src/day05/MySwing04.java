package day05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MySwing04 extends JFrame {

	private JPanel contentPane;
	private JTextField tf01;
	JTextArea ta01;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing04 frame = new MySwing04();
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
	public MySwing04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel("출력단수");
		lbl.setBounds(35, 23, 73, 15);
		contentPane.add(lbl);
		
		tf01 = new JTextField();
		tf01.setBounds(120, 20, 116, 21);
		contentPane.add(tf01);
		tf01.setColumns(10);
		
		JButton btn = new JButton("출력하기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
				}
		});
		btn.setBounds(35, 48, 201, 23);
		contentPane.add(btn);
		
		ta01 = new JTextArea();
		ta01.setBounds(35, 81, 201, 226);
		contentPane.add(ta01);
	}
	void myclick() {
		String atf01 = tf01.getText();
		int dan = Integer.parseInt(atf01);

		String txt = "";
		
		for (int i = 1; i <= 9; i++) {
		txt += dan+"*"+i+"="+(i*dan)+"\n";
		}
		ta01.setText(txt);
	}
}

