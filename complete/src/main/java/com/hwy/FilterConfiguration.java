package com.hwy;

import com.hwy.filter.FirstFilter;
import com.hwy.filter.SecondFilter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * Created with IntelliJ IDEA.
 * User: hongweiye
 * Date: 2014/12/3 16:34
 *
 * bean的顺序决定了filter的顺序
 */
@Configuration
public class FilterConfiguration {

    @Bean
    public Filter firstFilter(ApplicationContext context) {
        return new FirstFilter(context);
    }

    @Bean
    public Filter secondFilter(ApplicationContext context) {
        return new SecondFilter(context);
    }
}
