package pkg;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class prospectVer3 {
	private int l = 45, t = 20, combo=13, RBtn=7, checkBox=11;
	JPanel mypanel;
	JFrame frame;
	public prospectVer3() throws MalformedURLException
	{
	// Creates a Color for the last label header
		  int r = 93  , g = 159, b = 175;
	      Color augamarine = new Color(r, g, b);
	      
	      // Creates a color for the beginning label headers
	      int r2 = 1  , g2 = 32, b2 = 76;
	      Color darkblue = new Color(r2, g2, b2);
	      
	      
		  // Create Frame and Panel - Set Bounds -
		  frame = new JFrame("Prospect Assignment");
		  frame.setBounds(600,50,846,950);
		  mypanel = new JPanel();
		  mypanel.setPreferredSize(new Dimension(846, 1820)); // panel inside scrollpane must have larger dimensions than scrollpane dimensions to show IMPORTANT
	      
		  //Create ScrollBar - Set Policy - Size
		  JScrollPane scrollPane = new JScrollPane(mypanel,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		  scrollPane.setPreferredSize(new Dimension(846,950)); 
		  scrollPane.setViewportView(mypanel);
	      
		  //Create Top Gif image label and display - Set Bounds - 
		  URL url = new URL("https://static.askadmissions.net/cunycitytech/connectImages2_2010/default/banner.gif");
		  Icon icon = new ImageIcon(url);
		  JLabel gif = new JLabel(icon);
		  gif.setBounds(0, 0, 810, 282);
		  
		  //Create Bottom Gif image label and display - Set Bounds - 
		  URL url2 = new URL("https://static.askadmissions.net/cunycitytech/connectImages2_2010/default/city_tech_is_cuny.gif");
		  Icon icon2 = new ImageIcon(url2);
		  JLabel gif2 = new JLabel(icon2);
		  gif2.setBounds(720, 1789, 75, 25);
		  
		
		//====================================================== -- LABELS -- =======================================================//
		  
		  							         	// Create Swing objects - Set Bounds //
		  // Labels
		  JLabel[] labels = new JLabel[l];
		  labels[0] = new JLabel("Welcome to City Tech's Prospect Interest Page");
		  labels[1] = new JLabel("<html>We appreciate your interest in City Tech and want to learn more about you. Please answer the questions on this page to help us customize our <br> communications with you. All questions marked with an asterisk (*) are required.</html>");
		  labels[2] = new JLabel("<html>By creating a user name and password you can access your own personalized VIP page that is customized to your specific interests. Be sure to <br> click on the 'Submit Information' button at the bottom of the page when you have answered all questions.</html>" );
		  labels[3] = new JLabel("<html><font color='white'>Contact Information</font></html>");
		  labels[4] = new JLabel("First Name");
		  labels[5] = new JLabel("First Name*");
		  labels[6] = new JLabel("MI*");
		  labels[7] = new JLabel("Last Name*");
		  labels[8] = new JLabel("Address 1*");
		  labels[9] = new JLabel("Address 2*");
		  labels[10] = new JLabel("City");
		  labels[11] = new JLabel("State/Province *");
		  labels[12] = new JLabel("Zip Code *");
		  labels[13] = new JLabel("Country *");
		  labels[14] = new JLabel("Primary Phone *");
		  labels[15] = new JLabel("Phone Type *");
		  labels[16] = new JLabel("Date of Birth *");
		  labels[17] = new JLabel("Email Address *");
		  labels[18] = new JLabel("Verify Email Address *");
		  labels[19] = new JLabel("<html><font color='white'>Demographic Information</font></html>");
		  labels[20] = new JLabel("Gender *");
		  labels[21] = new JLabel("Ethnicity *");
		  labels[22] = new JLabel("Country of Citizenship");
		  labels[23] = new JLabel("<html><font color='white'>Academic Information</font></html>");
		  labels[24] = new JLabel("I will be entering college as a *");
		  labels[25] = new JLabel("Entry Term *");
		  labels[26] = new JLabel("Primary Major of Interest *");
		  labels[27] = new JLabel("Secordary Major of Interest");
		  labels[28] = new JLabel("I am interested in learning more about...");
		  labels[29] = new JLabel("<html><font color='white'>High School Information</font></html>");	
		  labels[30] = new JLabel("<html> Click here to find your High School. If you cannot find your high school, click here to type in your information by hand. If you have completed your GED please search for GED in the School Name and select the first option of Access GED M356.</html>");
		  labels[31] = new JLabel("High School Name *");
		  labels[32] = new JLabel("High School City *");
		  labels[33] = new JLabel("High School State *");
		  labels[34] = new JLabel("High School Graduation Date *");
		  labels[35] = new JLabel("SAT Score");
		  labels[36] = new JLabel("ACT Score (Composite)");
		  labels[37] = new JLabel("Have you been awarded a GED?");
		  labels[38] = new JLabel("<html><font color='white'>Login Information Information</font></html>");
		  labels[39] = new JLabel("Please create your user name and password for your personalized VIP page.");
		  labels[40] = new JLabel("Username *");
		  labels[41] = new JLabel("Password *");
		  labels[42] = new JLabel("<html>Passwords must be between 8-30 characters, contain at least 1 uppercase letter (A-Z), 1 lowercase letter (a-z), 1 number (0-9), and 1 of the following special characters: !@#$%^&*()_+|~-=\\`{}[]:\";<>?,./ Spaces are not allowed.</html>");
		  labels[43] = new JLabel("Confirm Password *");
		  labels[44] = new JLabel("<html> <p style='text-indent: 10px' padding: 30px><font color='white'>© New York City College of Technology | CUNY Privacy Policy | Text Only __ </font></p></html>");
		  
		  // Set bounds
		  labels[0].setBounds(13, 248, 800, 100);
		  labels[1].setBounds(13, 277, 800, 100);
		  labels[2].setBounds(13, 315, 800, 100);
		  labels[3].setBounds(13, 389,785, 25);
		  labels[4].setBounds(13, 419,785, 25);
		  labels[5].setBounds(253, 409,785, 25);
		  labels[6].setBounds(410, 409,785, 25);
		  labels[7].setBounds(450, 409,785, 25);
		  labels[8].setBounds(13, 449,785, 25);
		  labels[9].setBounds(13, 479,785, 25);
		  labels[10].setBounds(13, 509,785, 25);
		  labels[11].setBounds(13, 539,785, 25);
		  labels[12].setBounds(13, 569,785, 25);
		  labels[13].setBounds(13, 599,785, 25);
		  labels[14].setBounds(13, 629,785, 25);
		  labels[15].setBounds(13, 659,785, 25);
		  labels[16].setBounds(13, 689,785, 25);
		  labels[17].setBounds(13, 719,785, 25);
		  labels[18].setBounds(13, 749,785, 25);
		  labels[19].setBounds(13, 779,785, 25);
		  labels[20].setBounds(13, 809,785, 25);
		  labels[21].setBounds(13, 839,785, 25);
		  labels[22].setBounds(13, 869,785, 25);
		  labels[23].setBounds(13, 899,785, 25);
		  labels[24].setBounds(13, 929,785, 25);
		  labels[25].setBounds(13, 959,785, 25);
		  labels[26].setBounds(13, 989,785, 25);
		  labels[27].setBounds(13, 1019,785, 25);
		  labels[28].setBounds(13, 1059,785, 25);
		  labels[29].setBounds(13, 1269,785, 25);
		  labels[30].setBounds(13, 1299,785, 25);
		  labels[31].setBounds(13, 1339,785, 25);
		  labels[32].setBounds(13, 1369,785, 25);
		  labels[33].setBounds(13, 1399,785, 25);
		  labels[34].setBounds(13, 1429,785, 25);
		  labels[35].setBounds(13, 1459,785, 25);
		  labels[36].setBounds(13, 1489,785, 25);
		  labels[37].setBounds(13, 1519,785, 25);
		  labels[38].setBounds(13, 1559,785, 25);
		  labels[39].setBounds(13, 1579,785, 25); 
		  labels[40].setBounds(13, 1609,785, 25);
		  labels[41].setBounds(13, 1639,785, 25);
		  labels[42].setBounds(13, 1669,785, 25);
		  labels[43].setBounds(13, 1699,785, 25);
		  labels[44].setBounds(13, 1789,707, 25); // ending
		  
		 
		  // Set fonts and sizes
		  Font Boldfont = new Font("New Times Roman", Font.BOLD,13);
		  Font RegFont = new Font("New Times Roman", Font.BOLD,11);
		  Font SmallFont=new Font("New Times Roman", Font.PLAIN,9);
		  Font smallItalic = new Font("New Times Roman", Font.ITALIC,11);
		  
		  //Assign fonts
		  labels[0].setFont(Boldfont);
		  labels[1].setFont(RegFont);
		  labels[2].setFont(RegFont);
		  labels[3].setFont(Boldfont);
		  labels[4].setFont(RegFont);
		  labels[5].setFont(SmallFont);
		  labels[6].setFont(SmallFont);
		  labels[7].setFont(SmallFont);
		  labels[8].setFont(RegFont);
		  labels[9].setFont(RegFont);
		  labels[10].setFont(RegFont);
		  labels[11].setFont(RegFont);
		  labels[12].setFont(RegFont);
		  labels[13].setFont(RegFont);
		  labels[14].setFont(RegFont);
		  labels[15].setFont(RegFont);
		  labels[16].setFont(RegFont);
		  labels[17].setFont(RegFont);
		  labels[18].setFont(RegFont);
		  labels[19].setFont(Boldfont);
		  labels[20].setFont(RegFont);
		  labels[21].setFont(RegFont);
		  labels[22].setFont(RegFont);
		  labels[23].setFont(Boldfont);
		  labels[24].setFont(RegFont);
		  labels[25].setFont(RegFont);
		  labels[26].setFont(RegFont);
		  labels[27].setFont(RegFont);
		  labels[28].setFont(RegFont);
		  labels[29].setFont(Boldfont);
		  labels[30].setFont(RegFont);
		  labels[31].setFont(RegFont);
		  labels[32].setFont(RegFont);
		  labels[33].setFont(RegFont);
		  labels[34].setFont(RegFont);
		  labels[35].setFont(RegFont);
		  labels[36].setFont(RegFont);
		  labels[37].setFont(RegFont);
		  labels[38].setFont(Boldfont);
		  labels[39].setFont(SmallFont);
		  labels[40].setFont(RegFont);
		  labels[41].setFont(RegFont);
		  labels[42].setFont(RegFont);
		  labels[43].setFont(RegFont);
		  labels[44].setFont(smallItalic);
		  
		// Loop adds all labels to the mypanel container
			  for (int i=0; i < labels.length; i++)
			  {
				mypanel.add(labels[i]);
			  }
		  //labels[3]
		   
		  //Thought about creating methods to create labels and what not ...hmmm
		  /*
		  JLabel getLabel(String labelText) {

			    JLabel label = new JLabel(labelText);
			    //do additional needed setting like font, alignment etc. 
			    return label;
			}
		  */
		  
		//====================================================== -- TEXTFIEDLS -- =======================================================//
	    // textfields array
		JTextField[] tf = new JTextField[t];
		// Loop creates textfields and adds them to panel
			  for (int i=0; i < tf.length; i++)
			  {
				  tf[i] = new JTextField();
				  mypanel.add(tf[i]);
			  }
		// set bounds for textfields
		tf[0].setBounds(253, 426,150, 21);
		tf[1].setBounds(410, 426,32, 21);
		tf[2].setBounds(450, 426,150, 21);
		tf[3].setBounds(253, 451,210, 24);
		tf[4].setBounds(253, 481,210, 24);
		tf[5].setBounds(253, 511,210, 24);
		tf[6].setBounds(253, 571,62, 24);
		tf[7].setBounds(253, 631,42, 24);
		tf[8].setBounds(303, 631,42, 24);
		tf[9].setBounds(353, 631,42, 24);
		tf[10].setBounds(253, 721,210, 24);
		tf[11].setBounds(253, 751,210, 24);
		tf[12].setBounds(253, 1339,190, 24);
		tf[13].setBounds(253, 1369,190, 24);
		tf[14].setBounds(253, 1399,190, 24);
		tf[15].setBounds(253, 1459,75, 24);
		tf[16].setBounds(253, 1489,75, 24);
		tf[17].setBounds(253, 1612,190, 24);
		tf[18].setBounds(253, 1642,190, 24);
		tf[19].setBounds(253, 1702,190, 24);
		
		//Set Textfield uneditable
		tf[12].setEditable(false);
		tf[13].setEditable(false);
		tf[14].setEditable(false);
			
		//====================================================== -- COMBOBOX -- =======================================================//
		
		//combobox
		 JComboBox[] cb = new JComboBox[combo]; 
		 cb[0] = new JComboBox(new String[]{"Select one","NewYork", "NewJersey", "Alaska", "Etc", "Etc"});
		 cb[1] = new JComboBox(new String[]{"USA", "CHINA", "EGYPT", "ETC","ETC"});
		 cb[2] = new JComboBox(new String[]{"Month", "Jan", "Feb", "March","ETC"});
		 cb[3] = new JComboBox(new String[]{"Day", "1", "2", "3","ETC"});
		 cb[4] = new JComboBox(new String[]{"Year", "1990", "1991", "2000","ETC"});
		 cb[5] = new JComboBox(new String[]{"Select One", "Accounting", "Computer Science", "Liberal Arts","ETC"});
		 cb[6] = new JComboBox(new String[]{"Select One", "Accounting", "Computer Science", "Liberal Arts","ETC"});
		 cb[7] = new JComboBox(new String[]{"Select One", "Accounting", "Computer Science", "Liberal Arts","ETC"});
		 cb[8] = new JComboBox(new String[]{"Select One", "Accounting", "Computer Science", "Liberal Arts","ETC"});
		 cb[9] = new JComboBox(new String[]{"Select One", "Accounting", "Computer Science", "Liberal Arts","ETC"});
		 cb[10] = new JComboBox(new String[]{"Select One", "Accounting", "Computer Science", "Liberal Arts","ETC"});
		 cb[11] = new JComboBox(new String[]{"Month", "Jan", "Feb", "March","ETC"});
		 cb[12] = new JComboBox(new String[]{"Year", "1990", "1991", "2000","ETC"});
		 
		// set cb bounds 
		 cb[0].setBounds(253, 541,190, 24);
		 cb[1].setBounds(253, 601,190, 24); 
		 cb[2].setBounds(253, 691,90, 24);
		 cb[3].setBounds(353, 691,50, 24);
		 cb[4].setBounds(413, 691,70, 24);
		 cb[5].setBounds(253, 835,200, 24);
		 cb[6].setBounds(253, 865,200, 24);
		 cb[7].setBounds(253, 935,200, 24);
		 cb[8].setBounds(253, 965,150, 24);
		 cb[9].setBounds(253, 995,270, 24);
		 cb[10].setBounds(253, 1025,270, 24);
		 cb[11].setBounds(253, 1429,90, 24);
		 cb[12].setBounds(353, 1429,60, 24);
		 
		// Add cb to panel 
		 for (int i=0; i < cb.length; i++)
		  {
			  mypanel.add(cb[i]);
		  }
		
		//====================================================== -- RADIOBUTTON -- =======================================================//
		 JRadioButton[] rBtn = new JRadioButton[RBtn];
		 rBtn[0] = new JRadioButton("Cell");
		 rBtn[1] = new JRadioButton("Home");
		 rBtn[2] = new JRadioButton("Work");
		 rBtn[3] = new JRadioButton("Male");
		 rBtn[4] = new JRadioButton("Female");
		 rBtn[5] = new JRadioButton("Yes");
		 rBtn[6] = new JRadioButton("No");
		// add to panel and set colors
		 for (int i=0; i < 7; i++)
		  {
			  mypanel.add(rBtn[i]);
			  rBtn[i].setBackground(Color.white);
			  rBtn[i].setOpaque(true);
		  }
		 
		// Set bounds
		 rBtn[0].setBounds(253, 661,50, 24); 
		 rBtn[1].setBounds(303, 661,60, 24); 
		 rBtn[2].setBounds(363, 661,60, 24); 
		 rBtn[3].setBounds(253, 805,60, 24); 
		 rBtn[4].setBounds(313, 805,90, 24); 
		 rBtn[5].setBounds(253, 1519,50, 24); 
		 rBtn[6].setBounds(303, 1519,50, 24); 
		
		//====================================================== -- CHECKBOX -- =======================================================// 
		 JCheckBox[] checkB = new JCheckBox[checkBox];
		 checkB[0] = new JCheckBox("Athletics, Intrumarals, and Recreation");
		 checkB[1] = new JCheckBox("COPE");
		 checkB[2] = new JCheckBox("Counseling");
		 checkB[3] = new JCheckBox("Financial Aid");
		 checkB[4] = new JCheckBox("Our Children Center");
		 checkB[5] = new JCheckBox("Scholarships");
		 checkB[6] = new JCheckBox("SEEK Program");
		 checkB[7] = new JCheckBox("Student Goverment");
		 checkB[8] = new JCheckBox("Student Life and Development");
		 checkB[9] = new JCheckBox("Student Support Services (Disabilities)");
		 checkB[10] = new JCheckBox("Student Wellness Center");
		 
		 //add checkboxs to panel loop
		 for (int i=0; i < checkB.length; i++)
		  {
			  mypanel.add(checkB[i]);
			  checkB[i].setBackground(Color.white);
			  checkB[i].setOpaque(true);
			  
		  }
		 
		 // set bounds
		 checkB[0].setBounds(13, 1079,250, 24); 
		 checkB[1].setBounds(13, 1109,160, 24); 
		 checkB[2].setBounds(13, 1139,160, 24); 
		 checkB[3].setBounds(13, 1169,160, 24); 
		 checkB[4].setBounds(13, 1199,190, 24); 
		 checkB[5].setBounds(13, 1229,190, 24); 
		 checkB[6].setBounds(273, 1079,160, 24); 
		 checkB[7].setBounds(273, 1109,260, 24); 
		 checkB[8].setBounds(273, 1139,260, 24); 
		 checkB[9].setBounds(273, 1169,260, 24); 
		 checkB[10].setBounds(273, 1199,190, 24); 
		 
		//================================================= -- JBUTTON -- =======================================================//
		 JButton btn1 = new JButton("Submit Information");
		 mypanel.add(btn1);
		 btn1.setBounds(13,1732,150,24);
		 
		//================================================= -- ADD CONTAINERS TO THIER INDIVIDUAL FRAMES -- =======================================================//
		  
		  // Setup Pandoras box
		  frame.add(scrollPane);
		  mypanel.add(gif);
		  mypanel.add(gif2);
		  
		
		  //================================================= -- FINISHING TOUCHES -- =======================================================//
		  
		  // Gui extras
		  mypanel.setLayout(null);
		  frame.setVisible(true);
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  // frame.pack(); //-- UNUSED 
		  
		  // Decorations and Colors
		  mypanel.setBackground(Color.WHITE);
		  frame.setBackground(Color.GRAY); 
		  scrollPane.setBackground(Color.black);
		  labels[3].setBackground(darkblue);
		  labels[3].setOpaque(true);
		  labels[19].setBackground(darkblue);
		  labels[19].setOpaque(true);
		  labels[23].setBackground(darkblue);
		  labels[23].setOpaque(true);
		  labels[29].setBackground(darkblue);
		  labels[29].setOpaque(true);
		  labels[38].setBackground(darkblue);
		  labels[38].setOpaque(true);
		  labels[44].setBackground(augamarine);
		  labels[44].setOpaque(true);
		 
		  
		  // changes colors of panel dynamically
		 // panelColorChange change = new panelColorChange();
		  
		  
		  
		  
	}
}
	
	

