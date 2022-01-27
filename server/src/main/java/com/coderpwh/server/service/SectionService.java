package com.coderpwh.server.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coderpwh.server.util.UuidUtil;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coderpwh.server.domain.Section;
import com.coderpwh.server.mapper.SectionMapper;
import org.springframework.util.StringUtils;

@Service
public class SectionService extends ServiceImpl<SectionMapper, Section> {
    @Resource
    private SectionMapper sectionMapper;
    public List<Section> queryByPage(Page<Section> page) {
        return sectionMapper.selectPage(page,null).getRecords();
    }

    public void saveSection(Section section) {
        if (StringUtils.isEmpty(section.getId())){
            insert(section);
        }else {
            updateBySectionId(section);
        }
    }

    public void insert(Section section) {
        section.setId(UuidUtil.getShortUuid());
        sectionMapper.insert(section);
    }
    public void updateBySectionId(Section section) {
        sectionMapper.updateById(section);
    }

}


