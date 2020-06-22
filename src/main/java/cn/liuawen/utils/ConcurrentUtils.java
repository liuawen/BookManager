package cn.liuawen.utils;


import cn.liuawen.model.User;

/**
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2019-02-12
 */
public class ConcurrentUtils {

  private static ThreadLocal<User> host = new ThreadLocal<>();

  public static User getHost(){
    return host.get();
  }

  public static void setHost(User user){
    host.set(user);
  }

}
