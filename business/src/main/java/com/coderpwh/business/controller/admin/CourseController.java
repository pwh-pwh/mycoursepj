package com.coderpwh.business.controller.admin;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coderpwh.server.domain.Course;
import com.coderpwh.server.domain.Section;
import com.coderpwh.server.dto.ResponseDto;
import com.coderpwh.server.service.CourseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (course)表控制层
 *
 * @author xxxxx
 */
@RestController
@RequestMapping("/admin/course")
public class CourseController {
    /**
     * 服务对象
     */
    @Resource
    private CourseService courseService;

    @RequestMapping("/list")
    public ResponseDto<Page> courseList(@RequestBody Page<Course> page) {
        courseService.queryByPage(page);
        ResponseDto<Page> courseResponseDto = new ResponseDto<>();
        courseResponseDto.setContent(page);
        return courseResponseDto;
    }

    @PostMapping("/save")
    public ResponseDto save(@RequestBody Course course) {
        courseService.saveCourse(course);
        ResponseDto<Course> courseResponseDto = new ResponseDto<>();
        courseResponseDto.setContent(course);
        return courseResponseDto;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseDto deleteCourse(@PathVariable("id") String id) {
        courseService.removeById(id);
        return new ResponseDto();
    }

}
