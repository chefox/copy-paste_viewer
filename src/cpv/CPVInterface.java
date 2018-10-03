package cpv;

import java.awt.EventQueue;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JToolBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Color;

public class CPVInterface {
	ImageIcon iconLeft = createIcon("left.png");
	ImageIcon iconRight = createIcon("right.png");
	ImageIcon iconEmpty = createIcon("none.png");
	
	ImageIcon icon1 =createIcon("1.png");
	ImageIcon icon2 = createIcon("2.png");
	ImageIcon icon3 = createIcon("3.png");
	ImageIcon icon4 = createIcon("4.png");
	ImageIcon icon5 = createIcon("5.png");
	ImageIcon icon6 = createIcon("6.png");
	ImageIcon icon7 = createIcon("7.png");
	ImageIcon icon8 = createIcon("8.png");
	ImageIcon icon9 = createIcon("9.png");
	ImageIcon icon0 = createIcon("0.png");
	

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CPVInterface window = new CPVInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CPVInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GREEN);
		frame.setBounds(100, 100, 663, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLayeredPane layeredPane = new JLayeredPane();
		frame.getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		JButton btnBack = new JButton("");
		btnBack.setBounds(0, 123, 50, 50);
		btnBack.setIcon(iconLeft);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorder(null);
		layeredPane.add(btnBack);


		
		JButton btnFront = new JButton("");
		btnFront.setBounds(597, 176, 50, 50);
		btnFront.setIcon(iconRight);
		btnFront.setContentAreaFilled(false);
		btnFront.setBorder(null);
		layeredPane.add(btnFront);
		
		JButton btnSelectFile = new JButton("");
		btnSelectFile.setBounds(211, 176, 50, 50);
		btnSelectFile.setIcon(iconEmpty);
		btnSelectFile.setContentAreaFilled(false);
		btnSelectFile.setBorder(null);
		layeredPane.add(btnSelectFile);
		

		
		JPanel panel = new JPanel();
		panel.setBounds(49, 11, 500, 72);
		panel.setOpaque(false);
		layeredPane.add(panel);
		
		JButton btn1 = new JButton("");
		btn1.setContentAreaFilled(false);
		btn1.setBorder(null);
		btn1.setBounds(0, 0, 50, 50);
		btn1.setIcon(icon1);
		panel.add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.setContentAreaFilled(false);
		btn2.setBorder(null);
		btn2.setBounds(50, 0, 50, 50);
		btn2.setIcon(iconEmpty);
		panel.add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.setContentAreaFilled(false);
		btn3.setBorder(null);
		btn3.setBounds(100, 0, 50, 50);
		btn3.setIcon(iconEmpty);
		panel.add(btn3);
		
		JButton btn4 = new JButton("");
		btn4.setContentAreaFilled(false);
		btn4.setBorder(null);
		btn4.setBounds(150, 0, 50, 50);
		btn4.setIcon(iconEmpty);
		panel.add(btn4);
		
		JButton btn5 = new JButton("");
		btn5.setContentAreaFilled(false);
		btn5.setBorder(null);
		btn5.setBounds(200, 0, 50, 50);
		btn5.setIcon(iconEmpty);
		panel.add(btn5);
		
		JButton btn6 = new JButton("");
		btn6.setContentAreaFilled(false);
		btn6.setBorder(null);
		btn6.setBounds(250, 0, 50, 50);
		btn6.setIcon(iconEmpty);
		panel.add(btn6);
		
		JButton btn7 = new JButton("");
		btn7.setContentAreaFilled(false);
		btn7.setBorder(null);
		btn7.setBounds(300, 0, 50, 50);
		btn7.setIcon(iconEmpty);
		panel.add(btn7);
		
		JButton btn8 = new JButton("");
		btn8.setContentAreaFilled(false);
		btn8.setBorder(null);
		btn8.setBounds(350, 0, 50, 50);
		btn8.setIcon(iconEmpty);
		panel.add(btn8);
		
		JButton btn9 = new JButton("");
		btn9.setContentAreaFilled(false);
		btn9.setBorder(null);
		btn9.setBounds(400, 0, 50, 50);
		btn9.setIcon(iconEmpty);
		panel.add(btn9);
		
		JButton btn0 = new JButton("");
		btn0.setContentAreaFilled(false);
		btn0.setBorder(null);
		btn0.setBounds(450, 0, 50, 50);
		btn0.setIcon(iconEmpty);
		panel.add(btn0);


		

	}
    protected static ImageIcon createIcon(String path) {
        URL imgURL = CPVInterface.class.getResource(path);     
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("File not found " + path);
            return null;
        }
    }
}
