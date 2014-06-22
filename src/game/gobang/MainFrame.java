package game.gobang;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
/**
 * 五子棋
 */
public class MainFrame extends JFrame{
    public static void main(String[] args) {
    	MainPanel panel = new MainPanel();
		MainFrame frame = new MainFrame("五子棋");
		frame.setSize(680,680);
	    panel.setBackground(Color.GRAY);
		frame.add(panel,BorderLayout.CENTER);
		panel.addMouseListener(panel);
		frame.setVisible(true);
	}
    public MainFrame(){
    	super();
    }
    public MainFrame(String str){
    	super(str);
    }
}
