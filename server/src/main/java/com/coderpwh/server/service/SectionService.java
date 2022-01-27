package com.coderpwh.server.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coderpwh.server.domain.Section;
import com.coderpwh.server.mapper.SectionMapper;
@Service
public class SectionService extends ServiceImpl<SectionMapper, Section> {

}
