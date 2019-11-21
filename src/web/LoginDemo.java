package web;

import javax.swing.JOptionPane;

class LoginDemo
{
 public static void main(String arg[])
 {
	 try
	 {
	 FrontPage frame=new FrontPage();
	 frame.setSize(1000,1000);
	 frame.setVisible(true);
	 }
	 catch(Exception e)
	 {JOptionPane.showMessageDialog(null, e.getMessage());}
	 }
}
