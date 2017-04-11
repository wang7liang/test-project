package com.wang7liang.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by wangqiliang on 17/4/10.
 */
@Configuration
@ImportResource(locations={"classpath:drools-config.xml"})
public class DroolsConfig {

}
