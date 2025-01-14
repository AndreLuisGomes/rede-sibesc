package com.sibesc.rede_sibesc.service.validator;

import com.sibesc.rede_sibesc.entity.User;
import com.sibesc.rede_sibesc.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@RequiredArgsConstructor
public class UserValidator {

    private final UserRepository userRepository;

    public void validate(User user) {
        if (!notNullFields(user)) {
            throw new IllegalArgumentException("User contains null or empty fields!");
        }
    }

    private boolean notNullFields(User user) {
        // Verifica se os campos são nulos ou vazios
        return StringUtils.hasText(user.getName()) &&
                StringUtils.hasText(user.getEmail()) &&
                StringUtils.hasText(user.getPassword());
    }
}

