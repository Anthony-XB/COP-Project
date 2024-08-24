package cop2805;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseListener;

//GUI Class
public class GUI {
	
	//construct GUI fn
	private static void constructGUI() {
		//sets the look and feel
		JFrame.setDefaultLookAndFeelDecorated(true);
		//creates a new object
		Calc calc = new Calc();		
		
		//presets for the GUI
		calc.num1.setText("Number 1");
		calc.num2.setText("Number 2");		
		calc.calculation.setText("calculate");
		calc.swap.setText("Swap");

		calc.setVisible(true);
		
					
	}
	
	//runs the constructGUI fn
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				constructGUI();
			}
	});
}
}

//Calc class that extends to the JFRAM and includes an actionlistener
class Calc extends JFrame implements ActionListener{
	//declare all variables and types
	public JLabel num1,num2,result;	
	public JComboBox operations;
	public JButton calculation;
	public JButton swap;
	//claim stake button HERE
	public JTextField usrnum1,usrnum2;
	
	//Calc fn that references to parent object
	public Calc() {
		super();
		init();
	}
	
	//private fn
	private void init() {
		
		//assigns variable names to objects
		num1 = new JLabel();
		num2 = new JLabel();
		result = new JLabel();
		calculation = new JButton();
		swap = new JButton();
		usrnum1 = new JTextField();
		usrnum2 = new JTextField();
		operations = new JComboBox();
		
		//assign ops as a String array with 4 elements
		String ops[] = {"Add", "Subtract", "Multiply", "Divide"};
		operations = new JComboBox(ops);
		
		//adds the variables to your GUI window
		this.setTitle("Test");
		this.setLayout(new GridLayout (4,2));
		this.add(num1);
		this.add(usrnum1);
		this.add(num2);
		this.add(usrnum2);
		this.add(operations);
		this.add(result);
		
		//sets initial height and width of GUI
		int frameWidth = 800;
		int frameHeight = 350;
		
		//sets the initial positioning of the GUI on screen
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds((int) screenSize.getWidth()/2 - frameWidth,
				(int)screenSize.getHeight()/2 - frameHeight,
				frameWidth,
				frameHeight);	
		
		//listens to calculation action
		calculation.addActionListener(this);
		swap.addActionListener(this);
		
		
		//adds the calculation and result to the pane
		this.getContentPane().add(calculation);
		this.getContentPane().add(swap);
		this.getContentPane().add(result);
		//sets the preferred size of its components
		this.pack();
		//closes properly when exiting
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//assures the window pops open when running program
		this.setVisible(true);
		
	
	}

	@Override
	//actionListener fn
	public void actionPerformed(ActionEvent e) {
		//assigns source to the event source
		JButton source = (JButton) e.getSource();
		//assigns variables
		double number3;
		String num3;
		//parses the text of the JLabels to double
		double number1 = Double.parseDouble(usrnum1.getText());
		double number2 = Double.parseDouble(usrnum2.getText());
		//assigns String variable to each element of the JCOMBO
		String operators = (String) operations.getSelectedItem();
		
		
//		if(source == swap) {
//			JDialog d = new JDialog(this, "dialogBox");
//			d.setSize(100,100);
//			d.setVisible(true);
//		}
		
		//conditional statement
		//assuring calculation was clicked
		if(source == calculation) {	
			//switch / case conditional 
			switch(operators) {
			case "Add":
				number3 = number1 + number2;				
				num3 = String.valueOf(number3);
				this.result.setText("Result: " + num3);
				this.add(result);
				break;
			case "Subtract":
				number3 = number1 - number2;				
				num3 = String.valueOf(number3);
				this.result.setText("Result: " +num3);
				this.add(result);
				break;
			case "Multiply":
				number3 = number1 * number2;				
				num3 = String.valueOf(number3);
				this.result.setText("Result: " +num3);
				this.add(result);
				break;
			case "Divide":
				number3 = number1 / number2;				
				num3 = String.valueOf(number3);
				this.result.setText("Result: " +num3);
				this.add(result);
				break;
				
			}
		} else {
			//message to alert of error
			System.out.print("Switch not working");
		}
		}
			
			
			
			
		}


