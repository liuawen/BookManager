package cn.liuawen.interceptor;

import cn.liuawen.model.Ticket;
import cn.liuawen.model.User;
import cn.liuawen.service.TicketService;
import cn.liuawen.service.UserService;
import cn.liuawen.utils.ConcurrentUtils;
import cn.liuawen.utils.CookieUtils;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2019-02-12
 */
@Component
public class HostInfoInterceptor implements HandlerInterceptor {

  @Autowired
  private TicketService ticketService;

  @Autowired
  private UserService userService;

  /**
   * 为注入host信息
   *
   */
  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {

    String t = CookieUtils.getCookie("t", request);
    if (!StringUtils.isEmpty(t)) {
      Ticket ticket = ticketService.getTicket(t);
      if (ticket != null && ticket.getExpiredAt().after(new Date())) {
        User host = userService.getUser(ticket.getUserId());
        ConcurrentUtils.setHost(host);
      }
    }
    return true;
  }

}
