package com.trl.consumerautomaticoffsetcommitting.producers.b;

import com.trl.consumerautomaticoffsetcommitting.configs.ProducerConfig;
import com.trl.consumerautomaticoffsetcommitting.producers.BasicProducer;

public class ProducerBB {

    public void startProducing() {
        BasicProducer.startProducing(ProducerConfig.getTopicName_B(), "BB");
    }

}
