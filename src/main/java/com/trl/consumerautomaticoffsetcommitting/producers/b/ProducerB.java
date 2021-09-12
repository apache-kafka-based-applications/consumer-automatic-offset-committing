package com.trl.consumerautomaticoffsetcommitting.producers.b;

import com.trl.consumerautomaticoffsetcommitting.configs.ProducerConfig;
import com.trl.consumerautomaticoffsetcommitting.producers.BasicProducer;

public class ProducerB {

    public void startProducing() {
        BasicProducer.startProducing(ProducerConfig.getTopicName_B(), "B");
    }

}
