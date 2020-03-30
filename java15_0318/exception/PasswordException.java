package java15_0318.exception;

//自定义异常类
public class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}
