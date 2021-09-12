package com.trl.consumerautomaticoffsetcommitting.producers.a;

import com.trl.consumerautomaticoffsetcommitting.configs.ProducerConfig;
import com.trl.consumerautomaticoffsetcommitting.producers.BasicProducer;

public class ProducerAAA {

    public void startProducing() {
        BasicProducer.startProducing(ProducerConfig.getTopicName_A(), "AAA");
    }

}
