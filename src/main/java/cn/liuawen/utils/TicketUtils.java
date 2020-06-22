package cn.liuawen.utils;

import cn.liuawen.model.Ticket;
import org.joda.time.DateTime;

/**
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2019-02-12
 */
public class TicketUtils {

  public static Ticket next(int uid){

    Ticket ticket = new Ticket();
    ticket.setTicket(UuidUtils.next());
    ticket.setUserId(uid);
    //设置t票过期时间
    DateTime expiredTime = new DateTime();
    expiredTime = expiredTime.plusMonths(3);
    ticket.setExpiredAt(expiredTime.toDate());

    return ticket;
  }

}
