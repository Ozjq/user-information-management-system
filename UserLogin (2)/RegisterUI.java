import javax.swing.*;
import java.awt.*;

public class RegisterUI{


	public void showUI(MyListener myListener){
		JFrame jf = new JFrame ();
		jf.setTitle ("注册");
		jf.setSize (400, 450);
		jf.setLocation (500, 200);
		jf.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		jf.setLayout (new FlowLayout ());
		JLabel nameJla = new JLabel ("账号：");
		JLabel pwdJla = new JLabel ("密码：");
		JLabel pwdJla2 = new JLabel ("确认密码：");
		JLabel birthdayJla = new JLabel ("生日：");
		JLabel emailJla = new JLabel ("邮箱：");
		JLabel phoneJla = new JLabel ("手机号：");
		JLabel addressJla = new JLabel ("地址：");
		JLabel ageJla = new JLabel ("年龄：");
		JLabel scoreJla = new JLabel ("积分：");
		JTextField nameJtf = new JTextField (30);
		JTextField pwdJpf = new JTextField (30);
		JTextField pwdJpf2 = new JTextField (30);
		JTextField birthdayJtf = new JTextField (30);
		JTextField emailJtf = new JTextField (30);
		JTextField phoneJtf = new JTextField (30);
		JTextField addressJtf = new JTextField (30);
		JTextField ageJtf = new JTextField (30);
		JTextField scoreJtf = new JTextField (30);
		JButton registerJbtn = new JButton ("注册");


		RegistForm registForm = new RegistForm (
			  nameJtf,
			  pwdJpf,
			  ageJtf,
			  birthdayJtf,
			  emailJtf,
			  phoneJtf,
			  addressJtf,
			  scoreJtf
		);


		jf.add (nameJla);
		jf.add (nameJtf);
		jf.add (pwdJla);
		jf.add (pwdJpf);
		jf.add (pwdJla2);
		jf.add (pwdJpf2);
		jf.add (birthdayJla);
		jf.add (birthdayJtf);
		jf.add (emailJla);
		jf.add (emailJtf);
		jf.add (phoneJla);
		jf.add (phoneJtf);
		jf.add (addressJla);
		jf.add (addressJtf);
		jf.add (ageJla);
		jf.add (ageJtf);
		jf.add (scoreJla);
		jf.add (scoreJtf);
		jf.add (registerJbtn);
		jf.setVisible (true);
//		MyListener myListener = new MyListener (registForm);
		registerJbtn.addActionListener (myListener);
		myListener.registForm = registForm;


	}

	public static void main(String[] args){
		RegisterUI registerUI = new RegisterUI ();
		MyListener myListener = new MyListener ();
		registerUI.showUI (myListener);
	}

}
