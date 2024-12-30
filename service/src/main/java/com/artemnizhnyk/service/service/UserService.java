package com.artemnizhnyk.service.service;

import com.artemnizhnyk.database.dao.UserDao;
import com.artemnizhnyk.database.entity.User;
import com.artemnizhnyk.service.dto.UserDto;

import java.util.Optional;

public class UserService {

    private final UserDao userDao = new UserDao();

    public Optional<UserDto> getUser(Long id) {
        return userDao.findById(id)
                .map(it -> new UserDto());

    }
}
