package Entities;
import java.lang.*;
import java.nio.file.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Frames;


public class Account{
	public String name;
	public String email;
	private String pass;
	public String group;
	public String number;
	
	
	private File myfile;
	private FileWriter fwrite;
	private Scanner sc;
	
	
	public Account(){
		
	}
	public Account(String name,String email,String pass,String group,String number){
		this.name=name;
		this.email=email;
		this.pass=pass;
		this.group=group;
		this.number=number;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public void setPass(String pass){
		this.pass=pass;
	}
	public void setGroup(String group){
		this.group=group;
	}
	public void setNumber(String number){
		this.number=number;
	}
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}
	public String getPass(){
		return pass;
	}
	public String getGroup(){
		return group;
	}
	public String getNumber(){
		return number;
	}
	
	public void addAccount(){
		try
		{
			myfile=new File("./Data.txt");
			myfile.createNewFile();
			fwrite=new FileWriter(myfile,true);
			
			fwrite.write(getName()+"\t");
			fwrite.write(getEmail()+"\t");
			fwrite.write(getPass()+"\t");
			fwrite.write(getGroup()+"\t");
			fwrite.write(getNumber()+"\n");
			fwrite.flush();
			fwrite.close();
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
	public boolean getAccount(String name,String pass){
		boolean flag=false;
		try {
		myfile=new File("./Data.txt");
		sc =new Scanner(myfile);
		while(sc.hasNextLine()){
			String Line=sc.nextLine();
			String[] value=Line.split("\t");
			if(value[0].equals(name) && value[2].equals(pass)){
			flag=true;
			}
			}
			
			
			
			
			
		}
		catch(IOException ioe){
			ioe.printStackTrace();
			
		}
		return flag;
	}
	
	
	
	
	
	
	
	public void deleteAccount(String name) {
    try {
        String basePath = System.getProperty("user.dir");
        File myfile = new File(basePath, "Data.txt");
        File tempFile = new File(basePath, "Temp.txt");

        try (Scanner sc = new Scanner(myfile);
             PrintWriter writer = new PrintWriter(tempFile)) {

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (!line.startsWith(name + "\t")) {
                    writer.println(line);
                }
            }
        }
        Files.move(tempFile.toPath(), myfile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        JOptionPane.showMessageDialog(null, "Deleted Successfully");

    } catch (IOException ioe) {
        JOptionPane.showMessageDialog(null, "Delete Failed: " + ioe.getMessage());
        ioe.printStackTrace();
    }
}
	
	
	
	
	
	
	public void findAccount(String group){
		try {
		myfile=new File("./Data.txt");
		StringBuilder c=new StringBuilder();
		sc =new Scanner(myfile);
	
		while(sc.hasNextLine()){
			String Line=sc.nextLine();
			String[] value=Line.split("\t");
			if(value[3].equals(group)){
			c.append("Name  :").append(value[0]).append("\n");
            c.append("Email :").append(value[1]).append("\n");
            c.append("Group :").append(value[3]).append("\n");
            c.append("Phone :").append(value[4]).append("\n").append("\n");
			}
			}
			
			JTextArea textArea= new JTextArea(c.toString());
        JScrollPane scrollPane= new JScrollPane(textArea);
		scrollPane.setPreferredSize(new java.awt.Dimension(850,450));
		JOptionPane.showMessageDialog(null, scrollPane, "Account Details", JOptionPane.INFORMATION_MESSAGE);
			
			
			
		}
		catch(IOException ioe){
			ioe.printStackTrace();
			
		}
		
	}
	
	
	
	
	public void loadAccount(){
		try {
		myfile=new File("./Data.txt");
		StringBuilder c=new StringBuilder();
		sc =new Scanner(myfile);
	
		while(sc.hasNextLine()){
			String Line=sc.nextLine();
			String[] value=Line.split("\t");
			c.append("Name  :").append(value[0]).append("\n");
            c.append("Email :").append(value[1]).append("\n");
            c.append("Group :").append(value[3]).append("\n");
            c.append("Phone :").append(value[4]).append("\n").append("\n");
			}
			
			
			JTextArea textArea= new JTextArea(c.toString());
        JScrollPane scrollPane= new JScrollPane(textArea);
		scrollPane.setPreferredSize(new java.awt.Dimension(850,450));
		JOptionPane.showMessageDialog(null, scrollPane, "Account Details", JOptionPane.INFORMATION_MESSAGE);
			
			
			
		}
		catch(IOException ioe){
			ioe.printStackTrace();
			
		}
		
	}
	
	
	//
	
}