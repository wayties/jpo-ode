package us.dot.its.jpo.ode.exporter;

import org.springframework.messaging.simp.SimpMessagingTemplate;

import us.dot.its.jpo.ode.OdeProperties;
import us.dot.its.jpo.ode.wrapper.MessageConsumer;

public class RawBsmExporter extends Exporter {

    private OdeProperties odeProperties;
    private SimpMessagingTemplate template;

    public RawBsmExporter(OdeProperties odeProperties, String topic, SimpMessagingTemplate template) 
                                  throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        super(topic);
        this.odeProperties = odeProperties;
        this.template = template;
    }

    @Override
    protected void subscribe() {
        setConsumer(MessageConsumer.defaultByteArrayMessageConsumer(odeProperties.getKafkaBrokers(),
                odeProperties.getHostId() + this.getClass().getSimpleName(),
                new StompByteArrayMessageDistributor(template, getTopic())));
        
        getConsumer().subscribe(odeProperties.getKafkaTopicBsmSerializedPojo());
    }
}