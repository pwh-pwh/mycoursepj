package com.coderpwh.server.mapper;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.coderpwh.server.domain.Test;

import java.util.List;

public interface TestMapper extends BaseMapper<Test> {
    List<Test> testList();
}
