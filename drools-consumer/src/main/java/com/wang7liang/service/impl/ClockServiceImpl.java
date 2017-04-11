package com.wang7liang.service.impl;

import com.wang7liang.dto.Clock;
import com.wang7liang.service.ClockService;
import org.kie.api.cdi.KReleaseId;
import org.kie.api.cdi.KSession;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

/**
 * Created by wangqiliang on 17/4/11.
 */
@Service
public class ClockServiceImpl implements ClockService {

    @KSession("ksession-clockRule")
    private KieSession kSession;

    @Override
    public Clock run(Clock clock) {
        kSession.insert(clock);
        kSession.fireAllRules();

        return clock;
    }
}
