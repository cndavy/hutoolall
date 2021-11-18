package com.qx.sf.build.utils.encrypt;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xiejl
 */
@Data
public class EncryptType implements Serializable {

    private String attribute;

    public EncryptType(String attribute) {
        this.attribute = attribute;
    }
}
