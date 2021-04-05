package com.ddm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ddm.dto.MenuDto;
import com.ddm.dto.MenuQueryCriteria;
import com.ddm.entity.MenuEntity;
import org.apache.ibatis.annotations.Param;

import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public interface IMenuService extends IService<MenuEntity> {


    /**
     * 构建菜单树
     * @param menuDtos 原始数据
     * @return /
     */
    List<MenuDto> buildTree(List<MenuDto> menuDtos);

    /**
     * 构建菜单树
     * @param menuDtos /
     * @return /
     */
    Object buildMenus(List<MenuDto> menuDtos);



    /**
     * 根据当前用户获取菜单
     * @param currentUserId /
     * @return /
     */
    List<MenuDto> findByUser(Long currentUserId);

}
