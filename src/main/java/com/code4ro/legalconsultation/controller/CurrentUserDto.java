package com.code4ro.legalconsultation.controller;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class CurrentUserDto {
    private UUID id;
    private String fullName;
}
