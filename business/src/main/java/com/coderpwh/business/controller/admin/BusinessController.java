package com.coderpwh.business.controller.admin;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coderpwh.server.dto.ChapterDto;
import com.coderpwh.server.service.ChapterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
@RequestMapping("/admin/chapter")
public class BusinessController {

    private static final Logger log = LoggerFactory.getLogger(BusinessController.class);
    @Resource
    private ChapterService chapterService;

    @RequestMapping("/list")
    public Page<ChapterDto> chapterList(@RequestBody Page<ChapterDto> page) {

        return chapterService.findAllChapter(page);
    }

    @PostMapping("/save")
    public ChapterDto saveChapter(@RequestBody ChapterDto chapterDto) {
        log.debug("{}",chapterDto);
        chapterService.save(chapterDto);
        return chapterDto;
    }
}
