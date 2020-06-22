package cn.liuawen.utils;

import java.util.UUID;

/**
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2019-02-12
 */
public class UuidUtils {

  public static String next(){
    return UUID.randomUUID().toString().replace("-","a");
  }

}
