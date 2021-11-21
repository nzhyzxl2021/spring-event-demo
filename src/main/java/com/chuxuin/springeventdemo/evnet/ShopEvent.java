package com.chuxuin.springeventdemo.evnet;

import com.chuxuin.springeventdemo.data.ShopEventData;
import org.springframework.context.ApplicationEvent;

/**
 * @author chuxin
 * @ClassName ShopEvent
 * @Date 2021/11/21 11:51 PM
 * @Description: 店铺相关事件
 */
public abstract class ShopEvent extends ApplicationEvent {

    private ShopEventData shopEventData;


    public ShopEvent(Object source, ShopEventData shopEventData) {
        super(source);
        this.shopEventData = shopEventData;
    }

    public ShopEventData getShopEventData() {
        return shopEventData;
    }
}
