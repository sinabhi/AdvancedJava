package web;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class FrontPage extends JFrame implements ActionListener
{
 JButton Login, Signup;
 JPanel panel;
 JLabel label1,label3, label4, label5, label6;
 JLabel label2;

  FrontPage()
  {
  label1 = new JLabel();
  label1.setText("Some history about the college:");
  label1.setFont(new Font("Arial", Font.PLAIN,24));


  label2 = new JLabel();
  label2.setText("Dayananda Sagar College of Engineering is approved by All India Council for Technical Education (AICTE), Govt. of India and affiliated to Visvesvaraya Technological University. It has widest choice of engineering branches having 15 Under Graduate courses & 13 Post Graduate courses. In addition, it has 20 Research Centres in different branches of Engineering catering to research scholars for obtaining Ph.D under VTU. Various courses are accredited by NBA.\r\n" + 
  		"\r\n" + 
  		"The Institute is spread over 29 acres of land with large infrastructure supported by laboratories with state-of-the-art, Equipment & Machines. The Central Library with modern facilities and the Digital Library provides the knowledge base for the students.\r\n" + 
  		"\r\n" + 
  		"The campus is WI-FI equipped with large bandwidth internet facility. The College has good faculty strength with highest professional integrity and committed to the academics with transparency in their actions. Each faculty takes the responsibility of mentoring a certain number of students’ through personal attention paving the way for the students’ professional growth. The faculty are research oriented having number of sponsored R & D projects from different agencies such as Department of Science & Technology, Defense R & D organizations, Indian Space Research Organization, AICTE etc..");
//  label2.setHorizontalAlignment(JLabel.CENTER);
//  label2.setVerticalAlignment(JLabel.CENTER);
//  StyledDocument doc = label2.getStyledDocument();
//  SimpleAttributeSet center = new SimpleAttributeSet();
//  StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
//  doc.setParagraphAttributes(0, doc.getLength(), center, false);


  
  label3 = new JLabel();
  label3.setText("Dayanada Sagar College of Engineering");
  label3.setFont(new Font("Arial", Font.PLAIN, 24));
 
  label4 = new JLabel();
  label4.setText("Dept. of CSE");
  label4.setFont(new Font("Arial", Font.PLAIN,24));

  
  Login =new JButton("Login");
  Signup =new JButton("Signup");

  
  ImageIcon i = new ImageIcon("C:\\Users\\singh\\Desktop\\logo.png"); 
  
  label5 = new JLabel(i);
  label6 = new JLabel();
  
  panel=new JPanel(new GridLayout(6,3));
  panel.add(label5);
  panel.add(label3);
  panel.add(label4);
  panel.add(label6);

  panel.add(label1);

  panel.add(label2);

  panel.add(Login);
  panel.add(Signup);
  add(panel,BorderLayout.CENTER);
  Login.addActionListener(this);
  setTitle("ABOUT");
  }
 public void actionPerformed(ActionEvent ae)
  {
	 try
	 {
	 Login frame=new Login();
	 frame.setSize(1000,1000);
	 frame.setVisible(true);
	 }
	 catch(Exception e)
	 {JOptionPane.showMessageDialog(null, e.getMessage());}
	 }

}


