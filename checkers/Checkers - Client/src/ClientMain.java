import javax.swing.*;
import View.BoardPanel;


public class ClientMain {
	
	public static void main(String[] args) {
		ClientApp client = new ClientApp();
		client.setTitle("Game is on play!");
		client.pack();
		client.setVisible(true);
		client.setLocation(250, 150);
		client.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
