package web;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class Login extends JFrame implements ActionListener
{
	

 JButton SUBMIT;
 JPanel panel;
 JLabel label1,label2,label3, label4, label5, label6;
 //Font labelFont = label4.getFont();
 final JTextField  text1,text2;
  Login()
  {
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  label1 = new JLabel();
  label1.setText("Username:");
  text1 = new JTextField(15);
  label1.setFont(new Font("Arial", Font.PLAIN,24));


  label2 = new JLabel();
  label2.setText("Password:");
  text2 = new JPasswordField(15);
  label2.setFont(new Font("Arial", Font.PLAIN,24));

  
  label3 = new JLabel();
  label3.setText("Dayanada Sagar College of Engineering");
  label3.setFont(new Font("Arial", Font.PLAIN, 24));
 
  label4 = new JLabel();
  label4.setText("Dept. of CSE");
  label4.setFont(new Font("Arial", Font.PLAIN,24));

  
  SUBMIT=new JButton("SUBMIT");
  
  ImageIcon i = new ImageIcon("C:\\Users\\singh\\Desktop\\logo.png"); 
  
  label5 = new JLabel(i);
  label6 = new JLabel();
  
  panel=new JPanel(new GridLayout(6,3));
  panel.add(label5);
  panel.add(label3);
  panel.add(label4);
  panel.add(label6);

  panel.add(label1);
  panel.add(text1);
  panel.add(label2);
  panel.add(text2);
  panel.add(SUBMIT);
  add(panel,BorderLayout.CENTER);
  SUBMIT.addActionListener(this);
  setTitle("LOGIN FORM");
  }
 public void actionPerformed(ActionEvent ae)
  {
  String value1=text1.getText();
  String value2=text2.getText();
  if (value1.equals("abc") && value2.equals("abc")) {
  NextPage page=new NextPage();
  page.setVisible(true);
  JLabel label = new JLabel("Welcome:"+value1);
  page.getContentPane().add(label);
  }
  else{
  System.out.println("enter the valid username and password");
  JOptionPane.showMessageDialog(this,"Incorrect login or password",
  "Error",JOptionPane.ERROR_MESSAGE);
  }
}
}

