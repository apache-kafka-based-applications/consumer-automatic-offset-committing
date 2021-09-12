package com.trl.consumerautomaticoffsetcommitting.producers.c;

import com.trl.consumerautomaticoffsetcommitting.configs.ProducerConfig;
import com.trl.consumerautomaticoffsetcommitting.producers.BasicProducer;

public class ProducerCCC {

    public void startProducing() {
        BasicProducer.startProducing(ProducerConfig.getTopicName_C(), "CCC");
    }

}
