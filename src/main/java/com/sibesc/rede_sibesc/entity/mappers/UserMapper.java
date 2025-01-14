package com.sibesc.rede_sibesc.entity.mappers;

import com.sibesc.rede_sibesc.entity.User;
import com.sibesc.rede_sibesc.entity.dtos.UserRegisterDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" /* uses = PostMapper.class */ )
public interface UserMapper {

    User toEntity(UserRegisterDTO dto);

}
