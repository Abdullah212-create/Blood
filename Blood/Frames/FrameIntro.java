package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Entities.*;


public class FrameIntro extends JFrame implements MouseListener,ActionListener{
	
	JLabel namelbl,passlbl,imagelbl;
	JTextField namefbl;
	JPanel panel;
	Color mycolor;
	Font myfont;
	JPasswordField passfld;
	ImageIcon img;
	JButton rgbtn,lbtn,admin;
	
	
	
	public FrameIntro(){
		super("Blood");
		this.setSize(850,450);
		this.setLocationRelativeTo(null);
		
		panel=new JPanel();
		panel.setLayout(null);
		
		//mycolor=new Color(WHITE);
		myfont=new Font("Cambria",Font.PLAIN,13);
		
		img = new ImageIcon(getClass().getResource("/Images/blood.jpg"));
		imagelbl=new JLabel(img);
		imagelbl.setBounds(0,0,850,450);
		//panel.add(imagelbl);
		
		
		
		namelbl=new JLabel("Name :");
		namelbl.setBounds(225,100,100, 30);
		//panel.setBackground(mycolor);
		panel.add(namelbl);
		
		namefbl=new JTextField();
		namefbl.setBounds(325,100,200,30);
		panel.add(namefbl);
		
		
		passlbl=new JLabel("Key    :");
		passlbl.setBounds(225,140,100,30);
		panel.add(passlbl);
		
		passfld=new JPasswordField();
		passfld.setBounds(325,140,200,30);
		panel.add(passfld);
		
		
		rgbtn=new JButton("Sign up");
		rgbtn.setBounds(330,270,120,50);
		rgbtn.addActionListener(this);
		rgbtn.addMouseListener(this);
		panel.add(rgbtn);
		
		lbtn=new JButton("Login");
		lbtn.setBounds(180,270,100,50);
		lbtn.addActionListener(this);
		lbtn.addMouseListener(this);
		panel.add(lbtn);
		
		admin=new JButton("Admin");
		admin.setBounds(480,270,140,50);
		admin.addActionListener(this);
		admin.addMouseListener(this);
		panel.add(admin);
		
		
		
		
		
		
		
		
		
		
		this.add(panel);
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==lbtn){
			lbtn.setBackground(Color.RED);
			lbtn.setForeground(Color.WHITE);
		}
		else if(me.getSource()==rgbtn){
			rgbtn.setBackground(Color.RED);
			rgbtn.setForeground(Color.WHITE);
		
	}
	else if(me.getSource()==admin){
			admin.setBackground(Color.RED);
			admin.setForeground(Color.WHITE);
		
	}
	
	}
	public void mouseExited(MouseEvent me)
	{if(me.getSource()==rgbtn){
			rgbtn.setBackground(Color.WHITE);
			rgbtn.setForeground(Color.BLACK);
		}
		else if(me.getSource()==lbtn){
			lbtn.setBackground(Color.WHITE);
			lbtn.setForeground(Color.BLACK);
		
		}
		else if(me.getSource()==admin){
			admin.setBackground(Color.WHITE);
			admin.setForeground(Color.BLACK);
		
		}
		
		
		
		
		
		}
		public void actionPerformed(ActionEvent ae ){
			String s1=namefbl.getText();
			String s2=passfld.getText();
			
			if(ae.getSource()==rgbtn){
				
					Registration r1=new Registration();
				this.setVisible(false);
				r1.setVisible(true);
				
				
			}
			else if (ae.getSource()==lbtn){
				if(s1.isEmpty() || s2.isEmpty()){
					JOptionPane.showMessageDialog(null,"Fill up Name and Key");
				}
				else{
					Account a11=new Account();
					if (a11.getAccount(s1,s2)==true){
				Homepage hm1=new Homepage();
				this.setVisible(false);
					hm1.setVisible(true);}
					else{
						JOptionPane.showMessageDialog(null,"wrong Name or Key");
					}
			}
			}
			else if (ae.getSource()==admin){
				Admin a1=new Admin();
				a1.setVisible(true);
		}
}
}
