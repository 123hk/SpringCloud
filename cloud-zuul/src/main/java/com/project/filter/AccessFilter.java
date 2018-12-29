package com.project.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class AccessFilter extends ZuulFilter {



    /**
     * 过滤类型
     * @return 在服务被路由之前过滤
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤器的执行顺序(数字越小，优先级越高)
     * @return 执行顺序
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 该过滤器是否需要被执行
     * @return 是否启用
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器逻辑
     * @return
     */
    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest httpServletRequest = requestContext.getRequest();

        System.out.println("send() request to ()" + httpServletRequest.getMethod() + httpServletRequest.getRequestURI().toString());

        System.out.println("sessionId:" + httpServletRequest.getRequestedSessionId());

        Object accessToken = httpServletRequest.getParameter("accessToken");
        if(null == accessToken){
            System.out.println("access token is empty");
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);
            return null;
        }

        System.out.println("welcome! pass on");
        return null;
    }
}
