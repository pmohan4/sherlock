package com.hit.sherlock.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppPropertyConfig {


    @Value("${remote.ecom.root.url}")
    public String remoteEcomRootUrl;


}
