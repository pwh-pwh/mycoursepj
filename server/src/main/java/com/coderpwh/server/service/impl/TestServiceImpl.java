package com.coderpwh.server.service.impl;

import com.coderpwh.server.domain.Test;
import com.coderpwh.server.mapper.TestMapper;
import com.coderpwh.server.service.TestService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;
@Service
public class TestServiceImpl implements TestService {
    @Resource
    private TestMapper testMapper;

    @Override
    public List<Test> testList() {
        return testMapper.testList();
    }
}
