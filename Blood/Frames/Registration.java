package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Entities.*;

public class Registration extends JFrame implements ActionListener,MouseListener {
    
	JLabel nameLbl,emailLbl,passLbl,groupLbl,phoneLbl,titleLbl;
    JTextField nameField,emailField,phoneField,groupField;
	 
    JPasswordField passField;
     JButton submitBtn, backBtn;
	
    JPanel panel;

    public Registration() {
        super("Registration");
        this.setSize(850, 450);
        this.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(null);

        titleLbl = new JLabel("Create Your Account");
        titleLbl.setFont(new Font("Cambria", Font.BOLD, 18));
        titleLbl.setBounds(300,20,250,30);
        panel.add(titleLbl);

        nameLbl = new JLabel("Name:");
        nameLbl.setBounds(220,70,100,30);
        panel.add(nameLbl);

        nameField = new JTextField();
        nameField.setBounds(330,70,200,30);
        panel.add(nameField);

        emailLbl =new JLabel("Email:");
        emailLbl.setBounds(220,110,100,30);
        panel.add(emailLbl);

        emailField =new JTextField();
        emailField.setBounds(330,110,200,30);
        panel.add(emailField);

        passLbl =new JLabel("Password:");
        passLbl.setBounds(220,150,100,30);
        panel.add(passLbl);

        passField =new JPasswordField();
        passField.setBounds(330,150,200,30);
        panel.add(passField);

        groupLbl =new JLabel("Blood Group:");
        groupLbl.setBounds(220,190,100,30);
        panel.add(groupLbl);

        groupField =new JTextField();
        groupField.setBounds(330,190,200,30);
        panel.add(groupField);

        phoneLbl =new JLabel("Phone:");
        phoneLbl.setBounds(220,230,100,30);
        panel.add(phoneLbl);

        
		phoneField =new JTextField();
        
		phoneField.setBounds(330,230,200,30);
        panel.add(phoneField);

       
	    submitBtn =new JButton("Submit");
        submitBtn.setBounds(270,300,100,40);
        submitBtn.addMouseListener(this);
        submitBtn.addActionListener(this);
        panel.add(submitBtn);


        backBtn =new JButton("Back");
        backBtn.setBounds(400,300,100,40);
        backBtn.addActionListener(this);
		backBtn.addMouseListener(this);
        panel.add(backBtn);
		

        this.add(panel);
    }

public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==submitBtn){
			submitBtn.setBackground(Color.RED);
			submitBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource()==backBtn){
			backBtn.setBackground(Color.RED);
			backBtn.setForeground(Color.WHITE);
		
	}
	
	
	}
	public void mouseExited(MouseEvent me)
	{if(me.getSource()==submitBtn){
			submitBtn.setBackground(Color.WHITE);
			submitBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource()==backBtn){
			backBtn.setBackground(Color.WHITE);
			backBtn.setForeground(Color.BLACK);
		
		}
		
		
		
		
		
		
		}




















    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == backBtn) {
            FrameIntro f1 = new FrameIntro();
         this.setVisible(false);
           f1.setVisible(true);
        }else if (ae.getSource() == submitBtn) {
            String name =nameField.getText();
            String email =emailField.getText();
            String pass =passField.getText();
            String group =groupField.getText();
			String phone=phoneField.getText();

            if (name.isEmpty() || email.isEmpty() || pass.isEmpty() || group.isEmpty() || phone.isEmpty()) {
                JOptionPane.showMessageDialog(null, "All fields are required!");
           }  else {
                JOptionPane.showMessageDialog(null, "Registration Successful!");
                this.setVisible(false);
				Account a1=new Account(name,email,pass,group,phone);
				a1.addAccount();
                FrameIntro f1 = new FrameIntro();
                f1.setVisible(true);
            }
        }
    }
}
