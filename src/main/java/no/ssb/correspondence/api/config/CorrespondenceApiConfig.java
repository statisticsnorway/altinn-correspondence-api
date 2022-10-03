package no.ssb.correspondence.api.config;

import no.altinn.services.serviceengine.correspondence._2009._10.ICorrespondenceAgencyExternalBasic;
import no.ssb.correspondence.api.consumer.CorrespondenceAgencyExternalBasicService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by runesr on 02.02.2016.
 */
@Configuration
public class CorrespondenceApiConfig {

    @Value("${altinn.correspondence.url}")
    private String altinnCorrespondenceAgencyUrl;

    @Bean
    public ICorrespondenceAgencyExternalBasic iCorrespondenceAgencyExternalBasic() {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setAddress(altinnCorrespondenceAgencyUrl);
        factory.setServiceClass(ICorrespondenceAgencyExternalBasic.class);
        ICorrespondenceAgencyExternalBasic service = (ICorrespondenceAgencyExternalBasic) factory.create();
        return service;
    }

    @Bean
    public CorrespondenceAgencyExternalBasicService correspondenceAgencyExternalBasicService() {
        return new CorrespondenceAgencyExternalBasicService();
    }
}
