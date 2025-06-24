package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import Entities.*;


public class AdminPanel extends JFrame implements MouseListener,ActionListener {
	JPanel panel;
	JButton del,load;
	JLabel img;
	ImageIcon i1;
	JTextField delfld,loadfld;
	
	
	
	public AdminPanel(){
		super("SuperUser");
		this.setSize(850,450);
		this.setLocationRelativeTo(null);
		
		
		panel=new JPanel();
		panel.setLayout(null);
		
		/*i1=new ImageIcon("./Images/Admin.jpg");
		img=new JLabel(i1);
		img.setBounds(0,0,850,450);
		panel.add(img);*/
		
		/*del=new JButton("Delete Account");
		del.setBounds(300,50,250,30);
		del.setForeground(Color.RED);
		del.addMouseListener(this);
		del.addActionListener(this);
		//panel.add(del);*/
		
		
		delfld=new JTextField();
		delfld.setBounds(300,10,250,30);
		delfld.setForeground(Color.RED);
		panel.add(delfld);
		
		load=new JButton("load all userinfo");
		load.setBounds(300,90,250,30);
		load.addMouseListener(this);
		load.addActionListener(this);
		panel.add(load);
		
		
		
		
		
		
		
		
		
		
		
		
		this.add(panel);
	}
	
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==del){
			del.setBackground(Color.RED);
			del.setForeground(Color.WHITE);
		}
		
	else if(me.getSource()==load){
			load.setBackground(Color.RED);
			load.setForeground(Color.WHITE);
		
	}
	
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==del){
			del.setBackground(Color.WHITE);
			del.setForeground(Color.BLACK);
		
		}
		else if(me.getSource()==load){
			load.setBackground(Color.WHITE);
			load.setForeground(Color.BLACK);
		
		}
		
		
		
		
		
		}
		public void actionPerformed(ActionEvent ae ){
			String s1=delfld.getText();
			if(ae.getSource()==load){
				Account a1=new Account();
				a1.loadAccount();
				
				
			}
			/*else if(ae.getSource()==del){
				Account a1=new Account();
				a1.deleteAccount(s1);

			}*/



	
	
	
	
	
}
}
