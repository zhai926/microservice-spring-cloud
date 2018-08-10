package com.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  使用属性自定义 Ribbon 配置
 * Created by zhaihuilin on 2018/8/9 13:17.
 */
@Configuration
public class MyRule {

     @Bean
     public IRule iRule(){
        //return  new RandomRule();
        //  return  new RoundRobinRule();// 轮询策略
        return  new MyRoundRobinRule() ;// 定义我们自己的轮询策略
     }
}
