package faltopractice;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;
public class Memory implements ActionListener{
	BufferedImage image;
	JButton jb1;
	JButton jb2;
	JButton jb3;
	JButton jb4;
	JFrame frame;
	JPanel jp;
	JButton jb5;
	JLabel jl;
	JTextField jt;
	Memory()
	{
try
{
		JFrame frame=new JFrame("Memory game:");
		JPanel jp=new JPanel(new GridLayout(2,2,10,10));
		//jp.setMaximumSize(new Dimension(40, 40));
		//jp.setSize(10,10);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,100);
	image=ImageIO.read(new File("C://Users/Math/Downloads/37286535-happy-pics.jpg"));
		//Icon icon=new ImageIcon("C://Users/Math/Downloads/9thscience.png");
		jb1=new JButton(new ImageIcon(image));
		jb2=new JButton(new ImageIcon(image));
		jb3=new JButton(new ImageIcon(image));
		jb4=new JButton(new ImageIcon(image));
		jb5=new JButton(new ImageIcon(image));
		jt=new JTextField();
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		jp.setBackground(Color.PINK);
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jt);
		frame.add(jp);
		frame.setVisible(true);}
catch(IOException fe)
{System.out.println("file not found");}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Memory();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jb1)
			{
			try 
			{
			BufferedImage imagee=ImageIO.read(new File("C://Users/Math/Downloads/9thscience.jpg"));
			jb1.setIcon(new ImageIcon(imagee));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
			System.out.println("file not found");}}
		else if(e.getSource()==jb2)
		{
		try {
			BufferedImage imagee=ImageIO.read(new File("C://Users/Math/Downloads/36213557-happy-birthday-pic.jpg"));
			jb2.setIcon(new ImageIcon(imagee));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
			System.out.println("file not found");
		}}
		else if(e.getSource()==jb3)
		{try {
		BufferedImage imagee=ImageIO.read(new File("smile_happiness_toy_122973_3840x2400.jpg"));
		jb3.setIcon(new ImageIcon(imagee));
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		//e1.printStackTrace();
		System.out.println("file not found");}}
		else if(e.getSource()==jb4)
		{try {
		BufferedImage imagee=ImageIO.read(new File("C://Users/Math/Downloads/images.jpg"));
		jb4.setIcon(new ImageIcon(imagee));
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		//e1.printStackTrace();
		System.out.println("file not found");}}
		else if(e.getSource()==jb5)
		{try {
		BufferedImage imagee=ImageIO.read(new File("C://Users/Math/Downloads/9thscience.jpg"));
		jb5.setIcon(new ImageIcon(imagee));
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		//e1.printStackTrace();
		System.out.println("file not found");}}
	}
}
