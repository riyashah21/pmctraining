package swing;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;

public class gridlayout_p  {
	public gridlayout_p() {
		JFrame jf=new JFrame();
		JButton jb=new JButton("1");
		JButton jb1=new JButton("2");
		JButton jb2=new JButton("3");
		JButton jb3=new JButton("4");
		JButton jb4=new JButton("5");
		jf.add(jb);
		jf.add(jb1);
		jf.add(jb2);
		jf.add(jb3);
		jf.add(jb4);
		
		
		jf.setSize(600,600);
		jf.setLayout(new GridLayout(3,3));
		jf.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new gridlayout_p();
	}

}
