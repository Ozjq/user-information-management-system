
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class User {
    private String name;
    private String pwd;
    private int score;
    private String birthday;
    private boolean isLogin;
    public User(String name,String pwd){
        this.name=name;
        this.pwd=pwd;
        this.score=10;
        this.birthday="2000/01/01";
    }
    public String getpwd(){
        return this.pwd;
    }
    public void setBirthday(String  birthday){
        this.birthday=birthday;
    }

    public boolean checkPassword(String pwdIn){
        return pwd.equals(pwdIn);//判断输入框中的代码是否正确
    }
    public int login(String pwdIn){
        if(checkPassword(pwdIn)){
            if(isLogin){
                System.out.println("已经登陆过了");
                return 2;
            }
            isLogin=true;
            score+=10;
            System.out.println("登陆成功");
            return 1;
        }else{
            System.out.println("密码错误");
            return 0;
        }
    }

    public void setName(String userName){
        this.name=userName;
    }

    public String getName(){
        return this.name;
    }

    public String  getBirth(){
        return this.birthday;
    }

    public void logout(){
        isLogin=false;
        System.out.println("退出成功");
    }
}