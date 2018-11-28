package com.kennysoft.interceptor;
import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
public class UserVality  implements HandlerInterceptor{

    private static Logger logger = Logger.getLogger(UserVality.class);
    /**
     * Handler执行之前调用这个方法
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
         logger.info("intercepter preHandle ……");
        //获取请求的URL
        String url = request.getRequestURI();
        logger.info("test:" + url);

        //获取Session
        HttpSession session =  request.getSession();
        String username = "";
        if(!session.equals(null))
            username =(String)session.getAttribute("username");

        if(username != null && username.length() >0){
            return true;
        }
        //URL:login.jsp是公开的;这个demo是除了login.jsp是可以公开访问的，其它的URL都进行拦截控制
        if(url.indexOf("test")>=0){
            return true;
        }
        if(url.indexOf("resources") >=0 )
        {
            return  true;
        }
        Integer nret  =0;
        nret = nret +1;
        if(nret >0) //测试阶段
            return true;
        //不符合条件的，跳转到登录界面
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);

        return false;
    }
    /**
     * Handler执行完成之后调用这个方法
     */
    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception exc)
            throws Exception {

        logger.info("intercepter  afterCompletion ……");
    }

    /**
     * Handler执行之后，ModelAndView返回之前调用这个方法
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, ModelAndView modelAndView) throws Exception {
        logger.info("intercepter  postHandle ……");
    }


}
