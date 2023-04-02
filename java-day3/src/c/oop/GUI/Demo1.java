package c.oop.GUI;

import javax.swing.JFrame;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		JFrame fr = new JFrame("JBT App");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setBounds(100, 100, 500, 200);
		
		fr.setVisible(true);
		
		Thread.sleep(2000);
		fr.setLocation(300, 100);

		Thread.sleep(2000);
		fr.setLocation(0, 0);

	}

}
