package org.emnanehdi.learning.config;

import org.emnanehdi.learning.hello.Party;
import org.emnanehdi.learning.hello.impl.PartyImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoreModuleConfig {
    @Bean(name = "Party")
    public Party getParty() {

	return new PartyImpl();

    }
}
