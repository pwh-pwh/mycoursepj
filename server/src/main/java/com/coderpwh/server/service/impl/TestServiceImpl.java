package com.coderpwh.server.service.impl;

import com.coderpwh.server.domain.Test;
import com.coderpwh.server.mapper.TestMapper;
import com.coderpwh.server.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class TestServiceImpl implements TestService {
    @Resource
    private TestMapper testMapper;

    @Override
    public List<Test> testList() {
        return testMapper.testList();
    }
}
