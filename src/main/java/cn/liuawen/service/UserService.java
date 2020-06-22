package cn.liuawen.service;


import cn.liuawen.dao.UserDAO;
import cn.liuawen.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2019-02-12
 */
@Service
public class UserService {

  @Autowired
  private UserDAO userDAO;

  public int addUser(User user){
    return userDAO.addUser(user);
  }

  public User getUser(String email) {
    return userDAO.selectByEmail(email);
  }

  public User getUser(int uid) {
    return userDAO.selectById(uid);
  }
}
