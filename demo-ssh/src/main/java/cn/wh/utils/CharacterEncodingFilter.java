package cn.wh.utils;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 字符乱码过滤器
 *
 * @author wanghao
 * @create 2018-08-06 上午9:55
 **/
public class CharacterEncodingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain) throws IOException, ServletException {
        // 将请求和响应强制转换成Http形式
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        // 处理响应乱码
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        filterChain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
