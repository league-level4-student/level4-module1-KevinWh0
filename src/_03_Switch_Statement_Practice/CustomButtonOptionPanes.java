package _03_Switch_Statement_Practice;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.Random;

import javax.sound.midi.SysexMessage;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		System.out.println(choice);

		switch (choice) {
		case "Sunday":
			System.out.println("sun");
			break;
		case "Monday":
			System.out.println("mon");
			for (int i = 0; i < 10; i++) {
				JFrame frame = new JFrame();
				JPanel pannel = new JPanel();
				JLabel txt = new JLabel("NO");
				Random rand = new Random();
				
				frame.setVisible(true);
				frame.add(pannel);
				pannel.add(txt);
				Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

				frame.setBounds(new Rectangle(rand.nextInt(screenSize.width), rand.nextInt(screenSize.height), rand.nextInt(200), rand.nextInt(200)));
				
			}
			String[] d = {"Never","Ok, fine"};
			int done = JOptionPane.showOptionDialog(null, "Monday is the worst... Admit it", "NO", 0, -1, null,
					d, 0);
			
			if(done == 0) {
					JFrame frame = new JFrame();
					JPanel pannel = new JPanel();
					JLabel txt = new JLabel("NO");
					Random rand = new Random();
					
					frame.setVisible(true);
					frame.add(pannel);
					pannel.add(txt);
					Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

					frame.setBounds(new Rectangle(rand.nextInt(screenSize.width), rand.nextInt(screenSize.height), 200,200));
					
				
			}else {
				System.exit(1);
			}
			break;
		case "Tuesday":
			System.out.println("tues");
			break;
		case "Wednesday":
			System.out.println("wed");
			break;
		case "Thursday":
			System.out.println("thirs");
			break;
		case "Friday":
			System.err.println("Fri");
			break;
		case "Saturday":
			System.out.println("sat");
			break;
		default:
			break;
		}
	}
}
