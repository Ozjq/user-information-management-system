
import javax.swing.*;
import java.awt.*;
import javax.swing.*;
public class MainMsgUI{
	JFrame jf1 = new JFrame ();// 窗体对象唯一
	JTextField nameJtf1;
	JTextField scoreJtf1;
	JTextField birthJtf;
	String mainUserName;
	public void showMainUI(User user,UserListener userListener){
		// 清除组件
		jf1.getContentPane ().removeAll ();
		mainUserName = user.getName ();
		// 创建一个窗体 并设置窗体的属性
		jf1.setTitle (mainUserName + "信息界面");
		jf1.setSize (360, 450);
		jf1.setLocationRelativeTo (null);// 居中显示
		jf1.setDefaultCloseOperation (JFrame.HIDE_ON_CLOSE);
		// 创建窗体内需要的组件 并设置组件的属性 添加到窗体上
		// 设置布局 管理窗体内的组件摆放
		FlowLayout fl1 = new FlowLayout ();// 流式布局
		jf1.setLayout (fl1);
		// 创建一些组件并添加到窗体中
		JLabel infoLabel = new JLabel ("欢迎进入信息界面");
		JLabel nameJla1 = new JLabel ("昵称：");
		JLabel scoreJla = new JLabel ("分数：");
		JLabel birthJla = new JLabel ("生日： ");

		nameJtf1 = new JTextField (user.getName ());//初始化文本框
		scoreJtf1 = new JTextField ("10");
		birthJtf = new JTextField (user.getBirth ());
		Dimension dim = new Dimension (310, 35);
		infoLabel.setPreferredSize (dim);// Preferred Size 首选尺寸
		nameJtf1.setPreferredSize (dim);
		nameJtf1.setSelectedTextColor (Color.yellow);//文本选中颜色设置
		scoreJtf1.setPreferredSize (dim);
		scoreJtf1.setEditable (false);//分数不可修改
		birthJtf.setPreferredSize (dim);
		JButton saveBtn = new JButton ("保存修改");
		JButton backButton = new JButton ("返回登录界面");

		jf1.add (infoLabel);
		jf1.add (nameJla1);
		jf1.add (nameJtf1);
		jf1.add (birthJla);
		jf1.add (birthJtf);
		jf1.add (scoreJla);
		jf1.add (scoreJtf1);
		jf1.add (saveBtn);
		jf1.add (backButton);

		jf1.setVisible (true);// 显示到屏幕上
		saveBtn.addActionListener (userListener);
		backButton.addActionListener (userListener);


	}
}
