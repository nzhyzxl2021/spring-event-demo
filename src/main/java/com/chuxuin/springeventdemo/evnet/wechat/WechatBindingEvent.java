package com.chuxuin.springeventdemo.evnet.wechat;

import com.chuxuin.springeventdemo.data.WechatEventData;
import com.chuxuin.springeventdemo.evnet.WechatEvent;

/**
 * @author chuxin
 * @ClassName WechatBindingEvent
 * @Date 2021/11/21 11:54 PM
 * @Description: TODO
 */
public class WechatBindingEvent extends WechatEvent {


    public WechatBindingEvent(Object source, WechatEventData wechatEventData) {
        super(source, wechatEventData);
    }
}
