package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Entities.*;



public class Admin extends JFrame implements MouseListener,ActionListener{
	
	JLabel namelbl,passlbl;
	JTextField namefbl;
	JPanel panel;
	JPasswordField passfld;
	JButton lgbtn,backbtn;
	
	
	
	public Admin(){
		super("Blood");
		this.setSize(850,450);
		this.setLocationRelativeTo(null);
		
		panel=new JPanel();
		panel.setLayout(null);

		
		
		namelbl=new JLabel("Name :");
		namelbl.setBounds(225,100,100, 30);
		panel.add(namelbl);
		
		namefbl=new JTextField();
		namefbl.setBounds(325,100,200,30);
		panel.add(namefbl);
		
		
		passlbl=new JLabel("Key   :");
		passlbl.setBounds(225,140,100,30);
		panel.add(passlbl);
		
		passfld=new JPasswordField();
		passfld.setBounds(325,140,200,30);
		panel.add(passfld);

		
		lgbtn=new JButton("Login");
		lgbtn.setBounds(180,270,100,50);
		lgbtn.addActionListener(this);
		lgbtn.addMouseListener(this);
		panel.add(lgbtn);
		
		backbtn=new JButton("Back");
		backbtn.setBounds(480,270,140,50);
		backbtn.addActionListener(this);
		backbtn.addMouseListener(this);
		panel.add(backbtn);
		
		
		
		//img=new ImageIcon("blood.jpg");
		//imagelbl=new JLabel(img);
		//imagelbl.setBounds(0,0,850,450);
		//panel.add(imagelbl);
		
		
		
		
		
		
		this.add(panel);
}
public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==lgbtn){
			lgbtn.setBackground(Color.RED);
			lgbtn.setForeground(Color.WHITE);
		}
		
	else if(me.getSource()==backbtn){
			backbtn.setBackground(Color.RED);
			backbtn.setForeground(Color.WHITE);
		
	}
	
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==lgbtn){
			lgbtn.setBackground(Color.WHITE);
			lgbtn.setForeground(Color.BLACK);
		
		}
		else if(me.getSource()==backbtn){
			backbtn.setBackground(Color.WHITE);
			backbtn.setForeground(Color.BLACK);
		
		}
		
		
		
		
		
		}
		public void actionPerformed(ActionEvent ae ){
			String s1=namefbl.getText();
			String s2=passfld.getText();
			String p="Blood";
			
			
			
			
			if (ae.getSource()==lgbtn){
				if(s1.equals("Mask") && s2.equals("Blood")){
					 System.out.println("Opening AdminPanel...");
					
    AdminPanel a11 = new AdminPanel();
    this.setVisible(false);
    a11.setVisible(true);
}
}
				else if(s1.isEmpty() || s2.isEmpty()){
				JOptionPane.showMessageDialog(null,"Fill up Name and Key");}
				else{
					JOptionPane.showMessageDialog(null,"name or key not correct");
				}
				
				
				
				}
			else if (ae.getSource()==backbtn){
				FrameIntro f1=new FrameIntro();
				this.setVisible(false);
				f1.setVisible(true);
		}
}








}