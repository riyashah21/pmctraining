package swing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class jtable_program {
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		String Column[]= {"ID","USername","Password"};
		String data[][]= {{"1","tops","1234"},{"2","tops123","12345"}};
		
		
		
		JTable jt=new JTable(data, Column);
		jt.setBounds(30,40,200,300);
		JScrollPane sp=new JScrollPane(jt);
		jf.add(sp);
		jf.setVisible(true);
		jf.setSize(300,400);
	}

}
