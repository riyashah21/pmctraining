package swing;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class mouse_listner implements MouseListener {

	public mouse_listner() {

		JFrame jf = new JFrame();

		jf.addMouseListener(this);

		jf.setSize(500, 500);
		jf.setVisible(true);
		jf.setLayout(null);

		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new mouse_listner();
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("mouse clicked");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("mouse entered");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("mouse exited");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("mouse pressed");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("mouse released");
	}
}
