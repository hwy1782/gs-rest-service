package com.hwy;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Created with IntelliJ IDEA.
 * User: hongweiye
 * Date: 2014/12/3 14:34
 *
 * 替代xml
 */
public class GsRestWebXml extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}
