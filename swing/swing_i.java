package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class swing_i implements ActionListener{

	JTextField ja;
	 swing_i() {
		// TODO Auto-generated constructor stub
		
		//make frame
		JFrame jf=new JFrame();
		
		//Form heading
		JLabel jl=new JLabel("Form");
		jl.setBounds(180, 0, 80, 30);
		jf.add(jl);
		
		//Usrname
		JLabel jl1=new JLabel("Username");
		jl1.setBounds(120, 30, 80, 30);
		jf.add(jl1);
		
		ja=new JTextField();
		ja.setBounds(190, 30, 95, 30);
		jf.add(ja);
		
		
		//Password
		JLabel jl2 = new JLabel("Password");
		jl2.setBounds(120, 90, 80, 30);
		jf.add(jl2);

		JPasswordField jp = new JPasswordField();
		jp.setBounds(190, 90, 95, 30);
		jf.add(jp);
		
		
		//Gender
		JLabel jl3=new JLabel("Gender");
		jl3.setBounds(120, 160, 80, 30);
		jf.add(jl3);
		
		JRadioButton jr = new JRadioButton("male");
		JRadioButton jr1 = new JRadioButton("female");
		jr.setBounds(190, 160, 95, 30);
		jr1.setBounds(280, 160, 95, 30);
		
		ButtonGroup b = new ButtonGroup();
		b.add(jr);
		b.add(jr1);

		jf.add(jr);
		jf.add(jr1);
		
		//Language
		JLabel jl4=new JLabel("Language");
		jl4.setBounds(120, 240, 80, 30);
		jf.add(jl4);
		
		JCheckBox jc = new JCheckBox("Hindi");
		JCheckBox jc1 = new JCheckBox("gujrati");
		JCheckBox jc2 = new JCheckBox("english");
		jc.setBounds(190, 240, 95, 30);
		jc1.setBounds(290, 240, 95, 30);
		jc2.setBounds(380, 240, 95, 30);
		jf.add(jc);
		jf.add(jc1);
		jf.add(jc2);
		
		//City
		JLabel jl5=new JLabel("City");
		jl5.setBounds(120, 320, 80, 30);
		jf.add(jl5);
		
		String city[] = { "anand", "baroda", "surat", "bharuch", "ahmedabad" };
		JComboBox jco = new JComboBox(city);
		jco.setBounds(190, 320, 95, 30);
		jf.add(jco);

		//Button
		JButton jbu = new JButton("Submit");
		jbu.setBounds(180, 410, 80, 30);
		jf.add(jbu);

		jbu.addActionListener(this);
		
	
		
		jf.setSize(600,600);//default size
		jf.setLayout(null);//
		jf.setVisible(true);
		
	}
	public static void main(String[] args) {
		new swing_i();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//String s=ja.getText();
		//System.out.println(s);
		
	}
}