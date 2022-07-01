package com.hyz.eduservice.mapper;

import com.hyz.eduservice.entity.EduCourse;
import com.hyz.eduservice.entity.vo.CoursePublishVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 课程 Mapper 接口
 * </p>
 *
 * @author testjava
 * @since 2021-03-10
 */
@Mapper
public interface EduCourseMapper extends BaseMapper<EduCourse> {

    CoursePublishVo getCoursePublishById(String id);
}
