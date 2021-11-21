package com.chuxuin.springeventdemo.listener.user;

import com.chuxuin.springeventdemo.evnet.wechat.WechatBindingEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author chuxin
 * @ClassName WechatBindingListener
 * @Date 2021/11/22 12:07 AM
 * @Description: 微信绑定事件监听器
 */
@Component
public class WechatBindingListener {

    @EventListener(value = WechatBindingEvent.class, condition = "")
    public void wechatBinding2User(WechatBindingEvent wechatBindingEvent) {
        // do your own logistic
        // TODO
    }
}
