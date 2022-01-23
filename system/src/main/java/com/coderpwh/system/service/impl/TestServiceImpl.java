package com.coderpwh.system.service.impl;

import com.coderpwh.system.domain.Test;
import com.coderpwh.system.mapper.TestMapper;
import com.coderpwh.system.service.TestService;
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
