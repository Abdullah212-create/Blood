package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Entities.*;
public class Homepage extends JFrame implements MouseListener,ActionListener{
	JPanel panel;
	JLabel imagelbl;
	ImageIcon img;
	JButton Search,back;
	JTextField f;
	public Homepage(){

		
		super("homepages");
		this.setSize(850,450);
		this.setLocationRelativeTo(null);
		
		
		panel=new JPanel();
		panel.setLayout(null);
		
		img=new ImageIcon("./Images/Home1.jpg");
		imagelbl=new JLabel(img);
		imagelbl.setBounds(0,0,850,450);
		panel.add(imagelbl);
		
		Search=new JButton("Search");
		Search.setBounds(450,80,80,30);
		Search.addMouseListener(this);
		Search.addActionListener(this);
		this.add(Search);
		
		f=new JTextField();
		f.setBounds(250,80,200,30);
		this.add(f);
		
		
		
		back=new JButton("Back");
		back.setBounds(530,80,80,30);
		back.addMouseListener(this);
		back.addActionListener(this);
		this.add(back);
		
		
		
		
		
		
		
		
		
		
		
		this.add(panel);
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){
		if(me.getSource()==Search){
		  Search.setBackground(Color.RED);
			Search.setForeground(Color.WHITE);
		}
		else if(me.getSource()==back){
		  back.setBackground(Color.RED);
			back.setForeground(Color.WHITE);
		}
	}
	public void mouseExited(MouseEvent me){
		if(me.getSource()==Search){
			Search.setBackground(Color.WHITE);
			Search.setForeground(Color.BLACK);
	}
	else if(me.getSource()==back){
			back.setBackground(Color.WHITE);
			back.setForeground(Color.BLACK);
	}
	}
	public void actionPerformed(ActionEvent ae ){
		String s1=f.getText();
		
		if(ae.getSource()==Search){
			if(s1.isEmpty()){
				JOptionPane.showMessageDialog(null,"Fill it");
			}
			else{
				Account a1=new Account();
				a1.findAccount(s1);
			}
		}
		else if(ae.getSource()==back){
			FrameIntro f3=new FrameIntro();
			this.setVisible(false);
			f3.setVisible(true);
		}
	}
	
}
