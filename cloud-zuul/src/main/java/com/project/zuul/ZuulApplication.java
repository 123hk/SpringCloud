package com.project.zuul;

import com.project.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
@EnableZuulProxy        //启用 zuul，自带熔断和自动注册到 eureka, 但是需要到eureka client依赖
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }

//    /**
//     * 开启请求过滤拦截器
//     *
//     * @return
//     */
//    @Bean
//    public AccessFilter accessFilter() {
//        return new AccessFilter();
//    }
//
//    /**
//     * 开启异常拦截器
//     * @return
//     */
//    @Bean
//    public ErrorFilter errorFilter() { return new ErrorFilter(); }
//
//    /**
//     * 回调过滤器
//     *
//     * @return
//     */
//    @Bean
//    public LoginPostFilter loginPostFilter() {
//        return new LoginPostFilter();
//    }
    /**
     * 跨域
     * @return
     */
    @Bean
    public CorsFilter corsFilter() {
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        final CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        //允许脚本访问的返回头，请求成功后，脚本可以在XMLHttpRequest中访问这些头的信息
        config.addAllowedHeader("*");
        //允许使用的请求方法，以逗号隔开
        config.addAllowedMethod("*");
        //缓存此次请求的秒数。在这个时间范围内，所有同类型的请求都将不再发送预检请求而是直接使用此次返回的头作为判断依据，非常有用，大幅优化请求次数
        config.setMaxAge(18000L);
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
