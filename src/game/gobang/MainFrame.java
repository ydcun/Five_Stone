package game.gobang;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
/**
 * ������
 * @WangJB
 * @version 19:46 13/03/17
 */
public class MainFrame extends JFrame{
    public static void main(String[] args) {
    	MainPanel panel = new MainPanel();
		MainFrame frame = new MainFrame("������");
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
