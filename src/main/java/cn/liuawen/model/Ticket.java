package cn.liuawen.model;

import java.util.Date;

/**
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2019-02-12
 */
public class Ticket {

  private int id;

  /**
   * 相绑定的userId
   */
  private int userId;

  /**
   * t票实体
   */
  private String ticket;

  /**
   * 过期时间
   */
  private Date expiredAt;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getTicket() {
    return ticket;
  }

  public void setTicket(String ticket) {
    this.ticket = ticket;
  }

  public Date getExpiredAt() {
    return expiredAt;
  }

  public void setExpiredAt(Date expiredAt) {
    this.expiredAt = expiredAt;
  }
}
