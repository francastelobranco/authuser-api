package com.ead.course.dtos;

import lombok.*;

import javax.validation.constraints.NotBlank;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ModuleDto {

    @NotBlank
    private String title;

    @NotBlank
    private String description;
}
