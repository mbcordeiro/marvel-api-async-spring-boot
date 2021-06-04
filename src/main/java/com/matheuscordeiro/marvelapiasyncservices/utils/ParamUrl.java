package com.matheuscordeiro.marvelapiasyncservices.utils;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ParamUrl {
    private long timestamp;
    private String publicKey;
    private String privateKey;
    private String hash;
}
