package day05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class MySwing11 extends JFrame {

	private JPanel contentPane;
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing11 frame = new MySwing11();
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
	public MySwing11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 295, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel("숫자(1-100)");
		lbl.setBounds(40, 37, 82, 15);
		contentPane.add(lbl);
		
		tf = new JTextField();
		tf.setBounds(122, 34, 116, 21);
		contentPane.add(tf);
		tf.setColumns(10);
		
		JButton btn = new JButton("숫자맞추기");
		btn.setBounds(40, 68, 198, 23);
		contentPane.add(btn);
		
		JTextArea ta = new JTextArea();
		ta.setBounds(40, 101, 198, 273);
		contentPane.add(ta);
	}
}
