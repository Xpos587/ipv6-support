package com.example.accesskeybackend.IPv6Checker.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotEmpty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class IPv6Dto {
    @NotEmpty
    @NotNull
    private String siteUrl;
    private boolean success;

    public IPv6Dto(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}