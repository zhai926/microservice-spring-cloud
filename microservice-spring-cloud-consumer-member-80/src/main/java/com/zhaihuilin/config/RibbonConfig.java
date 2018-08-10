//package com.zhaihuilin.config;
//
//import com.netflix.loadbalancer.IRule;
//import com.netflix.loadbalancer.RetryRule;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// *  负载均衡策略设置
// * Created by zhaihuilin on 2018/8/9 11:53.
// */
//@Configuration
//public class RibbonConfig {
//
//     @Bean
//     public IRule rule(){
//         //return  new RandomRule();// 设置随机的
//           return  new RetryRule();// 设置获取可用的
//     }
//}
