package com.ecommerce.wanted_cqrs.entity.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ProductStatusType {

    ;

    private final String value;
    private final String desc;
}
