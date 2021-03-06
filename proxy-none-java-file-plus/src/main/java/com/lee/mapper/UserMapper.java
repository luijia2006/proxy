package com.lee.mapper;

import com.lee.model.User;

public interface UserMapper {

    Integer save(User user);

    User getUserById(Integer id);

    Integer delete(Integer id);
}
