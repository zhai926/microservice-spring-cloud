package com.zhaihuilin.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by zhaihuilin on 2018/8/8 10:44.
 */
@Configuration
@Component
public class RestUrlPerfixConfig {

    @Value("${Rest.URL.PREFIX}")
    public   String  Rest_Url_Perfix;

}
