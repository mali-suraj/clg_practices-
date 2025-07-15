import java.awt.*;
class TextFieldDemo extends Frame
{
 TextFieldDemo()
 {
 setLayout(null);
 setBackground(Color.pink);
 setForeground(Color.black);

 Label main=new Label("****STUDENT REGISTRATIONFROM*****");
 Label L1=new Label("Enter First Name:");
 TextField tf1=new TextField(20);
 Label L2=new Label("Enter Last Name:");
 TextField tf2=new TextField(20);
 Label L3=new Label("Enter Address:");
 TextField tf3=new TextField(20);
 Label L4=new Label("Enter Mobile No:");
 TextField tf4=new TextField(20);
  Label L5=new Label("Enter Email ID:");
 TextField tf5=new TextField(20);
 Label L6=new Label("Enter City Name:");
 TextField tf6=new TextField(20);
 Label L7=new Label("Enter DOB:");
 TextField tf7=new TextField(20);
 Button b1=new Button("SUBMIT");

 Font f1=new Font("Airal Black",Font.BOLD|Font.ITALIC,25);
 Font f2=new Font("Airal Black",Font.BOLD,25);
 main.setFont(f1);
 setFont(f2);

 main.setBackground(Color.orange);
 main.setBounds(200,200,500,40);
 L1.setBounds(200,300,210,40);
 tf1.setBounds(340,300,250,40);
 L2.setBounds(200,350,210,40);
 tf2.setBounds(340,350,250,40);
 L3.setBounds(200,400,210,40);
 tf3.setBounds(340,400,250,40);
  L4.setBounds(200,450,210,40);
 tf4.setBounds(340,450,250,40);
 L5.setBounds(200,500,210,40);
 tf5.setBounds(340,500,250,40);
 L6.setBounds(200,550,210,40);
 tf6.setBounds(340,550,250,40);
 L7.setBounds(200,600,210,40);
 tf7.setBounds(340,600,250,40);
 b1.setBounds(360,700,150,50);
 b1.setBackground(Color.red);

 add(main);
 add(L1);add(tf1);
 add(L2);add(tf2);
 add(L3);add(tf3);
 add(L4);add(tf4);
 add(L5);add(tf5);
 add(L6);add(tf6);
 add(L7);add(tf7);
 add(b1);
 }
  public static void main(String args[])
 {
 TextFieldDemo tfd=new TextFieldDemo();
tfd.setVisible(true);
tfd.setTitle("Text Field Demo");
tfd.setSize(800,800);
 }
}