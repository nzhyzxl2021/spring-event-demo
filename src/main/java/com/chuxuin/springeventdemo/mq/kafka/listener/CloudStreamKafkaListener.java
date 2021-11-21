package com.chuxuin.springeventdemo.mq.kafka.listener;

import com.chuxuin.springeventdemo.evnet.KafkaMessage2EventFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @author chuxin
 * @ClassName CloudStreamKafkaListener
 * @Date 2021/11/21 11:58 PM
 * @Description: kafka 消息监听入口
 */
@RequiredArgsConstructor
@Component
public class CloudStreamKafkaListener {

    private KafkaMessage2EventFactory kafkaMessage2EventFactory;

    private ApplicationEventPublisher applicationEventPublisher;

    public void kafkaMessageHandler(Object kafkaMessage) {
        kafkaMessage2EventFactory.publishEvent(kafkaMessage);
    }
}
