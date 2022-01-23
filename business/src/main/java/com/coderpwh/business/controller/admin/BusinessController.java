package com.coderpwh.business.controller.admin;

import com.coderpwh.server.dto.ChapterDto;
import com.coderpwh.server.service.ChapterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class BusinessController {

    @Resource
    private ChapterService chapterService;

    @RequestMapping("/chapterList")
    public List<ChapterDto> chapterList() {
        return chapterService.findAllChapter();
    }
}