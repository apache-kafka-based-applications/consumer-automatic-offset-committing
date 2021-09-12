package com.trl.consumerautomaticoffsetcommitting.producers.a;

import com.trl.consumerautomaticoffsetcommitting.producers.BasicProducer;

import static com.trl.consumerautomaticoffsetcommitting.configs.ProducerConfig.getTopicName_A;

public class ProducerA {

    public void startProducing() {
        BasicProducer.startProducing(getTopicName_A(), "A");
    }

}
