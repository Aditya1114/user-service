package com.foodorder.userinfo.mapper;

import com.foodorder.userinfo.dto.UserDTO;
import com.foodorder.userinfo.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User mapUserDTOToUser(UserDTO userDTO);

    UserDTO mapUserToUserDTO(User user);

}