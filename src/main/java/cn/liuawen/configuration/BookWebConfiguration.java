package cn.liuawen.configuration;

import cn.liuawen.interceptor.HostInfoInterceptor;
import cn.liuawen.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2019-02-12
 */
@Component
public class BookWebConfiguration implements WebMvcConfigurer {

  @Autowired
  private LoginInterceptor loginInterceptor;

  @Autowired
  private HostInfoInterceptor hostInfoInterceptor;

  @Bean
  public WebMvcConfigurer webMvcConfigurer() {
    return new WebMvcConfigurer() {
      /**
       * 添加拦截器
       */
      @Override
      public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(hostInfoInterceptor).addPathPatterns("/**");
        registry.addInterceptor(loginInterceptor).addPathPatterns("/books/**");
      }
    };
  }

}
