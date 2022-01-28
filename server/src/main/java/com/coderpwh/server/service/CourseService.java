package com.coderpwh.server.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coderpwh.server.domain.Course;
import com.coderpwh.server.util.UuidUtil;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coderpwh.server.mapper.CourseMapper;
import com.coderpwh.server.domain.Course;
import org.springframework.util.StringUtils;

@Service
public class CourseService extends ServiceImpl<CourseMapper, Course> {
    @Resource
    private CourseMapper courseMapper;

    public List<Course> queryByPage(Page<Course> page) {
        return courseMapper.selectPage(page,null).getRecords();
    }

    public void saveCourse(Course course) {
        if (StringUtils.isEmpty(course.getId())){
            insert(course);
        }else {
            updateByCourseId(course);
        }
    }

    public void insert(Course course) {
        course.setId(UuidUtil.getShortUuid());
        course.setCreateAt(new Date());
        course.setUpdatedAt(new Date());
        courseMapper.insert(course);
    }
    public void updateByCourseId(Course course) {
        course.setUpdatedAt(new Date());
        courseMapper.updateById(course);
    }

}
