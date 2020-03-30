package java15_0318;

import java15_0318.exception.PasswordException;
import java15_0318.exception.UserException;

public class LoginTest {
    private static String username="zhangsan";
    private static String password="123456";

    public static void main(String[] args) throws UserException, PasswordException {
        //这两个参数是用户输入的用户名和密码
        login("zhangsan","111111");
    }

    private static void login(String username, String password) throws UserException, PasswordException {
        if(!LoginTest.username.equals(username)){
            //错误处理
            throw new UserException("用户名错误");
        }
        if(!LoginTest.password.equals(password)){
            //错误处理
            throw new PasswordException("密码错误");
        }
        System.out.println("登陆成功");
    }
}
