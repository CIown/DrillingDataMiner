package com.ddm.service;

import com.ddm.dto.UserDto;

import java.util.List;

public interface IDataService {
    List<Long> getDeptIds(UserDto user);
}
