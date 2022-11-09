package swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class borderlayout_p {
	public borderlayout_p(){
		
		JFrame jf=new JFrame();
		JButton jb=new JButton("north");
		JButton jb1=new JButton("south");
		JButton jb2=new JButton("west");
		JButton jb3=new JButton("east");
		JButton jb4=new JButton("centre");
		
		jf.add(jb,BorderLayout.NORTH);
		jf.add(jb1,BorderLayout.SOUTH);
		jf.add(jb2,BorderLayout.WEST);
		jf.add(jb3,BorderLayout.EAST);
		jf.add(jb4,BorderLayout.CENTER);
		
		jf.setSize(600,600);
		jf.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new borderlayout_p();
		
	}

}
