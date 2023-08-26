import java.util.HashMap;
import java.util.Map;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class UserService {
    HashMap<String,User> userMap=new HashMap<>();
    String filePath="C:\\Users\\ASUS\\IdeaProjects\\User\\src\\record.txt";
    public boolean register(String name,String pwd){
        //先判断是否已经注册过了
        boolean containsKey=userMap.containsKey(name);
        if (containsKey) {
            System.out.println("用户名已经被注册");
            return false;
        }else{
            User user =new User(name,pwd);
            userMap.put(name,user);
            System.out.println("注册成功");

            // 将哈希表中的记录写入文本文件
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true));
                for (Map.Entry<String, User> entry : userMap.entrySet()) {
                    String line = "账号："+entry.getKey() + " 密码：" + entry.getValue().getpwd();
                    writer.write(line);
                    writer.newLine(); // 写入换行符
                }
                writer.close();
                System.out.println("Records written to file successfully.");
            } catch (IOException e) {
                System.err.println("Error writing records to file: " + e.getMessage());
            }

            return true;
        }
    }


    public User getUserByName(String userName){
        User user = userMap.get (userName);
        return user;
    }

    public int login(String name,String pwdIn){
        boolean containskey =userMap.containsKey(name);
        if(!containskey){
            System.out.println("用户名不存在");
            return 3;
        }else{
            User user =userMap.get(name);
            int loginCode =user.login(pwdIn);
            return loginCode;
        }
    }

    public void upDate(String oldName,String userName,String  newBirthday){
        User user =userMap.get(oldName);
        user.setName(userName);
        user.setBirthday (newBirthday);
        userMap.remove(oldName);
        userMap.put(userName,user);
    }

}