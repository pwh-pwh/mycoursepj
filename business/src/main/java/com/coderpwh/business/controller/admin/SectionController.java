package com.coderpwh.business.controller.admin;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coderpwh.server.domain.Section;
import com.coderpwh.server.dto.ResponseDto;
import com.coderpwh.server.service.SectionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (`section`)表控制层
 *
 * @author xxxxx
 */
@RestController
@RequestMapping("/admin/section")
public class SectionController {
    private static final String BUSINESS_NAME = "小节";

    /**
     * 服务对象
     */
    @Resource
    private SectionService sectionService;
    @RequestMapping("/list")
    public ResponseDto<Page> sectionList(@RequestBody Page<Section> page) {
        sectionService.queryByPage(page);
        ResponseDto<Page> sectionResponseDto = new ResponseDto<>();
        sectionResponseDto.setContent(page);
        return sectionResponseDto;
    }

    @PostMapping("/save")
    public ResponseDto save(@RequestBody Section section) {
        sectionService.saveSection(section);
        ResponseDto<Section> sectionResponseDto = new ResponseDto<>();
        sectionResponseDto.setContent(section);
        return sectionResponseDto;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseDto deleteSection(@PathVariable("id") String id) {
        sectionService.removeById(id);
        return new ResponseDto();
    }

}
