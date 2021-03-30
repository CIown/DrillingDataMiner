package com.ddm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ddm.entity.LogEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LogMapper extends BaseMapper<LogEntity> {
}
