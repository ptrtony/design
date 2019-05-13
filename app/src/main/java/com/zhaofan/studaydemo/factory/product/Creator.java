package com.zhaofan.studaydemo.factory.product;

/**
 * @author ChengJingQiang
 * @copyright:2019
 * @project Wepay
 * @date 2019/4/12
 * description:
 */
public abstract class Creator {
    public abstract <T extends Product> T creareProduct(Class<T> c);
}
