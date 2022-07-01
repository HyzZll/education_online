package com.hyz.eduservice.service;

import com.hyz.eduservice.entity.EduCourse;
import com.hyz.eduservice.entity.vo.CourseInfoForm;
import com.hyz.eduservice.entity.vo.CoursePublishVo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author testjava
 * @since 2021-03-10
 */
public interface EduCourseService extends IService<EduCourse> {

    String addCourseInfo(CourseInfoForm courseInfoForm);

    CourseInfoForm getCourseInfoById(String id);

    void updateCourseInfo(CourseInfoForm courseInfoForm);

    CoursePublishVo getCoursePublishById(String id);

    void delCourseInfo(String id);
}
