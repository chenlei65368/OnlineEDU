package com.xatu.onlineedu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xatu.onlineedu.entity.EduTeacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 讲师 Mapper 接口
 * </p>
 *
 * @author LiangHuan
 * @since 2020-05-18
 */
@Mapper
@Repository
public interface EduTeacherMapper extends BaseMapper<EduTeacher> {

}
