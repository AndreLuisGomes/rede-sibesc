package com.sibesc.rede_sibesc.entity.mappers;

import com.sibesc.rede_sibesc.entity.User;
import com.sibesc.rede_sibesc.entity.dtos.UserRegisterDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-11T22:38:23-0300",
    comments = "version: 1.6.0, compiler: javac, environment: Java 21.0.4 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toEntity(UserRegisterDTO dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setName( dto.name() );
        user.setEmail( dto.email() );
        user.setPassword( dto.password() );

        return user;
    }
}
