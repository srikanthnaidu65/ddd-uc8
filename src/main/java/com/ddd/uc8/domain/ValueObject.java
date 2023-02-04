package com.ddd.uc8.domain;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public interface ValueObject<T> {
    boolean sameValueAs(T other);
}
