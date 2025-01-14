package com.sibesc.rede_sibesc.entity.dtos;

import org.springframework.boot.context.properties.bind.DefaultValue;

public record FindByNameDTO(String name, @DefaultValue("0") Integer page, @DefaultValue("5") Integer itensPerPage) {
}
