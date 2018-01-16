package brtillecalculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Brtillecalculator extends JFrame {
	private double store, storeNext;
	private int setAdd = 0, setSub = 0;
	private JButton reset = new JButton( "C" )
	, equals = new JButton( "=" ),
	 add = new JButton( "+" ),
	 dot = new JButton( "." ),
	  subtract = new JButton( "-" ),
	   off = new JButton( "OFF" ),
	    zero = new JButton( "0" ),
	     one = new JButton( "1" ),
	      two = new JButton( "2" ) ,
	       three = new JButton( "3" ),
	        four = new JButton( "4" ), 
	        five = new JButton( "5" ),
	         six = new JButton( "6" ),
	          seven = new JButton( "7" ),
	           eight = new JButton( "8" ),
	            nine = new JButton( "9" );
	private JTextArea display = new JTextArea();
	//constructor
	public Brtillecalculator(){
		//JFrame 
		setSize( 390, 450 );
		setTitle( "Basic Calculator" );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		//create jpanel
		JPanel panel = new JPanel();
		panel.setLayout( null );
		panel.setBackground( Color.black );
		add( panel );
		//display or screen
		display.setBounds( 10, 20, 350, 50 );
		panel.add( display );
		//button components
		reset.setBounds( 100, 100, 80, 50 );
		panel.add( reset );
		off.setBounds( 190, 100, 80, 50 );
		panel.add( off );
		nine.setBounds( 10, 160, 80, 50 );
		panel.add( nine );
		eight.setBounds( 100, 160, 80, 50 );
		panel.add( eight );
		seven.setBounds( 190, 160, 80, 50 );
		panel.add( seven );
		six.setBounds( 10, 220, 80, 50 );
		panel.add( six );
		five.setBounds( 100, 220, 80, 50 );
		panel.add( five );
		four.setBounds( 190, 220, 80, 50 );
		panel.add( four );
		three.setBounds( 10, 280, 80, 50 );
		panel.add( three );
		two.setBounds( 100, 280, 80, 50 );
		panel.add( two );
		one.setBounds( 190, 280, 80, 50 );
		panel.add( one );
		zero.setBounds( 10, 340, 80, 50 );
		panel.add( zero );
		dot.setBounds( 100, 340, 80, 50 );
		panel.add( dot );
		equals.setBounds( 190, 340, 170, 50 );
		panel.add( equals );
		subtract.setBounds( 280, 220, 80, 110 );
		panel.add( subtract );
		add.setBounds( 280, 100, 80, 110 );
		panel.add( add );
		//button listener
		reset.addActionListener( new reset() );
		off.addActionListener( new off() );
		nine.addActionListener( new nine() );
		eight.addActionListener( new eight() );
		seven.addActionListener( new seven() );
		six.addActionListener( new six() );
		five.addActionListener( new five() );
		four.addActionListener( new four() );
		three.addActionListener( new three() );
		two.addActionListener( new two() );
		one.addActionListener( new one() );
		zero.addActionListener( new zero() );
		add.addActionListener( new add() );
		subtract.addActionListener( new subtract() );
		equals.addActionListener( new equals() );
		dot.addActionListener( new dot() );

		setVisible( true );
	}
	private class reset implements ActionListener{
		public void actionPerformed( ActionEvent e ){
			display.setText( null );
		}
	}
	private class off extends JFrame implements ActionListener{
		public void actionPerformed( ActionEvent e ){
			setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		}
	}
	private class nine implements ActionListener{
		public void actionPerformed( ActionEvent e ){
			display.append( "9" );
		}		
	}
	private class eight implements ActionListener{
		public void actionPerformed( ActionEvent e ){
			display.append( "8" );
		}
	}
	private class seven implements ActionListener{
		public void actionPerformed( ActionEvent e ){
			display.append( "7" );
		}
	}
	private class six implements ActionListener{
		public void actionPerformed( ActionEvent e ){
			display.append( "6" );
		}
	}
	private class five implements ActionListener{
		public void actionPerformed( ActionEvent e ){
			display.append( "5" );
		}
	}
	private class four implements ActionListener{
		public void actionPerformed( ActionEvent e ){
			display.append( "4" );
		}
	}
	private class three implements ActionListener{
		public void actionPerformed( ActionEvent e ){
			display.append( "3" );
		}
	}
	private class two implements ActionListener{
		public void actionPerformed( ActionEvent e ){
		display.append( "2" );
		}
	}
	private class one implements ActionListener{
		public void actionPerformed( ActionEvent e ){
			display.append( "1" );
		}
	}
	private class zero implements ActionListener{
		public void actionPerformed( ActionEvent e ){
			display.append( "0" );
		}
	}
	private class dot implements ActionListener{
		public void actionPerformed( ActionEvent e ){
			display.append( "." );
		}
	}
	private class add implements ActionListener{
		public void actionPerformed( ActionEvent e ){
			store = Double.parseDouble( display.getText() );
			setAdd = 1;
			display.setText( null );
		}
	}
	private class subtract implements ActionListener{
		public void actionPerformed( ActionEvent e ){
			store = Double.parseDouble( display.getText() );
			setSub = 1;
			display.setText( null );
		}
	}
	private class equals implements ActionListener{
		public void actionPerformed( ActionEvent e ){
			storeNext = Double.parseDouble( display.getText() );
			if ( setAdd == 1 )
				store += storeNext;
			else if ( setSub == 1 )
				store -= storeNext;
			display.setText(Double.toString( store ));
			setAdd = 0;
			setSub = 0;
		}
	}

	public static void main( String...args ) {
		new Brtillecalculator();
	}
}