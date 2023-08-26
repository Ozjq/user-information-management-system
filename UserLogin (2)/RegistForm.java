import javax.swing.*;

public class RegistForm{

	JTextField nameJtf;
	JTextField pwdJtf;
	JTextField ageJtf;
	JTextField birthdayJtf;
	JTextField emailJtf;
	JTextField phoneJtf;
	JTextField addressJtf;
	JTextField scoreJtf;

	public RegistForm(JTextField nameJtf, JTextField pwdJtf, JTextField ageJtf, JTextField birthdayJtf, JTextField emailJtf, JTextField phoneJtf, JTextField addressJtf, JTextField scoreJtf){
		this.nameJtf = nameJtf;
		this.pwdJtf = pwdJtf;
		this.ageJtf = ageJtf;
		this.birthdayJtf = birthdayJtf;
		this.emailJtf = emailJtf;
		this.phoneJtf = phoneJtf;
		this.addressJtf = addressJtf;
		this.scoreJtf = scoreJtf;
	}

	public String getName(){
		return nameJtf.getText();
	}
	public String getPwd(){
		return pwdJtf.getText();
	}
	public int getAge(){
//		"20"-20
		return Integer.parseInt (ageJtf.getText());
	}
	public String getBirthday(){
		return birthdayJtf.getText();
	}
	public String getEmail(){
		return emailJtf.getText();
	}
	public String getPhone(){
		return phoneJtf.getText();
	}
	public String getAddress(){
		return addressJtf.getText();
	}
	public int getScore(){
		return Integer.parseInt (scoreJtf.getText());
	}



}
