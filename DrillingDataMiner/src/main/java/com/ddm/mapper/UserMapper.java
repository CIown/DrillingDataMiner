package com.ddm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ddm.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
}
