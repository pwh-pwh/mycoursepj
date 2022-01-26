package com.coderpwh.business.controller.admin;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coderpwh.server.dto.ChapterDto;
import com.coderpwh.server.dto.ResponseDto;
import com.coderpwh.server.service.ChapterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/admin/chapter")
public class BusinessController {

    private static final Logger log = LoggerFactory.getLogger(BusinessController.class);
    @Resource
    private ChapterService chapterService;

    @RequestMapping("/list")
    public ResponseDto chapterList(@RequestBody Page<ChapterDto> page) {
        chapterService.findAllChapter(page);
        ResponseDto<Page<ChapterDto>> pageResponseDto = new ResponseDto<>();
        pageResponseDto.setContent(page);
        return pageResponseDto;
    }

    @PostMapping("/save")
    public ResponseDto<ChapterDto> saveChapter(@RequestBody ChapterDto chapterDto) {
        log.debug("{}",chapterDto);
        chapterService.save(chapterDto);
        ResponseDto<ChapterDto> chapterDtoResponseDto = new ResponseDto<>();
        chapterDtoResponseDto.setContent(chapterDto);
        return chapterDtoResponseDto;
    }
    @DeleteMapping("/delete/{id}")
    public ResponseDto deleteChapter(@PathVariable("id") String id) {
        chapterService.deleteById(id);
        return new ResponseDto<ChapterDto>();
    }
}
