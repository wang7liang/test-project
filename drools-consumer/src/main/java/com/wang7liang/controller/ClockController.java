package com.wang7liang.controller;


import com.wang7liang.dto.Clock;
import com.wang7liang.service.ClockService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by wangqiliang on 17/3/23.
 */
@RestController
public class ClockController {

    @Resource
    private ClockService clockService;

    private Clock clock = new Clock();

    /**
     * @return String
     */
    @RequestMapping("/clock/run")
    public String startProcess() {

        clock = clockService.run(clock);

        return "success";
    }


}
