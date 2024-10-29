package com.base.domain.repositories;

/**
 *
 * @author Jhonatan
 */
public interface IEnum {

    public String getKey();

    public String getValue();

    public boolean containsInEnum(String key);
}