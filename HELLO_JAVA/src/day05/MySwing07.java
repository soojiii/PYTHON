package day05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing07 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing07 frame = new MySwing07();
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
	public MySwing07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(71, 64, 1, 1);
		contentPane.add(table);
		
		lbl1 = new JLabel("__");
		lbl1.setBounds(47, 75, 44, 15);
		contentPane.add(lbl1);
		
		lbl2 = new JLabel("__");
		lbl2.setBounds(103, 75, 44, 15);
		contentPane.add(lbl2);
		
		lbl3 = new JLabel("__");
		lbl3.setBounds(148, 75, 44, 15);
		contentPane.add(lbl3);
		
		lbl4 = new JLabel("__");
		lbl4.setBounds(204, 75, 44, 15);
		contentPane.add(lbl4);
		
		lbl5 = new JLabel("__");
		lbl5.setBounds(268, 75, 44, 15);
		contentPane.add(lbl5);
		
		lbl6 = new JLabel("__");
		lbl6.setBounds(324, 75, 44, 15);
		contentPane.add(lbl6);
		
		JButton btn = new JButton("로또출력하기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}
		});
		btn.setBounds(28, 120, 340, 23);
		contentPane.add(btn);
	}
	
	void myclick() {
		int[] arr = {
				1,2,3,4,5, 6,7,8,9,10,
				11,12,13,14,15, 16,17,18,19,20,
				21,22,23,24,25, 26,27,28,29,30,
				31,32,33,34,35, 36,37,38,39,40,
				41,42,43,44,45
			};
		
		for (int i = 0; i < 1000; i++) {
			int rnd = (int) (Math.random()*45);
			int a = arr[0];
			arr[0]=arr[rnd];
			arr[rnd]=a;
		}
		
		lbl1.setText(String.valueOf(arr[0]));
		lbl2.setText(String.valueOf(arr[1]));
		lbl3.setText(String.valueOf(arr[2]));
		lbl4.setText(String.valueOf(arr[3]));
		lbl5.setText(String.valueOf(arr[4]));
		lbl6.setText(String.valueOf(arr[5]));
		
	}
	
}





