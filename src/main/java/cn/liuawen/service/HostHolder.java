package cn.liuawen.service;

import cn.liuawen.model.User;
import cn.liuawen.utils.ConcurrentUtils;
import org.springframework.stereotype.Service;

/**
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2019-02-12
 */
@Service
public class HostHolder {

  public User getUser() {
    return ConcurrentUtils.getHost();
  }

  public void setUser(User user) {
    ConcurrentUtils.setHost(user);
  }
}
