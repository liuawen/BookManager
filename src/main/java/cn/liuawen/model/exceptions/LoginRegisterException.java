package cn.liuawen.model.exceptions;


/**
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2019-02-12
 * 注册和登录时的异常
 */
public class LoginRegisterException extends RuntimeException {

    public LoginRegisterException() {
        super();
    }

    public LoginRegisterException(String message) {
        super(message);
    }

    public LoginRegisterException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginRegisterException(Throwable cause) {
        super(cause);
    }
}
