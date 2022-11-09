package swing;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class keyboard_listner implements KeyListener {
	public keyboard_listner() {
		
		JFrame jf=new JFrame();
		jf.addKeyListener(this);
		
		jf.setSize(500, 500);
		 jf.setVisible(true);
		 jf.setLayout(null);
	}
		 
		 public static void main(String args) {
			 new keyboard_listner();
		 }

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			System.out.println("keytyped");
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			System.out.println("keypressed");
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			System.out.println("keyreleaed");
		}


}
