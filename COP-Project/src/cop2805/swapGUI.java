package cop2805;

import javax.swing.*;

public class swapGUI {
	
	private static void constructGui() {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		Menu menu = new Menu();
		
		menu.swap.setText("Swap");
		menu.claimStake.setText("Claim Stake");
		menu.depost.setText("Depost");
		menu.withdraw.setText("Withdraw");
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				constructGui();
			}
		});
	}
}

class Menu extends JFrame {
	
	JButton swap;
	JButton claimStake;
	JButton depost;
	JButton withdraw;
	
	public Menu() {
		super();
		init();
	}
	
	private void init() {
		swap = new JButton();
		claimStake = new JButton();
		depost = new JButton();
		withdraw = new JButton();
	}
	
}


