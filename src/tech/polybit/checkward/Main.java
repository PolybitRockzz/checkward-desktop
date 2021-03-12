package tech.polybit.checkward;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;

public class Main {

	private JFrame frame;
	private JLabel backTutorialLabel;
	private JLabel backGameLabel;
	private Tutorial tutorial;
	private Game game;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("./logo.png"));
		frame.setResizable(false);
		frame.setTitle("Checkward - Official [Polybit] - 1.0");
		frame.setBounds(100, 100, 760, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JPanel homeScreen = new JPanel();
		homeScreen.setBounds(0, 0, 744, 471);
		homeScreen.setBackground(new Color(2, 51, 20));
		frame.getContentPane().add(homeScreen);
		homeScreen.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHECKWARD");
		lblNewLabel.setForeground(new Color(196, 245, 217));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 60));
		lblNewLabel.setBounds(175, 85, 400, 100);
		homeScreen.add(lblNewLabel);
		
		backTutorialLabel = new JLabel("BACK");
		backTutorialLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				System.out.println("Backed up!");
				frame.getContentPane().add(homeScreen);
				frame.getContentPane().remove(tutorial);
				frame.setVisible(false);
				frame.setVisible(true);
			}
		});
		backTutorialLabel.setForeground(new Color(196, 245, 217));
		backTutorialLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		backTutorialLabel.setBounds(15, 10, 150, 30);
		
		backGameLabel = new JLabel("BACK");
		backGameLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				System.out.println("Backed up!");
				frame.getContentPane().add(homeScreen);
				frame.getContentPane().remove(game);
				frame.setVisible(false);
				frame.setVisible(true);
			}
		});
		backGameLabel.setForeground(new Color(196, 245, 217));
		backGameLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		backGameLabel.setBounds(15, 10, 150, 30);
		
		JLabel lblStart = new JLabel("START");
		lblStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				System.out.println("Started!");
				game = new Game(frame);
				game.add(backGameLabel);
				frame.getContentPane().add(game);
				frame.getContentPane().remove(homeScreen);
				frame.setVisible(false);
				frame.setVisible(true);
			}
		});
		lblStart.setHorizontalAlignment(SwingConstants.CENTER);
		lblStart.setForeground(new Color(196, 245, 217));
		lblStart.setFont(new Font("Trebuchet MS", Font.BOLD, 32));
		lblStart.setBounds(250, 230, 250, 40);
		homeScreen.add(lblStart);
		
		JLabel lblTutorial = new JLabel("TUTORIAL");
		lblTutorial.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("Tutorial!");
				tutorial = new Tutorial(frame);
				tutorial.add(backTutorialLabel);
				frame.getContentPane().add(tutorial);
				frame.getContentPane().remove(homeScreen);
				frame.setVisible(false);
				frame.setVisible(true);
			}
		});
		lblTutorial.setHorizontalAlignment(SwingConstants.CENTER);
		lblTutorial.setForeground(new Color(196, 245, 217));
		lblTutorial.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblTutorial.setBounds(250, 281, 250, 40);
		homeScreen.add(lblTutorial);
		
		JLabel lblSettings = new JLabel("SETTINGS");
		lblSettings.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("Settings!");
				JOptionPane.showMessageDialog(null, "Sorry, but there is no settings or any game element to tweak in this current version.\nThink it's a mistake? Please check for the current latest version and try that out...", "Message", 0);
			}
		});
		lblSettings.setHorizontalAlignment(SwingConstants.CENTER);
		lblSettings.setForeground(new Color(196, 245, 217));
		lblSettings.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblSettings.setBounds(250, 332, 250, 40);
		homeScreen.add(lblSettings);
	}
}
