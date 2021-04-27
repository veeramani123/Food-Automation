import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.applet.*;
import java.io.*;

class food
{
	Scanner in =new Scanner(System.in);
	String name,addr,item,num,qua,amount;
	Button b1,b2;
	TextField tf1,tf2,tf3,tf4,tf6,tf9;
	public void book()
	{
		Frame f = new Frame("FOOD ORDERING");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		String[] itemss = {"SAMOSA","SANDWICH","BURGER","PIZZA","VEG-WRAP","VEG-ROLL"};
		JComboBox box = new JComboBox(itemss);
		box.setSelectedItem(null);
		Color c2 = new Color(255,255,255);
 
		Button b1 = new Button("PLACE ORDER");
		Button b2 = new Button("BILL AMOUNT");
		
		b1.setBackground(c2);
		b2.setBackground(c2);
		tf1 = new TextField("");
		tf9 = new TextField("");
		tf2 = new TextField("");
		tf3 = new TextField("");
		tf6 = new TextField("");
		Label lb = new Label("PLACE YOUR ORDER");
		Label menu = new Label("MENU CARD");
		Label menu1 = new Label("SAMOSA:30");
		Label menu2 = new Label("SANDWICH:75");
		Label menu3 = new Label("PIZZA:300");
		Label menu4 = new Label("Burger:150");
		Label menu5 = new Label("VEG-WRAP:150");
		Label menu6 = new Label("VEG-ROLL:100");
		Label lb1 = new Label("NAME: ");
		Label lb11 = new Label("ADDRESS: ");
		Label lb2 = new Label("PHONE NUMBER: ");
		Label lb3 = new Label("ITEM: ");
		Label lb4 = new Label("QUANTITY:");
		Label lb6 = new Label("AMOUNT:");
				
		Font f1 = new Font("TimesRoman",Font.ITALIC,20);
		Font f3 = new Font("TimesRoman",Font.ITALIC,25);
		Font f2 = new Font("TimesRoman",Font.ITALIC,30);
		Font f4 = new Font("TimesRoman",Font.BOLD,25);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int height = screenSize.height;
    int width = screenSize.width;
	
	tf1.setFont(f3);
	tf2.setFont(f3);
	tf3.setFont(f3);
	tf6.setFont(f3);
	b2.setFont(f4);
	b1.setFont(f4);
	menu.setFont(f4);
	menu1.setFont(f4);
	menu2.setFont(f4);
	menu3.setFont(f4);
	menu4.setFont(f4);
	menu5.setFont(f4);
	menu6.setFont(f4);

	menu.setForeground(Color.WHITE);menu1.setForeground(Color.WHITE);menu2.setForeground(Color.WHITE);menu3.setForeground(Color.WHITE);menu4.setForeground(Color.WHITE);
	menu5.setForeground(Color.WHITE);menu6.setForeground(Color.WHITE);

	lb.setFont(f2);
	lb1.setFont(f1);
	lb11.setFont(f1);
	lb3.setFont(f1);
	lb4.setFont(f1);
	lb2.setFont(f1);
	lb6.setFont(f1);
		lb.setBounds(350,50,350,50);
		lb1.setBounds(250,150,150,50);//Name
		lb11.setBounds(250,250,150,50);//Address
		lb2.setBounds(250,350,150,50);//Number
		lb3.setBounds(250,450,150,50);//Item
		lb4.setBounds(250,550,150,50);//Qunatity
		tf6.setBounds(250,650,150,50);
		b1.setBounds(50,100,200,60);
		b2.setBounds(550,650,200,60);
		menu.setBounds(100,200,200,60);
		menu1.setBounds(100,250,200,60);
		menu2.setBounds(100,300,200,60);
		menu3.setBounds(100,350,200,60);
		menu4.setBounds(100,400,200,60);
		menu5.setBounds(100,450,200,60);
		menu6.setBounds(100,500,200,60);
		b1.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent arg0){
				name = tf1.getText();
				addr = tf2.getText();
				num = tf3.getText();
				item = (String)box.getSelectedItem();
				qua = tf9.getText();
					food t = new food();
					t.display(name,addr,num,item,qua,amount);
				}
			});
			b2.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent arg0){
					String item1 = (String)box.getSelectedItem();
			String quant1 = tf9.getText();
					food t = new food();
					amount = t.cal(item1,quant1);
					tf6.setText(amount);
				}
			});
		box.setBounds(475,450,200,50);
		tf1.setBounds(475,150,200,50);
		tf2.setBounds(475,250,150,50);
		tf3.setBounds(475,350,250,50);
		tf9.setBounds(475,550,150,50);
		f.add(lb);f.add(lb1);f.add(lb11);f.add(lb2);f.add(lb3);f.add(lb4);f.add(b2);f.add(tf9);
		f.add(box);f.add(tf1);f.add(tf2);f.add(b1);f.add(tf6);f.add(tf3);f.add(menu);f.add(menu1);f.add(menu2);f.add(menu3);f.add(menu4);f.add(menu5);f.add(menu6);
		Color c = new Color(255,153,0);
		f.setBackground(c);
		f.setSize(1000,1000);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
		
	public void display(String names,String address,String pnumber,String select_item,String quantity,String bill_amount)
	{
		Frame f1 = new Frame("FOOD ORDERING");
		Color C1 = new Color(255,102,102);
		f1.setBackground(C1);
		Label lb11 = new Label("THANK YOU:)");
		Label lb12 = new Label("YOUR ORDER HAS BEEN PLACED SUCCESSFULLY!!!");
		Label l10 = new Label("NAME:");
		Label l11 = new Label("ADDRESS:");
		Label l12 = new Label("PHONE NUMBER:");
		Label l13 = new Label("ITEM:");
		Label l14 = new Label("QUANTITY:");	
		Label l15 = new Label("BILL AMOUNT:");
		
		Label l1 = new Label(names);
		Label l2 = new Label(address);
		Label l3 = new Label(pnumber);
		Label l4 = new Label(select_item);
		Label l5 = new Label(quantity);
		Label l6 = new Label(bill_amount);
		
		Font f0 = new Font("TimesRoman",Font.ITALIC,35);
		f1.setForeground(Color.white);
		lb11.setFont(f0);
		lb12.setFont(f0);
		l1.setFont(f0);
		l2.setFont(f0);
		l3.setFont(f0);
		l4.setFont(f0);
		l5.setFont(f0);
		l6.setFont(f0);
		l10.setFont(f0);
		l11.setFont(f0);
		l12.setFont(f0);
		l13.setFont(f0);
		l14.setFont(f0);
		l15.setFont(f0);	
		
		l10.setBounds(150,100,200,30);
		l1.setBounds(300,100,200,30);
		l11.setBounds(150,200,200,30);
		l2.setBounds(350,200,200,30);
		l12.setBounds(150,300,800,30);
		l3.setBounds(450,300,200,30);
		l13.setBounds(150,400,200,30);	
		l4.setBounds(350,400,200,30);
		l14.setBounds(150,500,200,30);
		l5.setBounds(450,500,200,30);
		l15.setBounds(150,600,300,30);
		l6.setBounds(450,600,200,30);
		
		
		
		lb11.setBounds(200,700,900,30);
		lb12.setBounds(100,800,900,30);
		f1.add(l10);
		f1.add(l1);
		f1.add(l2);
		f1.add(l3);
		f1.add(l4);
		f1.add(l5);
		f1.add(l6);
		
		f1.add(l10);
		f1.add(l11);
		f1.add(l12);
		f1.add(l13);
		f1.add(l14);
		f1.add(l15);
		
		
		f1.add(lb11);
		f1.add(lb12);
		f1.setSize(1000,900);
		f1.setLayout(null);
		f1.setVisible(true);
	}		
		
	
	public String cal(String ty,String tic)
{
	String h = tic;
	int b;
	int a = Integer.parseInt(h);
	String val;
	if( ty.equals("SAMOSA"))//"Samosa","Sandwich","Burger","Pizza","Veg-Wrap","Veg-Roll"
	{
		b =  a * 30;
		val = Integer.toString(b);
	}
	else if (ty.equals("SANDWICH"))
	{
		b = a * 75;
		val = Integer.toString(b);
	}
	else if(ty.equals("BURGER"))
	{
		b = a * 150;
		val = Integer.toString(b);
	}
	else if(ty.equals("PIZZA"))
	{
		b = a * 300;
		val = Integer.toString(b);
	}
	else if(ty.equals("VEG-WRAP"))
	{
		b = a * 150;
		val = Integer.toString(b);
	}
	else if(ty.equals("VEG-ROLL"))
	{
		b = a * 100;
		val = Integer.toString(b);
	}
	else
	{
		val = "Select correct option";
	}
	return val;}}
public class project_main
{
	public static void main(String[] args)
	{
		food f = new food();
		f.book();}}
