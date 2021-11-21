package com.chuxuin.springeventdemo.evnet.shop;

import com.chuxuin.springeventdemo.data.ShopEventData;
import com.chuxuin.springeventdemo.evnet.BaseEvent;

/**
 * @author chuxin
 * @ClassName ShopCreatedEvent
 * @Date 2021/11/21 11:56 PM
 * @Description: TODO
 */
public class ShopCreatedEvent extends BaseEvent<ShopEventData> {

    public ShopCreatedEvent(Object source, ShopEventData eventData) {
        super(source, eventData);
    }
}
