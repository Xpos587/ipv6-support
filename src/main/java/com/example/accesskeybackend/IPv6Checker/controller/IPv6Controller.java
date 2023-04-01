package com.example.accesskeybackend.IPv6Checker.controller;

import lombok.AllArgsConstructor;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import com.example.accesskeybackend.IPv6Checker.IPv6;
import com.example.accesskeybackend.IPv6Checker.dto.IPv6Dto;

@RestController
@RequestMapping("/api/web/checkIpv6Support")

@AllArgsConstructor
public class IPv6Controller {
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<IPv6Dto> checkIPv6(
            @RequestParam(required = true) final String siteUrl
    ) {
        IPv6Dto ipv6Dto = new IPv6Dto(siteUrl);
        boolean isSupport = IPv6.isSupport(siteUrl);
//        System.out.println(isSupport);
        ipv6Dto.setSuccess(isSupport);
//        System.out.println(ipv6Dto);
        return ResponseEntity.ok(ipv6Dto);
    }
}

