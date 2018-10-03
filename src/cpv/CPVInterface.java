package cpv;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;

public class CPVInterface {

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLayeredPane layeredPane = new JLayeredPane();
		frame.getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		JButton btnBack = new JButton("back");
		btnBack.setBounds(0, 123, 89, 23);
		layeredPane.add(btnBack);
		
		JButton btnFront = new JButton("front");
		btnFront.setBounds(345, 123, 89, 23);
		layeredPane.add(btnFront);
		
		JButton btnSelectFile = new JButton("select file");
		btnSelectFile.setBounds(178, 123, 89, 23);
		layeredPane.add(btnSelectFile);
		
		JCheckBoxMenuItem chckbxmntmFolders = new JCheckBoxMenuItem("folders");
		chckbxmntmFolders.setBounds(154, 11, 129, 22);
		layeredPane.add(chckbxmntmFolders);
	}
}
