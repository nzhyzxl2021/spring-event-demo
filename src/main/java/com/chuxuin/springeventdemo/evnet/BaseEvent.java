package com.chuxuin.springeventdemo.evnet;

import org.springframework.context.ApplicationEvent;

/**
 * @author chuxin
 * @ClassName BaseEvent
 * @Date 2021/11/21 11:55 PM
 * @Description: 基础事件类
 */
public class BaseEvent<T> extends ApplicationEvent {

    private T eventData;

    public BaseEvent(Object source, T eventData) {
        super(source);
        this.eventData = eventData;
    }

    public T getEventData() {
        return eventData;
    }
}
