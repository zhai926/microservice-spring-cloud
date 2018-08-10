package com.zhaihuilin;

import com.zhaihuilin.config.RestUrlPerfixConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zhaihuilin on 2018/8/8 10:50.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Testconfig {

     @Autowired
  RestUrlPerfixConfig config;

     @Test
     public  void  Test(){
       System.out.println("{}"+ config.Rest_Url_Perfix);
     }
}
