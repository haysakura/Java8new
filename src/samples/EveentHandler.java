package samples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EveentHandler {
	
	public static void main(String[] args)
	{
		JButton show = new JButton("Show");
		
		// before Java8 no Lambda
		show.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Event handling without lambda expression is boring.");				
			}
		});
		
		// Java8 with Lambda
		show.addActionListener(
				e -> System.out.println("Light, Camera, Action!! Lambda expression rocks.")
				);
	}

}
