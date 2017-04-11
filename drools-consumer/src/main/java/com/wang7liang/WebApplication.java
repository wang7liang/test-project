package com.wang7liang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URL;

/**
 * Created by wangqiliang on 17/3/23.
 */
@SpringBootApplication
public class WebApplication {

    /**
     * @param args String[]
     */
    public static void main(String[] args) {
        // 使用项目下的settings.xml连接Workbench
        URL resource = WebApplication.class.getClassLoader().getResource("settings.xml");
        System.setProperty("kie.maven.settings.custom",resource.getPath());

        // 启动
        SpringApplication.run(WebApplication.class, args);
    }



}

