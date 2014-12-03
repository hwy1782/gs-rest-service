package com.hwy.filter;

import org.joda.time.DateTime;
import org.springframework.context.ApplicationContext;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: hongweiye
 * Date: 2014/12/3 15:49
 */
public class SecondFilter extends OncePerRequestFilter {

    private final ApplicationContext applicationContext;


    public SecondFilter(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        System.out.println("do second filter time is "+ DateTime.now());
        filterChain.doFilter(request, response);
    }

}
