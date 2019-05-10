/**
 * Copyright (c) 2019,TravelSky.
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 */
package com.consumer.controller;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

/**
 * ADH
 * <p> 
 * 体现设计意图的说明
 *
 * @author luohao
 *
 *
 */
@Component
public class ConsumerListener {
    @KafkaListener(topics = "topic1")
    public void listenT1(ConsumerRecord<?, ?> cr) throws Exception {
        System.out.println("listenT1收到消息！！   topic:>>>  " + cr.topic() + "    key:>>  " + cr.key() + "    value:>>  " + cr.value());
    }

    @KafkaListener(topics = "topic2")
    public void listenT2(ConsumerRecord<?, ?> cr) throws Exception {
        System.out.println("listenT2收到消息！！   topic:>>>  " + cr.topic() + "    key:>>  " + cr.key() + "    value:>>  " + cr.value());
    }


}
