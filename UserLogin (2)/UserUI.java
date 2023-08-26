
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class UserUI {
    UserListener ul = new UserListener ();

    public void showLoginUI(){
        // 创建一个窗体 并设置窗体的属性
        JFrame jf = new JFrame ();
        jf.setTitle ("登录界面");
        jf.setSize (400, 500);
        jf.setLocationRelativeTo (null);// 居中显示
        jf.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        jf.setVisible (true);// 显示到屏幕上
        // 创建窗体内需要的组件 并设置组件的属性 添加到窗体上
        // 设置布局 管理窗体内的组件摆放
        FlowLayout fl = new FlowLayout ();// 流式布局
        jf.setLayout (fl);

        // 创建一个图标对象
        ImageIcon icon = new ImageIcon ("C:\\Users\\ASUS\\IdeaProjects\\User\\src\\img.jpg");
        JLabel nameJla = new JLabel ("账号：");
        JLabel pwdJla = new JLabel ("密码：");

        JTextField nameJtf = new JTextField ();
        JPasswordField pwdJpf = new JPasswordField ();
        JLabel iconJla = new JLabel (icon);
        // 设置尺寸
        Dimension dim = new Dimension (320,35);
        nameJtf.setPreferredSize (dim);// Preferred Size 首选尺寸
        pwdJpf.setPreferredSize (dim);
        JButton loginBtn = new JButton ("登录");
        JButton registerBtn = new JButton ("注册");
        // 添加组件
        jf.add (nameJla);jf.add (nameJtf);
        jf.add (pwdJla);jf.add (pwdJpf);
        jf.add (loginBtn);
        jf.add (registerBtn);
        jf.add (iconJla);
        jf.setVisible (true);// 可视化

        //监听器加载给按钮
        ActionListener listener =ul;// 向上转型 接下来点击按钮就会使用 ul对象调用 响应方法 执行也是我们自己写代码
        loginBtn.addActionListener (listener);
        registerBtn.addActionListener (listener);
        // 初始化监听器对象中的输入框对象变量名 为了在监听器中使用
        ul.nameJtf = nameJtf;
        ul.pwdJpf = pwdJpf;
    }

    public static void main(String[] args){
        UserUI ui = new UserUI ();
        ui.showLoginUI ();
    }
}