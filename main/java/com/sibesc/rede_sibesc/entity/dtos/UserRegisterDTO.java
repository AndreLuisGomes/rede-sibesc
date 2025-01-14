package com.sibesc.rede_sibesc.entity.dtos;

import jakarta.persistence.Entity;
import lombok.Data;

public record UserRegisterDTO(
        String name,
        String email,
        String password
) {
}
