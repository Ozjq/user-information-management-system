
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserListener implements ActionListener{
	public int loginCode;
	JTextField nameJtf;//文本框
	JPasswordField pwdJpf;//密码框
	static final UserService userService = new UserService ();

	JTextField nameJtf1;
	JTextField scoreJtf1;
	JTextField birthJtf;
	String mainUserName;
	MainMsgUI mainMsgUI = new MainMsgUI ();
	public void initMainMsgUI(User user,UserListener userListener){
		mainMsgUI.showMainUI (user,userListener);
		this.nameJtf1=mainMsgUI.nameJtf1;
		this.scoreJtf1=mainMsgUI.scoreJtf1;
		this.birthJtf=mainMsgUI.birthJtf;
		this.mainUserName=mainMsgUI.mainUserName;
	}


	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println ("点击了按钮");
		String btnAc = e.getActionCommand ();//响应事件的名称
		System.out.println (btnAc);
		JFrame frame = (JFrame) SwingUtilities.getWindowAncestor (nameJtf);
		// 获取输入框中文本
		String nameIn = nameJtf.getText ();
		String pwdIn = pwdJpf.getText ();
		System.out.println (nameIn + " " + pwdIn);
		if(btnAc.equals ("登录")){
			int loginCode = userService.login (nameIn, pwdIn);
			if(loginCode == 0){
				// 弹窗
				JOptionPane.showMessageDialog (null, "密码错误");
			} else if(loginCode == 1){
				JOptionPane.showMessageDialog (null, "登录成功");

				initMainMsgUI(userService.getUserByName (nameIn),this);

				frame.setVisible (false);
			} else if(loginCode == 2){
				JOptionPane.showMessageDialog (null, "已经登录过了");
			} else if(loginCode == 3){
				JOptionPane.showMessageDialog (null, "用户名不存在");
			}
		} else if(btnAc.equals ("注册")){
			boolean rcod = userService.register (nameIn, pwdIn);
			if(rcod){
				JOptionPane.showMessageDialog (null, "注册成功");
			} else{
				JOptionPane.showMessageDialog (null, "用户名已经被注册");
			}
		}

		if(btnAc.equals ("保存修改")){

			String newUserName = nameJtf1.getText ();
			String newBir = birthJtf.getText ();
			userService.upDate (mainUserName, newUserName, newBir);
			mainUserName = newUserName;
			JOptionPane.showMessageDialog (null, "修改成功");
			initMainMsgUI(userService.getUserByName (mainUserName),this);

		}

		if(btnAc.equals ("返回登录界面")){
			// 关闭当前窗口
			User user = userService.getUserByName (mainUserName);
			user.logout ();
			mainMsgUI.jf1.setVisible (false);// 信息界面隐藏
			frame.setVisible (true);// 登录界面显示

		}
	}
}