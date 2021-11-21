package com.chuxuin.springeventdemo.evnet;

import com.chuxuin.springeventdemo.data.WechatEventData;
import org.springframework.context.ApplicationEvent;

/**
 * @author chuxin
 * @ClassName WechatEvent
 * @Date 2021/11/21 11:48 PM
 * @Description: 微信相关事件抽象类
 */
public abstract class WechatEvent extends ApplicationEvent {

    private WechatEventData wechatEventData;

    public WechatEvent(Object source, WechatEventData wechatEventData) {
        super(source);
        this.wechatEventData = wechatEventData;
    }

    public WechatEventData getWechatEventData() {
        return wechatEventData;
    }
}
