import javax.swing.JFrame;



/**
 * Generating main window
 *
 */
@SuppressWarnings("serial")
public class MyFrame extends JFrame {

	/**
	 * constructor
	 * set window visible etc.
	 * 
	 */
	public MyFrame() {
	        super("Hello World");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setVisible(true);
	    }

}